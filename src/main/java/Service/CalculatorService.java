package Service;

import Model.Calculator;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;

public class CalculatorService {
    private final String INSTANCE_FIELD  ="testdata.value.NumberOfInstancesField";
    Calculator calculator;
    public Calculator getCalculatorData() throws IOException {

        //System.out.println(TestDataReader.getTestData(INSTANCE_FIELD));
        calculator=new Calculator();
        calculator.setInstancesField(TestDataReader.getTestData(INSTANCE_FIELD));
        return calculator;

    }

    }