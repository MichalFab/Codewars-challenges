# Java Functional Programming (Part 3: Closured for Business)

Write a factory that creates adder functions. Depending on what is passed to the create method, the function will, when called, add that amount to another amount given to the function. In other words:

`f = AdderFactory.create(1); //Adds 1 to everything
 f.applyAsInt(4) == 5;
 f.applyAsInt(10) == 11;
 f.applyAsInt(-5) == -4;`