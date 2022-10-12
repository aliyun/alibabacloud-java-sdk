// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("RoadRegions")
    public java.util.List<DetectVehicleIllegalParkingAdvanceRequestRoadRegions> roadRegions;

    public static DetectVehicleIllegalParkingAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleIllegalParkingAdvanceRequest self = new DetectVehicleIllegalParkingAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleIllegalParkingAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public DetectVehicleIllegalParkingAdvanceRequest setRoadRegions(java.util.List<DetectVehicleIllegalParkingAdvanceRequestRoadRegions> roadRegions) {
        this.roadRegions = roadRegions;
        return this;
    }
    public java.util.List<DetectVehicleIllegalParkingAdvanceRequestRoadRegions> getRoadRegions() {
        return this.roadRegions;
    }

    public static class DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint self = new DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion extends TeaModel {
        @NameInMap("Point")
        public DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint point;

        public static DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion self = new DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion setPoint(DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint point) {
            this.point = point;
            return this;
        }
        public DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegionPoint getPoint() {
            return this.point;
        }

    }

    public static class DetectVehicleIllegalParkingAdvanceRequestRoadRegions extends TeaModel {
        @NameInMap("RoadRegion")
        public java.util.List<DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion> roadRegion;

        public static DetectVehicleIllegalParkingAdvanceRequestRoadRegions build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingAdvanceRequestRoadRegions self = new DetectVehicleIllegalParkingAdvanceRequestRoadRegions();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingAdvanceRequestRoadRegions setRoadRegion(java.util.List<DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion> roadRegion) {
            this.roadRegion = roadRegion;
            return this;
        }
        public java.util.List<DetectVehicleIllegalParkingAdvanceRequestRoadRegionsRoadRegion> getRoadRegion() {
            return this.roadRegion;
        }

    }

}
