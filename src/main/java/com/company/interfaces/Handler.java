package com.company.interfaces;

import java.util.Deque;
import java.util.List;

public interface Handler {

    void process(Deque<List<Command>> stack);

}
