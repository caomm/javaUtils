package com.full.cn.utils;

import org.junit.Test;
import org.python.util.PythonInterpreter;

public class Java2Python {

    @Test
    public void java2Json(){
        PythonInterpreter interpreter = new PythonInterpreter();
        interpreter.exec("days=('mod','Tue','Wed','Thu','Fri','Sat','Sun'); ");
        interpreter.exec("print days[6];");
        //interpreter.exec("print('hello')");
    }
}
