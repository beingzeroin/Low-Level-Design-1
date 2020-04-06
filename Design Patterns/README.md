# Let's Discuss Design pattern in Java
## These are classfied into 3 categories -
	1. Creational
	2. Structural
	3. Behavioural


### Creational Category basically deals with Object Creation.
`There are several pattern in this category as follows`.
1. Singleton
2. Builder
3. Prototype
4. Factory
5. AbstractFactory

# SINGLETON DESIGN PATTERN

## Concepts
	1. Only one instance created
	2. Guarantees control of a resource
	3. Lazily Loaded
	4. Examples:
		a. Runtime
		b. Logger
		c. Spring Beans
		d. Graphic Managers

## Design
	1. Class is responsible for lifecycle
	2. Static in nature
	3. Needs to be thread safe
	4. Private instance
	5. Private Constructor
	6. No parameters required for construction else it will be factory

`I coded Singleton pattern for DATABASE CONNECTION and ADDRESS VALIDATION`

# BUILDER DESIGN PATTERN

## Concepts
	1. Remove Dirty Code because we dont have to handle arguments of const. seperately
	2. Client does not have to remember order of arguments
	3. Backward Compatible, because we can add any no of new var. w/o affecting prev code.
	4. Examples:
		a. When parameters are more
		b. If there is possibility of addition of more args in future.


## Design
	1. Ther is Builder class which is nested inside Master Class
	2. Builder class is Static in nature
	3. Private Constructor of Master Class
	6. Setters are there to set value of return type Builder and build of type Master cls

`I coded Builder pattern for Bird Class`
