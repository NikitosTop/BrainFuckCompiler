package com.company.commands;

import com.company.interfaces.Command;
import com.company.memory.Memory;

public class SwitchLeft implements Command {

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        if (index == 0) {
            index = memory.getSymbols().length - 1;
        }
        else {
            index--;
        }
        memory.setIndex(index);
    }

}