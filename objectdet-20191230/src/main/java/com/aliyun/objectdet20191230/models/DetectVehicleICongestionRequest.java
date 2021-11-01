// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionRequest extends TeaModel {
    // A short description of struct
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("OriginRequestId")
    public String originRequestId;

    @NameInMap("PreRegionIntersectFeatures")
    public java.util.List<DetectVehicleICongestionRequestPreRegionIntersectFeatures> preRegionIntersectFeatures;

    @NameInMap("RoadRegions")
    public java.util.List<DetectVehicleICongestionRequestRoadRegions> roadRegions;

    @NameInMap("StreamArn")
    public String streamArn;

    public static DetectVehicleICongestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleICongestionRequest self = new DetectVehicleICongestionRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleICongestionRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public DetectVehicleICongestionRequest setOriginRequestId(String originRequestId) {
        this.originRequestId = originRequestId;
        return this;
    }
    public String getOriginRequestId() {
        return this.originRequestId;
    }

    public DetectVehicleICongestionRequest setPreRegionIntersectFeatures(java.util.List<DetectVehicleICongestionRequestPreRegionIntersectFeatures> preRegionIntersectFeatures) {
        this.preRegionIntersectFeatures = preRegionIntersectFeatures;
        return this;
    }
    public java.util.List<DetectVehicleICongestionRequestPreRegionIntersectFeatures> getPreRegionIntersectFeatures() {
        return this.preRegionIntersectFeatures;
    }

    public DetectVehicleICongestionRequest setRoadRegions(java.util.List<DetectVehicleICongestionRequestRoadRegions> roadRegions) {
        this.roadRegions = roadRegions;
        return this;
    }
    public java.util.List<DetectVehicleICongestionRequestRoadRegions> getRoadRegions() {
        return this.roadRegions;
    }

    public DetectVehicleICongestionRequest setStreamArn(String streamArn) {
        this.streamArn = streamArn;
        return this;
    }
    public String getStreamArn() {
        return this.streamArn;
    }

    public static class DetectVehicleICongestionRequestPreRegionIntersectFeatures extends TeaModel {
        @NameInMap("Features")
        public java.util.List<String> features;

        public static DetectVehicleICongestionRequestPreRegionIntersectFeatures build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionRequestPreRegionIntersectFeatures self = new DetectVehicleICongestionRequestPreRegionIntersectFeatures();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionRequestPreRegionIntersectFeatures setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

    }

    public static class DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint self = new DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class DetectVehicleICongestionRequestRoadRegionsRoadRegion extends TeaModel {
        @NameInMap("Point")
        public DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint point;

        public static DetectVehicleICongestionRequestRoadRegionsRoadRegion build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionRequestRoadRegionsRoadRegion self = new DetectVehicleICongestionRequestRoadRegionsRoadRegion();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionRequestRoadRegionsRoadRegion setPoint(DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint point) {
            this.point = point;
            return this;
        }
        public DetectVehicleICongestionRequestRoadRegionsRoadRegionPoint getPoint() {
            return this.point;
        }

    }

    public static class DetectVehicleICongestionRequestRoadRegions extends TeaModel {
        @NameInMap("RoadRegion")
        public java.util.List<DetectVehicleICongestionRequestRoadRegionsRoadRegion> roadRegion;

        public static DetectVehicleICongestionRequestRoadRegions build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionRequestRoadRegions self = new DetectVehicleICongestionRequestRoadRegions();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionRequestRoadRegions setRoadRegion(java.util.List<DetectVehicleICongestionRequestRoadRegionsRoadRegion> roadRegion) {
            this.roadRegion = roadRegion;
            return this;
        }
        public java.util.List<DetectVehicleICongestionRequestRoadRegionsRoadRegion> getRoadRegion() {
            return this.roadRegion;
        }

    }

}
