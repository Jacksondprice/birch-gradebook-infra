package com.birchgradebookinfra;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
