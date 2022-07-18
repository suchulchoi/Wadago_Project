package com.wadago;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Ex03 {
	 public static void main(String[] args) throws Exception {
		 ScriptEngine engine=new ScriptEngineManager().getEngineByName("python");
		 try {
			 engine.eval("print('Python-Hello world')");
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
}
