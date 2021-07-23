# 这个文件夹 工程 包含 <Sort 小高峰过滤 极速排序算法> 的 演化过程 和 它在<自然语言, 商旅, 欧拉环路径, 非线性链表, 象契字符串> 的排序上真实生态应用.
#### 极速排序, The Top Sort, 当前世界第一数组排序算法和它的应用实例.

###### 测试结果 ，联想 legion 品牌 测试，1000万随机double数组排序耗时 0.9 秒。(单机1亿double随机 11秒排完)

###### 测试算法如下：

######   int []array1=arrayInit(); 
######   System.out.println(" ");
######   System.out.println("罗瑶光小高峰过滤快速排序5代：");
######   TimeCheck imeCheck1= new TimeCheck();//时间记录
######   imeCheck1.begin();
######   array1=new Quick_Luoyaoguang_5D().sort(array1, 7, 80);//执行
######   imeCheck1.end();
######   imeCheck1.duration();//打印时间
  
######   private static int[] arrayInit() {
###### 		int[] array=new int[9999999]; //因为int 的size 64位最大也就上亿，所以采用1千万。
###### 		java.util.Random r=new java.util.Random(); 
###### 		for(int i=9999999,j=0;i>0;i--,j++){
###### 			array[j]=r.nextInt();
###### 		}
###### 		return array;
###### 	}
  
#####   相关地址：
##### 最新四代
https://github.com/yaoguangluo/sort/blob/master/LYG9DWithDoubleTopSort4D.java
##### 涉及链接
https://github.com/yaoguangluo/DNA_Chromosome_backup20210705/blob/codingbackup18801/2021/07/18/LYG9DWithDoubleTopSort4D.java

###### https://github.com/yaoguangluo/Data_Processor/tree/master/DP/sortProcessor

###### https://github.com/yaoguangluo/Data_Processor/blob/master/DP/sortProcessor/Demo.java
  
###### 这个算法以APACHE2.0证书发布免费给全世界使用，版权所属送给中华人民共和国，荣誉赠送给詹姆斯.高斯林先生，（动机来自小生写给梁女士的求婚礼物 2020年2月15~2020年10月发现是我一厢情愿，已取消。）。

##### 软著发表原文地址：
###### GITHUB
https://github.com/yaoguangluo/DataSwap/blob/master/src/org/deta/tinos/array/LYG5DWithDoubleQuickSort4D.java

https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/statistic/LYG5DWithDoubleQuickSort4D.java

###### GITEE
https://gitee.com/DetaChina/DataSwap/blob/master/src/org/deta/tinos/array/LYG5DWithDoubleQuickSort4D.java

https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/statistic/LYG5DWithDoubleQuickSort4D.java

###### 论文思想列表集地址（微分催化，小高峰过滤，排序思维，等）：
https://github.com/yaoguangluo/Deta_Resource

https://github.com/yaoguangluo/Deta_Resource/blob/master/%E6%8E%92%E5%BA%8F%E7%A0%94%E7%A9%B6%E5%8E%86%E5%8F%B2%E8%AE%B0%E5%BD%95.pdf

##### 相关生态应用函数
###### 极速排序对象契字符串排序
LYG9DWithChineseMixStringSort9D.java
Create LYG9DWithChineseMixStringSort9D.java
###### 极速排序对象契字符串矩阵排序 一个完整的带main测试实例.
LYG10DWithChineseMixStringSort10D.java
Create LYG10DWithChineseMixStringSort10D.java
###### 极速排序对线性 double 数组排序
LYG9DWithDoubleQuickSort4D.java
Create LYG9DWithDoubleQuickSort4D.java
###### 极速排序对自然语言分词对象排序
NLPTopicMatch.java
Update NLPTopicMatch.java
###### 极速排序对非线性链表对象 排序
SortListObjectByDoubleKeyDemo.java
Update and rename sortListObjectByDoubleKeyDemo.java to SortListObjec…
###### 极速排序对欧拉环唯一最短路径排序
YaoguangLuoEulerRingTSP3D.java
Create YaoguangLuoEulerRingTSP3D.java




###### 罗瑶光 20200818
