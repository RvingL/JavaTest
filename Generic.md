#泛型
##泛型的理解
1.不指定泛型的容器，可以存放任何类型的元素

指定了泛型的容器，只能存放指定类型的元素以及其子类
##通配符
1.<? extends>  

ArrayList heroList<? extends Hero> 表示这是一个Hero泛型或者其子类泛型

从heroList取出来的对象，一定是可以转型成Hero的
               
但是，不能往里面放东西

2.<? super>

ArrayList heroList<? super Hero> 表示这是一个Hero泛型或者其父类泛型

可以往里面插入Hero以及Hero的子类

但是取出来有风险，因为不确定取出来是Hero还是Object
##总结
如果希望只取出，不插入，就使用? extends Hero

如果希望只插入，不取出，就使用? super Hero

如果希望，又能插入，又能取出，就不要用通配符？