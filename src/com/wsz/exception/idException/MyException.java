package com.wsz.exception.idException;

public class MyException extends Exception{
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    @Override
    public String toString() {
        return "这是一个异常{" +
                "detail=" + detail +
                '}';
    }
}
