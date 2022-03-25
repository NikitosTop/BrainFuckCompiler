package com.company.memory;

public class Memory {

    private static final int SIZE = 30000;
    private final byte[] symbols;
    private int index;
    private StringBuilder result;

    public Memory(){
        symbols = new byte[SIZE];
        result = new StringBuilder();
    }

    public byte[] getSymbols() {
        return symbols;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public StringBuilder getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result.append(result);
    }
}
