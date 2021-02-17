Names: John Peters, Daniel Leskiewicz, Derek Gauger
Class: SE 2811 051 Group 7
Pattern Name: Builder Pattern

Project Idea: We want to use the builder design pattern to allow a user to choose and build from preset
computers instead of having the user compile a list of components themselves. Many users would
rather just get a computer that is rated for a specific spec and not understand how each component
contributes to that. The builder pattern allows the costumer to just choose a computer instead of trying
to figure out what amount of RAM they want, what speed should that RAM run at or even the timings of
the Caches of the RAM; what Mother Board they need for what CPU, what GPU they need to be able to
do what they want to do, what amount of power is being consumed so that they know what PSU to buy.
The builder pattern will let the user just build a computer that can run x game at however many FPS.

Repository: https://github.com/petersjg/group-7

What presentation should include:
1. The motivation behind this pattern is to be able to design a flexible solution to various object
creations problems. The whole point of using the builder pattern is to separate the construction
of a complex object from its representation. An example of the builder pattern is when creating
cars. We can use this pattern to create a Car class and create different car builder classes which
would implement an interface and implement their own design. This can also be done without
current example such as computer building. We can create a class for the Computer and create
different styles of builder classes that implement an interface and implement their own unique
features for each builder.
2. The builder pattern is trying to solve problems like, a class that can create different
representations of a complex object, and also how a class that includes a complex object can be
simplified. Other more in-depth solutions also include encapsulate creating and assembling
parts of a complex object in a separate Builder object. Lastly, the pattern also solves the issues
by allowing the class to delegate object creation to a builder object instead of creating the
objects directly.

Responsibilities:

John: Code Structure, Documentation, UML & Sequence Diagrams (and the respective slides),
most of Main (all except first switch)

Derek: fleshing out different builders by writing out the getters and setters (the strings needed
to be written out), did the limitations, summary, and advantages in presentation

Daniel: Motivation and problem statement slides and the first switch statement (with its
scanner) 
