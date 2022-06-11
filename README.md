# fossil_interview_code
Every question was submitted in seperated folder which include the Main.java, open your edittor and run Main.java to run the code
### Question 1

*Output:*
```
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
```

### Question 2

*Output:*
```
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=100
```
### Question 3

*Output:*
```
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=200
maxSpeed=100
maxSpeed=100
maxSpeed=100
```
Because when we run two method with two different thread, but JVM doesn't promise any order in thread execution.
Therefore, we have two method run without any sequences. Wait until 1 thread is finish its job and run the other to produce the order just like question 1

### Question 4

*Output:*
```
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
maxSpeed=100
maxSpeed=200
```
use concurrency control methods such as using locks with the `synchronized` keyword, implementing a customized `Runnable` or `Callable` interface or using `mutexes`