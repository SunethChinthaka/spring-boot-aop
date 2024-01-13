# spring-boot-aop

**What is AOP?**

Aspect Oriented Programming (AOP) is a programming paradigm aiming to segregate cross-cutting functionalities, such as logging, from business logic in an application

Spring boot application mainly divided in to three layers:

Web Layer for exposing the services using RESTFul web services.
Business layer to handle business logic.
Data Layer for data persistence logic.

Each layer is having different responsibility and there are some common aspects which gets apply to all layers. e.g. Logging, Security, Validation, etc. Common aspects are also called as cross-cutting concerns.

Spring AOP has interceptors which can intercept application and its methods.


**What are AOP Terminologies?**

**Aspect**:
Aspect is a class in which we define Pointcuts and Advices.

**Advice**:
It’s the behavior that addresses system-wide concerns (logging, security checks, etc…). This behavior is represented by a method to be executed at a JoinPoint. This behavior can be executed Before, After, or Around the JoinPoint according to the Advice type as we will see later.

**Pointcut**:
A Pointcut is an expression that defines at what JoinPoints a given Advice should be applied.

**JoinPoint**:
Simply put, a JoinPoint is a point in the execution flow of a method where an Aspect (new behavior) can be plugged in.

**What are Types of advices in aspectj AOP?**

**@Before** : Advice that executes before a join point, but which does not have the ability to prevent execution flow proceeding to the join point (unless it throws an exception).

**@AfterReturning** : Advice to be executed after a join point completes normally.

**@AfterThrowing** : Advice to be executed if a method exits by throwing an exception.

**@After** : Advice to be executed regardless of the means by which a join point exits (normal or exceptional return).

