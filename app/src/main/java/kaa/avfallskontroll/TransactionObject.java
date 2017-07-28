package kaa.avfallskontroll;

/**
 * Model class which holds the transaction objects within the table.
 *
 * @author Joakim Zakrisson
 * @version 2017-07-26
 */
public class TransactionObject {

    private int transactionNumber;
    private int ID;
    private int deviation;
    private String dispatcher;
    private String pickupPoint;
    private String reciever;
    private String deliveryPoint;
    private String vehicle;
    private String conveyor;
    private String article;
    private String errand;
    private String reference;
    private String firstWeight;
    private String secondWeight;
    private String finalWeight;
    private String firstWeightTime;
    private String finalWeightTime;

    private String file;

    public int getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(int transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDeviation() {
        return deviation;
    }

    public void setDeviation(int deviation) {
        this.deviation = deviation;
    }

    public String getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(String dispatcher) {
        this.dispatcher = dispatcher;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(String pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public void setDeliveryPoint(String deliveryPoint) {
        this.deliveryPoint = deliveryPoint;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getConveyor() {
        return conveyor;
    }

    public void setConveyor(String conveyor) {
        this.conveyor = conveyor;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getErrand() {
        return errand;
    }

    public void setErrand(String errand) {
        this.errand = errand;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(String firstWeight) {
        this.firstWeight = firstWeight;
    }

    public String getSecondWeight() {
        return secondWeight;
    }

    public void setSecondWeight(String secondWeight) {
        this.secondWeight = secondWeight;
    }

    public String getFinalWeight() {
        return finalWeight;
    }

    public void setFinalWeight(String finalWeight) {
        this.finalWeight = finalWeight;
    }

    public String getFirstWeightTime() {
        return firstWeightTime;
    }

    public void setFirstWeightTime(String firstWeightTime) {
        this.firstWeightTime = firstWeightTime;
    }

    public String getFinalWeightTime() {
        return finalWeightTime;
    }

    public void setFinalWeightTime(String finalWeightTime) {
        this.finalWeightTime = finalWeightTime;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}