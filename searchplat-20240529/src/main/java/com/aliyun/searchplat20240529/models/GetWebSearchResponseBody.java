// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetWebSearchResponseBody extends TeaModel {
    @NameInMap("latency")
    public Integer latency;

    @NameInMap("request_id")
    public String requestId;

    @NameInMap("result")
    public GetWebSearchResponseBodyResult result;

    @NameInMap("usage")
    public GetWebSearchResponseBodyUsage usage;

    public static GetWebSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWebSearchResponseBody self = new GetWebSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWebSearchResponseBody setLatency(Integer latency) {
        this.latency = latency;
        return this;
    }
    public Integer getLatency() {
        return this.latency;
    }

    public GetWebSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWebSearchResponseBody setResult(GetWebSearchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetWebSearchResponseBodyResult getResult() {
        return this.result;
    }

    public GetWebSearchResponseBody setUsage(GetWebSearchResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetWebSearchResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetWebSearchResponseBodyResultSearchResult extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("link")
        public String link;

        @NameInMap("position")
        public Long position;

        @NameInMap("snippet")
        public String snippet;

        @NameInMap("tilte")
        public String tilte;

        public static GetWebSearchResponseBodyResultSearchResult build(java.util.Map<String, ?> map) throws Exception {
            GetWebSearchResponseBodyResultSearchResult self = new GetWebSearchResponseBodyResultSearchResult();
            return TeaModel.build(map, self);
        }

        public GetWebSearchResponseBodyResultSearchResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetWebSearchResponseBodyResultSearchResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetWebSearchResponseBodyResultSearchResult setPosition(Long position) {
            this.position = position;
            return this;
        }
        public Long getPosition() {
            return this.position;
        }

        public GetWebSearchResponseBodyResultSearchResult setSnippet(String snippet) {
            this.snippet = snippet;
            return this;
        }
        public String getSnippet() {
            return this.snippet;
        }

        public GetWebSearchResponseBodyResultSearchResult setTilte(String tilte) {
            this.tilte = tilte;
            return this;
        }
        public String getTilte() {
            return this.tilte;
        }

    }

    public static class GetWebSearchResponseBodyResult extends TeaModel {
        @NameInMap("search_result")
        public java.util.List<GetWebSearchResponseBodyResultSearchResult> searchResult;

        public static GetWebSearchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetWebSearchResponseBodyResult self = new GetWebSearchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetWebSearchResponseBodyResult setSearchResult(java.util.List<GetWebSearchResponseBodyResultSearchResult> searchResult) {
            this.searchResult = searchResult;
            return this;
        }
        public java.util.List<GetWebSearchResponseBodyResultSearchResult> getSearchResult() {
            return this.searchResult;
        }

    }

    public static class GetWebSearchResponseBodyUsageFilterModel extends TeaModel {
        @NameInMap("input_tokens")
        public Long inputTokens;

        @NameInMap("output_tokens")
        public Long outputTokens;

        @NameInMap("total_tokens")
        public Long totalTokens;

        public static GetWebSearchResponseBodyUsageFilterModel build(java.util.Map<String, ?> map) throws Exception {
            GetWebSearchResponseBodyUsageFilterModel self = new GetWebSearchResponseBodyUsageFilterModel();
            return TeaModel.build(map, self);
        }

        public GetWebSearchResponseBodyUsageFilterModel setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetWebSearchResponseBodyUsageFilterModel setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetWebSearchResponseBodyUsageFilterModel setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetWebSearchResponseBodyUsageRewriteModel extends TeaModel {
        @NameInMap("input_tokens")
        public Long inputTokens;

        @NameInMap("output_tokens")
        public Long outputTokens;

        @NameInMap("total_tokens")
        public Long totalTokens;

        public static GetWebSearchResponseBodyUsageRewriteModel build(java.util.Map<String, ?> map) throws Exception {
            GetWebSearchResponseBodyUsageRewriteModel self = new GetWebSearchResponseBodyUsageRewriteModel();
            return TeaModel.build(map, self);
        }

        public GetWebSearchResponseBodyUsageRewriteModel setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public GetWebSearchResponseBodyUsageRewriteModel setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public GetWebSearchResponseBodyUsageRewriteModel setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

    public static class GetWebSearchResponseBodyUsage extends TeaModel {
        @NameInMap("filter_model")
        public GetWebSearchResponseBodyUsageFilterModel filterModel;

        @NameInMap("rewrite_model")
        public GetWebSearchResponseBodyUsageRewriteModel rewriteModel;

        @NameInMap("search_count")
        public Long searchCount;

        public static GetWebSearchResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetWebSearchResponseBodyUsage self = new GetWebSearchResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetWebSearchResponseBodyUsage setFilterModel(GetWebSearchResponseBodyUsageFilterModel filterModel) {
            this.filterModel = filterModel;
            return this;
        }
        public GetWebSearchResponseBodyUsageFilterModel getFilterModel() {
            return this.filterModel;
        }

        public GetWebSearchResponseBodyUsage setRewriteModel(GetWebSearchResponseBodyUsageRewriteModel rewriteModel) {
            this.rewriteModel = rewriteModel;
            return this;
        }
        public GetWebSearchResponseBodyUsageRewriteModel getRewriteModel() {
            return this.rewriteModel;
        }

        public GetWebSearchResponseBodyUsage setSearchCount(Long searchCount) {
            this.searchCount = searchCount;
            return this;
        }
        public Long getSearchCount() {
            return this.searchCount;
        }

    }

}
