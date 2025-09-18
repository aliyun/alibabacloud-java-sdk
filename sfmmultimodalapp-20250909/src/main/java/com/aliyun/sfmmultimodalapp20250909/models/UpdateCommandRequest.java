// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateCommandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_axaxaaa</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>659864545</p>
     */
    @NameInMap("DomainCode")
    public String domainCode;

    /**
     * <strong>example:</strong>
     * <p>shopping_t</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ToolDescription")
    public String toolDescription;

    @NameInMap("ToolExamples")
    public java.util.List<UpdateCommandRequestToolExamples> toolExamples;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8293382932xxx</p>
     */
    @NameInMap("ToolId")
    public String toolId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open_bx</p>
     */
    @NameInMap("ToolName")
    public String toolName;

    @NameInMap("ToolParams")
    public java.util.List<UpdateCommandRequestToolParams> toolParams;

    /**
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCommandRequest self = new UpdateCommandRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCommandRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateCommandRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public UpdateCommandRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCommandRequest setToolDescription(String toolDescription) {
        this.toolDescription = toolDescription;
        return this;
    }
    public String getToolDescription() {
        return this.toolDescription;
    }

    public UpdateCommandRequest setToolExamples(java.util.List<UpdateCommandRequestToolExamples> toolExamples) {
        this.toolExamples = toolExamples;
        return this;
    }
    public java.util.List<UpdateCommandRequestToolExamples> getToolExamples() {
        return this.toolExamples;
    }

    public UpdateCommandRequest setToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }
    public String getToolId() {
        return this.toolId;
    }

    public UpdateCommandRequest setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public UpdateCommandRequest setToolParams(java.util.List<UpdateCommandRequestToolParams> toolParams) {
        this.toolParams = toolParams;
        return this;
    }
    public java.util.List<UpdateCommandRequestToolParams> getToolParams() {
        return this.toolParams;
    }

    public UpdateCommandRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class UpdateCommandRequestToolExamples extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>给我xxx</p>
         */
        @NameInMap("Query")
        public String query;

        public static UpdateCommandRequestToolExamples build(java.util.Map<String, ?> map) throws Exception {
            UpdateCommandRequestToolExamples self = new UpdateCommandRequestToolExamples();
            return TeaModel.build(map, self);
        }

        public UpdateCommandRequestToolExamples setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class UpdateCommandRequestToolParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ParamExample")
        public String paramExample;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        public static UpdateCommandRequestToolParams build(java.util.Map<String, ?> map) throws Exception {
            UpdateCommandRequestToolParams self = new UpdateCommandRequestToolParams();
            return TeaModel.build(map, self);
        }

        public UpdateCommandRequestToolParams setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public UpdateCommandRequestToolParams setParamExample(String paramExample) {
            this.paramExample = paramExample;
            return this;
        }
        public String getParamExample() {
            return this.paramExample;
        }

        public UpdateCommandRequestToolParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
