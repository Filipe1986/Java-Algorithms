# Java-Algorithms

Textbook -> https://algs4.cs.princeton.edu/home/



・Algorithm: method for solving a problem.
・Data structure: method to store information.

Part 1

|topic | structures and algorithmsdata |
| ------------- |:-------------:| -----:|
|data types | stack, queue, bag, union-find, priority queue |
|sorting | quicksort, mergesort, heapsort |
|searching | BST, red-black BST, hash table |

Part 2
|topic | structures and algorithmsdata |
| ------------- |:-------------:| -----:|
|graphs | BFS, DFS, Prim, Kruskal, Dijkstra |
|strings | radix sorts, tries, KMP, regexps, data compression |
|advanced | B-tree, suffix array, maxflow |

```Java
    System.out.println("Code in .md file");
 ```

 ### UNION-FIND

##### Modeling the connections
We assume "is connected to" is an equivalence relation:

・Reflexive:  p is connected to p.

・Symmetric:  if p is connected to q, then q is connected to p.

・Transitive: if p is connected to q and q is connected to r,then p is connected to r

##### Union find

##### Quick find

|Algorithm|Initialize|union| find
| ------------- |:-------------:| -----:| --------:|
|Quick-Find| N | N | 1
|Quick-Union| N | N | N
|Weighted Quick-Union| N | Log N | Log N


Quick-Find is quadric: N unions takes N^2 acesses to process
