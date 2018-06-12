package com.eastzq.designpatterns.creational.factory.simple;

public class ChartFactory {
	public static Chart getChart(String chartType) {
		Chart chart = null;
		if("line".equals(chartType)) {
			chart = new LineChart();
		}else if ("pie".equals(chartType)) {
			chart =  new PieChart();
		}else {
			throw new RuntimeException("当前不支持这种类型的对象生成！");
		}
		return chart;
	}
	public static void main(String[] args) {
		double s = 0;
		double p = 0.18;
		for(int i=1;i<9;i++) {
			s+=p*Math.pow(1.18, i-1);
		}
		System.out.println(s);
	}
}
