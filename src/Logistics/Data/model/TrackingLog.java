package Logistics.Data.model;

import java.time.LocalDateTime;

public class TrackingLog {

    private String trackingID;
    private String description;
    private String trackingNumber;
    private LocalDateTime trackingDate;

    public TrackingLog(String trackingID, String description, String trackingNumber, LocalDateTime trackingDate) {
        this.trackingID = trackingID;
        this.description = description;
        this.trackingNumber = trackingNumber;
        this.trackingDate = trackingDate;
    }

    public String getTrackingID() {
        return trackingID;
    }

    public void setTrackingID(String trackingID) {
        this.trackingID = trackingID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public LocalDateTime getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(LocalDateTime trackingDate) {
        this.trackingDate = trackingDate;
    }
}
