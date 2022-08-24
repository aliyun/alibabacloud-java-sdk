// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeDetectImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public CustomizeDetectImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CustomizeDetectImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomizeDetectImageResponseBody self = new CustomizeDetectImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomizeDetectImageResponseBody setData(CustomizeDetectImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CustomizeDetectImageResponseBodyData getData() {
        return this.data;
    }

    public CustomizeDetectImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CustomizeDetectImageResponseBodyDataElementsBoxes extends TeaModel {
        @NameInMap("Height")
        public Float height;

        @NameInMap("Width")
        public Float width;

        @NameInMap("X")
        public Float x;

        @NameInMap("Y")
        public Float y;

        public static CustomizeDetectImageResponseBodyDataElementsBoxes build(java.util.Map<String, ?> map) throws Exception {
            CustomizeDetectImageResponseBodyDataElementsBoxes self = new CustomizeDetectImageResponseBodyDataElementsBoxes();
            return TeaModel.build(map, self);
        }

        public CustomizeDetectImageResponseBodyDataElementsBoxes setHeight(Float height) {
            this.height = height;
            return this;
        }
        public Float getHeight() {
            return this.height;
        }

        public CustomizeDetectImageResponseBodyDataElementsBoxes setWidth(Float width) {
            this.width = width;
            return this;
        }
        public Float getWidth() {
            return this.width;
        }

        public CustomizeDetectImageResponseBodyDataElementsBoxes setX(Float x) {
            this.x = x;
            return this;
        }
        public Float getX() {
            return this.x;
        }

        public CustomizeDetectImageResponseBodyDataElementsBoxes setY(Float y) {
            this.y = y;
            return this;
        }
        public Float getY() {
            return this.y;
        }

    }

    public static class CustomizeDetectImageResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public CustomizeDetectImageResponseBodyDataElementsBoxes boxes;

        @NameInMap("Category")
        public String category;

        @NameInMap("Score")
        public Float score;

        public static CustomizeDetectImageResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            CustomizeDetectImageResponseBodyDataElements self = new CustomizeDetectImageResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public CustomizeDetectImageResponseBodyDataElements setBoxes(CustomizeDetectImageResponseBodyDataElementsBoxes boxes) {
            this.boxes = boxes;
            return this;
        }
        public CustomizeDetectImageResponseBodyDataElementsBoxes getBoxes() {
            return this.boxes;
        }

        public CustomizeDetectImageResponseBodyDataElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CustomizeDetectImageResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class CustomizeDetectImageResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<CustomizeDetectImageResponseBodyDataElements> elements;

        public static CustomizeDetectImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CustomizeDetectImageResponseBodyData self = new CustomizeDetectImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CustomizeDetectImageResponseBodyData setElements(java.util.List<CustomizeDetectImageResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<CustomizeDetectImageResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
