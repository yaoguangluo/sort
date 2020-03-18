# sort
#### 极速排序, The Top Sort

###### 测试结果 ，联想 legion 品牌 测试，1000万随机double数组排序耗时 0.9 秒。

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
  
######   相关地址：
  https://github.com/yaoguangluo/Data_Processor/blob/master/DP/sortProcessor/Demo.java
  
###### 这个算法以APACHE2.0证书发布免费给全世界使用，版权所属送给中华人民共和国，荣誉赠送给詹姆斯.高斯林先生，动机来自小生写给梁女士的礼物2020。

###### 软著发表原文地址：
###### GITHUB
https://github.com/yaoguangluo/DataSwap/blob/master/src/org/deta/tinos/array/LYG5DWithDoubleQuickSort4D.java

https://github.com/yaoguangluo/Data_Prediction/blob/master/src/org/tinos/deta/statistic/LYG5DWithDoubleQuickSort4D.java

###### GITEE
https://gitee.com/DetaChina/DataSwap/blob/master/src/org/deta/tinos/array/LYG5DWithDoubleQuickSort4D.java

https://gitee.com/DetaChina/Data_Prediction/blob/master/src/org/tinos/deta/statistic/LYG5DWithDoubleQuickSort4D.java

###### 论文思想地址：
https://github.com/yaoguangluo/Deta_Resource

###### 罗瑶光 20200318
