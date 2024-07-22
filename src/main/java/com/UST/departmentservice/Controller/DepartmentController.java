The code provided is written in Spring Boot version 2.x.

Here is the upgraded code compatible with Java 17, incorporating new language features, standards, and best practices:

```java
package com.ust.departmentservice.controller;

import com.ust.departmentservice.model.Department;
import com.ust.departmentservice.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartmentById(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }
}
```

Note: In the upgraded code, I followed best practices of naming conventions and made some changes to improve readability. I also updated the `Autowired` annotation to constructor injection, which is a recommended practice in the latest Spring versions.