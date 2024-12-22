The Java Collections Framework is a powerful architecture for storing and manipulating groups of objects. Here is an overview of the collections hierarchy in Java:

### Core Interfaces
1. **Collection**: Root interface for most collections.
   - **List**: An ordered collection that allows duplicate elements.
     - **ArrayList**
     - **LinkedList**
     - **Vector**
     - **Stack**
   - **Set**: A collection that does not allow duplicate elements.
     - **HashSet**
     - **LinkedHashSet**
     - **TreeSet**
   - **Queue**: A collection used to hold elements before processing.
     - **PriorityQueue**
     - **Deque**
       - **ArrayDeque**
       - **LinkedList**

2. **Map**: Interface for key-value pair collections.
   - **HashMap**
   - **LinkedHashMap**
   - **TreeMap**
   - **Hashtable**
   - **ConcurrentHashMap**

### Abstract Classes
- **AbstractCollection**
- **AbstractList**
- **AbstractSet**
- **AbstractQueue**
- **AbstractMap**

### Iterator Utility Classes
- **Iterator: Allows iteration over collection elements.**
- **ListIterator: Extends the Iterator interface for lists, enables bidirectional iteration.**

### Support Classes
- **Collections: Contains utility methods for collections.**
- **Arrays: Contains methods for manipulating arrays.**

### Example Methods Used
- `add(E e)`: Adds an element to the collection.
- `remove(Object o)`: Removes an element from the collection.
- `size()`: Returns the number of elements in the collection.
- `clear()`: Removes all elements from the collection.
- `contains(Object o)`: Checks if an element is present in the collection.

For more details, refer to (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html).