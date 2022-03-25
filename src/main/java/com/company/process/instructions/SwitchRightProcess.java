package com.company.process.instructions;

import com.company.commands.SwitchRight;
import com.company.interfaces.Command;
import com.company.interfaces.Handler;

import java.util.Deque;
import java.util.List;

public class SwitchRightProcess implements Handler {

    @Override
    public void process(Deque<List<Command>> stack) {
        stack.peek().add(new SwitchRight());
    }
}
