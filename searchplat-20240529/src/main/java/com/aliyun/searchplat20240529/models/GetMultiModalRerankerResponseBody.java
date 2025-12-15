// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMultiModalRerankerResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetMultiModalRerankerResponseBodyResult result;

    @NameInMap("usage")
    public GetMultiModalRerankerResponseBodyUsage usage;

    public static GetMultiModalRerankerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiModalRerankerResponseBody self = new GetMultiModalRerankerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiModalRerankerResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetMultiModalRerankerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiModalRerankerResponseBody setResult(GetMultiModalRerankerResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMultiModalRerankerResponseBodyResult getResult() {
        return this.result;
    }

    public GetMultiModalRerankerResponseBody setUsage(GetMultiModalRerankerResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetMultiModalRerankerResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetMultiModalRerankerResponseBodyResultScores extends TeaModel {
        @NameInMap("index")
        public Integer index;

        @NameInMap("score")
        public Double score;

        public static GetMultiModalRerankerResponseBodyResultScores build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalRerankerResponseBodyResultScores self = new GetMultiModalRerankerResponseBodyResultScores();
            return TeaModel.build(map, self);
        }

        public GetMultiModalRerankerResponseBodyResultScores setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetMultiModalRerankerResponseBodyResultScores setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class GetMultiModalRerankerResponseBodyResult extends TeaModel {
        @NameInMap("scores")
        public java.util.List<GetMultiModalRerankerResponseBodyResultScores> scores;

        public static GetMultiModalRerankerResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalRerankerResponseBodyResult self = new GetMultiModalRerankerResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMultiModalRerankerResponseBodyResult setScores(java.util.List<GetMultiModalRerankerResponseBodyResultScores> scores) {
            this.scores = scores;
            return this;
        }
        public java.util.List<GetMultiModalRerankerResponseBodyResultScores> getScores() {
            return this.scores;
        }

    }

    public static class GetMultiModalRerankerResponseBodyUsage extends TeaModel {
        @NameInMap("image_token")
        public Long imageToken;

        @NameInMap("text_token")
        public Long textToken;

        public static GetMultiModalRerankerResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalRerankerResponseBodyUsage self = new GetMultiModalRerankerResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetMultiModalRerankerResponseBodyUsage setImageToken(Long imageToken) {
            this.imageToken = imageToken;
            return this;
        }
        public Long getImageToken() {
            return this.imageToken;
        }

        public GetMultiModalRerankerResponseBodyUsage setTextToken(Long textToken) {
            this.textToken = textToken;
            return this;
        }
        public Long getTextToken() {
            return this.textToken;
        }

    }

}
