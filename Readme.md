
To build the code :
mvn clean install

To execute -
java -jar problemset-1.0-SNAPSHOT.jar

UniqueElementsImplSol1 

  - maintains the order
  - uses Java 8 distinct function to find Unique Elements
  - it uses LinkedHashSet in background
  
UniqueElementsImplSol2

  - Set never stores any Duplicates ,so this may be an ideal solution 
  - time complexity will be O(N)
  
UniqueElementsImplSol3

  - Implements using HashMap
  - also can give us a count of duplicate elements
  - time complexity will be O(N)
  
