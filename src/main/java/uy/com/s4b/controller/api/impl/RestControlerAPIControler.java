/**
 * 
 */
package uy.com.s4b.controller.api.impl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.extern.slf4j.Slf4j;
import uy.com.s4b.controller.api.IControllerAPI;
import uy.com.s4b.controller.api.RestControlerAPI;
import uy.com.s4b.exception.RecordNotFoundException;
import uy.com.s4b.repo.IRerpoEmployeDB;
import uy.com.s4b.vo.EmployeeVO;

/**
 * @author arpela
 *
 */
@IControllerAPI
@Slf4j
public class RestControlerAPIControler implements RestControlerAPI {

	@Autowired 
	private IRerpoEmployeDB repo;
	
	/**
	 * 
	 */
	public RestControlerAPIControler() {
		
	}

	/**
	 * 
	 */
	public ResponseEntity<EmployeeVO> addEmployee(@Valid @RequestBody EmployeeVO employee) {
		repo.save(employee);
		
		log.info("############################## ");
		log.info("Dato recibido: ");
		log.info(ToStringBuilder.reflectionToString(employee, ToStringStyle.SHORT_PREFIX_STYLE));		
		log.info("############################## ");
		return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}
	
	
	@Override
	public ResponseEntity<List<EmployeeVO>> allEmployeeVO() {
		List<EmployeeVO> retorno = repo.findAll();
		return new ResponseEntity<List<EmployeeVO>>(retorno, HttpStatus.OK);
	}

	
	@Override
	public ResponseEntity<EmployeeVO> oneEmployeeVO(Integer id) {
		Optional<EmployeeVO> retorno = repo.findById(id);
		
		if (retorno.isEmpty()) {
			throw new RecordNotFoundException("No se localizo el empleado: " + id);
		}
		
		return new ResponseEntity<EmployeeVO>(retorno.get(), HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<EmployeeVO> findeByName(String nombre) {
		Optional<EmployeeVO> retorno = repo.findByfirstName(nombre);
		
		if (retorno.isEmpty()) {
			throw new RecordNotFoundException("No se localizo el empleado: " + nombre);
		}
		return new ResponseEntity<EmployeeVO>(retorno.get(), HttpStatus.OK);
	}
	
	
}
