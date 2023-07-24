package com.ccb.fintech.vendorautodispatch.controller;

import com.ccb.fintech.vendorautodispatch.entity.Test;
import com.ccb.fintech.vendorautodispatch.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tests")
public class TestController {

    private final TestMapper testMapper;

    @Autowired
    public TestController(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    // 查询所有Test记录
    @GetMapping
    public List<Test> getAllTests() {
        return testMapper.findAll();
    }

    // 根据id查询Test记录
    @GetMapping("/{id}")
    public Test getTestById(@PathVariable Long id) {
        return testMapper.findById(id);
    }

    // 新增Test记录
    @PostMapping
    public void addTest(@RequestBody Test test) {
        testMapper.insert(test);
    }

    // 更新Test记录
    @PutMapping("/{id}")
    public void updateTest(@PathVariable Long id, @RequestBody Test test) {
        test.setId(id); // 设置要更新的记录的id
        testMapper.update(test);
    }

    // 根据id删除Test记录
    @DeleteMapping("/{id}")
    public void deleteTest(@PathVariable Long id) {
        testMapper.deleteById(id);
    }
}
