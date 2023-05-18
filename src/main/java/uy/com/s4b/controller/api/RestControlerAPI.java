package uy.com.s4b.controller.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import uy.com.s4b.vo.EmployeeVO;

/**
 * @author arpela
 *
 */
public interface RestControlerAPI {

	@PostMapping(value = "/employees", produces = { "application/json" }, consumes = { "application/json" })
	public ResponseEntity<EmployeeVO> addEmployee(@Valid @RequestBody EmployeeVO employee);

	@GetMapping(value = "/employees/findAll", produces = { "application/json" })
	public ResponseEntity<List<EmployeeVO>> allEmployeeVO() ;
	
	
	@GetMapping(value = "/employees/{id}", produces = { "application/json" })
	public ResponseEntity<EmployeeVO> oneEmployeeVO(@PathVariable(name = "id", required = true) Integer id);
	
	
	@GetMapping(value = "/employees/name/{id}", produces = { "application/json" })
	public ResponseEntity<EmployeeVO> findeByName(@PathVariable(name = "id", required = true) String name);

}
