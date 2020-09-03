// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeStampResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeStampResponseData data;

    public static RecognizeStampResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeStampResponse self = new RecognizeStampResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeStampResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeStampResponse setData(RecognizeStampResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeStampResponseData getData() {
        return this.data;
    }

    public static class RecognizeStampResponseDataResultsGeneralText extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        public static RecognizeStampResponseDataResultsGeneralText build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseDataResultsGeneralText self = new RecognizeStampResponseDataResultsGeneralText();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseDataResultsGeneralText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecognizeStampResponseDataResultsGeneralText setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class RecognizeStampResponseDataResultsRoi extends TeaModel {
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

        public static RecognizeStampResponseDataResultsRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseDataResultsRoi self = new RecognizeStampResponseDataResultsRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseDataResultsRoi setLeft(Integer left) {
            this.left = left;
            return this;
        }
        public Integer getLeft() {
            return this.left;
        }

        public RecognizeStampResponseDataResultsRoi setTop(Integer top) {
            this.top = top;
            return this;
        }
        public Integer getTop() {
            return this.top;
        }

        public RecognizeStampResponseDataResultsRoi setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public RecognizeStampResponseDataResultsRoi setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

    }

    public static class RecognizeStampResponseDataResultsText extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        public static RecognizeStampResponseDataResultsText build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseDataResultsText self = new RecognizeStampResponseDataResultsText();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseDataResultsText setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecognizeStampResponseDataResultsText setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class RecognizeStampResponseDataResults extends TeaModel {
        @NameInMap("GeneralText")
        @Validation(required = true)
        public java.util.List<RecognizeStampResponseDataResultsGeneralText> generalText;

        @NameInMap("Roi")
        @Validation(required = true)
        public RecognizeStampResponseDataResultsRoi roi;

        @NameInMap("Text")
        @Validation(required = true)
        public RecognizeStampResponseDataResultsText text;

        public static RecognizeStampResponseDataResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseDataResults self = new RecognizeStampResponseDataResults();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseDataResults setGeneralText(java.util.List<RecognizeStampResponseDataResultsGeneralText> generalText) {
            this.generalText = generalText;
            return this;
        }
        public java.util.List<RecognizeStampResponseDataResultsGeneralText> getGeneralText() {
            return this.generalText;
        }

        public RecognizeStampResponseDataResults setRoi(RecognizeStampResponseDataResultsRoi roi) {
            this.roi = roi;
            return this;
        }
        public RecognizeStampResponseDataResultsRoi getRoi() {
            return this.roi;
        }

        public RecognizeStampResponseDataResults setText(RecognizeStampResponseDataResultsText text) {
            this.text = text;
            return this;
        }
        public RecognizeStampResponseDataResultsText getText() {
            return this.text;
        }

    }

    public static class RecognizeStampResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeStampResponseDataResults> results;

        public static RecognizeStampResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseData self = new RecognizeStampResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeStampResponseData setResults(java.util.List<RecognizeStampResponseDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeStampResponseDataResults> getResults() {
            return this.results;
        }

    }

}
