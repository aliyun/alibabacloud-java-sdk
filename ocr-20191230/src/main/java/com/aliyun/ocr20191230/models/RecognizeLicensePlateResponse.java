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

    public RecognizeLicensePlateResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeLicensePlateResponse setData(RecognizeLicensePlateResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeLicensePlateResponseData getData() {
        return this.data;
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

        public RecognizeLicensePlateResponseDataPlatesRoi setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public RecognizeLicensePlateResponseDataPlatesRoi setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public RecognizeLicensePlateResponseDataPlatesRoi setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public RecognizeLicensePlateResponseDataPlatesRoi setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class RecognizeLicensePlateResponseDataPlates extends TeaModel {
        @NameInMap("Confidence")
        @Validation(required = true)
        public Float confidence;

        @NameInMap("PlateNumber")
        @Validation(required = true)
        public String plateNumber;

        @NameInMap("PlateType")
        @Validation(required = true)
        public String plateType;

        @NameInMap("PlateTypeConfidence")
        @Validation(required = true)
        public Float plateTypeConfidence;

        @NameInMap("Roi")
        @Validation(required = true)
        public RecognizeLicensePlateResponseDataPlatesRoi roi;

        public static RecognizeLicensePlateResponseDataPlates build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseDataPlates self = new RecognizeLicensePlateResponseDataPlates();
            return TeaModel.build(map, self);
        }

        public RecognizeLicensePlateResponseDataPlates setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public RecognizeLicensePlateResponseDataPlates setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public RecognizeLicensePlateResponseDataPlates setPlateType(String plateType) {
            this.plateType = plateType;
            return this;
        }
        public String getPlateType() {
            return this.plateType;
        }

        public RecognizeLicensePlateResponseDataPlates setPlateTypeConfidence(Float plateTypeConfidence) {
            this.plateTypeConfidence = plateTypeConfidence;
            return this;
        }
        public Float getPlateTypeConfidence() {
            return this.plateTypeConfidence;
        }

        public RecognizeLicensePlateResponseDataPlates setRoi(RecognizeLicensePlateResponseDataPlatesRoi roi) {
            this.roi = roi;
            return this;
        }
        public RecognizeLicensePlateResponseDataPlatesRoi getRoi() {
            return this.roi;
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

        public RecognizeLicensePlateResponseData setPlates(java.util.List<RecognizeLicensePlateResponseDataPlates> plates) {
            this.plates = plates;
            return this;
        }
        public java.util.List<RecognizeLicensePlateResponseDataPlates> getPlates() {
            return this.plates;
        }

    }

}
