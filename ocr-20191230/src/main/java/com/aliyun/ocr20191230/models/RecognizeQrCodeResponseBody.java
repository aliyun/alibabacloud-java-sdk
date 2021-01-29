// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQrCodeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeQrCodeResponseBodyData data;

    public static RecognizeQrCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQrCodeResponseBody self = new RecognizeQrCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeQrCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeQrCodeResponseBody setData(RecognizeQrCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeQrCodeResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeQrCodeResponseBodyDataElementsResults extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("QrCodesData")
        public java.util.List<String> qrCodesData;

        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public Float rate;

        public static RecognizeQrCodeResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseBodyDataElementsResults self = new RecognizeQrCodeResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setQrCodesData(java.util.List<String> qrCodesData) {
            this.qrCodesData = qrCodesData;
            return this;
        }
        public java.util.List<String> getQrCodesData() {
            return this.qrCodesData;
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

    }

    public static class RecognizeQrCodeResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Results")
        public java.util.List<RecognizeQrCodeResponseBodyDataElementsResults> results;

        public static RecognizeQrCodeResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseBodyDataElements self = new RecognizeQrCodeResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public RecognizeQrCodeResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public RecognizeQrCodeResponseBodyDataElements setResults(java.util.List<RecognizeQrCodeResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeQrCodeResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

    }

    public static class RecognizeQrCodeResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeQrCodeResponseBodyDataElements> elements;

        public static RecognizeQrCodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseBodyData self = new RecognizeQrCodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseBodyData setElements(java.util.List<RecognizeQrCodeResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeQrCodeResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
