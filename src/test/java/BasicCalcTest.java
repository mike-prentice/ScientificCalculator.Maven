import static org.junit.jupiter.api.Assertions.*;

class BasicCalcTest {

    @org.junit.jupiter.api.Test
    public void add() {BasicCalc add = new BasicCalc();
        assertEquals(2,BasicCalc.add(1,1));

    }
    @org.junit.jupiter.api.Test
    public void subTract() {BasicCalc subTract = new BasicCalc();
        assertEquals(10,BasicCalc.subTract(20,10));

    }
}