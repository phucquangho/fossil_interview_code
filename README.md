# fossil_interview_code

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
To show the output speed in-turn orders like above, we need to use synchronized, wait, and notify to same notification resource to control when thread need to print out data.
