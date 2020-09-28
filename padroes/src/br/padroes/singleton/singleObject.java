package br.padroes.singleton;


public final class singleObject {


private static final singleObject instance = new singleObject();

private singleObject(){}

public static singleObject getInstance(){
   return instance;
}

public void showMessage(){
   System.out.println("Hello World!");
}
}