package com.company.commands;

import com.company.interfaces.Command;
import com.company.memory.Memory;

public class Decrement implements Command {

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        memory.getSymbols()[index] -= 1;
    }
}