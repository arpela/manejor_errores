/**
 * 
 */
package uy.com.s4b.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import uy.com.s4b.vo.EmployeeVO;

/**
 * @author arpela
 */
public interface IRerpoEmployeDB extends JpaRepository<EmployeeVO, Integer> {

	public Optional<EmployeeVO> findByfirstName(String name);
}
