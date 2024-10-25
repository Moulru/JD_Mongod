package com.jdmongod.jd_mongod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// JDMongod 메인 컨트롤러
@Controller
public class JDMongodMainController {

  // 임시 컨트롤러
  @GetMapping("/noticeBoard")
  public String firstController() {
    return "noticeBoard";
  }
}
