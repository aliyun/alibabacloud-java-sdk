// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetEmbeddingTuningResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetEmbeddingTuningResponseBodyResult result;

    @NameInMap("usage")
    public GetEmbeddingTuningResponseBodyUsage usage;

    public static GetEmbeddingTuningResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmbeddingTuningResponseBody self = new GetEmbeddingTuningResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmbeddingTuningResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetEmbeddingTuningResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEmbeddingTuningResponseBody setResult(GetEmbeddingTuningResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetEmbeddingTuningResponseBodyResult getResult() {
        return this.result;
    }

    public GetEmbeddingTuningResponseBody setUsage(GetEmbeddingTuningResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetEmbeddingTuningResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetEmbeddingTuningResponseBodyResult extends TeaModel {
        @NameInMap("output")
        public java.util.List<java.util.List<Float>> output;

        public static GetEmbeddingTuningResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetEmbeddingTuningResponseBodyResult self = new GetEmbeddingTuningResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetEmbeddingTuningResponseBodyResult setOutput(java.util.List<java.util.List<Float>> output) {
            this.output = output;
            return this;
        }
        public java.util.List<java.util.List<Float>> getOutput() {
            return this.output;
        }

    }

    public static class GetEmbeddingTuningResponseBodyUsage extends TeaModel {
        @NameInMap("doc_count")
        public Integer docCount;

        public static GetEmbeddingTuningResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetEmbeddingTuningResponseBodyUsage self = new GetEmbeddingTuningResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetEmbeddingTuningResponseBodyUsage setDocCount(Integer docCount) {
            this.docCount = docCount;
            return this;
        }
        public Integer getDocCount() {
            return this.docCount;
        }

    }

}
