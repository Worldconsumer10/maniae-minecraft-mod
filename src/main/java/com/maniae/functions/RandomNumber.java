package com.maniae.functions;

import java.util.Random;

public class RandomNumber {
    public static int Int(int min, int max)
    {
        return Math.min(Math.max(min,new Random().nextInt()*max),max);
    }
    public static int Int(int max)
    {
        return Math.min(Math.max(0,new Random().nextInt()*max),max);
    }
}
