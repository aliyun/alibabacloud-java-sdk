// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDataRangeResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-****-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Data range object.</p>
     */
    @NameInMap("Result")
    public QueryDataRangeResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Possible values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDataRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataRangeResponseBody self = new QueryDataRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataRangeResponseBody setResult(QueryDataRangeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryDataRangeResponseBodyResult getResult() {
        return this.result;
    }

    public QueryDataRangeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels extends TeaModel {
        /**
         * <p>Alias of the LlmCube resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>zhuge</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>LlmCube resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sdasdafas23342342342</p>
         */
        @NameInMap("LlmCubeId")
        public String llmCubeId;

        public static QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels build(java.util.Map<String, ?> map) throws Exception {
            QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels self = new QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels();
            return TeaModel.build(map, self);
        }

        public QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels setLlmCubeId(String llmCubeId) {
            this.llmCubeId = llmCubeId;
            return this;
        }
        public String getLlmCubeId() {
            return this.llmCubeId;
        }

    }

    public static class QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels extends TeaModel {
        /**
         * <p>Alias of the LLM cube resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>Nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>zhuge</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>LlmCube resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1231242231asdasda</p>
         */
        @NameInMap("LlmCubeId")
        public String llmCubeId;

        public static QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels build(java.util.Map<String, ?> map) throws Exception {
            QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels self = new QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels();
            return TeaModel.build(map, self);
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels setLlmCubeId(String llmCubeId) {
            this.llmCubeId = llmCubeId;
            return this;
        }
        public String getLlmCubeId() {
            return this.llmCubeId;
        }

    }

    public static class QueryDataRangeResponseBodyResultApiCopilotThemeModels extends TeaModel {
        /**
         * <p>Array of LlmCube resources.</p>
         */
        @NameInMap("ApiCopilotLlmCubeModels")
        public java.util.List<QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels> apiCopilotLlmCubeModels;

        /**
         * <p>Nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>zhuge</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Analysis theme ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36631232342312312</p>
         */
        @NameInMap("ThemeId")
        public String themeId;

        /**
         * <p>Nickname of the analysis theme.</p>
         * 
         * <strong>example:</strong>
         * <p>test theme</p>
         */
        @NameInMap("ThemeName")
        public String themeName;

        public static QueryDataRangeResponseBodyResultApiCopilotThemeModels build(java.util.Map<String, ?> map) throws Exception {
            QueryDataRangeResponseBodyResultApiCopilotThemeModels self = new QueryDataRangeResponseBodyResultApiCopilotThemeModels();
            return TeaModel.build(map, self);
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModels setApiCopilotLlmCubeModels(java.util.List<QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels> apiCopilotLlmCubeModels) {
            this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
            return this;
        }
        public java.util.List<QueryDataRangeResponseBodyResultApiCopilotThemeModelsApiCopilotLlmCubeModels> getApiCopilotLlmCubeModels() {
            return this.apiCopilotLlmCubeModels;
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModels setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModels setThemeId(String themeId) {
            this.themeId = themeId;
            return this;
        }
        public String getThemeId() {
            return this.themeId;
        }

        public QueryDataRangeResponseBodyResultApiCopilotThemeModels setThemeName(String themeName) {
            this.themeName = themeName;
            return this;
        }
        public String getThemeName() {
            return this.themeName;
        }

    }

    public static class QueryDataRangeResponseBodyResult extends TeaModel {
        /**
         * <p>Array of LlmCube resources.</p>
         */
        @NameInMap("ApiCopilotLlmCubeModels")
        public java.util.List<QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels> apiCopilotLlmCubeModels;

        /**
         * <p>Array of analysis themes.</p>
         */
        @NameInMap("ApiCopilotThemeModels")
        public java.util.List<QueryDataRangeResponseBodyResultApiCopilotThemeModels> apiCopilotThemeModels;

        public static QueryDataRangeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryDataRangeResponseBodyResult self = new QueryDataRangeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryDataRangeResponseBodyResult setApiCopilotLlmCubeModels(java.util.List<QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels> apiCopilotLlmCubeModels) {
            this.apiCopilotLlmCubeModels = apiCopilotLlmCubeModels;
            return this;
        }
        public java.util.List<QueryDataRangeResponseBodyResultApiCopilotLlmCubeModels> getApiCopilotLlmCubeModels() {
            return this.apiCopilotLlmCubeModels;
        }

        public QueryDataRangeResponseBodyResult setApiCopilotThemeModels(java.util.List<QueryDataRangeResponseBodyResultApiCopilotThemeModels> apiCopilotThemeModels) {
            this.apiCopilotThemeModels = apiCopilotThemeModels;
            return this;
        }
        public java.util.List<QueryDataRangeResponseBodyResultApiCopilotThemeModels> getApiCopilotThemeModels() {
            return this.apiCopilotThemeModels;
        }

    }

}
