package core;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ArrayFunTest.
 *
 * @author  Barry Brown
 * @version 3/5/2018 v1
 */
public class ArrayFunTest
{   
    @Test
    public void testCreateArray()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        assertEquals(0, b.size());
    }
    
    @Test
    public void testAddToArray()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        assertEquals(1, b.size());
        b.add("Bye");
        assertEquals(2, b.size());
        b.add("Adios");
        assertEquals(3, b.size());
    }
    
    @Test
    public void testAdd12()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("str1");
        b.add("str2");
        b.add("str3");
        b.add("str4");
        b.add("str5");
        b.add("str6");
        b.add("str7");
        b.add("str8");
        b.add("str9");
        b.add("str10");
        b.add("str11");
        b.add("str12");
        assertEquals(12, b.size());
    }
    
    @Test
    public void testAdd100()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        
        for (int i = 0; i < 50; i++)
            b.add("str" + i);
        assertEquals(50, b.size());
        
        for (int i = 0; i < 50; i++)
            b.add("morestr" + i);
            
        assertEquals(100, b.size());
    }
   
    // TESTS FOR GET()
    @Test
    public void testGet()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.add("Bye");
        assertEquals("Hello", b.get(0));
        assertEquals("Bye", b.get(1));
    }
    
    @Test (expected=Party.class)
    public void testGetException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.get(1);
        // No more code after this, because the exception
        // will cause the method to exit.
        // Don't create more that one exception per test method.
    }
    
    @Test (expected=Party.class)
    public void testGetException100()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.get(100);
    }
    
    @Test (expected=Party.class)
    public void testGetNegativeException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.get(-1);
    }
    
    @Test
    public void testGet12()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("str1");
        b.add("str2");
        b.add("str3");
        b.add("str4");
        b.add("str5");
        b.add("str6");
        b.add("str7");
        b.add("str8");
        b.add("str9");
        b.add("str10");
        b.add("str11");
        b.add("str12");
        assertEquals("str8", b.get(7));
        assertEquals("str12", b.get(11));
        assertEquals("str1", b.get(0));
    }

    // TESTS FOR SET()
    @Test
    public void testSet()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.add("Bye");
        b.set(0, "Bonjour");
        assertEquals("Bonjour", b.get(0));
        assertEquals("Bye", b.get(1));
        b.set(1, "Adios");
        assertEquals("Bonjour", b.get(0));
        assertEquals("Adios", b.get(1));
    }
    
    @Test (expected=Party.class)
    public void testSetException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.set(1, "Bye");
        // No more code after this, because the exception
        // will cause the method to exit.
        // Don't create more that one exception per test method.
    }
    
    @Test (expected=Party.class)
    public void testSetException100()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.set(100, "Bye");
    }
    
    @Test (expected=Party.class)
    public void testSetEmptyException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.set(0, "Hello");
    }

    @Test (expected=Party.class)
    public void testSetNegativeException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.set(-1, "Hello");
    }

    @Test (expected=Party.class)
    public void testSetFullException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("Hello");
        b.add("Bye");
        b.set(2, "Bonjour");
    }

	// TESTS FOR TOSTRING()
    @Test
    public void testToString()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        assertEquals("[]", b.toString());
        b.add("hello");
        assertEquals("[hello]", b.toString());
        b.add("bye");
        assertEquals("[hello, bye]", b.toString());
        b.add("adios");
        assertEquals("[hello, bye, adios]", b.toString());
    }
    
   
    // TESTS FOR INSERT()
    @Test
    public void testInsert()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("hello");
        b.add("bye");
        b.insert(1, "adios");
        assertEquals("hello", b.get(0));
        assertEquals("adios", b.get(1));
        assertEquals("bye", b.get(2));
        assertEquals(3, b.size());
        
        b.insert(1, "buenos dias");
        assertEquals(4, b.size());
        assertEquals("hello", b.get(0));
        assertEquals("buenos dias", b.get(1));
        assertEquals("adios", b.get(2));
        
        b.insert(0, "hi");
        assertEquals(5, b.size());
        assertEquals("hi", b.get(0));
        assertEquals("hello", b.get(1));
        
        b.insert(4, "see ya");
        assertEquals(6, b.size());
        assertEquals("see ya", b.get(4));
        assertEquals("bye", b.get(5));
    }
    
    @Test
    public void testInsert11At0()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("one");
        b.insert(0, "two");
        b.insert(0, "three");
        b.insert(0, "four");
        b.insert(0, "five");
        b.insert(0, "six");
        b.insert(0, "seven");
        b.insert(0, "eight");
        b.insert(0, "nine");
        b.insert(0, "ten");
        b.insert(0, "eleven");
        assertEquals(11, b.size());
        assertEquals("eleven", b.get(0));
        assertEquals("ten", b.get(1));
        assertEquals("two", b.get(9));
        assertEquals("one", b.get(10));
    }
    
    @Test
    public void testInsertAtEnd()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("one");
        b.insert(0, "two");
        b.insert(1, "three");
        b.insert(2, "four");
        assertEquals(4, b.size());
        assertEquals("two", b.get(0));
        assertEquals("three", b.get(1));
        assertEquals("four", b.get(2));
        assertEquals("one", b.get(3));
    }
    
    @Test
    public void testInsertAt0()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("one");
        b.insert(0, "two");
        b.insert(0, "three");
        b.insert(0, "four");
        assertEquals(4, b.size());
        assertEquals("four", b.get(0));
        assertEquals("three", b.get(1));
        assertEquals("two", b.get(2));
        assertEquals("one", b.get(3));
    }
    
    @Test (expected=Party.class)
    public void testInsertException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("hello");
        b.insert(1, "bye");
    }
	
    @Test (expected=Party.class)
    public void testInsertAtZeroException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.insert(0, "bye");
    }
    
    @Test (expected=Party.class)
    public void testInsertNegative()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.insert(-1, "hello");
    }


    // TESTS FOR REMOVE()
    @Test
    public void testRemove1()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("hello");
        b.remove(0);
        assertEquals(0, b.size());
    }
    
    @Test
    public void testRemoveSeveral()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("hello");
        b.add("bye");
        b.add("adios");
        b.add("ciao");
        b.add("see ya");
        b.remove(0);
        assertEquals(4, b.size());
        assertEquals("bye", b.get(0));
        assertEquals("adios", b.get(1));
        assertEquals("ciao", b.get(2));
        assertEquals("see ya", b.get(3));
        
        b.remove(3);
        assertEquals(3, b.size());
        assertEquals("bye", b.get(0));
        assertEquals("adios", b.get(1));
        assertEquals("ciao", b.get(2));
        
        b.remove(0);
        b.remove(0);
        b.remove(0);
        assertEquals(0, b.size());
    }
    
    @Test (expected=Party.class)
    public void testRemoveException()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("hello");
        b.remove(1);
    }
    
    @Test (expected=Party.class)
    public void testRemoveNegative()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.remove(-1);
    }
    
    @Test (expected=Party.class)
    public void testRemoveEmpty()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("hello");
        b.remove(0);
        b.remove(0);
    }

    // TEST FOR INDEXOF()
    @Test
    public void testIndexOf()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        
        for (int i = 0; i < 20; i++)
            b.add("str"+i);
        
       // for (int i = 0; i < 20; i++)
          //  System.out.println(b.indexOf(b.get(i))+" : " +b.get(i));
        
        assertEquals(0, b.indexOf(b.get(0)));
        assertEquals(19, b.indexOf(b.get(19)));
        assertEquals(-1, b.indexOf("not found"));
    }
    
    @Test
    public void testIndexOfWithDuplicates()
    {
        ArrayFun<String> b = new ArrayFun<String>();
        b.add("str1");
        b.add("str2");
        b.add("str3");
        b.add("str2");
        b.add("str3");
        
        assertEquals(0, b.indexOf("str1"));
        assertEquals(1, b.indexOf("str2"));
        assertEquals(2, b.indexOf("str3"));
    }
    
    @Test
    public void testIndexOfWithNull()
    {
        ArrayFun<Integer> b = new ArrayFun<Integer>();
        b.add(5);
        b.add(2);

        // There should be no nulls in the list
        assertEquals(-1, b.indexOf(null));
    }

	
    // Make sure ArrayFun works with different kinds
    // of objects.
    
    @Test
    public void testInteger()
    {
        ArrayFun<Integer> b = new ArrayFun<Integer>();
        for (int i = 0; i < 50; i++)
            b.add(i);
        assertEquals(50, b.size());
        assertEquals(0, (int)b.get(0));
        assertEquals(1, (int)b.get(1));
        assertEquals(49, (int)b.get(49));
    }

    @Test
    public void testJFrame()
    {
        ArrayFun<javax.swing.JFrame> b = new ArrayFun<javax.swing.JFrame>();
        javax.swing.JFrame j1 = new javax.swing.JFrame();
        javax.swing.JFrame j2 = new javax.swing.JFrame();
        b.add(j2);
        b.add(j1);
        assertEquals(j2, b.get(0));
        assertEquals(j1, b.get(1));
    }
}