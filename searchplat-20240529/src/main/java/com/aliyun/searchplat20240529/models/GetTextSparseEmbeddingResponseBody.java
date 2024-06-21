// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextSparseEmbeddingResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetTextSparseEmbeddingResponseBodyResult result;

    @NameInMap("usage")
    public GetTextSparseEmbeddingResponseBodyUsage usage;

    public static GetTextSparseEmbeddingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextSparseEmbeddingResponseBody self = new GetTextSparseEmbeddingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextSparseEmbeddingResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetTextSparseEmbeddingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTextSparseEmbeddingResponseBody setResult(GetTextSparseEmbeddingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTextSparseEmbeddingResponseBodyResult getResult() {
        return this.result;
    }

    public GetTextSparseEmbeddingResponseBody setUsage(GetTextSparseEmbeddingResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetTextSparseEmbeddingResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding extends TeaModel {
        @NameInMap("token")
        public String token;

        @NameInMap("token_id")
        public Integer tokenId;

        @NameInMap("weight")
        public Float weight;

        public static GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding build(java.util.Map<String, ?> map) throws Exception {
            GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding self = new GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding();
            return TeaModel.build(map, self);
        }

        public GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding setTokenId(Integer tokenId) {
            this.tokenId = tokenId;
            return this;
        }
        public Integer getTokenId() {
            return this.tokenId;
        }

        public GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding setWeight(Float weight) {
            this.weight = weight;
            return this;
        }
        public Float getWeight() {
            return this.weight;
        }

    }

    public static class GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings extends TeaModel {
        @NameInMap("embedding")
        public java.util.List<GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding> embedding;

        @NameInMap("index")
        public Integer index;

        public static GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings build(java.util.Map<String, ?> map) throws Exception {
            GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings self = new GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings();
            return TeaModel.build(map, self);
        }

        public GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings setEmbedding(java.util.List<GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding> embedding) {
            this.embedding = embedding;
            return this;
        }
        public java.util.List<GetTextSparseEmbeddingResponseBodyResultSparseEmbeddingsEmbedding> getEmbedding() {
            return this.embedding;
        }

        public GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

    }

    public static class GetTextSparseEmbeddingResponseBodyResult extends TeaModel {
        @NameInMap("sparse_embeddings")
        public java.util.List<GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings> sparseEmbeddings;

        public static GetTextSparseEmbeddingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTextSparseEmbeddingResponseBodyResult self = new GetTextSparseEmbeddingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTextSparseEmbeddingResponseBodyResult setSparseEmbeddings(java.util.List<GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings> sparseEmbeddings) {
            this.sparseEmbeddings = sparseEmbeddings;
            return this;
        }
        public java.util.List<GetTextSparseEmbeddingResponseBodyResultSparseEmbeddings> getSparseEmbeddings() {
            return this.sparseEmbeddings;
        }

    }

    public static class GetTextSparseEmbeddingResponseBodyUsage extends TeaModel {
        @NameInMap("token_count")
        public Long tokenCount;

        public static GetTextSparseEmbeddingResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetTextSparseEmbeddingResponseBodyUsage self = new GetTextSparseEmbeddingResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetTextSparseEmbeddingResponseBodyUsage setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

    }

}
