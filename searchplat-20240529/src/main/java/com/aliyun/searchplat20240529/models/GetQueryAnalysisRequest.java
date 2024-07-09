// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetQueryAnalysisRequest extends TeaModel {
    @NameInMap("history")
    public java.util.List<GetQueryAnalysisRequestHistory> history;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("query")
    public String query;

    public static GetQueryAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueryAnalysisRequest self = new GetQueryAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public GetQueryAnalysisRequest setHistory(java.util.List<GetQueryAnalysisRequestHistory> history) {
        this.history = history;
        return this;
    }
    public java.util.List<GetQueryAnalysisRequestHistory> getHistory() {
        return this.history;
    }

    public GetQueryAnalysisRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public static class GetQueryAnalysisRequestHistory extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("role")
        public String role;

        public static GetQueryAnalysisRequestHistory build(java.util.Map<String, ?> map) throws Exception {
            GetQueryAnalysisRequestHistory self = new GetQueryAnalysisRequestHistory();
            return TeaModel.build(map, self);
        }

        public GetQueryAnalysisRequestHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetQueryAnalysisRequestHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
