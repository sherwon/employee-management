package com.employee_management.employee_management.service;

import com.employee_management.employee_management.Repository.DepartmentRepository;
import com.employee_management.employee_management.Repository.StudentRepository;
import com.employee_management.employee_management.entity.Department;
import com.employee_management.employee_management.entity.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UniversityService {
    private StudentRepository studentRepository;
    private DepartmentRepository departmentRepository;

    @Transactional
    public void createStudentWithDepartment() {
        Department department = Department.builder()
                .name("Computer Science")
                .build();
        Student student = Student.builder()
                .name("Mark")
                .department(department)
                .build();

        department.setStudent(student);
        departmentRepository.save(department);

        studentRepository.save(student);
    }
}
