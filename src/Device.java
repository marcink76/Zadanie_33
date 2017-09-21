public class Device {

    String code;
    String producer;
    String type;
    double price;


    public Device(String code, String producer, String type, double price){
        this.price = price;
    }

    public Device(String code, String producer, String type){
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

    String getInfo(){
        String getinfo = "Kod: "+code+", producent: " + producer +", typ: "+ type +", cena: "+ price;
        return getinfo;
    }
}
