package com.first.microservices.basicmicroservices.repositories;

import com.first.microservices.basicmicroservices.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
