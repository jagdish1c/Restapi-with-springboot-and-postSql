package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Payload;
import com.example.demo.service.MyPayloadCrudService;

@RestController
public class MyPayloadCrudController {
	
	
	@Autowired
	private MyPayloadCrudService myPersonsCrudService;
	
	@RequestMapping(method=RequestMethod.GET ,value="/load")
	public List<Payload> getLoad() {
		 return myPersonsCrudService.getAllItems();
 
	}
	@RequestMapping(method=RequestMethod.GET ,value="/load/{id}")
	public Optional<Payload>  getLoadById(@PathVariable int id) {
		 return myPersonsCrudService.getLoadById(id);
 
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/load" )
	public String addLoad(@RequestBody Payload payload) {
		 return myPersonsCrudService.postAllItems(payload);
 
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/load/{id}" )
	public String updateLoad(@RequestBody Payload payload, @PathVariable int id) {
		 return myPersonsCrudService.updateLoadWithId(payload,id);
 
	}
	@RequestMapping(method = RequestMethod.DELETE,value = "/load/{id}" )
	public String deleteLoad(@PathVariable int id) {
		 return myPersonsCrudService.deleteLoad(id);
 
	}
	

}
