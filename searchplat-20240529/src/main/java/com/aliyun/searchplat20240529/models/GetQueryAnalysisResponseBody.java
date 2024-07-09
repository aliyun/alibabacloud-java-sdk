// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetQueryAnalysisResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetQueryAnalysisResponseBodyResult result;

    @NameInMap("usage")
    public GetQueryAnalysisResponseBodyUsage usage;

    public static GetQueryAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryAnalysisResponseBody self = new GetQueryAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryAnalysisResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetQueryAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryAnalysisResponseBody setResult(GetQueryAnalysisResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetQueryAnalysisResponseBodyResult getResult() {
        return this.result;
    }

    public GetQueryAnalysisResponseBody setUsage(GetQueryAnalysisResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetQueryAnalysisResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetQueryAnalysisResponseBodyResult extends TeaModel {
        @NameInMap("intent")
        public String intent;

        @NameInMap("queries")
        public java.util.List<String> queries;

        @NameInMap("query")
        public String query;

        public static GetQueryAnalysisResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetQueryAnalysisResponseBodyResult self = new GetQueryAnalysisResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetQueryAnalysisResponseBodyResult setIntent(String intent) {
            this.intent = intent;
            return this;
        }
        public String getIntent() {
            return this.intent;
        }

        public GetQueryAnalysisResponseBodyResult setQueries(java.util.List<String> queries) {
            this.queries = queries;
            return this;
        }
        public java.util.List<String> getQueries() {
            return this.queries;
        }

        public GetQueryAnalysisResponseBodyResult setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class GetQueryAnalysisResponseBodyUsage extends TeaModel {
        @NameInMap("input_tokens")
        public Long inputTokens;

        @NameInMap("output_tokens")
        public Long outputTokens;

        @NameInMap("total_tokens")
        public Long totalTokens;

        public static GetQueryAnalysisResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetQueryAnalysisResponseBodyUsage self = new GetQueryAnalysisResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetQueryAnalysisResponseBodyUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetQueryAnalysisResponseBodyUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetQueryAnalysisResponseBodyUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

}
