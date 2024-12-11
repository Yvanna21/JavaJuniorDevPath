Le framework des collections en Java est une architecture puissante pour stocker et manipuler des groupes d'objets. 
Voici une vue d'ensemble de la hiérarchie des collections en Java :

### Interfaces Principales
1. **Collection** : Interface racine de la plupart des collections.
   - **List** : Une collection ordonnée qui permet des éléments en double.
     - **ArrayList**
     - **LinkedList**
     - **Vector**
     - **Stack**
   - **Set** : Une collection qui ne permet pas les éléments en double.
     - **HashSet**
     - **LinkedHashSet**
     - **TreeSet**
   - **Queue** : Une collection utilisée pour maintenir les éléments avant le traitement.
     - **PriorityQueue**
     - **Deque**
       - **ArrayDeque**
       - **LinkedList**

2. **Map** : Interface pour les collections de paires clé-valeur.
   - **HashMap**
   - **LinkedHashMap**
   - **TreeMap**
   - **Hashtable**
   - **ConcurrentHashMap**

### Classes Abstraites
- **AbstractCollection**
- **AbstractList**
- **AbstractSet**
- **AbstractQueue**
- **AbstractMap**

### Classes Utilitaires pour les Itérateurs
- **Iterator : Permet d'itérer sur les éléments d'une collection.**

- **ListIterator : Étend l'interface Iterator pour les listes, permet l'itération dans les deux sens.**

### Classes de Support
- **Collections : Contient des méthodes utilitaires pour les collections.**

- **Arrays : Contient des méthodes pour manipuler les tableaux.**

### Exemples de Méthodes Utilisées
- `add(E e)` : Ajoute un élément à la collection.
- `remove(Object o)` : Supprime un élément de la collection.
- `size()` : Retourne le nombre d'éléments dans la collection.
- `clear()` : Supprime tous les éléments de la collection.
- `contains(Object o)` : Vérifie si un élément est présent dans la collection.

Pour plus de détails, consulter [cet article]https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html