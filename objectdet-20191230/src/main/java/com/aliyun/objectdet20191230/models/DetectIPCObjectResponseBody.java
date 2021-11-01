// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectIPCObjectResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectIPCObjectResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DetectIPCObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCObjectResponseBody self = new DetectIPCObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectIPCObjectResponseBody setData(DetectIPCObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectIPCObjectResponseBodyData getData() {
        return this.data;
    }

    public DetectIPCObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectIPCObjectResponseBodyDataElements extends TeaModel {
        @NameInMap("Box")
        public java.util.List<Long> box;

        @NameInMap("Score")
        public Float score;

        @NameInMap("TargetRate")
        public Float targetRate;

        @NameInMap("Type")
        public String type;

        public static DetectIPCObjectResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectIPCObjectResponseBodyDataElements self = new DetectIPCObjectResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectIPCObjectResponseBodyDataElements setBox(java.util.List<Long> box) {
            this.box = box;
            return this;
        }
        public java.util.List<Long> getBox() {
            return this.box;
        }

        public DetectIPCObjectResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectIPCObjectResponseBodyDataElements setTargetRate(Float targetRate) {
            this.targetRate = targetRate;
            return this;
        }
        public Float getTargetRate() {
            return this.targetRate;
        }

        public DetectIPCObjectResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectIPCObjectResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectIPCObjectResponseBodyDataElements> elements;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Width")
        public Long width;

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

        public DetectIPCObjectResponseBodyData setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectIPCObjectResponseBodyData setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
