package customList;

import java.util.AbstractList;
import java.util.Arrays;


public class MyList<E> extends AbstractList<E>{
    private int s = 0;
    private Object data[];
    private int ind = 0;

    public MyList(){
        data = new Object[10];
        ind=0;
    }

    @SuppressWarnings("unchecked")

    public E get(int index){
        return (E)data[index];
    }

    public boolean add(E e){
        data[ind]=e;
        ind++;
        if(ind>=s)
            increases();
        return true;
    }

    public E remove(int index){
        if(s< index)
            return null;
        Object x=data[index];
        for(int j=index;j<s-1;j++)
            data[j]=data[j+1];
        ind--;
        s--;
        return (E)x;
    }

    public int s() {
        return s;
    }

    private void increases(){
        s=data.len*2;
        data=Arrays.copyOf(data,s);
    }

    public String toString(){
        String s="";
        for (int ind = 0; ind < this.ind; ind++)
            s=s+data[ind]+" ";
        return s;
    }
}