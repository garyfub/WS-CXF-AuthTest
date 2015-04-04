/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
// START SNIPPET: service
package demo.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.springframework.stereotype.Service;

@Service
public class Restful{
    

	@GET
    @Path("/test")
	public String testStr(){
		return "Haha restfull web service";
	}
	
	
	@GET
    @Path("/sayHi/{name}")
	public Map<String, String> sayHi(@PathParam("name") String yourName){
		Map<String, String> map = new HashMap<String, String>();
        map.put("text","Hi " + yourName);
		return map;
	}
	
	
	
	@GET
    @Path("/getPerson/{name}")
	public PersonDto getPerson(@PathParam("name") String yourName){
		PersonDto p = new PersonDto();
		p.setName("Wang zi");
		p.setAge(29);
		
		return p;
	}
	
	
	
	@GET
    @Path("/getPersons/{name}")
	public List<PersonDto> getPersons(@PathParam("name") String yourName){
		PersonDto p = new PersonDto();
		p.setName("Wang zi");
		p.setAge(29);
		
		
		PersonDto p1 = new PersonDto();
		p1.setName("Wang zi 1");
		p1.setAge(30);
		
		List<PersonDto> list = new ArrayList<PersonDto>();
		list.add(p);
		list.add(p1);
		
		return list;
	}
	
}
// END SNIPPET: service
