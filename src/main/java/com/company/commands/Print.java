package com.company.commands;

import com.company.interfaces.Command;
import com.company.memory.Memory;

public class Print implements Command {

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        memory.setResult(String.valueOf((char) memory.getSymbols()[index]));
    }

}