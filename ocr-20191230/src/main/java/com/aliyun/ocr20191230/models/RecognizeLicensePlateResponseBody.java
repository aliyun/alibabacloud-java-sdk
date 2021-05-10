// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeLicensePlateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeLicensePlateResponseBodyData data;

    public static RecognizeLicensePlateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeLicensePlateResponseBody self = new RecognizeLicensePlateResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeLicensePlateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeLicensePlateResponseBody setData(RecognizeLicensePlateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeLicensePlateResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeLicensePlateResponseBodyDataPlatesRoi extends TeaModel {
        @NameInMap("W")
        public Integer w;

        @NameInMap("H")
        public Integer h;

        @NameInMap("Y")
        public Integer y;

        @NameInMap("X")
        public Integer x;

        public static RecognizeLicensePlateResponseBodyDataPlatesRoi build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseBodyDataPlatesRoi self = new RecognizeLicensePlateResponseBodyDataPlatesRoi();
            return TeaModel.build(map, self);
        }

        public RecognizeLicensePlateResponseBodyDataPlatesRoi setW(Integer w) {
            this.w = w;
            return this;
        }
        public Integer getW() {
            return this.w;
        }

        public RecognizeLicensePlateResponseBodyDataPlatesRoi setH(Integer h) {
            this.h = h;
            return this;
        }
        public Integer getH() {
            return this.h;
        }

        public RecognizeLicensePlateResponseBodyDataPlatesRoi setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

        public RecognizeLicensePlateResponseBodyDataPlatesRoi setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

    }

    public static class RecognizeLicensePlateResponseBodyDataPlatesPositions extends TeaModel {
        @NameInMap("X")
        public Long x;

        @NameInMap("Y")
        public Long y;

        public static RecognizeLicensePlateResponseBodyDataPlatesPositions build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseBodyDataPlatesPositions self = new RecognizeLicensePlateResponseBodyDataPlatesPositions();
            return TeaModel.build(map, self);
        }

        public RecognizeLicensePlateResponseBodyDataPlatesPositions setX(Long x) {
            this.x = x;
            return this;
        }
        public Long getX() {
            return this.x;
        }

        public RecognizeLicensePlateResponseBodyDataPlatesPositions setY(Long y) {
            this.y = y;
            return this;
        }
        public Long getY() {
            return this.y;
        }

    }

    public static class RecognizeLicensePlateResponseBodyDataPlates extends TeaModel {
        @NameInMap("PlateTypeConfidence")
        public Float plateTypeConfidence;

        @NameInMap("PlateType")
        public String plateType;

        @NameInMap("Confidence")
        public Float confidence;

        @NameInMap("PlateNumber")
        public String plateNumber;

        @NameInMap("Roi")
        public RecognizeLicensePlateResponseBodyDataPlatesRoi roi;

        @NameInMap("Positions")
        public java.util.List<RecognizeLicensePlateResponseBodyDataPlatesPositions> positions;

        public static RecognizeLicensePlateResponseBodyDataPlates build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseBodyDataPlates self = new RecognizeLicensePlateResponseBodyDataPlates();
            return TeaModel.build(map, self);
        }

        public RecognizeLicensePlateResponseBodyDataPlates setPlateTypeConfidence(Float plateTypeConfidence) {
            this.plateTypeConfidence = plateTypeConfidence;
            return this;
        }
        public Float getPlateTypeConfidence() {
            return this.plateTypeConfidence;
        }

        public RecognizeLicensePlateResponseBodyDataPlates setPlateType(String plateType) {
            this.plateType = plateType;
            return this;
        }
        public String getPlateType() {
            return this.plateType;
        }

        public RecognizeLicensePlateResponseBodyDataPlates setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

        public RecognizeLicensePlateResponseBodyDataPlates setPlateNumber(String plateNumber) {
            this.plateNumber = plateNumber;
            return this;
        }
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public RecognizeLicensePlateResponseBodyDataPlates setRoi(RecognizeLicensePlateResponseBodyDataPlatesRoi roi) {
            this.roi = roi;
            return this;
        }
        public RecognizeLicensePlateResponseBodyDataPlatesRoi getRoi() {
            return this.roi;
        }

        public RecognizeLicensePlateResponseBodyDataPlates setPositions(java.util.List<RecognizeLicensePlateResponseBodyDataPlatesPositions> positions) {
            this.positions = positions;
            return this;
        }
        public java.util.List<RecognizeLicensePlateResponseBodyDataPlatesPositions> getPositions() {
            return this.positions;
        }

    }

    public static class RecognizeLicensePlateResponseBodyData extends TeaModel {
        @NameInMap("Plates")
        public java.util.List<RecognizeLicensePlateResponseBodyDataPlates> plates;

        public static RecognizeLicensePlateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeLicensePlateResponseBodyData self = new RecognizeLicensePlateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeLicensePlateResponseBodyData setPlates(java.util.List<RecognizeLicensePlateResponseBodyDataPlates> plates) {
            this.plates = plates;
            return this;
        }
        public java.util.List<RecognizeLicensePlateResponseBodyDataPlates> getPlates() {
            return this.plates;
        }

    }

}
