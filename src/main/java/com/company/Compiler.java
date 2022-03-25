package com.company;

import com.company.interfaces.Command;
import com.company.process.InstructionProcess;

import java.util.*;

public class Compiler {

    public List<Command> compile(String code){

        Deque<List<Command>> stack = new ArrayDeque<>();
        stack.push(new ArrayList<>());

        InstructionProcess instructionProcess = new InstructionProcess();

        for(char instruction : code.toCharArray()){

            instructionProcess.getInstructionProcess(instruction).process(stack);

        }
        return stack.pop();
    }

}
