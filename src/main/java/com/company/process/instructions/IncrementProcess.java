package com.company.process.instructions;

import com.company.commands.Increment;
import com.company.interfaces.Command;
import com.company.interfaces.Handler;

import java.util.Deque;
import java.util.List;

public class IncrementProcess implements Handler {

    @Override
    public void process(Deque<List<Command>> stack) {
        stack.peek().add(new Increment());
    }

}
