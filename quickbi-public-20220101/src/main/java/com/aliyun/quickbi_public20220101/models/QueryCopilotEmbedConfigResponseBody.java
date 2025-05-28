// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCopilotEmbedConfigResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1FC71085-D5FD-08E0-813A-4D4BD1031BC5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of embedded configurations.</p>
     */
    @NameInMap("Result")
    public java.util.List<QueryCopilotEmbedConfigResponseBodyResult> result;

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

    public static QueryCopilotEmbedConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCopilotEmbedConfigResponseBody self = new QueryCopilotEmbedConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCopilotEmbedConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCopilotEmbedConfigResponseBody setResult(java.util.List<QueryCopilotEmbedConfigResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryCopilotEmbedConfigResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryCopilotEmbedConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCopilotEmbedConfigResponseBodyResultDataRange extends TeaModel {
        /**
         * <p>Whether all question resources are selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("AllCube")
        public Boolean allCube;

        /**
         * <p>Whether all analysis themes are selected.</p>
         * 
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("AllTheme")
        public Boolean allTheme;

        /**
         * <p>Collection of question resource IDs.</p>
         */
        @NameInMap("LlmCubes")
        public java.util.List<String> llmCubes;

        /**
         * <p>Collection of analysis theme IDs.</p>
         */
        @NameInMap("Themes")
        public java.util.List<String> themes;

        public static QueryCopilotEmbedConfigResponseBodyResultDataRange build(java.util.Map<String, ?> map) throws Exception {
            QueryCopilotEmbedConfigResponseBodyResultDataRange self = new QueryCopilotEmbedConfigResponseBodyResultDataRange();
            return TeaModel.build(map, self);
        }

        public QueryCopilotEmbedConfigResponseBodyResultDataRange setAllCube(Boolean allCube) {
            this.allCube = allCube;
            return this;
        }
        public Boolean getAllCube() {
            return this.allCube;
        }

        public QueryCopilotEmbedConfigResponseBodyResultDataRange setAllTheme(Boolean allTheme) {
            this.allTheme = allTheme;
            return this;
        }
        public Boolean getAllTheme() {
            return this.allTheme;
        }

        public QueryCopilotEmbedConfigResponseBodyResultDataRange setLlmCubes(java.util.List<String> llmCubes) {
            this.llmCubes = llmCubes;
            return this;
        }
        public java.util.List<String> getLlmCubes() {
            return this.llmCubes;
        }

        public QueryCopilotEmbedConfigResponseBodyResultDataRange setThemes(java.util.List<String> themes) {
            this.themes = themes;
            return this;
        }
        public java.util.List<String> getThemes() {
            return this.themes;
        }

    }

    public static class QueryCopilotEmbedConfigResponseBodyResult extends TeaModel {
        /**
         * <p>Robot\&quot;s nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>little Q</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>Embedding ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9c079710-ddbe-48b3-b495-7c83c8d57cc4</p>
         */
        @NameInMap("CopilotId")
        public String copilotId;

        /**
         * <p>ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>qweqw12312423521</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Nickname of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>Data range (analysis themes and question resources).</p>
         */
        @NameInMap("DataRange")
        public QueryCopilotEmbedConfigResponseBodyResultDataRange dataRange;

        /**
         * <p>ID of the modifier.</p>
         * 
         * <strong>example:</strong>
         * <p>asda1231231dfs</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>Module name.</p>
         * 
         * <strong>example:</strong>
         * <p>little Q</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>Name of the embedded module.</p>
         * 
         * <strong>example:</strong>
         * <p>0327</p>
         */
        @NameInMap("ShowName")
        public String showName;

        public static QueryCopilotEmbedConfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCopilotEmbedConfigResponseBodyResult self = new QueryCopilotEmbedConfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryCopilotEmbedConfigResponseBodyResult setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setCopilotId(String copilotId) {
            this.copilotId = copilotId;
            return this;
        }
        public String getCopilotId() {
            return this.copilotId;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setDataRange(QueryCopilotEmbedConfigResponseBodyResultDataRange dataRange) {
            this.dataRange = dataRange;
            return this;
        }
        public QueryCopilotEmbedConfigResponseBodyResultDataRange getDataRange() {
            return this.dataRange;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public QueryCopilotEmbedConfigResponseBodyResult setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
