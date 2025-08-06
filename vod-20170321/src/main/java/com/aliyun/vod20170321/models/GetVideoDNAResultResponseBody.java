// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoDNAResultResponseBody extends TeaModel {
    @NameInMap("AIVideoDNAResult")
    public GetVideoDNAResultResponseBodyAIVideoDNAResult AIVideoDNAResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVideoDNAResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDNAResultResponseBody self = new GetVideoDNAResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVideoDNAResultResponseBody setAIVideoDNAResult(GetVideoDNAResultResponseBodyAIVideoDNAResult AIVideoDNAResult) {
        this.AIVideoDNAResult = AIVideoDNAResult;
        return this;
    }
    public GetVideoDNAResultResponseBodyAIVideoDNAResult getAIVideoDNAResult() {
        return this.AIVideoDNAResult;
    }

    public GetVideoDNAResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Start")
        public String start;

        public static GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication self = new GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication();
            return TeaModel.build(map, self);
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        @NameInMap("Start")
        public String start;

        public static GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput self = new GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput();
            return TeaModel.build(map, self);
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices extends TeaModel {
        @NameInMap("Duplication")
        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication duplication;

        @NameInMap("Input")
        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput input;

        public static GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices self = new GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices();
            return TeaModel.build(map, self);
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices setDuplication(GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication duplication) {
            this.duplication = duplication;
            return this;
        }
        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesDuplication getDuplication() {
            return this.duplication;
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices setInput(GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput input) {
            this.input = input;
            return this;
        }
        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlicesInput getInput() {
            return this.input;
        }

    }

    public static class GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots extends TeaModel {
        @NameInMap("FpShotSlices")
        public java.util.List<GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices> fpShotSlices;

        @NameInMap("PrimaryKey")
        public String primaryKey;

        @NameInMap("Similarity")
        public String similarity;

        public static GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots self = new GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots();
            return TeaModel.build(map, self);
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots setFpShotSlices(java.util.List<GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices> fpShotSlices) {
            this.fpShotSlices = fpShotSlices;
            return this;
        }
        public java.util.List<GetVideoDNAResultResponseBodyAIVideoDNAResultFpShotsFpShotSlices> getFpShotSlices() {
            return this.fpShotSlices;
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots setPrimaryKey(String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public String getPrimaryKey() {
            return this.primaryKey;
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class GetVideoDNAResultResponseBodyAIVideoDNAResult extends TeaModel {
        @NameInMap("FpShots")
        public java.util.List<GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots> fpShots;

        public static GetVideoDNAResultResponseBodyAIVideoDNAResult build(java.util.Map<String, ?> map) throws Exception {
            GetVideoDNAResultResponseBodyAIVideoDNAResult self = new GetVideoDNAResultResponseBodyAIVideoDNAResult();
            return TeaModel.build(map, self);
        }

        public GetVideoDNAResultResponseBodyAIVideoDNAResult setFpShots(java.util.List<GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots> fpShots) {
            this.fpShots = fpShots;
            return this;
        }
        public java.util.List<GetVideoDNAResultResponseBodyAIVideoDNAResultFpShots> getFpShots() {
            return this.fpShots;
        }

    }

}
