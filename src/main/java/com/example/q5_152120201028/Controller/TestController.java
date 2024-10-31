package com.example.q5_152120201028.Controller;

import com.example.q5_152120201028.Entity.Test;
import com.example.q5_152120201028.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tests")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping
    public List<Test> getAllTests() {
        return testService.getAllTests();
    }

    @GetMapping("/{id}")
    public Optional<Test> getTestById(@PathVariable Long id) {
        return testService.getTestById(id);
    }

    @PostMapping
    public Test createTest(@RequestBody Test test) {
        return testService.createTest(test);
    }

    @PutMapping("/{id}")
    public Test updateTest(@PathVariable Long id, @RequestBody Test testDetails) {
        return testService.updateTest(id, testDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        testService.deleteTest(id);
    }
}
