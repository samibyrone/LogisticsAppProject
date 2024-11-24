package Logistics.Data.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Package {

    private Receiver receiver;
    private Sender sender;
    private String description;
    private String id;
    private int quantity;
    private BigDecimal deliveryFee;
    private LocalDateTime createdAt;
    private List<TrackingLog> trackingLogs = new ArrayList<>();

    public Package(Receiver receiver, Sender sender, String description, String id, int quantity, BigDecimal deliveryFee, LocalDateTime createdAt) {
        this.receiver = receiver;
        this.sender = sender;
        this.description = description;
        this.id = id;
        this.quantity = quantity;
        this.deliveryFee = deliveryFee;
        this.createdAt = createdAt;
        trackingLogs = new ArrayList<>();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<TrackingLog> getTrackingLogs() {
        return trackingLogs;
    }

    public void setTrackingLogs(List<TrackingLog> trackingLogs) {
        this.trackingLogs = trackingLogs;
    }
}
