package org.tinos.deta.statistic;
//基于算法导论快排4衍生极速小高峰缺陷过滤理论快速排序第7代完美版本 线性数字数组排序法函数Java完整版本实现。
//思想：算法导论快排4理论，罗瑶光小高峰过滤理论,优化 催化波动算子duplication 思想, 减少条件递规深度思想。
//实现：罗瑶光
//时间：20140101~ 20200701
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
			if(!(c> this.range|| deep> this.deeps)) {//balance催化减少条件递规深度思想。
				int i= leftPoint;
				for(int j= 1+ i; j<= leftPoint+ c; j= i++){
					while(j> leftPoint){
						if(array[j]< array[--j]){//催化波动算子duplication 思想
							double temp= array[j+ 1];
							array[j+ 1]= array[j];
							array[j]= temp;
						}
					}
				}	
				return;
			}
			int pos= partition(array, leftPoint, rightPoint);
      			if(leftPoint< pos- 1){
        			processDouble(array, leftPoint, pos- 1, deep+ 1);//减少条件递规深度思想。
     	 		}
      			if( pos+ 1< rightPoint){
        			processDouble(array, pos+ 1, rightPoint, deep+ 1);//减少条件递规深度思想。
      			}
	}

	private int partition(double[] array, int leftPoint, int rightPoint) {
		double x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];//小高峰过滤饱和催化减少条件递规深度思想。
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){
			while(!(array[leftPointReflection++]> x|| leftPointReflection> rightPoint)) {}//催化波动算子duplication 思想
			while(array[rightPoint--]> x){}//催化波动算子duplication 思想
			if(--leftPointReflection< ++rightPoint){//催化波动算子duplication 思想
				double temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;//小高峰过滤饱和催化减少条件递规深度思想。
		return rightPoint;
	}
}
