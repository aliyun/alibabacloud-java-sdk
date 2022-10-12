// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    @NameInMap("PreRegionIntersectFeatures")
    public java.util.List<DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures> preRegionIntersectFeatures;

    @NameInMap("RoadRegions")
    public java.util.List<DetectVehicleICongestionAdvanceRequestRoadRegions> roadRegions;

    public static DetectVehicleICongestionAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleICongestionAdvanceRequest self = new DetectVehicleICongestionAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleICongestionAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public DetectVehicleICongestionAdvanceRequest setPreRegionIntersectFeatures(java.util.List<DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures> preRegionIntersectFeatures) {
        this.preRegionIntersectFeatures = preRegionIntersectFeatures;
        return this;
    }
    public java.util.List<DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures> getPreRegionIntersectFeatures() {
        return this.preRegionIntersectFeatures;
    }

    public DetectVehicleICongestionAdvanceRequest setRoadRegions(java.util.List<DetectVehicleICongestionAdvanceRequestRoadRegions> roadRegions) {
        this.roadRegions = roadRegions;
        return this;
    }
    public java.util.List<DetectVehicleICongestionAdvanceRequestRoadRegions> getRoadRegions() {
        return this.roadRegions;
    }

    public static class DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures extends TeaModel {
        @NameInMap("Features")
        public java.util.List<String> features;

        public static DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures self = new DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionAdvanceRequestPreRegionIntersectFeatures setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

    }

    public static class DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint self = new DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion extends TeaModel {
        @NameInMap("Point")
        public DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint point;

        public static DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion self = new DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion setPoint(DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint point) {
            this.point = point;
            return this;
        }
        public DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegionPoint getPoint() {
            return this.point;
        }

    }

    public static class DetectVehicleICongestionAdvanceRequestRoadRegions extends TeaModel {
        @NameInMap("RoadRegion")
        public java.util.List<DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion> roadRegion;

        public static DetectVehicleICongestionAdvanceRequestRoadRegions build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionAdvanceRequestRoadRegions self = new DetectVehicleICongestionAdvanceRequestRoadRegions();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionAdvanceRequestRoadRegions setRoadRegion(java.util.List<DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion> roadRegion) {
            this.roadRegion = roadRegion;
            return this;
        }
        public java.util.List<DetectVehicleICongestionAdvanceRequestRoadRegionsRoadRegion> getRoadRegion() {
            return this.roadRegion;
        }

    }

}
