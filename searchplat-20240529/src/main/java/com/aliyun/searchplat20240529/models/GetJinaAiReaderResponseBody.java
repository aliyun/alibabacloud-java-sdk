// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetJinaAiReaderResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetJinaAiReaderResponseBodyResult result;

    @NameInMap("usage")
    public GetJinaAiReaderResponseBodyUsage usage;

    public static GetJinaAiReaderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJinaAiReaderResponseBody self = new GetJinaAiReaderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJinaAiReaderResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetJinaAiReaderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJinaAiReaderResponseBody setResult(GetJinaAiReaderResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetJinaAiReaderResponseBodyResult getResult() {
        return this.result;
    }

    public GetJinaAiReaderResponseBody setUsage(GetJinaAiReaderResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetJinaAiReaderResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetJinaAiReaderResponseBodyResult extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("meta")
        public java.util.Map<String, String> meta;

        public static GetJinaAiReaderResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetJinaAiReaderResponseBodyResult self = new GetJinaAiReaderResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetJinaAiReaderResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetJinaAiReaderResponseBodyResult setMeta(java.util.Map<String, String> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, String> getMeta() {
            return this.meta;
        }

    }

    public static class GetJinaAiReaderResponseBodyUsage extends TeaModel {
        @NameInMap("token_count")
        public Integer tokenCount;

        public static GetJinaAiReaderResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetJinaAiReaderResponseBodyUsage self = new GetJinaAiReaderResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetJinaAiReaderResponseBodyUsage setTokenCount(Integer tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Integer getTokenCount() {
            return this.tokenCount;
        }

    }

}
