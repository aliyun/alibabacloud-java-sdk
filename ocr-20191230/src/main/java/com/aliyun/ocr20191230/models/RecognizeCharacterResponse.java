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

    }

    public static class RecognizeCharacterResponseDataResults extends TeaModel {
        @NameInMap("Probability")
        @Validation(required = true)
        public Double probability;

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

    }

    public static class RecognizeCharacterResponseData extends TeaModel {
        @NameInMap("Results")
        @Validation(required = true)
        public java.util.List<RecognizeCharacterResponseDataResults> results;

        public static RecognizeCharacterResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeCharacterResponseData self = new RecognizeCharacterResponseData();
            return TeaModel.build(map, self);
        }

    }

}
