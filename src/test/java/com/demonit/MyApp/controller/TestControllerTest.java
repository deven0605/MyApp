package com.demonit.MyApp.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.*;
public class TestControllerTest {

    TestController testController = new TestController();

    @Test
    public void getMessage() {
        String par = "Hello World!";
        String res = testController.getMessage(par);
        assertEquals(par, res);
    }
}
