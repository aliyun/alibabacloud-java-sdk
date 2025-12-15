// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetMultiModalEmbeddingResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetMultiModalEmbeddingResponseBodyResult result;

    @NameInMap("usage")
    public GetMultiModalEmbeddingResponseBodyUsage usage;

    public static GetMultiModalEmbeddingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMultiModalEmbeddingResponseBody self = new GetMultiModalEmbeddingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMultiModalEmbeddingResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetMultiModalEmbeddingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMultiModalEmbeddingResponseBody setResult(GetMultiModalEmbeddingResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetMultiModalEmbeddingResponseBodyResult getResult() {
        return this.result;
    }

    public GetMultiModalEmbeddingResponseBody setUsage(GetMultiModalEmbeddingResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetMultiModalEmbeddingResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetMultiModalEmbeddingResponseBodyResultEmbeddings extends TeaModel {
        @NameInMap("embedding")
        public java.util.List<Double> embedding;

        @NameInMap("index")
        public Long index;

        public static GetMultiModalEmbeddingResponseBodyResultEmbeddings build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalEmbeddingResponseBodyResultEmbeddings self = new GetMultiModalEmbeddingResponseBodyResultEmbeddings();
            return TeaModel.build(map, self);
        }

        public GetMultiModalEmbeddingResponseBodyResultEmbeddings setEmbedding(java.util.List<Double> embedding) {
            this.embedding = embedding;
            return this;
        }
        public java.util.List<Double> getEmbedding() {
            return this.embedding;
        }

        public GetMultiModalEmbeddingResponseBodyResultEmbeddings setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

    }

    public static class GetMultiModalEmbeddingResponseBodyResult extends TeaModel {
        @NameInMap("embeddings")
        public java.util.List<GetMultiModalEmbeddingResponseBodyResultEmbeddings> embeddings;

        public static GetMultiModalEmbeddingResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalEmbeddingResponseBodyResult self = new GetMultiModalEmbeddingResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetMultiModalEmbeddingResponseBodyResult setEmbeddings(java.util.List<GetMultiModalEmbeddingResponseBodyResultEmbeddings> embeddings) {
            this.embeddings = embeddings;
            return this;
        }
        public java.util.List<GetMultiModalEmbeddingResponseBodyResultEmbeddings> getEmbeddings() {
            return this.embeddings;
        }

    }

    public static class GetMultiModalEmbeddingResponseBodyUsage extends TeaModel {
        @NameInMap("image")
        public Long image;

        @NameInMap("image_token")
        public Long imageToken;

        @NameInMap("text_token")
        public Long textToken;

        @NameInMap("token_count")
        public Long tokenCount;

        public static GetMultiModalEmbeddingResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetMultiModalEmbeddingResponseBodyUsage self = new GetMultiModalEmbeddingResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetMultiModalEmbeddingResponseBodyUsage setImage(Long image) {
            this.image = image;
            return this;
        }
        public Long getImage() {
            return this.image;
        }

        public GetMultiModalEmbeddingResponseBodyUsage setImageToken(Long imageToken) {
            this.imageToken = imageToken;
            return this;
        }
        public Long getImageToken() {
            return this.imageToken;
        }

        public GetMultiModalEmbeddingResponseBodyUsage setTextToken(Long textToken) {
            this.textToken = textToken;
            return this;
        }
        public Long getTextToken() {
            return this.textToken;
        }

        public GetMultiModalEmbeddingResponseBodyUsage setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

    }

}
