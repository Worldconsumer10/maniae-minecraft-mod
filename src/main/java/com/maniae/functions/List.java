package com.maniae.functions;

import com.google.common.base.Function;
import com.mojang.datafixers.types.Func;

import java.util.Arrays;

public class List<T> {
    private T[] _internal;
    public int count = 0;
    public void Add(T element){
        if (Contains(element))
            return;
        try {
            int length = _internal.length;
            T[] newTable = Arrays.copyOf(_internal, length + 1);
            newTable[length] = element;
            _internal = newTable;
            count = newTable.length;
        }catch (Exception e){}
    }
    public T ElementAt(int i){
        try{
            return _internal[i];
        }catch(Exception e){}
        return null;
    }
    public boolean Contains(T element){
        try{
            for (int i = 0; i < _internal.length; i++) {
                T val = _internal[i];
                if (val!=null && val==element)
                    return true;
            }
            return false;
        }catch (Exception e){}
        return false;
    }
    public boolean Any(Function<T,Boolean> func){
        try {
            for (int i = 0; i < _internal.length; i++) {
                T val = _internal[i];
                if (val != null && func.apply(val)) {
                    return true;
                }
            }
            return false;
        }catch (Exception e){ return false; }
    }
    public boolean All(Function<T,Boolean> func){
        try {
            for (int i = 0; i < _internal.length; i++) {
                T val = _internal[i];
                if (val != null && !func.apply(val)) {
                    return false;
                }
            }
            return true;
        }catch (Exception e){return false;}
    }
    public void AddRange(T[] element){
        for (int i = 0; i < element.length; i++) {
            Add(element[i]);
        }
    }
    public void Remove(T element){
        try{
            int length = _internal.length;
            T[] newTable = Arrays.copyOf(_internal, length - 1);
            for (int i = 0; i < length; i++) {
                var ele = _internal[i];
                if (ele==element)
                    continue;
                newTable[i]=ele;

            }
            _internal = newTable;
            count = newTable.length;
        }catch (Exception e){}
    }
    public void RemoveAt(int index){
        try {
            int length = _internal.length;
            T[] newTable = Arrays.copyOf(_internal, length - 1);
            for (int i = 0; i < length; i++) {
                var ele = _internal[i];
                if (i == index)
                    continue;
                newTable[i] = ele;

            }
            _internal = newTable;
            count = newTable.length;
        } catch (Exception e){}
    }
}
