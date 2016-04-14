package com.feprism.pojo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.lang.reflect.Method;
//import static org.junit.Assert;

/** 
* LogTask Tester. 
* 
* @author <Authors name> 
* @since <pre>十二月 24, 2015</pre> 
* @version 1.0 
*/ 
public class LogTaskTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: taskSaveLogToDatabase() 
* 
*/ 
@Test
public void testTaskSaveLogToDatabase() throws Exception { 
//TODO: Test goes here...
   Method method = LogTask.class.getMethod("taskSaveLogToDatabase");
   method.setAccessible(true);
   method.invoke(new LogTask());
} 


/** 
* 
* Method: getScriptError() 
* 
*/ 
@Test
public void testGetScriptError() throws Exception { 
//TODO: Test goes here...
   System.out.println("testGetScriptError");
/* 
try { 
   Method method = LogTask.getClass().getMethod("getScriptError"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
