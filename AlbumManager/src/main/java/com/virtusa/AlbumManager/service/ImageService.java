package com.virtusa.AlbumManager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.AlbumManager.entity.Image;
 
import com.virtusa.AlbumManager.repository.ImageRepository;

 

@Service
public class ImageService 
{

	@Autowired
	private  ImageRepository imageRepository;
	
	public void saveImage(Image image) {
		imageRepository.save(image);	
	}

	public List<Image> getAllActiveImages() {
		return imageRepository.findAll();
	}

	public Optional<Image> getImageById(Long id) {
		return imageRepository.findById(id);
	}

}
