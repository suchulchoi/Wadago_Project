package com.wadago;

import org.python.core.PyInteger;
import org.python.util.PythonInterpreter;

public class Ex01 {
   public static void main(String[] args) {
      PythonInterpreter python = new PythonInterpreter();
      python.set("num", 20);
      python.exec("square = num * num");
      PyInteger square = (PyInteger) python.get("square");
      System.out.println("square: "+square.asInt());
      python.close();
   }
}