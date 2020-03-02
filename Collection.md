#集合框架
##集合的概念
集合是用来存放对象的一组容器
##集合与数组的区别
数组有局限性，不能超出下标值

集合没有局限，容量capacity会随着对象增长而增长
##集合常用方法
ArrayList类实现了List接口的所有方法

add(); contains(); get(); indexof(); remove(); set(); size(); toArray(); addAll(); clear();

集合添加泛型可以指定添加对象的类型只能是该类和他的子类
##集合的遍历
1.for循环(普通型或增强型) 

2.迭代器遍历
##LinkedList
LinkedList类既实现了List接口。

也实现了双向链表Deque接口，可以很方便的在头尾插入删除数据

进而实现了Queue接口，Queue是先进先出队列 FIFO

常用方法：

1.offer 在最后添加元素
          
 2.poll 取出第一个元素
   
 3.peek 查看第一个元素
##二叉树排序
二叉树特点：

1.每个节点都可以有左子节点，右子节点

2.每一个节点都有一个值

3.二叉树的中序遍历结果可以作为排序结果
##HashMap
HashMap储存数据的方式是—— 键值对

一个key只能对应一个value

一个value可以对应多个key
##HashSet
Set中的元素，不能重复

Set中的元素，没有顺序。
严格的说，是没有按照元素的插入顺序排列

HashSet的具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序。

Set不提供get()来获取指定位置的元素。
所以遍历需要用到迭代器，或增强型for循环

通过观察HashSet的源代码

可以发现HashSet自身并没有独立的实现，而是在里面封装了一个Map.

HashSet是作为Map的key而存在的

而value是一个命名为PRESENT的static的Object对象，因为是一个类属性，所以只会有一个。

    private static final Object PRESENT = new Object();
##Collection
Collection是 Set,List,Queue和 Deque的接口.
##Collections
Collections是一个类，容器的工具类,就如同Arrays是数组的工具类

反转：reverse(List list)

混淆：shuffle(List list)

排序：sort(List list)

交换：swap(List list,int index,int index)

滚动：rotate(List list,int i)

线程安全化：synchronizedList(List list)
##ArrayList和HashSet的区别
1、ArrayList: 有顺序；HashSet: 无顺序

2、List中的数据可以重复；Set中的数据不能够重复

重复判断标准是:

首先看hashcode是否相同

如果hashcode不同，则认为是不同数据

如果hashcode相同，再比较equals，如果equals相同，则是相同数据，否则是不同数据
##ArrayList和LinkedList的区别
1、ArrayList 插入，删除数据慢；LinkedList插入，删除数据快

2、ArrayList是顺序结构，所以定位很快；LinkedList 是链表结构，定位慢
##HashMap和Hashtable的区别
HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式

1、HashMap可以存放 null；Hashtable不能存放null

2、HashMap不是线程安全的类；Hashtable是线程安全的类
##HashSet、LinkedHashSet、TreeSet的区别
HashSet：无序；
LinkedHashSet：按照插入顺序；
TreeSet：从小到大排序；