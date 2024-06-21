// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextGenerationResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetTextGenerationResponseBodyResult result;

    @NameInMap("usage")
    public GetTextGenerationResponseBodyUsage usage;

    public static GetTextGenerationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTextGenerationResponseBody self = new GetTextGenerationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTextGenerationResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetTextGenerationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTextGenerationResponseBody setResult(GetTextGenerationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetTextGenerationResponseBodyResult getResult() {
        return this.result;
    }

    public GetTextGenerationResponseBody setUsage(GetTextGenerationResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetTextGenerationResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetTextGenerationResponseBodyResult extends TeaModel {
        @NameInMap("text")
        public String text;

        public static GetTextGenerationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetTextGenerationResponseBodyResult self = new GetTextGenerationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetTextGenerationResponseBodyResult setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class GetTextGenerationResponseBodyUsage extends TeaModel {
        @NameInMap("input_tokens")
        public Long inputTokens;

        @NameInMap("output_tokens")
        public Long outputTokens;

        @NameInMap("total_tokens")
        public Long totalTokens;

        public static GetTextGenerationResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetTextGenerationResponseBodyUsage self = new GetTextGenerationResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetTextGenerationResponseBodyUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetTextGenerationResponseBodyUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetTextGenerationResponseBodyUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

}
