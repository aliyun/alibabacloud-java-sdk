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

    public static class RecognizeQrCodeResponseDataElementsResults extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        @NameInMap("Suggestion")
        @Validation(required = true)
        public String suggestion;

        @NameInMap("Rate")
        @Validation(required = true)
        public Double rate;

        @NameInMap("QrCodesData")
        @Validation(required = true)
        public java.util.List<String> qrCodesData;

        public static RecognizeQrCodeResponseDataElementsResults build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseDataElementsResults self = new RecognizeQrCodeResponseDataElementsResults();
            return TeaModel.build(map, self);
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

    }

    public static class RecognizeQrCodeResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeQrCodeResponseDataElements> elements;

        public static RecognizeQrCodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeQrCodeResponseData self = new RecognizeQrCodeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
