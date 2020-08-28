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

    public static class RecognizePassportMRZResponseDataRegions extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("RecognitionScore")
        @Validation(required = true)
        public Double recognitionScore;

        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        @NameInMap("DetectionScore")
        @Validation(required = true)
        public Double detectionScore;

        @NameInMap("BandBoxes")
        @Validation(required = true)
        public java.util.List<Double> bandBoxes;

        public static RecognizePassportMRZResponseDataRegions build(java.util.Map<String, ?> map) throws Exception {
            RecognizePassportMRZResponseDataRegions self = new RecognizePassportMRZResponseDataRegions();
            return TeaModel.build(map, self);
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

    }

}
