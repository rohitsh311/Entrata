# Entrata Task

Tests to check various functionalities of Entrata [Visit Website](https://www.entrata.com "Entrata") webapplication.
#### * Testcase 1 - To check user has navigated to required webpage by passing right url.
  - Here user passes the url [Visit Website](https://www.entrata.com "Entrata") in the address bar.After entering the said url user is navigated to home page of said      webapplication.

     ![image](https://github.com/rohitsh311/Entrata/assets/143522780/c64c51d5-26e6-42c4-a92f-1da62eab42c5)

  - By using Hard assertion(eg. Assert.assertEquals) validation of navigation to required webpage is done.
  ## Execution of Test 1
    - Create Maven Project(eg.TestNG) in Eclipse IDE.
    - Create package in the said project.For eg. 'urlaunch'
    - In 'urlaunch' package create a class named browserlauch.Inside the class we have written the testscript for validating required functionality.
    - Before executing the browser method inside this class provide @Test annotation for the method and remove the @Test annotation provided to all other methods in this
      package and other package as well.
    - For implementation of this test case we run this class using Maven install command.
    - Assert.asserEquals() method is used for validating whether user has navigated to requied url  [Visit Website](https://www.entrata.com "Entrata").
    - Here, only browser method is executed and in console the message of "Url is Verified" is diplayed.
      

#### * Testcase 2 - Click on Watch demo button and fill the details and verify the details entered are correct or not.
  - Here user clicks on Watch Demo button displayed on homepage [Visit Website](https://www.entrata.com "Entrata"). After clicking below page appears where we check the data
     which we are entering is validated.

      ![image](https://github.com/rohitsh311/Entrata/assets/143522780/2d89988f-2f0f-45ad-9389-1cecd7d034e0)

   ## Execution of Test 2
    - Inside the project we create a separate package named WatchDemo under which class named WatchButton is created. 
    - Inside the class watch() method is created which has the requisite test script for implementation of this test case.
    - Before executing this Test case write @Test annotaion to watch method and remove @Test annotations from all the other methods in all other packages.
      We can use maven install command to run this test case.
    - Here we use Assert.assertTrue() to check whether the Watch Demo button is enabled and Assert.assertEquals() for validating the data enterd inside the text boxes is same 
      as entered.In console we get various output printed which validate the proper functioning as per expectations.

#### * Testcase 3- Navigating to different page and verifying the navigation.
    - Here user clicks on link [Visit Website](https://www.entrata.com/products/revenue-management "ERM") mentioned in footer section of the homepage of this webapplication.
      After clicking the link [Visit Website](https://www.entrata.com/products/revenue-management "ERM") page validation of navigation to expected webpage is done.

   ## Execution of Test 3
    - Inside the browserlaunch class nav() method is created. Test script for requisite functionality is written in this method.
    - For execution of this Test case we write @Test annotation for nav() method and then implement this class using maven install command.
    - Asesert.assertEquals method is used to verify the nabvigation is as per expectation and we also get the output in the console.

### Note: The Execution of said code can also be done by keeping all the @Test annotations as it is and directly implementing the pom.xml file through maven.       
###       The steps in above respective test cases are mentioned to simplify the process of understanding the execution of test cases.


  ## Dependencies Used

  
        ![image](https://github.com/rohitsh311/Entrata/assets/143522780/0d384e7e-3948-42f9-a0ef-402ddfc70fb6)



      

  
