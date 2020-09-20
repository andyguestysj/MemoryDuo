class Main {
  public static void testMethod(int localInt, demo localObject)
  {
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("testMethod : localInt is " + localInt);
    System.out.println("testMethod : localObject.testValue value is  " + localObject.testValue);
    System.out.println("");

    System.out.println("testMethod : localInt incremented by 5");
    System.out.println("testMethod : localObject.testValue incremented by 5");
    localInt += 5;
    localObject.testValue +=5;
    System.out.println("");

    System.out.println("testMethod : localInt changed to " + localInt);
    System.out.println("testMethod : localObject.testValue changed to " + localObject.testValue);
    System.out.println("");
  }

  public static void main(String[] args) {
    demo testObject = new demo();
    testObject.testValue = 1;
    int testInt = 2;

    System.out.println("main : testInt is " + testInt);
    System.out.println("main : testObject.testValue value is  " + testObject.testValue);
    System.out.println("");

    System.out.println("main : calling testMethod(testInt, testObject);");
    testMethod(testInt, testObject);
    System.out.println("");

    System.out.println("main : testMethod() completed");
    System.out.println("");

    System.out.println("main : testInt is " + testInt);
    System.out.println("main : testObject.testValue value is  " + testObject.testValue);
    System.out.println("");

  }


}