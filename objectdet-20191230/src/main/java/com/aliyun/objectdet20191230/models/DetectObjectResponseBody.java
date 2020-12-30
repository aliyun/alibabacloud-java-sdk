// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectObjectResponseBodyData data;

    public static DetectObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectResponseBody self = new DetectObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectObjectResponseBody setData(DetectObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectObjectResponseBodyData getData() {
        return this.data;
    }

    public static class DetectObjectResponseBodyDataElements extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        @NameInMap("Score")
        public Float score;

        public static DetectObjectResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectObjectResponseBodyDataElements self = new DetectObjectResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectObjectResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DetectObjectResponseBodyDataElements setBoxes(java.util.List<Integer> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<Integer> getBoxes() {
            return this.boxes;
        }

        public DetectObjectResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class DetectObjectResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectObjectResponseBodyDataElements> elements;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Height")
        public Integer height;

        public static DetectObjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectObjectResponseBodyData self = new DetectObjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectObjectResponseBodyData setElements(java.util.List<DetectObjectResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectObjectResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public DetectObjectResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DetectObjectResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

}
