
import com.company.Compiler;
import com.company.interfaces.Command;
import com.company.memory.Memory;
import java.util.List;

import com.company.process.InstructionProcess;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrainFuckProcessTest {

    InstructionProcess instructionProcess = new InstructionProcess();

    @Test
    public void testIncrementProcess(){
        assertEquals("IncrementProcess", instructionProcess.getInstructionProcess('+').getClass().getSimpleName());
    }

    @Test
    public void testDecrementProcess(){
        assertEquals("DecrementProcess", instructionProcess.getInstructionProcess('-').getClass().getSimpleName());
    }

    @Test
    public void testPrintProcess(){
        assertEquals("PrintProcess", instructionProcess.getInstructionProcess('.').getClass().getSimpleName());
    }

    @Test
    public void testStartLoopProcess(){
        assertEquals("StartLoopProcess", instructionProcess.getInstructionProcess('[').getClass().getSimpleName());
    }

    @Test
    public void testEndLoopProcess(){
        assertEquals("EndLoopProcess", instructionProcess.getInstructionProcess(']').getClass().getSimpleName());
    }

    @Test
    public void testSwitchLeftProcess(){
        assertEquals("SwitchLeftProcess", instructionProcess.getInstructionProcess('<').getClass().getSimpleName());
    }

    @Test
    public void testSwitchRightProcess(){
        assertEquals("SwitchRightProcess", instructionProcess.getInstructionProcess('>').getClass().getSimpleName());
    }

}
