package com.company.process;

import com.company.interfaces.Handler;
import com.company.process.instructions.*;

import java.util.HashMap;
import java.util.Map;

public class InstructionProcess {

    private static Map<Character, Handler> dataInstructions;

    public InstructionProcess(){
        dataInstructions = new HashMap<>();
        dataInstructions.put('+', new IncrementProcess());
        dataInstructions.put('-', new DecrementProcess());
        dataInstructions.put('.', new PrintProcess());
        dataInstructions.put('>', new SwitchRightProcess());
        dataInstructions.put('<', new SwitchLeftProcess());
        dataInstructions.put('[', new StartLoopProcess());
        dataInstructions.put(']', new EndLoopProcess());
    }

    public Handler getInstructionProcess(char instruction){
        return dataInstructions.get(instruction);
    }

}
