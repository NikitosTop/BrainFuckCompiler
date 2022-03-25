package com.company.process.instructions;

import com.company.commands.Decrement;
import com.company.interfaces.Command;
import com.company.interfaces.Handler;

import java.util.Deque;
import java.util.List;

public class DecrementProcess implements Handler {

    @Override
    public void process(Deque<List<Command>> stack) {
        stack.peek().add(new Decrement());
    }
}