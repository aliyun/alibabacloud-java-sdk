// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectVehicleICongestionResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DetectVehicleICongestionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleICongestionResponseBody self = new DetectVehicleICongestionResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVehicleICongestionResponseBody setData(DetectVehicleICongestionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVehicleICongestionResponseBodyData getData() {
        return this.data;
    }

    public DetectVehicleICongestionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectVehicleICongestionResponseBodyDataElementsBoxes extends TeaModel {
        @NameInMap("Bottom")
        public Long bottom;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Top")
        public Long top;

        public static DetectVehicleICongestionResponseBodyDataElementsBoxes build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionResponseBodyDataElementsBoxes self = new DetectVehicleICongestionResponseBodyDataElementsBoxes();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionResponseBodyDataElementsBoxes setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

        public DetectVehicleICongestionResponseBodyDataElementsBoxes setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectVehicleICongestionResponseBodyDataElementsBoxes setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectVehicleICongestionResponseBodyDataElementsBoxes setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

    }

    public static class DetectVehicleICongestionResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<DetectVehicleICongestionResponseBodyDataElementsBoxes> boxes;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Score")
        public Float score;

        @NameInMap("TypeName")
        public String typeName;

        public static DetectVehicleICongestionResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionResponseBodyDataElements self = new DetectVehicleICongestionResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionResponseBodyDataElements setBoxes(java.util.List<DetectVehicleICongestionResponseBodyDataElementsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<DetectVehicleICongestionResponseBodyDataElementsBoxes> getBoxes() {
            return this.boxes;
        }

        public DetectVehicleICongestionResponseBodyDataElements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DetectVehicleICongestionResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectVehicleICongestionResponseBodyDataElements setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures extends TeaModel {
        @NameInMap("Features")
        public java.util.List<String> features;

        public static DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures self = new DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures setFeatures(java.util.List<String> features) {
            this.features = features;
            return this;
        }
        public java.util.List<String> getFeatures() {
            return this.features;
        }

    }

    public static class DetectVehicleICongestionResponseBodyDataRegionIntersectMatched extends TeaModel {
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        public static DetectVehicleICongestionResponseBodyDataRegionIntersectMatched build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionResponseBodyDataRegionIntersectMatched self = new DetectVehicleICongestionResponseBodyDataRegionIntersectMatched();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionResponseBodyDataRegionIntersectMatched setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

    }

    public static class DetectVehicleICongestionResponseBodyDataRegionIntersects extends TeaModel {
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        public static DetectVehicleICongestionResponseBodyDataRegionIntersects build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionResponseBodyDataRegionIntersects self = new DetectVehicleICongestionResponseBodyDataRegionIntersects();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionResponseBodyDataRegionIntersects setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

    }

    public static class DetectVehicleICongestionResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectVehicleICongestionResponseBodyDataElements> elements;

        @NameInMap("RegionIntersectFeatures")
        public java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures> regionIntersectFeatures;

        @NameInMap("RegionIntersectMatched")
        public java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersectMatched> regionIntersectMatched;

        @NameInMap("RegionIntersects")
        public java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersects> regionIntersects;

        public static DetectVehicleICongestionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleICongestionResponseBodyData self = new DetectVehicleICongestionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVehicleICongestionResponseBodyData setElements(java.util.List<DetectVehicleICongestionResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectVehicleICongestionResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public DetectVehicleICongestionResponseBodyData setRegionIntersectFeatures(java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures> regionIntersectFeatures) {
            this.regionIntersectFeatures = regionIntersectFeatures;
            return this;
        }
        public java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersectFeatures> getRegionIntersectFeatures() {
            return this.regionIntersectFeatures;
        }

        public DetectVehicleICongestionResponseBodyData setRegionIntersectMatched(java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersectMatched> regionIntersectMatched) {
            this.regionIntersectMatched = regionIntersectMatched;
            return this;
        }
        public java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersectMatched> getRegionIntersectMatched() {
            return this.regionIntersectMatched;
        }

        public DetectVehicleICongestionResponseBodyData setRegionIntersects(java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersects> regionIntersects) {
            this.regionIntersects = regionIntersects;
            return this;
        }
        public java.util.List<DetectVehicleICongestionResponseBodyDataRegionIntersects> getRegionIntersects() {
            return this.regionIntersects;
        }

    }

}
