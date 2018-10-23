package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.java.SortAlgos;
import main.java.Item;

public class AlgoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Item[] a= null;
		Item[] b= new Item[5];
		Item[] c= new Item[5];
		Item[] d= new Item[5];
		Item[] e= new Item[5];
		
		b[0]=new Item(1);
		b[1]=new Item(2);
		b[2]=new Item(3);
		b[3]=new Item(4);
		b[4]=new Item(5);
		
		c[0]=new Item(5);
		c[1]=new Item(4);
		c[2]=new Item(3);
		c[3]=new Item(2);
		c[4]=new Item(1);
		
		d[0]=new Item(2);
		d[1]=new Item(4);
		d[2]=new Item(5);
		d[3]=new Item(3);
		d[4]=new Item(1); 
		
		e[0]=new Item(4);
		e[1]=new Item(5);
		e[2]=new Item(3);
		e[3]=new Item(1);
		e[4]=new Item(2); 
		
		//ndoe coverage
		SortAlgos.bubbleSort(c);
		for(int i=0;i<b.length;i++) {
			 assertTrue(c[i].key==b[i].key);
		}
		
		//edge coverage
		//SortAlgos.bubbleSort(a);
		SortAlgos.bubbleSort(d);
		for(int i=0;i<b.length;i++) {
			 assertTrue(d[i].key==b[i].key);
		}
		
		//condition coverage
		SortAlgos.bubbleSort(e);
		for(int i=0;i<b.length;i++) {
			 assertTrue(e[i].key==b[i].key);
		}
		
		Item[] f= new Item[5];
		f[0]=new Item(4);
		f[1]=new Item(5);
		f[2]=new Item(3);
		f[3]=new Item(1);
		f[4]=new Item(2); 
		SortAlgos.selectionSort(f);
		for(int i=0;i<b.length;i++) {
			 assertTrue(f[i].key==b[i].key);
		}
		
		Item[] g= new Item[5];
		g[0]=new Item(4);
		g[1]=new Item(5);
		g[2]=new Item(3);
		g[3]=new Item(1);
		g[4]=new Item(2); 
		SortAlgos.insertionSort(g);
		for(int i=0;i<b.length;i++) {
			 assertTrue(g[i].key==b[i].key);
		}
		
		Item[] h= new Item[5];
		h[0]=new Item(4);
		h[1]=new Item(5);
		h[2]=new Item(3);
		h[3]=new Item(1);
		h[4]=new Item(2); 
		SortAlgos.mergeSort(h);
		for(int i=0;i<b.length;i++) {
			 assertTrue(h[i].key==b[i].key);
		}
		
		Item[] j= new Item[5];
		j[0]=new Item(4);
		j[1]=new Item(5);
		j[2]=new Item(3);
		j[3]=new Item(1);
		j[4]=new Item(2); 
		SortAlgos.quickSort(j);
		for(int i=0;i<b.length;i++) {
			 assertTrue(j[i].key==b[i].key);
		}
		
		Item[] k= new Item[5];
		k[0]=new Item(4);
		k[1]=new Item(5);
		k[2]=new Item(3);
		k[3]=new Item(1);
		k[4]=new Item(2); 
		SortAlgos.heapSort(k);
		for(int i=0;i<b.length;i++) {
			 assertTrue(k[i].key==b[i].key);
		}
		
	}

}
