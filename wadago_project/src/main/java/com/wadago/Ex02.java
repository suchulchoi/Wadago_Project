package com.wadago;

import java.io.FileReader;
import java.io.StringWriter;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.SimpleScriptContext;

public class Ex02 {
   public static void main(String[] args) throws Exception {
	   ScriptEngineManager manager=new ScriptEngineManager();
	   ScriptContext context=new SimpleScriptContext();
	   
	   StringWriter writer=new StringWriter();
	   context.setWriter(writer);
	   ScriptEngine engine=manager.getEngineByName("python");
	   engine.eval(new FileReader("C:\\Users\\mom\\Desktop\\test\\sum.py"),context);
	   System.out.println(writer.toString());
   }
}
