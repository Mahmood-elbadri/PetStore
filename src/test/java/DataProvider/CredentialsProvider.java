package DataProvider;

import org.testng.annotations.DataProvider;

public class CredentialsProvider {
    @DataProvider(name = "credentials")
    public Object[][]dataSet(){
        return new Object[][]{
                {"mahmoud123",96532}
        };
    }
}
