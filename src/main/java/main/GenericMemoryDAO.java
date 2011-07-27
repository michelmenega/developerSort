package main;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMemoryDAO<T> {

	private ArrayList<T> data = new ArrayList<T>(0);

	public void add(T t) {
		if (has(t) != null) {
			remove(t);
		}
		data.add(t);
	}

	public void remove(T t) {
		data.remove(t);
	}

	private Object has(T t) {
		Integer index = data.indexOf(t);
		if (index >= 0) {
			return data.get(index.intValue());
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public Collection<T> list() {
		return (Collection<T>) data.clone();
	}
	
	// TODO Forcar T a implementar uma interface q contenha String name
	// public void add(String name) {
	// T t = new T(name);
	// if (has(t) != null)
	// remove(t);
	// if(t != null)
	// data.add(t);
	// }
	//
	// public void remove(String name) {
	// T t = new T(name);
	// data.remove(t);
	// }

}
