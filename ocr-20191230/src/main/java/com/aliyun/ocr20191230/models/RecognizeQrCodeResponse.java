// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQrCodeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeQrCodeResponseData data;

    public static RecognizeQrCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQrCodeResponse self = new RecognizeQrCodeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeQrCodeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeQrCodeResponse setData(RecognizeQrCodeResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeQrCodeResponseData getData() {
        return this.data;
    }

    public static class RecognizeQrCodeResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Float rate;

        @NameInMap("QrCodesData")
        @Validation(required = true)
        public java.util.List<String> qrCodesData;

        public static RecognizeQrCodeResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseDataElementsResults self = new RecognizeQrCodeResponseDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeQrCodeResponseDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public RecognizeQrCodeResponseDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public RecognizeQrCodeResponseDataElementsResults setQrCodesData(java.util.List<String> qrCodesData) {
            this.qrCodesData = qrCodesData;
            return this;
        }
        public java.util.List<String> getQrCodesData() {
            return this.qrCodesData;
        }

    }

    public static class RecognizeQrCodeResponseDataElements extends TeaModel {
        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeQrCodeResponseDataElementsResults> results;

        public static RecognizeQrCodeResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseDataElements self = new RecognizeQrCodeResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizeQrCodeResponseDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public RecognizeQrCodeResponseDataElements setResults(java.util.List<RecognizeQrCodeResponseDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeQrCodeResponseDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class RecognizeQrCodeResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeQrCodeResponseDataElements> elements;

        public static RecognizeQrCodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseData self = new RecognizeQrCodeResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseData setElements(java.util.List<RecognizeQrCodeResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeQrCodeResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
