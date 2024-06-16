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

## Printing Methods

Consider the repetitive structure of a knock-knock joke.  
The only difference between two jokes is:

1. The **name** of who is at the door, and
2. The **punchline**.

| Joke#1 | Joke#2 |
| --- | ----------- |
| Knock-knock. | Knock-knock. |
| Who's there? | Who's there? |
| Nobel. | Figs. |
| Nobel who? | Figs who? |
| Nobel…that’s why I knocked! | Figs the doorbell, it's not working!  |

Consider the following code that prints both jokes.  The print statements are similar.

```java
public class JokeMakerStarter {

	public static void main(String[] args) {
		
		String name = "Nobel";
		String punchline = "Nobel…that’s why I knocked!";
		
		System.out.println("Knock knock");
		System.out.println("Who's there");
		System.out.println(name);
		System.out.println(name + " who");
		System.out.println(punchline);
		
	}
}
``` 



[Visualize using Python Tutor http://pythontutor.com](https://pythontutor.com/render.html#code=public%20class%20JokeMaker%20%7B%0A%20%20%20%20%0A%20%20%20%20public%20static%20void%20tellJoke%28String%20who,%20String%20punchline%29%20%7B%0A%20%20%20%20%20%20%20%20System.out.println%28%22Knock%20knock%22%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28%22Who's%20there%3F%22%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28who%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28who%20%2B%20%22%20who%3F%22%29%3B%0A%20%20%20%20%20%20%20%20System.out.println%28punchline%29%3B%0A%20%20%20%20%7D%0A%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20%20%20tellJoke%28%22Tank%22,%20%22You're%20Welcome.%22%29%3B%0A%20%20%20%20%20%20%20%20tellJoke%28%22Nobel%22,%20%22No%20bell,%20that's%20why%20I%20knocked!%22%29%3B%0A%20%20%20%20%7D%0A%7D&cumulative=false&curInstr=0&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false)

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
