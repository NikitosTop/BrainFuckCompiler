package com.company.process.instructions;

import com.company.interfaces.Command;
import com.company.interfaces.Handler;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StartLoopProcess implements Handler {

    @Override
    public void process(Deque<List<Command>> stack) {
        stack.push(new ArrayList<>());
    }
}
