package com.app.clustereddata.services.impls;

import com.app.clustereddata.exceptions.IdAlreadyExistsException;
import com.app.clustereddata.models.dto.DealDto;
import com.app.clustereddata.models.entity.Deal;
import com.app.clustereddata.repositories.DealRepository;
import com.app.clustereddata.services.DealService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DealServiceImpl implements DealService {

    private final ModelMapper modelMapper;
    private final DealRepository dealRepository;

    @Override
    public DealDto create(DealDto deal) {
        if(dealRepository.existsById(deal.getId()))
            throw new IdAlreadyExistsException("Deal with " + deal.getId() + " already exists");
        Deal newDeal = modelMapper.map(deal, Deal.class);
        newDeal.setId(deal.getId());
        Deal savedDeal = dealRepository.save(newDeal);
        return modelMapper.map(savedDeal, DealDto.class);
    }
}