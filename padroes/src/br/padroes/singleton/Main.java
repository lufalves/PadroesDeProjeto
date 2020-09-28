package br.padroes.singleton;

class Main {
	  public static void main(String[] args) {

	    singleObject s1 = singleObject.getInstance();
	    singleObject s2 = singleObject.getInstance();
	    singleObject s3 = singleObject.getInstance();

	    System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	    System.out.println(s3.hashCode());
	  }
	}