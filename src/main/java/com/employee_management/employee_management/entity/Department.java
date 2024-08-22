package com.employee_management.employee_management.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String departmentName;
    @OneToOne(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Student student;
}
