# Writing Methods

## Learning Goals

- Learning Goal 1
- Learning Goal 2

## Introduction

A program often requires an operation to be performed repeatedly on different data values. This may result in a large program with redundant code that is difficult to understand, debug, and maintain.  

Code redundancy can be reduced by creating a block of reusable code. 
A **method** allows us to name a block of code that can be called to operate on specific data values.  

How do methods improve software? 

- A big problem is solved by dividing into subproblems. 
- Code duplication is eliminated, making code easier to reuse and maintain.


## Code-Along Instructions

Walk the student through any setup required to run the lesson.....


## Methods Basics

why - reduce redundancy, reduce errors, improve readability, reuse

## Issues with code duplication 

Consider the repetitive structure of a knock-knock joke.  
The only difference between two jokes is:

1. The **name** of who is at the door, and
2. The **punchline**.

|Line| Joke#1 | Joke#2 |
|---| --- | ----------- |
|1| Knock-knock. | Knock-knock. |
|2| Who's there? | Who's there? |
|3| Nobel. | Figs. |
|4| Nobel who? | Figs who? |
|5| Nobel…that’s why I knocked! | Figs the doorbell, it's not working!  |

The `main()` method listed below contains sample code to print both jokes. The variables `name` and `punchline` are used to demonstrate the common structure of all knock-knock jokes. 

```java
public class JokeMakerCodeDuplication {

	public static void main(String[] args) {
		
		//Tell first joke
		String name = "Nobel";
		String punchline = "Nobel…that’s why I knocked";
		
		System.out.println("Knock knock");
		System.out.println("Who's there");
		System.out.println(name);
		System.out.println(name + " who");
		System.out.println(punchline);
		
		//Tell second joke
		name = "Figs";
		punchline = "Figs the doorbell, it's not working";
		
		System.out.println("Knock knock");
		System.out.println("Who's there");
		System.out.println(name);
		System.out.println(name + " who");
		System.out.println(punchline);
	}

}
```

The print statements are identical for each joke. Notice the punctuation was omitted at the end of each line. If we want to add punctuation, we must perform similar updates to the print statements associated with each joke.  While this example is trivial, code duplication can cause serious maintenance problems in real applications as it is difficult to locate and consistently update all occurrences of duplicated code.
 
We will eliminate the redundant code by defining a new method that tells a knock-knock joke.  A method is defined within a Java class and consists of a header and body.  The  header is also called a method signature, and includes an access modifier, static modifier, return type, name, and formal parameters. The method body consists of a set of statements enclosed in curly braces { }.

![tellJoke method header and body](images/methodsignature.png)

- Most of the methods we'll write will be declared using the `public` and `static` modifiers.  We'll cover what these modifiers mean in a later lesson.   
- The return type indicates the type of value returned by the method.  The `tellJoke()` method prints to the console but does not return a value so the return type is `void`.  
- The formal parameters `name` and `punchline` allow different values to be substituted for the joke when the method is called. The method body uses the parameter variables to customize the print statements.

We call the `tellJoke` method by passing in values for `name` and `punchline` as shown below.  The values passed into the method call are called `arguments` or `actual parameters`, and should correspond to the order and type of the formal parameters. :

`![calling tellJoke method passing values for name and punchline](images/methodcall.png)




```java
public class JokeMaker {
	
	public static void tellJoke(String who, String punchline) {
		System.out.println("Knock knock.");
		System.out.println("Who's there?");
		System.out.println(who + ".");
		System.out.println(who + " who?");
		System.out.println(punchline + "!");
	}

	public static void main(String[] args) {
		tellJoke("Nobel", "No bell, that's why I knocked");
		
		System.out.println();
		
		tellJoke("Figs", "Figs the doorbell, it's not working");
	}

}}
````






Python Tutor [http://pythontutor.com](http://pythontutor.com)





## Deliverables

List each of the deliverables the student must complete in order to finish the
lab. Provide as much context as possible, including instructions on how to run
the tests and other means of validating successful completion of deliverables.

## Conclusion

A short one or two paragraph summary of the contents of the lessons, recapping
the learning goals.

## Resources

- [Resource Link 1](example.com)
- [Resource Link 2](example.com)
