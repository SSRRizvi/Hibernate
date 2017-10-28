

.# Hibernate
Hibernate Complex example with simple solution : 
 1. A OneToMany relationship in Java is where the source object has an attribute that stores a collection of target objects and 
    if those target objects had the inverse relationship back to the source object it would be a ManyToOne relationship. 
 2. All relationships in Java and JPA are unidirectional, in that if a source object references a target object there is 
    no guarantee that the target object also has a relationship to the source object. This is different than a relational database, 
    in which relationships are defined through foreign keys and querying such that the inverse query always exists.
 3. JPA also defines a ManyToMany relationship, which is similar to a OneToMany relationship except that the inverse relationship (if it were defined) 
    is a ManyToMany relationship. 
 4. The main difference between a OneToMany and a ManyToMany relationship in JPA is that a ManyToMany always makes use of 
    an intermediate relational join table to store the relationship, whereas a OneToMany can either use a join table, 
    or a foreign key in target object's table referencing the source object table's primary key. 
    If the OneToMany uses a foreign key in the target object's table JPA requires that the relationship be bi-directional (inverse ManyToOne 
    relationship must be defined in the target object), and the source object must use the mappedBy attribute to define the mapping.

 5. If the Collection is defined using generics to specify the element type, the associated target entity class does not need to be specified

 6. @ManyToMany – Is used to create many-to-many relationship between Employee and Meeting entities. 
    If the Collection is defined using generics to specify the element type, the associated target entity class does not need to be specified,
    otherwise it must be specified. 

 7. Every many-to-many association has two sides, the owning side and the non-owning/inverse side. 
    The join table is specified on the owning side. If the association is bidirectional, either side may be designated as the owning side. 

8. @MapKey is used when the entity is returning Map. Map is key value pair. So to decide what should be the key of map, @MapKey use name      as an attribute which would ne key of map
   i.e
      @MapKey(name="name") // employee class property, can be any name of employee class which you want work as key of map 
	     private Map<String, Employee> employeeList = new HashMap<String,Employee>();
9. @OrderBy("column(property) name ASC/DESC") : This annotation is used to define order of fetehed entity list/set
   i.e
     @OneToMany(targetEntity=Employee.class , cascade=CascadeType.ALL, fetch=FetchType.EAGER)
     @JoinColumn(name="empDeptId")
     @OrderBy("age ASC") // property name
     private List<Employee> employeeList = new ArrayList<Employee>(); 
 

