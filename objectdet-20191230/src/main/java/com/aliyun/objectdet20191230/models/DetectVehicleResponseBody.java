// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectVehicleResponseBodyData data;

    public static DetectVehicleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleResponseBody self = new DetectVehicleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVehicleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectVehicleResponseBody setData(DetectVehicleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVehicleResponseBodyData getData() {
        return this.data;
    }

    public static class DetectVehicleResponseBodyDataDetectObjectInfoList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Id")
        public Integer id;

        public static DetectVehicleResponseBodyDataDetectObjectInfoList build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleResponseBodyDataDetectObjectInfoList self = new DetectVehicleResponseBodyDataDetectObjectInfoList();
            return TeaModel.build(map, self);
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

    }

    public static class DetectVehicleResponseBodyData extends TeaModel {
        @NameInMap("DetectObjectInfoList")
        public java.util.List<DetectVehicleResponseBodyDataDetectObjectInfoList> detectObjectInfoList;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DetectVehicleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleResponseBodyData self = new DetectVehicleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectVehicleResponseBodyData setDetectObjectInfoList(java.util.List<DetectVehicleResponseBodyDataDetectObjectInfoList> detectObjectInfoList) {
            this.detectObjectInfoList = detectObjectInfoList;
            return this;
        }
        public java.util.List<DetectVehicleResponseBodyDataDetectObjectInfoList> getDetectObjectInfoList() {
            return this.detectObjectInfoList;
        }

        public DetectVehicleResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectVehicleResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

}
