package dk.brp.svendeproeve.model;

public enum OrderStatus {
    RECEIVED(1, "received");
    private int code;
    private String status;

    OrderStatus(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public static OrderStatus getByStatusString(String status) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.status.equalsIgnoreCase(status))
                return value;
        }
        throw new IllegalArgumentException("unknown status for order");
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }
}
