package org.tinos.deta.statistic;
//基于算法导论快排4衍生极速小高峰缺陷过滤理论快速排序第7代 线性数字数组排序法函数Java完整版本实现。
//思想：算法导论快排4理论，罗瑶光小高峰过滤理论,优化 催化波动算子duplication 思想, 减少条件递规深度思想。
//实现：罗瑶光
//时间：20140101~ 20200628
public class LYG7DWithDoubleQuickSort4D{
	int range;
	int deeps;
	public double[] sort(double[] array, int range, int deeps) {
		this.range= range;
		this.deeps= deeps;
		processDouble(array, 0, array.length- 1, 0);
		return array;
	}

	private void processDouble(double[] array, int leftPoint, int rightPoint, int deep) {
			int c= rightPoint- leftPoint;
			if(!(c> this.range|| deep> this.deeps)) {
				int j;
				for(int i= 1+ leftPoint; i<= leftPoint+ c; i++){
					j= i;
					while(j> leftPoint){
						if(array[j]< array[j- 1]){
							double temp= array[j];
							array[j]= array[j- 1];
							array[j- 1]= temp;
						}
						j--;
					}
				}	
				return;
			}
			int pos= partition(array, leftPoint, rightPoint);
      if(leftPoint< pos- 1){
         processDouble(array, leftPoint, pos- 1, deep+ 1);
      }
      if( pos+ 1< rightPoint){
        processDouble(array, pos+ 1, rightPoint, deep+ 1);
      }
	}

	private int partition(double[] array, int leftPoint, int rightPoint) {
		double x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){
			while(!(array[leftPointReflection++]> x|| leftPointReflection> rightPoint)) {}
			while(array[rightPoint--]> x){}
			if(--leftPointReflection< ++rightPoint){
				double temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;
		return rightPoint;
	}
}
