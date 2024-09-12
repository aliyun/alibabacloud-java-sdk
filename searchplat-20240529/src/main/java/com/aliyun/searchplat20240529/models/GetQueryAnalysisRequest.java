// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetQueryAnalysisRequest extends TeaModel {
    @NameInMap("functions")
    public java.util.List<GetQueryAnalysisRequestFunctions> functions;

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

    public GetQueryAnalysisRequest setFunctions(java.util.List<GetQueryAnalysisRequestFunctions> functions) {
        this.functions = functions;
        return this;
    }
    public java.util.List<GetQueryAnalysisRequestFunctions> getFunctions() {
        return this.functions;
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

    public static class GetQueryAnalysisRequestFunctions extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("parameters")
        public java.util.Map<String, ?> parameters;

        public static GetQueryAnalysisRequestFunctions build(java.util.Map<String, ?> map) throws Exception {
            GetQueryAnalysisRequestFunctions self = new GetQueryAnalysisRequestFunctions();
            return TeaModel.build(map, self);
        }

        public GetQueryAnalysisRequestFunctions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQueryAnalysisRequestFunctions setParameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.Map<String, ?> getParameters() {
            return this.parameters;
        }

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
