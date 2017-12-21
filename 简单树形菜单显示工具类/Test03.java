package com.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test03 {
	private static StringBuffer html = new StringBuffer();  
		/**
		 * 构建菜单项
		 * @param args
		 */
	  public static List<Tree> getTrees(){
	  	 List<Tree> trees=new ArrayList<>();
	  	 //添加父节点存在的数据
	  	 Tree tree1=new Tree(1,"菜单1",0);
	  	 trees.add(tree1);
	  	 Tree tree2=new Tree(2,"菜单2",0);
	  	 trees.add(tree2);
	  	 Tree tree3=new Tree(3,"菜单3",0);
	  	 trees.add(tree3);
	  	 Tree tree4=new Tree(4,"菜单4",0);
	  	 trees.add(tree4);
	  	 Tree tree5=new Tree(5,"菜单5",0);
	  	 trees.add(tree5);
	  	 Tree tree6=new Tree(11,"菜单11",1);
	  	 trees.add(tree6);
	  	 Tree tree7=new Tree(12,"菜单12",1);
	  	 trees.add(tree7);
	  	 Tree tree8=new Tree(22,"菜单22",2);
	  	 trees.add(tree8);
	  	 Tree tree9=new Tree(31,"菜单31",22);
	  	 trees.add(tree9);
	  	 Tree tree10=new Tree(32,"菜单32",22);
	  	 trees.add(tree10);
	  	 return trees;
	  }
	
	  private static final Map<Integer, Integer> MAP=new HashMap<>();
		public static void main(String[] args) {
			  List<Tree> list=getTrees();
			  getAll(list, 0, -1);
		}
		public static void getAll(List<Tree> list,int pid,int num){
			for (int i = 0; i < list.size(); i++) {
				 Tree tree=list.get(i);
				 if(tree.getPid()==pid){
					 if(!MAP.containsKey(pid)){
						  MAP.put(pid, pid);
						  num++;
					 }
					 StringBuilder sb=new StringBuilder();
					 for(int j=0;j<num;j++){
						 sb.append("\t");
					 }
					 System.out.println(sb.toString()+tree.getName()+"["+tree.getId()+"]");
					 getAll(list, tree.getId(),num);
				 }
			}
		}
		
}
