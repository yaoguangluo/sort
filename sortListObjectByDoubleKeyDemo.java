package org.deta.tinos.string;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.deta.tinos.array.LYG8DWithDoubleQuickSort4D;//看大家放在哪个包下自己改
public class sortListObjectByDoubleKeyDemo{
	public static void main(String argv[]) throws IOException {
		//初始化一个需要排序的对象 数组， 我们参考 数组【0】来排序。
		List<Object[]> list= new ArrayList<>();
		for(double i= 0; i< 10000; i++) {
			Object[] object= new Object[2];
			object[0]= 10000-i;
			object[1]= ""+ i;
			list.add(object);
		}
		//初始完后开始模拟排序，采用double 数组来转换排序。 并用map来存储相同 object key的数组。
		Map<Double, ArrayList<Object[]>> map= new HashMap<>();	
		Iterator<Object[]> iterator= list.iterator();
		while(iterator.hasNext()) {
			Object[] objects= iterator.next();
			ArrayList<Object[]> lists= new ArrayList<>();
			if(map.containsKey(objects[0])) {
				lists= map.get(objects[0]);
				lists.add(objects);
			}else {
				lists= new ArrayList<>(); 
				lists.add(objects);
			}
			map.put((Double) objects[0], lists);
		}
		//排序内核
		Iterator<Double> iteratorMap= map.keySet().iterator();
		double[] doubles= new double[map.size()];
		int i= 0;
		while(iteratorMap.hasNext()) {
			doubles[i++]= iteratorMap.next();
		}	
		new LYG8DWithDoubleQuickSort4D().sort(doubles, 7, 70);
		//排完后整理输出
		List<Object[]> output= new ArrayList<>();
		for(double set: doubles) {
			List<Object[]> lists= map.get(set);
			Iterator<Object[]> iterators= lists.iterator();
			while(iterators.hasNext()) {
				output.add(iterators.next());
			}
			map.remove(set);
		}
		//完成 测试：
		for(i= 0; i< output.size(); i++) {
			System.out.println(output.get(i)[0]+ ":" + output.get(i)[1]);
		}
	}
}
