// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetDocumentSplitResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetDocumentSplitResponseBodyResult result;

    @NameInMap("usage")
    public GetDocumentSplitResponseBodyUsage usage;

    public static GetDocumentSplitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentSplitResponseBody self = new GetDocumentSplitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDocumentSplitResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetDocumentSplitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDocumentSplitResponseBody setResult(GetDocumentSplitResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetDocumentSplitResponseBodyResult getResult() {
        return this.result;
    }

    public GetDocumentSplitResponseBody setUsage(GetDocumentSplitResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetDocumentSplitResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetDocumentSplitResponseBodyResultChunks extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("meta")
        public java.util.Map<String, String> meta;

        public static GetDocumentSplitResponseBodyResultChunks build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitResponseBodyResultChunks self = new GetDocumentSplitResponseBodyResultChunks();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitResponseBodyResultChunks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDocumentSplitResponseBodyResultChunks setMeta(java.util.Map<String, String> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

    }

    public static class GetDocumentSplitResponseBodyResultRichTexts extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("meta")
        public java.util.Map<String, String> meta;

        public static GetDocumentSplitResponseBodyResultRichTexts build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitResponseBodyResultRichTexts self = new GetDocumentSplitResponseBodyResultRichTexts();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitResponseBodyResultRichTexts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDocumentSplitResponseBodyResultRichTexts setMeta(java.util.Map<String, String> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

    }

    public static class GetDocumentSplitResponseBodyResultSentences extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("meta")
        public java.util.Map<String, String> meta;

        public static GetDocumentSplitResponseBodyResultSentences build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitResponseBodyResultSentences self = new GetDocumentSplitResponseBodyResultSentences();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitResponseBodyResultSentences setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetDocumentSplitResponseBodyResultSentences setMeta(java.util.Map<String, String> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

    }

    public static class GetDocumentSplitResponseBodyResult extends TeaModel {
        @NameInMap("chunks")
        public java.util.List<GetDocumentSplitResponseBodyResultChunks> chunks;

        @NameInMap("nodes")
        public java.util.List<java.util.Map<String, String>> nodes;

        @NameInMap("rich_texts")
        public java.util.List<GetDocumentSplitResponseBodyResultRichTexts> richTexts;

        @NameInMap("sentences")
        public java.util.List<GetDocumentSplitResponseBodyResultSentences> sentences;

        public static GetDocumentSplitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitResponseBodyResult self = new GetDocumentSplitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitResponseBodyResult setChunks(java.util.List<GetDocumentSplitResponseBodyResultChunks> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<GetDocumentSplitResponseBodyResultChunks> getChunks() {
            return this.chunks;
        }

        public GetDocumentSplitResponseBodyResult setNodes(java.util.List<java.util.Map<String, String>> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<java.util.Map<String, String>> getNodes() {
            return this.nodes;
        }

        public GetDocumentSplitResponseBodyResult setRichTexts(java.util.List<GetDocumentSplitResponseBodyResultRichTexts> richTexts) {
            this.richTexts = richTexts;
            return this;
        }
        public java.util.List<GetDocumentSplitResponseBodyResultRichTexts> getRichTexts() {
            return this.richTexts;
        }

        public GetDocumentSplitResponseBodyResult setSentences(java.util.List<GetDocumentSplitResponseBodyResultSentences> sentences) {
            this.sentences = sentences;
            return this;
        }
        public java.util.List<GetDocumentSplitResponseBodyResultSentences> getSentences() {
            return this.sentences;
        }

    }

    public static class GetDocumentSplitResponseBodyUsage extends TeaModel {
        @NameInMap("token_count")
        public Long tokenCount;

        public static GetDocumentSplitResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetDocumentSplitResponseBodyUsage self = new GetDocumentSplitResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetDocumentSplitResponseBodyUsage setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

    }

}
