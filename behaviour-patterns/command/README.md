# Command

Usefull Links :
- https://www.baeldung.com/java-command-pattern


## Definition

The <b>command</b> pattern is a behavioral design pattern . Simply put, the pattern intends to <b>encapsulate in an object 
all the data required for performing a given action (command)</b>, including what method to call, the method’s arguments, 
and the object to which the method belongs.

This model allows us to <b>decouple objects that produce the commands from their consumers</b> , so that’s why the pattern 
is commonly known as the <b>producer-consumer</b> pattern.

## Diagram

![Command](command.jpg)

A command is an object whose role is to <b>store all the information required for executing an action</b>, including the 
method to call, the method arguments, and the object (known as the receiver) that implements the method.

A <b>receiver</b> is an object that <b>performs a set of cohesive actions</b>. It’s the component that performs the actual 
action when the command’s execute() method is called.

An <b>invoker</b> is an object that knows how to execute a given command but doesn’t know how the command has been implemented. 
It only knows the command’s interface.In some cases, the invoker also stores and queues commands, aside from executing 
them. This is useful for implementing some additional features, such as macro recording or undo and redo functionality.

## Design 
- Object per command 
- Command Interface 
- Execute Method 
- ‘Unexecute’ method 
- Reflection 
- Command, Invoker, ConcreteCommand


## Summary 
- Encapsulate each request as an object 
- Decouple sender from processor 
- Very few drawbacks 
- Often used for undo functionality 

## Usage in JDK
- All implementations of java.lang.Runnable
- All implementations of javax.swing.Action

## Java 8 Object-Functional Implementation

### Using Lambda Expressions
```
TextFileOperationExecutor textFileOperationExecutor
 = new TextFileOperationExecutor();
textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt");
textFileOperationExecutor.executeOperation(() -> "Saving file file1.txt");
```
### Using Method References
```
TextFileOperationExecutor textFileOperationExecutor
 = new TextFileOperationExecutor();
TextFile textFile = new TextFile("file1.txt");
textFileOperationExecutor.executeOperation(textFile::open);
textFileOperationExecutor.executeOperation(textFile::save);
```

## Undo Redo Implementation
- https://codereview.stackexchange.com/questions/172662/command-pattern-with-undo-returning-response-in-invoker-and-command-class-or-c
- https://blog.zenika.com/2014/12/15/pattern-command-undo-variations-compensation-replay-memento2/
