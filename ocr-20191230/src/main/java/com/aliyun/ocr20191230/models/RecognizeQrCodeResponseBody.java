// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeQrCodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public RecognizeQrCodeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>A53DC437-F883-4968-86D5-EB21FB044692</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RecognizeQrCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeQrCodeResponseBody self = new RecognizeQrCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeQrCodeResponseBody setData(RecognizeQrCodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeQrCodeResponseBodyData getData() {
        return this.data;
    }

    public RecognizeQrCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RecognizeQrCodeResponseBodyDataElementsResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>qrcode</p>
         */
        @NameInMap("Label")
        public String label;

        /**
         * <p>1</p>
         */
        @NameInMap("QrCodesData")
        public java.util.List<String> qrCodesData;

        /**
         * <strong>example:</strong>
         * <p>99.91</p>
         */
        @NameInMap("Rate")
        public Float rate;

        /**
         * <strong>example:</strong>
         * <p>review</p>
         */
        @NameInMap("Suggestion")
        public String suggestion;

        public static RecognizeQrCodeResponseBodyDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseBodyDataElementsResults self = new RecognizeQrCodeResponseBodyDataElementsResults();
            return TeaModel.build(map, self);
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setQrCodesData(java.util.List<String> qrCodesData) {
            this.qrCodesData = qrCodesData;
            return this;
        }
        public java.util.List<String> getQrCodesData() {
            return this.qrCodesData;
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public RecognizeQrCodeResponseBodyDataElementsResults setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class RecognizeQrCodeResponseBodyDataElements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeQrCode/RecognizeQrCode6.jpg">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/ocr/RecognizeQrCode/RecognizeQrCode6.jpg</a></p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("Results")
        public java.util.List<RecognizeQrCodeResponseBodyDataElementsResults> results;

        /**
         * <strong>example:</strong>
         * <p>img5iGtwVIxQzc4Nqy$L84yHd-1v****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

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

        public RecognizeQrCodeResponseBodyDataElements setResults(java.util.List<RecognizeQrCodeResponseBodyDataElementsResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<RecognizeQrCodeResponseBodyDataElementsResults> getResults() {
            return this.results;
        }

        public RecognizeQrCodeResponseBodyDataElements setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
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
