# sort
极速排序, The Top Sort

测试结果 ，联想 legion 品牌 测试，1000万随机double数组排序耗时 0.9 秒。

测试算法如下：

  int []array1=arrayInit(); 
  System.out.println(" ");
  System.out.println("罗瑶光小高峰过滤快速排序5代：");
  TimeCheck imeCheck1= new TimeCheck();//时间记录
  imeCheck1.begin();
  array1=new Quick_Luoyaoguang_5D().sort(array1, 7, 80);//执行
  imeCheck1.end();
  imeCheck1.duration();//打印时间
  
  private static int[] arrayInit() {
		int[] array=new int[9999999]; //因为int 的size 64位最大也就上亿，所以采用1千万。
		java.util.Random r=new java.util.Random(); 
		for(int i=9999999,j=0;i>0;i--,j++){
			array[j]=r.nextInt();
		}
		return array;
	}
  
  相关地址：
  https://github.com/yaoguangluo/Data_Processor/blob/master/DP/sortProcessor/Demo.java
