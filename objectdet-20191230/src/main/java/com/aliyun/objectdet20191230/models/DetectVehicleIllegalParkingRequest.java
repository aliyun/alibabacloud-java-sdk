// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("RoadRegions")
    public java.util.List<DetectVehicleIllegalParkingRequestRoadRegions> roadRegions;

    public static DetectVehicleIllegalParkingRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleIllegalParkingRequest self = new DetectVehicleIllegalParkingRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleIllegalParkingRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectVehicleIllegalParkingRequest setRoadRegions(java.util.List<DetectVehicleIllegalParkingRequestRoadRegions> roadRegions) {
        this.roadRegions = roadRegions;
        return this;
    }
    public java.util.List<DetectVehicleIllegalParkingRequestRoadRegions> getRoadRegions() {
        return this.roadRegions;
    }

    public static class DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint self = new DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion extends TeaModel {
        @NameInMap("Point")
        public DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint point;

        public static DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion self = new DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion setPoint(DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint point) {
            this.point = point;
            return this;
        }
        public DetectVehicleIllegalParkingRequestRoadRegionsRoadRegionPoint getPoint() {
            return this.point;
        }

    }

    public static class DetectVehicleIllegalParkingRequestRoadRegions extends TeaModel {
        @NameInMap("RoadRegion")
        public java.util.List<DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion> roadRegion;

        public static DetectVehicleIllegalParkingRequestRoadRegions build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingRequestRoadRegions self = new DetectVehicleIllegalParkingRequestRoadRegions();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingRequestRoadRegions setRoadRegion(java.util.List<DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion> roadRegion) {
            this.roadRegion = roadRegion;
            return this;
        }
        public java.util.List<DetectVehicleIllegalParkingRequestRoadRegionsRoadRegion> getRoadRegion() {
            return this.roadRegion;
        }

    }

}
