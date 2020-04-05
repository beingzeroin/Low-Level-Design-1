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
