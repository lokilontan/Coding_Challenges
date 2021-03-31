package core;

public class ArrayFun<T>
{
    private T[] arr;
    private int count;
    
    public ArrayFun()
    {
        arr = (T[]) new Object[10];       // Array of Objects
        count = 0;                  // The "illusion" size
    }
    
    /**
     * Add a new Object to the end of the array.
     */
    public void add(T o)
    {
        if (count == arr.length) // Is array full?
        {
            // Create new array (arr2) whose length is 10 longer
            // than arr
            T[] arr2 =(T[]) new Object[arr.length + 10];
            
            // Copy elements from arr to arr2
            for (int i = 0; i < arr.length; i++)
            {
                arr2[i] = arr[i];
            }
            
            // Throw away arr2
            arr = arr2;
        }
        arr[count] = o;
        count++;
    }
    
    /**
     * Wipes entire array.
     */
    public void clear()
    {
      for (int i = 0; i < count; i++){
         arr[i] = null;
      }
      count = 0;
    }
    
    /**
     * Returns the "illusion" size.
     */
    public int size()
    {
        return count;
    }
    
    /**
     * Returns whether the given object is in the array.
     */
    public boolean contains(T o)
    {
    	boolean flag = false;
    	for (int i = 0; i < count; i++){
    		if (arr[i].equals(o)) flag = true;
    	}
        return flag;
    }
    
    /**
     * Return the lowest index of where the target value exists, or -1 if the target does not exist.
     */
    public int indexOf(T o)
    {
    	int flag = -1;
    	for(int i = 0; i < count; i++){
    		if (arr[i] == o) {flag = i; break;}
    	}
        return flag;
    }
    
    /**
     * Retrieve the object at the given index.
     */
    public T get(int index)
    {
        if (index >= count || index < 0)
        {
            throw new Party();
        }
        else
        {
            return arr[index];
        }
    }
    
    /**
     * Change the object at a given index.
     */
    public void set(int index, T o)
    {
    	 if (index < 0 || index >= count) {
    	    	throw new Party();
    	    }
    	    else
    	    {
    	    	arr[index] = o;
    	    }
    }
    
    /**
     * Remove object at the given index.
     * Shink array to close the gap.
     */
    public void remove(int index)
    {
    if (index < 0 || index >= count) {
    	throw new Party();
    }
    else
    {
      for(int i = index; i <= count; i++){
         arr[i] = arr [i+1];
      }
      count--;
    }
    }
    
    /**
     * Insert object at given index. Expand array to accomodate
     * new object.
     */
    public void insert(int index, T o)
    {
    	if (index < 0 || index >= count) {
    		throw new Party();
    	}
    	else {
    		if (count == arr.length) {
    			Object[] arr2 = new Object[arr.length + 10];
    			for (int i = 0; i < arr.length; i++){
    				arr2[i] = arr[i];
    			}
    			arr = (T[]) arr2;
    		}
    	for(int j = count-1; j >= index; j--) {
    		arr[j+1] = arr[j];
    		}	
    	arr[index] = o;
    	count++;
    	}
    }
    
    
    /**
    *Returns a string containing all the elements of the array. 
    *There should be a comma and space between each element in the string, 
    *like this: [alpha, beta, gamma, delta]
    */
    public String toString(){
    String s;
    if (count > 0 ){ 
     s = "[";
      for (int i = 0; i < count; i++) {
         s = s + arr[i] + ", " ; 
      }
       s = s.substring(0, s.length()-2) + "]";
       
    }
    
    else s = "[]";
    
    return s;
   }  
 
}