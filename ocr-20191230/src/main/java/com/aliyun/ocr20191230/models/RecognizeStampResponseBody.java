// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStampResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeStampResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeStampResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStampResponseBody self = new RecognizeStampResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeStampResponseBody setData(RecognizeStampResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeStampResponseBodyData getData() {
        return this.data;
    }

    public RecognizeStampResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeStampResponseBodyDataResultsGeneralText extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Content")
        public String content;

        public static RecognizeStampResponseBodyDataResultsGeneralText build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseBodyDataResultsGeneralText self = new RecognizeStampResponseBodyDataResultsGeneralText();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseBodyDataResultsGeneralText setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public RecognizeStampResponseBodyDataResultsGeneralText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RecognizeStampResponseBodyDataResultsRoi extends TeaModel {
        @NameInMap("Height")
        public Integer height;

        @NameInMap("Left")
        public Integer left;

        @NameInMap("Top")
        public Integer top;

        @NameInMap("Width")
        public Integer width;

        public static RecognizeStampResponseBodyDataResultsRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseBodyDataResultsRoi self = new RecognizeStampResponseBodyDataResultsRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseBodyDataResultsRoi setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public RecognizeStampResponseBodyDataResultsRoi setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeStampResponseBodyDataResultsRoi setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeStampResponseBodyDataResultsRoi setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class RecognizeStampResponseBodyDataResultsText extends TeaModel {
        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("Content")
        public String content;

        public static RecognizeStampResponseBodyDataResultsText build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseBodyDataResultsText self = new RecognizeStampResponseBodyDataResultsText();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseBodyDataResultsText setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public RecognizeStampResponseBodyDataResultsText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class RecognizeStampResponseBodyDataResults extends TeaModel {
        @NameInMap("GeneralText")
        public java.util.List<RecognizeStampResponseBodyDataResultsGeneralText> generalText;

        @NameInMap("Roi")
        public RecognizeStampResponseBodyDataResultsRoi roi;

        @NameInMap("Text")
        public RecognizeStampResponseBodyDataResultsText text;

        public static RecognizeStampResponseBodyDataResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseBodyDataResults self = new RecognizeStampResponseBodyDataResults();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseBodyDataResults setGeneralText(java.util.List<RecognizeStampResponseBodyDataResultsGeneralText> generalText) {
            this.generalText = generalText;
            return this;
        }
        public java.util.List<RecognizeStampResponseBodyDataResultsGeneralText> getGeneralText() {
            return this.generalText;
        }

        public RecognizeStampResponseBodyDataResults setRoi(RecognizeStampResponseBodyDataResultsRoi roi) {
            this.roi = roi;
            return this;
        }
        public RecognizeStampResponseBodyDataResultsRoi getRoi() {
            return this.roi;
        }

        public RecognizeStampResponseBodyDataResults setText(RecognizeStampResponseBodyDataResultsText text) {
            this.text = text;
            return this;
        }
        public RecognizeStampResponseBodyDataResultsText getText() {
            return this.text;
        }

    }

    public static class RecognizeStampResponseBodyData extends TeaModel {
        @NameInMap("Results")
        public java.util.List<RecognizeStampResponseBodyDataResults> results;

        public static RecognizeStampResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseBodyData self = new RecognizeStampResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseBodyData setResults(java.util.List<RecognizeStampResponseBodyDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeStampResponseBodyDataResults> getResults() {
            return this.results;
        }

    }

}
