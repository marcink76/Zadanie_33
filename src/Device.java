public class Device {

    String code;
    String producer;
    String type;
    double price;


    public Device(String code, String producer, String type, double price){
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = price;

    }
    String getInfo(Device device){
        String getinfo = "Kod: "+code+", producent: " + producer +", typ: "+ type +", cena: "+ price;
        return getinfo;
    }
}
