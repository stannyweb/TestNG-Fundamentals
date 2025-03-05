package chapter1;

import org.testng.annotations.*;

public class Configuration_Annotations {
    /*
    @BeforeSuite: Изпълнява се само веднъж, преди всички тестове в suite-а.
    Използва се за инициализиране на глобални ресурси, които са необходими за всички тестове.
     */
    @BeforeSuite
    void beforeSuite() {
//        Before Suite: Изпълнява се преди всички тестове в suite-а.
        System.out.println("Chrome - Set up System Property");
    }

    @BeforeTest
    void beforeTest() {
//        Before Test: Изпълнява се преди всички тестове в <test> tag.
        System.out.println("Open Chrome");
    }

    @BeforeClass
    void beforeClass() {
//        Before Class: Изпълнява се преди първия тест в класа.
        System.out.println("Open Test Application");
    }

    @BeforeMethod
    void beforeMethod() {
//        Before Method: Изпълнява се преди всеки тест метод.
        System.out.println("Sign in");
    }

    @Test
    void searchCustomer() {
//        Test Method 1: Изпълнява се тест метод 1.
        System.out.println("Search for customer");
    }

    @Test
    void searchProduct() {
//        Test Method 2: Изпълнява се тест метод 2.
        System.out.println("Search for product");
    }

    @AfterMethod
    void afterMethod() {
//        After Method: Изпълнява се след всеки тест метод.
        System.out.println("Sign out");
    }

    @AfterClass
    void afterClass() {
//        After Class: Изпълнява се след последния тест в класа.
        System.out.println("Close the application");
    }

    @AfterTest
    void afterTest() {
//        After Test: Изпълнява се след всички тестове в <test> tag.
        System.out.println("Close chrome");
    }

    /*
    @AfterSuite: Изпълнява се само веднъж, след като всички тестове в suite-а са изпълнени.
    Използва се за освобождаване на глобални ресурси.
     */
    @AfterSuite
    void afterSuite() {
//        After Suite: Изпълнява се след всички тестове в suite-а.
        System.out.println("Chrome - Clean up all cookies");
    }


}
