// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectVehicleIllegalParkingResponseBodyData data;

    public static DetectVehicleIllegalParkingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleIllegalParkingResponseBody self = new DetectVehicleIllegalParkingResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVehicleIllegalParkingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectVehicleIllegalParkingResponseBody setData(DetectVehicleIllegalParkingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVehicleIllegalParkingResponseBodyData getData() {
        return this.data;
    }

    public static class DetectVehicleIllegalParkingResponseBodyDataElementsBoxes extends TeaModel {
        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Right")
        public Long right;

        @NameInMap("Bottom")
        public Long bottom;

        public static DetectVehicleIllegalParkingResponseBodyDataElementsBoxes build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingResponseBodyDataElementsBoxes self = new DetectVehicleIllegalParkingResponseBodyDataElementsBoxes();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingResponseBodyDataElementsBoxes setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectVehicleIllegalParkingResponseBodyDataElementsBoxes setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectVehicleIllegalParkingResponseBodyDataElementsBoxes setRight(Long right) {
            this.right = right;
            return this;
        }
        public Long getRight() {
            return this.right;
        }

        public DetectVehicleIllegalParkingResponseBodyDataElementsBoxes setBottom(Long bottom) {
            this.bottom = bottom;
            return this;
        }
        public Long getBottom() {
            return this.bottom;
        }

    }

    public static class DetectVehicleIllegalParkingResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<DetectVehicleIllegalParkingResponseBodyDataElementsBoxes> boxes;

        @NameInMap("Score")
        public Float score;

        @NameInMap("TypeName")
        public String typeName;

        public static DetectVehicleIllegalParkingResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingResponseBodyDataElements self = new DetectVehicleIllegalParkingResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingResponseBodyDataElements setBoxes(java.util.List<DetectVehicleIllegalParkingResponseBodyDataElementsBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<DetectVehicleIllegalParkingResponseBodyDataElementsBoxes> getBoxes() {
            return this.boxes;
        }

        public DetectVehicleIllegalParkingResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectVehicleIllegalParkingResponseBodyDataElements setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class DetectVehicleIllegalParkingResponseBodyDataRegionIntersects extends TeaModel {
        @NameInMap("Ids")
        public java.util.List<Long> ids;

        public static DetectVehicleIllegalParkingResponseBodyDataRegionIntersects build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingResponseBodyDataRegionIntersects self = new DetectVehicleIllegalParkingResponseBodyDataRegionIntersects();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingResponseBodyDataRegionIntersects setIds(java.util.List<Long> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<Long> getIds() {
            return this.ids;
        }

    }

    public static class DetectVehicleIllegalParkingResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectVehicleIllegalParkingResponseBodyDataElements> elements;

        @NameInMap("RegionIntersects")
        public java.util.List<DetectVehicleIllegalParkingResponseBodyDataRegionIntersects> regionIntersects;

        public static DetectVehicleIllegalParkingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleIllegalParkingResponseBodyData self = new DetectVehicleIllegalParkingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVehicleIllegalParkingResponseBodyData setElements(java.util.List<DetectVehicleIllegalParkingResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectVehicleIllegalParkingResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public DetectVehicleIllegalParkingResponseBodyData setRegionIntersects(java.util.List<DetectVehicleIllegalParkingResponseBodyDataRegionIntersects> regionIntersects) {
            this.regionIntersects = regionIntersects;
            return this;
        }
        public java.util.List<DetectVehicleIllegalParkingResponseBodyDataRegionIntersects> getRegionIntersects() {
            return this.regionIntersects;
        }

    }

}
