// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeLicensePlateResponseData data;

    public static RecognizeLicensePlateResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateResponse self = new RecognizeLicensePlateResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeLicensePlateResponseDataPlatesRoi extends TeaModel {
        @NameInMap("H")
        @Validation(required = true)
        public Integer h;

        @NameInMap("W")
        @Validation(required = true)
        public Integer w;

        @NameInMap("X")
        @Validation(required = true)
        public Integer x;

        @NameInMap("Y")
        @Validation(required = true)
        public Integer y;

        public static RecognizeLicensePlateResponseDataPlatesRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseDataPlatesRoi self = new RecognizeLicensePlateResponseDataPlatesRoi();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeLicensePlateResponseDataPlates extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Double confidence;

        @NameInMap("PlateNumber")
        @Validation(required = true)
        public String plateNumber;

        @NameInMap("PlateType")
        @Validation(required = true)
        public String plateType;

        @NameInMap("PlateTypeConfidence")
        @Validation(required = true)
        public Double plateTypeConfidence;

        @NameInMap("Roi")
        @Validation(required = true)
        public RecognizeLicensePlateResponseDataPlatesRoi roi;

        public static RecognizeLicensePlateResponseDataPlates build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseDataPlates self = new RecognizeLicensePlateResponseDataPlates();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeLicensePlateResponseData extends TeaModel {
        @NameInMap("Plates")
        @Validation(required = true)
        public java.util.List<RecognizeLicensePlateResponseDataPlates> plates;

        public static RecognizeLicensePlateResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseData self = new RecognizeLicensePlateResponseData();
            return TeaModel.build(map, self);
        }

    }

}
