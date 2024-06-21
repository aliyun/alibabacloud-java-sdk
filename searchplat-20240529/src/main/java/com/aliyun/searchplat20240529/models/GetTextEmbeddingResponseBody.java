// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextEmbeddingResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetTextEmbeddingResponseBodyResult result;

    @NameInMap("usage")
    public GetTextEmbeddingResponseBodyUsage usage;

    public static GetTextEmbeddingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextEmbeddingResponseBody self = new GetTextEmbeddingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextEmbeddingResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetTextEmbeddingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTextEmbeddingResponseBody setResult(GetTextEmbeddingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTextEmbeddingResponseBodyResult getResult() {
        return this.result;
    }

    public GetTextEmbeddingResponseBody setUsage(GetTextEmbeddingResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetTextEmbeddingResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetTextEmbeddingResponseBodyResultEmbeddings extends TeaModel {
        @NameInMap("embedding")
        public java.util.List<Double> embedding;

        @NameInMap("index")
        public Integer index;

        public static GetTextEmbeddingResponseBodyResultEmbeddings build(java.util.Map<String, ?> map) throws Exception {
            GetTextEmbeddingResponseBodyResultEmbeddings self = new GetTextEmbeddingResponseBodyResultEmbeddings();
            return TeaModel.build(map, self);
        }

        public GetTextEmbeddingResponseBodyResultEmbeddings setEmbedding(java.util.List<Double> embedding) {
            this.embedding = embedding;
            return this;
        }
        public java.util.List<Double> getEmbedding() {
            return this.embedding;
        }

        public GetTextEmbeddingResponseBodyResultEmbeddings setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

    }

    public static class GetTextEmbeddingResponseBodyResult extends TeaModel {
        @NameInMap("embeddings")
        public java.util.List<GetTextEmbeddingResponseBodyResultEmbeddings> embeddings;

        public static GetTextEmbeddingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTextEmbeddingResponseBodyResult self = new GetTextEmbeddingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTextEmbeddingResponseBodyResult setEmbeddings(java.util.List<GetTextEmbeddingResponseBodyResultEmbeddings> embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public java.util.List<GetTextEmbeddingResponseBodyResultEmbeddings> getEmbeddings() {
            return this.embeddings;
        }

    }

    public static class GetTextEmbeddingResponseBodyUsage extends TeaModel {
        @NameInMap("token_count")
        public Long tokenCount;

        public static GetTextEmbeddingResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetTextEmbeddingResponseBodyUsage self = new GetTextEmbeddingResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetTextEmbeddingResponseBodyUsage setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

    }

}
