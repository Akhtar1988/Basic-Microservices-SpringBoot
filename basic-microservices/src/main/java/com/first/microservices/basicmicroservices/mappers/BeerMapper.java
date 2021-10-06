package com.first.microservices.basicmicroservices.mappers;
import com.first.microservices.basicmicroservices.domain.Beer;
import com.first.microservices.basicmicroservices.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
