// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizePassportMRZResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizePassportMRZResponseBodyData data;

    public static RecognizePassportMRZResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizePassportMRZResponseBody self = new RecognizePassportMRZResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizePassportMRZResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizePassportMRZResponseBody setData(RecognizePassportMRZResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizePassportMRZResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizePassportMRZResponseBodyDataRegions extends TeaModel {
        @NameInMap("RecognitionScore")
        public Float recognitionScore;

        @NameInMap("DetectionScore")
        public Float detectionScore;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("BandBoxes")
        public java.util.List<Float> bandBoxes;

        public static RecognizePassportMRZResponseBodyDataRegions build(java.util.Map<String, ?> map) throws Exception {
            RecognizePassportMRZResponseBodyDataRegions self = new RecognizePassportMRZResponseBodyDataRegions();
            return TeaModel.build(map, self);
        }

        public RecognizePassportMRZResponseBodyDataRegions setRecognitionScore(Float recognitionScore) {
            this.recognitionScore = recognitionScore;
            return this;
        }
        public Float getRecognitionScore() {
            return this.recognitionScore;
        }

        public RecognizePassportMRZResponseBodyDataRegions setDetectionScore(Float detectionScore) {
            this.detectionScore = detectionScore;
            return this;
        }
        public Float getDetectionScore() {
            return this.detectionScore;
        }

        public RecognizePassportMRZResponseBodyDataRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizePassportMRZResponseBodyDataRegions setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RecognizePassportMRZResponseBodyDataRegions setBandBoxes(java.util.List<Float> bandBoxes) {
            this.bandBoxes = bandBoxes;
            return this;
        }
        public java.util.List<Float> getBandBoxes() {
            return this.bandBoxes;
        }

    }

    public static class RecognizePassportMRZResponseBodyData extends TeaModel {
        @NameInMap("Regions")
        public java.util.List<RecognizePassportMRZResponseBodyDataRegions> regions;

        public static RecognizePassportMRZResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizePassportMRZResponseBodyData self = new RecognizePassportMRZResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizePassportMRZResponseBodyData setRegions(java.util.List<RecognizePassportMRZResponseBodyDataRegions> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<RecognizePassportMRZResponseBodyDataRegions> getRegions() {
            return this.regions;
        }

    }

}
