package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

@RestController
public class BasicJeepSalesController implements JeepSalesController {

  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
    
    return null;
  }

}
