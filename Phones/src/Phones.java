public class Phones {
    private IPhoneCrop iPhoneCrop;
    private static Sumsung sumsung;
    private static Sony sony;
    private POCO poco;

    public Phones(IFabricaDePhones factory){
        this.setiPhoneCrop(factory.createPhoneCrop());
        this.sumsung(factory.createPhoneCrop());
    }

    private String sumsung(IPhoneCrop iPhoneCrop) {
        return this.getSumsung().showPhoneCrop();
    }

    public String problem(){
        return this.iPhoneCrop.problem();
    }


    public IPhoneCrop getiPhoneCrop() {
        return iPhoneCrop;
    }

    public void setiPhoneCrop(IPhoneCrop iPhoneCrop) {
        this.iPhoneCrop = iPhoneCrop;
    }
    public static Sumsung getSumsung() {
        return sumsung;
    }

    public void setSumsung(Sumsung sumsung) {
        this.sumsung = sumsung;
    }

    public POCO getD3500() {
        return poco;
    }

    public void setD3500(POCO d3500) {
        this.poco = d3500;
    }

    public static Sony getSony() {
        return sony;
    }

    public void setSony(Sony sony) {
        this.sony = sony;
    }

}

class POCO implements IPhoneCrop {
    @Override
    public String problem() {
        return "Model";
    }

    @Override
    public String showPhoneCrop() {
        return "model POCO";
    }
}

class Sumsung implements IPhoneFullFrame{
    @Override
    public String showPhoneFullFrame() {
        return "model Full Frame D5";
    }

    @Override
    public String showPhoneCrop() {
        return "model";
    }
}

class D650 implements IPhoneFullFrame{
    @Override
    public String  showPhoneFullFrame() {
        return "model D650";
    }

    @Override
    public String showPhoneCrop() {
        return "Crop";
    }
}

class Fabrica {
}

class FabricaSony implements  IFabricaDePhones{

    @Override
    public IPhoneCrop createPhoneCrop() {
        return new Sony();
    }
}

class FabricaSumsung implements  IFabricaDePhones{

    @Override
    public IPhoneCrop createPhoneCrop() {
        return (IPhoneCrop) new Sumsung();
    }
}

class FabricaPOCO implements  IFabricaDePhones{
    @Override
    public IPhoneCrop createPhoneCrop() {
        return new POCO();
    }
}

interface IPhoneFullFrame  {
    String showPhoneFullFrame();
    String showPhoneCrop();
}

interface IPhoneCrop {
    String problem();


    String showPhoneCrop();

}

interface IFabricaDePhones {
    IPhoneCrop createPhoneCrop();

}

class Sony implements IPhoneCrop{
    @Override
    public String problem() {
        return "Model";
    }

    @Override
    public String showPhoneCrop() {
        return "model Sony";
    }
}
