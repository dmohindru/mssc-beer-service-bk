package dev.dmohindru.msscbeerservice.web.mappers;

import dev.dmohindru.msscbeerservice.domain.Beer;
import dev.dmohindru.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
