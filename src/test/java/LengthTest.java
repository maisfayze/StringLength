import org.example.StringLength;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LengthTest {
    StringLength stringLength = new StringLength();
    @DataProvider (name = "StringData")
    public  Object [][] myData(){
        return  new  Object[][]{
                {"Mais",4},
                {"Salsabeel",9},
                {"",0},
                {"Mais ",4},
                {" Mais ",4},
                {"9",1},
                {"Salsabeel Salsabeel",19},
                {" Salsabeel",9},



        };
    }
    @Test(dataProvider = "StringData")
    public void testLength(String text , int expected){
        int length = stringLength.getLength(text);
        Assert.assertEquals(length,expected);
    }
}
