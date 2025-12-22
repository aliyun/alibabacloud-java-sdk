// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeCharacterResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>7A9BC7FE-2D42-57AF-93BC-09A229DD2F1D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeCharacterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCharacterResponseBody self = new RecognizeCharacterResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeCharacterResponseBody setData(RecognizeCharacterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeCharacterResponseBodyData getData() {
        return this.data;
    }

    public RecognizeCharacterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeCharacterResponseBodyDataResultsTextRectanglesPos extends TeaModel {
        @NameInMap("x")
        public Integer x;

        @NameInMap("y")
        public Integer y;

        public static RecognizeCharacterResponseBodyDataResultsTextRectanglesPos build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseBodyDataResultsTextRectanglesPos self = new RecognizeCharacterResponseBodyDataResultsTextRectanglesPos();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectanglesPos setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectanglesPos setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeCharacterResponseBodyDataResultsTextRectangles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>-65</p>
         */
        @NameInMap("Angle")
        public Integer angle;

        /**
         * <strong>example:</strong>
         * <p>409</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p>511</p>
         */
        @NameInMap("Left")
        public Integer left;

        @NameInMap("Pos")
        public java.util.List<RecognizeCharacterResponseBodyDataResultsTextRectanglesPos> pos;

        /**
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("Top")
        public Integer top;

        /**
         * <strong>example:</strong>
         * <p>77</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static RecognizeCharacterResponseBodyDataResultsTextRectangles build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseBodyDataResultsTextRectangles self = new RecognizeCharacterResponseBodyDataResultsTextRectangles();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectangles setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectangles setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectangles setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectangles setPos(java.util.List<RecognizeCharacterResponseBodyDataResultsTextRectanglesPos> pos) {
            this.pos = pos;
            return this;
        }
        public java.util.List<RecognizeCharacterResponseBodyDataResultsTextRectanglesPos> getPos() {
            return this.pos;
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectangles setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeCharacterResponseBodyDataResultsTextRectangles setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeCharacterResponseBodyDataResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.99</p>
         */
        @NameInMap("Probability")
        public Float probability;

        @NameInMap("Text")
        public String text;

        @NameInMap("TextRectangles")
        public RecognizeCharacterResponseBodyDataResultsTextRectangles textRectangles;

        public static RecognizeCharacterResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseBodyDataResults self = new RecognizeCharacterResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseBodyDataResults setProbability(Float probability) {
            this.probability = probability;
            return this;
        }
        public Float getProbability() {
            return this.probability;
        }

        public RecognizeCharacterResponseBodyDataResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeCharacterResponseBodyDataResults setTextRectangles(RecognizeCharacterResponseBodyDataResultsTextRectangles textRectangles) {
            this.textRectangles = textRectangles;
            return this;
        }
        public RecognizeCharacterResponseBodyDataResultsTextRectangles getTextRectangles() {
            return this.textRectangles;
        }

    }

    public static class RecognizeCharacterResponseBodyData extends TeaModel {
        @NameInMap("Results")
        public java.util.List<RecognizeCharacterResponseBodyDataResults> results;

        public static RecognizeCharacterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseBodyData self = new RecognizeCharacterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseBodyData setResults(java.util.List<RecognizeCharacterResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeCharacterResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
