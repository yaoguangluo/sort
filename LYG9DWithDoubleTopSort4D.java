package OEU.LYG4DQS4D;

import ASQ.PSU.test.TimeCheck;

//基于算法导论快排4衍生极速小高峰缺陷过滤理论快速排序第8代 线性数字数组排序法函数Java完整版本实现。
//思想：算法导论快排4理论，罗瑶光小高峰过滤理论。
//实现：罗瑶光
//时间：20140101~ 20200711
//复制一份 稍后准备 元基新陈代谢优化
public class LYG9DWithDoubleTopSort4D{
	int range;
	int deeps;
	public double[] sort(double[] array, int range, int deeps) {
		this.range= range;
		this.deeps= deeps;
		processDouble(array, 0, array.length- 1, 0);
		return array;
	}

	private void processDouble(double[] array, int leftPoint, int rightPoint, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< this.range|| deep> this.deeps)) {//增加了deep
			int pos= partition(array, leftPoint, rightPoint);
			if(leftPoint< pos- 1) {
				processDouble(array, leftPoint, pos- 1, deep+ 1);
			}
			if(pos+ 1< rightPoint) {
				processDouble(array, pos+ 1, rightPoint, deep+ 1);
			}
			return;
		}
		int i= leftPoint;
		for(int j= i+ 1; j< leftPoint+ c; j= i++){
			while(j> leftPoint){
				if(array[j]< array[--j]){
					double temp= array[j+ 1];
					array[j+ 1]= array[j];
					array[j]= temp;
				}
			}
		}	
	}

	private int partition(double[] array, int leftPoint, int rightPoint) {
		double x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){//我设立个top2D , --细节竟然没有一个人关注这些细节...20210716
			while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(leftPointReflection< ++rightPoint){
				double temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;
		return rightPoint;
	}
	public static void main(String[] argv) {
		double[] doubles=new double[9999999];
		for(int i= 0; i< doubles.length; i++) {
			doubles[i]= Math.random();
		}
		LYG9DWithDoubleTopSort4D lYG9DWithDoubleTopSort2D= new LYG9DWithDoubleTopSort4D();
		TimeCheck timecheck=new TimeCheck();
		timecheck.begin();
		lYG9DWithDoubleTopSort2D.sort(doubles, 7, 70);
		timecheck.end();
		timecheck.duration();
		for(int i= 0; i< doubles.length- 1; i++) {
			if(doubles[i]> doubles[i+ 1]) {
				System.out.println(i+"->"+ doubles[i]);
			}
		}
		System.out.println("end");
	}
}