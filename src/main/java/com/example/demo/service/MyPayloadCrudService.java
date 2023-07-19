package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.MyPayloadCrudRepository;
import com.example.demo.entity.Payload;


@Service
public class MyPayloadCrudService {
	
	
	@Autowired
	private MyPayloadCrudRepository payloadRepository;
	
	public List<Payload> getAllItems(){
		List<Payload> payloads = new ArrayList<Payload>();
		payloadRepository.findAll().forEach(payloads::add);
	  	return payloads;
		
	}

	public String postAllItems(Payload payload) {
		payloadRepository.save(payload);
		return "sucess";
	}

	public String updateLoadWithId(Payload payload, int id) {
		 List<Payload> allPayloadData = getAllItems();
		 Payload temp =  allPayloadData.stream().filter(data->data.getShipperId()==id).findFirst().get();
		 if(temp!=null) {
			 payloadRepository.save(payload);
			 return "Success";
		 }else {
			 return "Not Success : Can Not Update Data with ShipperId="+id;
		 }
		 
	}

	public String deleteLoad(int id) {
		payloadRepository.deleteById(id);
		return "success";
	}

	public Optional<Payload> getLoadById(int id) {
		return payloadRepository.findById(id);
	
		 
	}

}
