import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class PhonesTest {
    @Test
    void TestSumsung() {
        IFabricaDePhones factory = new FabricaSumsung();
        Phones phones = new Phones(factory);
        assertEquals("model Full Frame D5", Phones.getSumsung());
    }

    @Test
    void TestSony() {
        IFabricaDePhones factory = new FabricaSony();
        Phones phones = new Phones(factory);
        assertEquals("model Sony", Phones.getSony());
    }

    @Test
    void TestD3500() {
        IFabricaDePhones factory = new FabricaSony();
        Phones Phones = new Phones(factory);
        assertEquals("model D3500", Phones.getD3500());
    }
}