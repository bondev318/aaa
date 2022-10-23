package com.example.mssv.hoten.a.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mssv.hoten.a.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
