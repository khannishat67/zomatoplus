package com.thinkxfactor.zomatoplus.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Items;


public interface ItemsRepository extends JpaRepository<Items,Long> {

	List<Items> findAllByRestaurantId(long restaurentId);

    

}
