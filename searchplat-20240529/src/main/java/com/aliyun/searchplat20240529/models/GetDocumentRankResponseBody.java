// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentRankResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetDocumentRankResponseBodyResult result;

    @NameInMap("usage")
    public GetDocumentRankResponseBodyUsage usage;

    public static GetDocumentRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentRankResponseBody self = new GetDocumentRankResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentRankResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetDocumentRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentRankResponseBody setResult(GetDocumentRankResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDocumentRankResponseBodyResult getResult() {
        return this.result;
    }

    public GetDocumentRankResponseBody setUsage(GetDocumentRankResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetDocumentRankResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetDocumentRankResponseBodyResultScores extends TeaModel {
        @NameInMap("index")
        public Integer index;

        @NameInMap("score")
        public Double score;

        public static GetDocumentRankResponseBodyResultScores build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentRankResponseBodyResultScores self = new GetDocumentRankResponseBodyResultScores();
            return TeaModel.build(map, self);
        }

        public GetDocumentRankResponseBodyResultScores setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetDocumentRankResponseBodyResultScores setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class GetDocumentRankResponseBodyResult extends TeaModel {
        @NameInMap("scores")
        public java.util.List<GetDocumentRankResponseBodyResultScores> scores;

        public static GetDocumentRankResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentRankResponseBodyResult self = new GetDocumentRankResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDocumentRankResponseBodyResult setScores(java.util.List<GetDocumentRankResponseBodyResultScores> scores) {
            this.scores = scores;
            return this;
        }
        public java.util.List<GetDocumentRankResponseBodyResultScores> getScores() {
            return this.scores;
        }

    }

    public static class GetDocumentRankResponseBodyUsage extends TeaModel {
        @NameInMap("doc_count")
        public Long docCount;

        public static GetDocumentRankResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentRankResponseBodyUsage self = new GetDocumentRankResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetDocumentRankResponseBodyUsage setDocCount(Long docCount) {
            this.docCount = docCount;
            return this;
        }
        public Long getDocCount() {
            return this.docCount;
        }

    }

}
