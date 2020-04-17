package org.example;

/**
 * Hello world!
 *
 */

import java.util.logging.*;
import customList.MyList;

public class App
{
    private static final Logger logger = Logger.getLogger((org.example.App.class.getName()));

    public static void main( String[] args )
    {
        MyList<Integer> li = new MyList<Integer>();

        logger.severe("Initiating List");
        for(int i=0;i<15;i++)
            li.add(i);

        logger.info("LIST : ");
        String res=li.toString();
        logger.info(res);
        logger.info("Removing 3 and 4 from li");
        logger.info("Element removed " +li.remove(3));
        logger.info("Element removed " +li.remove(3));
        logger.info("Size of my li : "+li.size());
        logger.info("LIST : ");
        res = li.toString();
        logger.info(res);
    }
}
