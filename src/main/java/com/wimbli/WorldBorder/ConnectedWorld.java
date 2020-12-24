package com.wimbli.WorldBorder;

public class ConnectedWorld {

    private String worldTo;
    private String worldFrom;

    private WBUtils.Direction worldToEnterDirection;
    private WBUtils.Direction worldFromExitDiration;
    private final double modX;
    private final double modZ;

    public ConnectedWorld(String worldTo,
                          String worldFrom,
                          WBUtils.Direction worldToEnterDirection,
                          WBUtils.Direction worldFromExitDiration,
                          double modX,
                          double modZ
    ) {
        this.worldTo = worldTo;
        this.worldFrom = worldFrom;
        this.worldToEnterDirection = worldToEnterDirection;
        this.worldFromExitDiration = worldFromExitDiration;
        this.modX = modX;
        this.modZ = modZ;
    }

    public String getWorldTo() {
        return worldTo;
    }

    public void setWorldTo(String worldTo) {
        this.worldTo = worldTo;
    }

    public String getWorldFrom() {
        return worldFrom;
    }

    public void setWorldFrom(String worldFrom) {
        this.worldFrom = worldFrom;
    }

    public WBUtils.Direction getWorldToEnterDirection() {
        return worldToEnterDirection;
    }

    public void setWorldToEnterDirection(WBUtils.Direction worldToEnterDirection) {
        this.worldToEnterDirection = worldToEnterDirection;
    }

    public WBUtils.Direction getWorldFromExitDiration() {
        return worldFromExitDiration;
    }

    public void setWorldFromExitDiration(WBUtils.Direction worldFromExitDiration) {
        this.worldFromExitDiration = worldFromExitDiration;
    }

    public double getModX() {
        return modX;
    }

    public double getModZ() {
        return modZ;
    }
}
