// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetWebSearchRequest extends TeaModel {
    @NameInMap("content_type")
    public String contentType;

    @NameInMap("history")
    public java.util.List<GetWebSearchRequestHistory> history;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    @NameInMap("query_rewrite")
    public Boolean queryRewrite;

    @NameInMap("top_k")
    public Long topK;

    @NameInMap("way")
    public String way;

    public static GetWebSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWebSearchRequest self = new GetWebSearchRequest();
        return TeaModel.build(map, self);
    }

    public GetWebSearchRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public GetWebSearchRequest setHistory(java.util.List<GetWebSearchRequestHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<GetWebSearchRequestHistory> getHistory() {
        return this.history;
    }

    public GetWebSearchRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public GetWebSearchRequest setQueryRewrite(Boolean queryRewrite) {
        this.queryRewrite = queryRewrite;
        return this;
    }
    public Boolean getQueryRewrite() {
        return this.queryRewrite;
    }

    public GetWebSearchRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public GetWebSearchRequest setWay(String way) {
        this.way = way;
        return this;
    }
    public String getWay() {
        return this.way;
    }

    public static class GetWebSearchRequestHistory extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("role")
        public String role;

        public static GetWebSearchRequestHistory build(java.util.Map<String, ?> map) throws Exception {
            GetWebSearchRequestHistory self = new GetWebSearchRequestHistory();
            return TeaModel.build(map, self);
        }

        public GetWebSearchRequestHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetWebSearchRequestHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
