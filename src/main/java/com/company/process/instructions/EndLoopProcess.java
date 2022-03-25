package com.company.process.instructions;

import com.company.commands.EndLoop;
import com.company.interfaces.Command;
import com.company.interfaces.Handler;

import java.util.Deque;
import java.util.List;

public class EndLoopProcess implements Handler {

    @Override
    public void process(Deque<List<Command>> stack) {
        List<Command> innerLoopCommand = stack.pop();
        stack.peek().add(new EndLoop(innerLoopCommand));
    }
}