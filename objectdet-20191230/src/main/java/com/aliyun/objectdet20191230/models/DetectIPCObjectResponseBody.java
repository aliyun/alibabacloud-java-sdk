// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectIPCObjectResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectIPCObjectResponseBodyData data;

    public static DetectIPCObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCObjectResponseBody self = new DetectIPCObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectIPCObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectIPCObjectResponseBody setData(DetectIPCObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectIPCObjectResponseBodyData getData() {
        return this.data;
    }

    public static class DetectIPCObjectResponseBodyDataElements extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Box")
        public java.util.List<Long> box;

        @NameInMap("TargetRate")
        public Float targetRate;

        public static DetectIPCObjectResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCObjectResponseBodyDataElements self = new DetectIPCObjectResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectIPCObjectResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectIPCObjectResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectIPCObjectResponseBodyDataElements setBox(java.util.List<Long> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Long> getBox() {
            return this.box;
        }

        public DetectIPCObjectResponseBodyDataElements setTargetRate(Float targetRate) {
            this.targetRate = targetRate;
            return this;
        }
        public Float getTargetRate() {
            return this.targetRate;
        }

    }

    public static class DetectIPCObjectResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectIPCObjectResponseBodyDataElements> elements;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Height")
        public Long height;

        public static DetectIPCObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCObjectResponseBodyData self = new DetectIPCObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectIPCObjectResponseBodyData setElements(java.util.List<DetectIPCObjectResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectIPCObjectResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public DetectIPCObjectResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public DetectIPCObjectResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

    }

}
