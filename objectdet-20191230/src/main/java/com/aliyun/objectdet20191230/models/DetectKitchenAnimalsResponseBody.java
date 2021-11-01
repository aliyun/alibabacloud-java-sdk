// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectKitchenAnimalsResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectKitchenAnimalsResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DetectKitchenAnimalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectKitchenAnimalsResponseBody self = new DetectKitchenAnimalsResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectKitchenAnimalsResponseBody setData(DetectKitchenAnimalsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectKitchenAnimalsResponseBodyData getData() {
        return this.data;
    }

    public DetectKitchenAnimalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectKitchenAnimalsResponseBodyDataElementsRectangles extends TeaModel {
        @NameInMap("Height")
        public Long height;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Width")
        public Long width;

        public static DetectKitchenAnimalsResponseBodyDataElementsRectangles build(java.util.Map<String, ?> map) throws Exception {
            DetectKitchenAnimalsResponseBodyDataElementsRectangles self = new DetectKitchenAnimalsResponseBodyDataElementsRectangles();
            return TeaModel.build(map, self);
        }

        public DetectKitchenAnimalsResponseBodyDataElementsRectangles setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectKitchenAnimalsResponseBodyDataElementsRectangles setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectKitchenAnimalsResponseBodyDataElementsRectangles setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectKitchenAnimalsResponseBodyDataElementsRectangles setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class DetectKitchenAnimalsResponseBodyDataElements extends TeaModel {
        @NameInMap("Rectangles")
        public DetectKitchenAnimalsResponseBodyDataElementsRectangles rectangles;

        @NameInMap("Score")
        public Float score;

        @NameInMap("Type")
        public String type;

        public static DetectKitchenAnimalsResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectKitchenAnimalsResponseBodyDataElements self = new DetectKitchenAnimalsResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectKitchenAnimalsResponseBodyDataElements setRectangles(DetectKitchenAnimalsResponseBodyDataElementsRectangles rectangles) {
            this.rectangles = rectangles;
            return this;
        }
        public DetectKitchenAnimalsResponseBodyDataElementsRectangles getRectangles() {
            return this.rectangles;
        }

        public DetectKitchenAnimalsResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public DetectKitchenAnimalsResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectKitchenAnimalsResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectKitchenAnimalsResponseBodyDataElements> elements;

        public static DetectKitchenAnimalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectKitchenAnimalsResponseBodyData self = new DetectKitchenAnimalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectKitchenAnimalsResponseBodyData setElements(java.util.List<DetectKitchenAnimalsResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectKitchenAnimalsResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
