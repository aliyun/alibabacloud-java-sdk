// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectVehicleResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectVehicleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleResponseBody self = new DetectVehicleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectVehicleResponseBody setData(DetectVehicleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectVehicleResponseBodyData getData() {
        return this.data;
    }

    public DetectVehicleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectVehicleResponseBodyDataDetectObjectInfoList extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Type")
        public String type;

        public static DetectVehicleResponseBodyDataDetectObjectInfoList build(java.util.Map<String, ?> map) throws Exception {
            DetectVehicleResponseBodyDataDetectObjectInfoList self = new DetectVehicleResponseBodyDataDetectObjectInfoList();
            return TeaModel.build(map, self);
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectVehicleResponseBodyDataDetectObjectInfoList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectVehicleResponseBodyData extends TeaModel {
        @NameInMap("DetectObjectInfoList")
        public java.util.List<DetectVehicleResponseBodyDataDetectObjectInfoList> detectObjectInfoList;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

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

        public DetectVehicleResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectVehicleResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
