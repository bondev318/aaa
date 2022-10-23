package com.example.mssv.hoten.a.service;

import java.util.List;

import com.example.mssv.hoten.a.entity.Subject;

public interface SubjectService {
	Subject save(Subject subject);

	List<Subject> findAll();
}
