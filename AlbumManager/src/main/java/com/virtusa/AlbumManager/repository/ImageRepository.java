package com.virtusa.AlbumManager.repository;

 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.AlbumManager.entity.Image;


@Repository
public interface ImageRepository extends JpaRepository<Image, Long>
{

}
