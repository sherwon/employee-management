package com.employee_management.employee_management.Repository;

import com.employee_management.employee_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
