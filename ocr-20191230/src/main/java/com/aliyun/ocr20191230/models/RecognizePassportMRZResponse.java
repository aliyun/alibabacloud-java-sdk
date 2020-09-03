// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePassportMRZResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizePassportMRZResponseData data;

    public static RecognizePassportMRZResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportMRZResponse self = new RecognizePassportMRZResponse();
        return TeaModel.build(map, self);
    }

    public RecognizePassportMRZResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizePassportMRZResponse setData(RecognizePassportMRZResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizePassportMRZResponseData getData() {
        return this.data;
    }

    public static class RecognizePassportMRZResponseDataRegions extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RecognitionScore")
        @Validation(required = true)
        public Float recognitionScore;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("DetectionScore")
        @Validation(required = true)
        public Float detectionScore;

        @NameInMap("BandBoxes")
        @Validation(required = true)
        public java.util.List<Float> bandBoxes;

        public static RecognizePassportMRZResponseDataRegions build(java.util.Map<String, ?> map) throws Exception {
            RecognizePassportMRZResponseDataRegions self = new RecognizePassportMRZResponseDataRegions();
            return TeaModel.build(map, self);
        }

        public RecognizePassportMRZResponseDataRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizePassportMRZResponseDataRegions setRecognitionScore(Float recognitionScore) {
            this.recognitionScore = recognitionScore;
            return this;
        }
        public Float getRecognitionScore() {
            return this.recognitionScore;
        }

        public RecognizePassportMRZResponseDataRegions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecognizePassportMRZResponseDataRegions setDetectionScore(Float detectionScore) {
            this.detectionScore = detectionScore;
            return this;
        }
        public Float getDetectionScore() {
            return this.detectionScore;
        }

        public RecognizePassportMRZResponseDataRegions setBandBoxes(java.util.List<Float> bandBoxes) {
            this.bandBoxes = bandBoxes;
            return this;
        }
        public java.util.List<Float> getBandBoxes() {
            return this.bandBoxes;
        }

    }

    public static class RecognizePassportMRZResponseData extends TeaModel {
        @NameInMap("Regions")
        @Validation(required = true)
        public java.util.List<RecognizePassportMRZResponseDataRegions> regions;

        public static RecognizePassportMRZResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePassportMRZResponseData self = new RecognizePassportMRZResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizePassportMRZResponseData setRegions(java.util.List<RecognizePassportMRZResponseDataRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<RecognizePassportMRZResponseDataRegions> getRegions() {
            return this.regions;
        }

    }

}
