package com.example.mssv.hoten.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mssv.hoten.a.entity.Subject;
import com.example.mssv.hoten.a.repository.SubjectRepository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRepository subjectRepository;

	@Override
	public Subject save(Subject subject) {
		// TODO Auto-generated method stub
		return subjectRepository.save(subject);
	}

	@Override
	public List<Subject> findAll() {
		// TODO Auto-generated method stub
		return subjectRepository.findAll();
	}

}
