package net.sanket.sprint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.sanket.sprint.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
