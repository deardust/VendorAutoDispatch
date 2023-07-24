package com.ccb.fintech.vendorautodispatch;

import com.ccb.fintech.vendorautodispatch.mapper.TestMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VendorAutoDispatchApplication {

    private final TestMapper testMapper;

    public VendorAutoDispatchApplication(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendorAutoDispatchApplication.class, args);
    }




}
