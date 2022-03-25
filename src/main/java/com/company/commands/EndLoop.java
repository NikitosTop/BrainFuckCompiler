package com.company.commands;

import com.company.interfaces.Command;
import com.company.memory.Memory;

import java.util.ArrayList;
import java.util.List;

public class EndLoop implements Command {

    private List<Command> innerLoopCommands;

    public EndLoop(List<Command> innerLoopCommands) {
        this.innerLoopCommands = new ArrayList<>(innerLoopCommands);
    }

    @Override
    public void execute(Memory memory) {
        while (memory.getSymbols()[memory.getIndex()] != 0){
            innerLoopCommands.forEach(command -> command.execute(memory));
        }
    }
}