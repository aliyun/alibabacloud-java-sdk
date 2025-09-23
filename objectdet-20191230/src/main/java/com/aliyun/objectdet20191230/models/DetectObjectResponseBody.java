// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectObjectResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>6EF97B44-2763-4EAD-8737-FB9F5EE25FE2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectResponseBody self = new DetectObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectObjectResponseBody setData(DetectObjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectObjectResponseBodyData getData() {
        return this.data;
    }

    public DetectObjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectObjectResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<Integer> boxes;

        /**
         * <strong>example:</strong>
         * <p>0.266</p>
         */
        @NameInMap("Score")
        public Float score;

        /**
         * <strong>example:</strong>
         * <p>chair</p>
         */
        @NameInMap("Type")
        public String type;

        public static DetectObjectResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectObjectResponseBodyDataElements self = new DetectObjectResponseBodyDataElements();
            return TeaModel.build(map, self);
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

        public DetectObjectResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectObjectResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectObjectResponseBodyDataElements> elements;

        /**
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>533</p>
         */
        @NameInMap("Width")
        public Integer width;

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

        public DetectObjectResponseBodyData setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DetectObjectResponseBodyData setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
