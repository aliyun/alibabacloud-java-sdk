// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class CustomizeInstanceSegmentImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public CustomizeInstanceSegmentImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CustomizeInstanceSegmentImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CustomizeInstanceSegmentImageResponseBody self = new CustomizeInstanceSegmentImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CustomizeInstanceSegmentImageResponseBody setData(CustomizeInstanceSegmentImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CustomizeInstanceSegmentImageResponseBodyData getData() {
        return this.data;
    }

    public CustomizeInstanceSegmentImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes build(java.util.Map<String, ?> map) throws Exception {
            CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes self = new CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes();
            return TeaModel.build(map, self);
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class CustomizeInstanceSegmentImageResponseBodyDataElementsContours extends TeaModel {
        @NameInMap("X")
        public Integer x;

        @NameInMap("Y")
        public Integer y;

        public static CustomizeInstanceSegmentImageResponseBodyDataElementsContours build(java.util.Map<String, ?> map) throws Exception {
            CustomizeInstanceSegmentImageResponseBodyDataElementsContours self = new CustomizeInstanceSegmentImageResponseBodyDataElementsContours();
            return TeaModel.build(map, self);
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsContours setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsContours setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class CustomizeInstanceSegmentImageResponseBodyDataElementsMask extends TeaModel {
        @NameInMap("Counts")
        public String counts;

        @NameInMap("Sizes")
        public java.util.List<Integer> sizes;

        public static CustomizeInstanceSegmentImageResponseBodyDataElementsMask build(java.util.Map<String, ?> map) throws Exception {
            CustomizeInstanceSegmentImageResponseBodyDataElementsMask self = new CustomizeInstanceSegmentImageResponseBodyDataElementsMask();
            return TeaModel.build(map, self);
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsMask setCounts(String counts) {
            this.counts = counts;
            return this;
        }
        public String getCounts() {
            return this.counts;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElementsMask setSizes(java.util.List<Integer> sizes) {
            this.sizes = sizes;
            return this;
        }
        public java.util.List<Integer> getSizes() {
            return this.sizes;
        }

    }

    public static class CustomizeInstanceSegmentImageResponseBodyDataElements extends TeaModel {
        @NameInMap("Boxes")
        public CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes boxes;

        @NameInMap("Category")
        public String category;

        @NameInMap("Contours")
        public java.util.List<CustomizeInstanceSegmentImageResponseBodyDataElementsContours> contours;

        @NameInMap("Mask")
        public CustomizeInstanceSegmentImageResponseBodyDataElementsMask mask;

        @NameInMap("Score")
        public Float score;

        public static CustomizeInstanceSegmentImageResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            CustomizeInstanceSegmentImageResponseBodyDataElements self = new CustomizeInstanceSegmentImageResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElements setBoxes(CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes boxes) {
            this.boxes = boxes;
            return this;
        }
        public CustomizeInstanceSegmentImageResponseBodyDataElementsBoxes getBoxes() {
            return this.boxes;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElements setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElements setContours(java.util.List<CustomizeInstanceSegmentImageResponseBodyDataElementsContours> contours) {
            this.contours = contours;
            return this;
        }
        public java.util.List<CustomizeInstanceSegmentImageResponseBodyDataElementsContours> getContours() {
            return this.contours;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElements setMask(CustomizeInstanceSegmentImageResponseBodyDataElementsMask mask) {
            this.mask = mask;
            return this;
        }
        public CustomizeInstanceSegmentImageResponseBodyDataElementsMask getMask() {
            return this.mask;
        }

        public CustomizeInstanceSegmentImageResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class CustomizeInstanceSegmentImageResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<CustomizeInstanceSegmentImageResponseBodyDataElements> elements;

        public static CustomizeInstanceSegmentImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CustomizeInstanceSegmentImageResponseBodyData self = new CustomizeInstanceSegmentImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CustomizeInstanceSegmentImageResponseBodyData setElements(java.util.List<CustomizeInstanceSegmentImageResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<CustomizeInstanceSegmentImageResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
