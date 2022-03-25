package com.company.commands;

import com.company.interfaces.Command;
import com.company.memory.Memory;

public class SwitchRight implements Command {

    @Override
    public void execute(Memory memory) {
        int index = memory.getIndex();
        if(index == memory.getSymbols().length - 1){
            index = 0;
        }else{
            index++;
        }
        memory.setIndex(index);
    }
}
