// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWorkwearResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectWorkwearResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DetectWorkwearResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectWorkwearResponseBody self = new DetectWorkwearResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectWorkwearResponseBody setData(DetectWorkwearResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectWorkwearResponseBodyData getData() {
        return this.data;
    }

    public DetectWorkwearResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectWorkwearResponseBodyDataElementsPropertyProbability extends TeaModel {
        @NameInMap("No")
        public Double no;

        @NameInMap("Threshold")
        public Long threshold;

        @NameInMap("Unknown")
        public Double unknown;

        @NameInMap("Yes")
        public Double yes;

        public static DetectWorkwearResponseBodyDataElementsPropertyProbability build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearResponseBodyDataElementsPropertyProbability self = new DetectWorkwearResponseBodyDataElementsPropertyProbability();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearResponseBodyDataElementsPropertyProbability setNo(Double no) {
            this.no = no;
            return this;
        }
        public Double getNo() {
            return this.no;
        }

        public DetectWorkwearResponseBodyDataElementsPropertyProbability setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

        public DetectWorkwearResponseBodyDataElementsPropertyProbability setUnknown(Double unknown) {
            this.unknown = unknown;
            return this;
        }
        public Double getUnknown() {
            return this.unknown;
        }

        public DetectWorkwearResponseBodyDataElementsPropertyProbability setYes(Double yes) {
            this.yes = yes;
            return this;
        }
        public Double getYes() {
            return this.yes;
        }

    }

    public static class DetectWorkwearResponseBodyDataElementsProperty extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Probability")
        public DetectWorkwearResponseBodyDataElementsPropertyProbability probability;

        public static DetectWorkwearResponseBodyDataElementsProperty build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearResponseBodyDataElementsProperty self = new DetectWorkwearResponseBodyDataElementsProperty();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearResponseBodyDataElementsProperty setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public DetectWorkwearResponseBodyDataElementsProperty setProbability(DetectWorkwearResponseBodyDataElementsPropertyProbability probability) {
            this.probability = probability;
            return this;
        }
        public DetectWorkwearResponseBodyDataElementsPropertyProbability getProbability() {
            return this.probability;
        }

    }

    public static class DetectWorkwearResponseBodyDataElementsRectangles extends TeaModel {
        @NameInMap("Height")
        public Long height;

        @NameInMap("Left")
        public Long left;

        @NameInMap("Top")
        public Long top;

        @NameInMap("Width")
        public Long width;

        public static DetectWorkwearResponseBodyDataElementsRectangles build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearResponseBodyDataElementsRectangles self = new DetectWorkwearResponseBodyDataElementsRectangles();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearResponseBodyDataElementsRectangles setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DetectWorkwearResponseBodyDataElementsRectangles setLeft(Long left) {
            this.left = left;
            return this;
        }
        public Long getLeft() {
            return this.left;
        }

        public DetectWorkwearResponseBodyDataElementsRectangles setTop(Long top) {
            this.top = top;
            return this;
        }
        public Long getTop() {
            return this.top;
        }

        public DetectWorkwearResponseBodyDataElementsRectangles setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class DetectWorkwearResponseBodyDataElements extends TeaModel {
        @NameInMap("Property")
        public java.util.List<DetectWorkwearResponseBodyDataElementsProperty> property;

        @NameInMap("Rectangles")
        public DetectWorkwearResponseBodyDataElementsRectangles rectangles;

        @NameInMap("Score")
        public Double score;

        @NameInMap("Type")
        public String type;

        public static DetectWorkwearResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearResponseBodyDataElements self = new DetectWorkwearResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearResponseBodyDataElements setProperty(java.util.List<DetectWorkwearResponseBodyDataElementsProperty> property) {
            this.property = property;
            return this;
        }
        public java.util.List<DetectWorkwearResponseBodyDataElementsProperty> getProperty() {
            return this.property;
        }

        public DetectWorkwearResponseBodyDataElements setRectangles(DetectWorkwearResponseBodyDataElementsRectangles rectangles) {
            this.rectangles = rectangles;
            return this;
        }
        public DetectWorkwearResponseBodyDataElementsRectangles getRectangles() {
            return this.rectangles;
        }

        public DetectWorkwearResponseBodyDataElements setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

        public DetectWorkwearResponseBodyDataElements setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DetectWorkwearResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<DetectWorkwearResponseBodyDataElements> elements;

        public static DetectWorkwearResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectWorkwearResponseBodyData self = new DetectWorkwearResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectWorkwearResponseBodyData setElements(java.util.List<DetectWorkwearResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<DetectWorkwearResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
