package com.javatpoint;  
public class Calculator{  
  
public int cube(int n){return n*n*n;}  
  
}  

<jsp:useBean id="obj" class="com.javatpoint.Calculator"/>  
  
<%  
int m=obj.cube(5);  
out.print("cube of 5 is "+m);  
%>  