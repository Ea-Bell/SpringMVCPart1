package hello.servlet.basic.frontcontroller.v3;

import hello.servlet.basic.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String>paramMap);

}
