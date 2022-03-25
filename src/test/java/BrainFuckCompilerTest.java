

import com.company.Compiler;
import com.company.interfaces.Command;
import com.company.memory.Memory;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrainFuckCompilerTest {

    @Test
    public void testLoop(){

        String loop = "-[------->+<]>+++.";
        List<Command> commands = new Compiler().compile(loop);
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));
        assertEquals("L", memory.getResult().toString());

    }

    @Test
    public void testPrint(){

        String print = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.";
        List<Command> commands = new Compiler().compile(print);
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));
        assertEquals("M", memory.getResult().toString());

    }

    @Test
    public void testSwitchLeft(){

        String switchLeft = "><+";
        List<Command> commands = new Compiler().compile(switchLeft);
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));
        assertEquals(1, memory.getSymbols()[0]);

    }

    @Test
    public void testSwitchRight(){

        String switchRight = ">+";
        List<Command> commands = new Compiler().compile(switchRight);
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));
        assertEquals(1, memory.getSymbols()[1]);

    }

    @Test
    public void testDecrement(){

        String decrement = "---";
        List<Command> commands = new Compiler().compile(decrement);
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));
        assertEquals(-3, memory.getSymbols()[0]);

    }

    @Test
    public void testIncrement(){

        String increment = "+++";
        List<Command> commands = new Compiler().compile(increment);
        Memory memory = new Memory();
        commands.forEach(command -> command.execute(memory));
        assertEquals(3, memory.getSymbols()[0]);

    }

    @Test
    public void testHelloWorld(){
        String helloWorld = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.";
        List<Command> commands = new Compiler().compile(helloWorld);
        Memory memory = new Memory();
        for(Command c:commands){
            c.execute(memory);
        }
        assertEquals("Hello World!\n", memory.getResult().toString());
    }

}