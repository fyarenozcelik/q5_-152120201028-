package com.example.q5_152120201028.Service;

import com.example.q5_152120201028.Entity.Test;
import com.example.q5_152120201028.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public List<Test> getAllTests() {
        return testRepository.findAll();
    }

    public Optional<Test> getTestById(Long id) {
        return testRepository.findById(id);
    }

    public Test createTest(Test test) {
        return testRepository.save(test);
    }

    public Test updateTest(Long id, Test testDetails) {
        Test test = testRepository.findById(id).orElseThrow();
        test.setName(testDetails.getName());
        test.setSurname(testDetails.getSurname());
        test.setPassword(testDetails.getPassword());
        return testRepository.save(test);
    }

    public void deleteTest(Long id) {
        testRepository.deleteById(id);
    }
}
