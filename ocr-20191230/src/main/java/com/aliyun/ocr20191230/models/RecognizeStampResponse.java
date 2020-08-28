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

    public static class RecognizeStampResponseDataResultsGeneralText extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        public static RecognizeStampResponseDataResultsGeneralText build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseDataResultsGeneralText self = new RecognizeStampResponseDataResultsGeneralText();
            return TeaModel.build(map, self);
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

    }

    public static class RecognizeStampResponseDataResultsText extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        public static RecognizeStampResponseDataResultsText build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseDataResultsText self = new RecognizeStampResponseDataResultsText();
            return TeaModel.build(map, self);
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

    }

    public static class RecognizeStampResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeStampResponseDataResults> results;

        public static RecognizeStampResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeStampResponseData self = new RecognizeStampResponseData();
            return TeaModel.build(map, self);
        }

    }

}
