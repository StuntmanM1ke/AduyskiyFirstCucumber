package ru.bellintegrator.test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Steps{



    @Before
    public void open(){
        открытьХром();
    }

    @After
    public void close(){
        закрытьХром();
    }


}
