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