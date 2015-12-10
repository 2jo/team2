package org.junk.dao;

//해쉬맵의 동작원리가 이거다.
public interface CRUDMapper<V, K> {
	
	public void create(V vo)throws Exception;
	
	public V read(K key)throws Exception;
	
	public void update(V vo)throws Exception;
	
	public void delete(K key)throws Exception;
}
