package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.Repository;
import com.example.demo.model.Contact;

@Service
public class ServiceImp implements ServiceInt {
	
	@Autowired
	private Repository repository;

	@Override
	public boolean saveDetails(Contact contact) {
		// TODO Auto-generated method stub
		Contact save = repository.save(contact);
		
		if(save != null)
		{
			return true;
		}
		return false;
	}
	
}
