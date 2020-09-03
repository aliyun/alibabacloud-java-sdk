// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeCharacterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeCharacterResponseData data;

    public static RecognizeCharacterResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCharacterResponse self = new RecognizeCharacterResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCharacterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeCharacterResponse setData(RecognizeCharacterResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeCharacterResponseData getData() {
        return this.data;
    }

    public static class RecognizeCharacterResponseDataResultsTextRectangles extends TeaModel {
        @NameInMap("Angle")
        @Validation(required = true)
        public Integer angle;

        @NameInMap("Left")
        @Validation(required = true)
        public Integer left;

        @NameInMap("Top")
        @Validation(required = true)
        public Integer top;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static RecognizeCharacterResponseDataResultsTextRectangles build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseDataResultsTextRectangles self = new RecognizeCharacterResponseDataResultsTextRectangles();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseDataResultsTextRectangles setAngle(Integer angle) {
            this.angle = angle;
            return this;
        }
        public Integer getAngle() {
            return this.angle;
        }

        public RecognizeCharacterResponseDataResultsTextRectangles setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeCharacterResponseDataResultsTextRectangles setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeCharacterResponseDataResultsTextRectangles setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeCharacterResponseDataResultsTextRectangles setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class RecognizeCharacterResponseDataResults extends TeaModel {
        @NameInMap("Probability")
        @Validation(required = true)
        public Float probability;

        @NameInMap("Text")
        @Validation(required = true)
        public String text;

        @NameInMap("TextRectangles")
        @Validation(required = true)
        public RecognizeCharacterResponseDataResultsTextRectangles textRectangles;

        public static RecognizeCharacterResponseDataResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseDataResults self = new RecognizeCharacterResponseDataResults();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseDataResults setProbability(Float probability) {
            this.probability = probability;
            return this;
        }
        public Float getProbability() {
            return this.probability;
        }

        public RecognizeCharacterResponseDataResults setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public RecognizeCharacterResponseDataResults setTextRectangles(RecognizeCharacterResponseDataResultsTextRectangles textRectangles) {
            this.textRectangles = textRectangles;
            return this;
        }
        public RecognizeCharacterResponseDataResultsTextRectangles getTextRectangles() {
            return this.textRectangles;
        }

    }

    public static class RecognizeCharacterResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeCharacterResponseDataResults> results;

        public static RecognizeCharacterResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseData self = new RecognizeCharacterResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeCharacterResponseData setResults(java.util.List<RecognizeCharacterResponseDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeCharacterResponseDataResults> getResults() {
            return this.results;
        }

    }

}
