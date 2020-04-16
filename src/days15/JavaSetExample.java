package days15;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * 
 * Set是无序的,不可以重复元素
 * HashSet：数据结构是哈希表,线程是非同步的
 * 保证元素唯一性的原理:判断原始的hasCode值是否相同
 * 若果相同,还会继续判断元素的equals方法,是否为true
 * 
 * 
 * TreeSet可以对Set集合中的元素进行排序
 * 
 * */
public class JavaSetExample {
	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<Student>();
		set.add(new Student("张三",20));
		set.add(new Student("李四",21));
		set.add(new Student("王五",22));
		set.add(new Student("赵六",23));
		set.add(new Student("王八",24));
		
		Iterator<Student> studentIterator = set.iterator();
		if (studentIterator.hasNext()) {
			Student student = studentIterator.next();
			System.out.println("学生姓名:"+student.getName()+ "年龄:"+ student.getAge());
		}

	}
}

