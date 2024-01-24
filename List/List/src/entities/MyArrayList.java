package entities;

import java.util.Arrays;

public class MyArrayList implements IList {
	private int [] data;
	private int sz = 0;
	private static final int DEFAULT_SIZE = 5;
	private int maxSize = DEFAULT_SIZE;
	
	public MyArrayList() {
		this.sz = 0;
		data = new int[maxSize];
	}
	
	@Override
	public void add(int value) {
		if (sz == max Size) {
			resizeCapacity();
		}
		
		data [sz++] = value;
	}
	
	private void resizeCapacity() {
		int newSize = maxSize * 2;
		data = Arrays.copyOf(data, newSize);
		maxSize = newSize;
	}
	@Override
	public void clear() {
		data = null;
		sz = 0;
		maxSize = DEFAULT_SIZE;
		data = new int[maxSize];
	}
	@Override
	public int remove(int index) {
		//TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int size() {
		return sz;
	}
	@Override
	public int get (int index) {
		if (index >= 0 && index < sz)
			return data [index];
		return -1;
	}
	
	@Override
	public int indexOf(int value) {
		for (int i = 0; i < sz; i++) {
			if (value == data[i])
				return i;
		}
		return -1;
	}
	
	public String toString() {
		String s = "[";
		for (int i = 0; i < sz; i++)
			s = s + data[i] + ", ";
		
		s = s.substring(0, s.length() - 2);
		s = s + "]";
		s = s + "\n";
		
		s = s + "Size = " + sz + ", Capacity = " + maxSize;
		
		return s;
		
	}

}
