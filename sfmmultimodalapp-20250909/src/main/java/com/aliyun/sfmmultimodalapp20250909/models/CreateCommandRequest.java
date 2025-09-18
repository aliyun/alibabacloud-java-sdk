// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateCommandRequest extends TeaModel {
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
     * <p>This parameter is required.</p>
     * 
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
    public java.util.List<CreateCommandRequestToolExamples> toolExamples;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open_bx</p>
     */
    @NameInMap("ToolName")
    public String toolName;

    @NameInMap("ToolParams")
    public java.util.List<CreateCommandRequestToolParams> toolParams;

    /**
     * <strong>example:</strong>
     * <p>llm-xxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCommandRequest self = new CreateCommandRequest();
        return TeaModel.build(map, self);
    }

    public CreateCommandRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateCommandRequest setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public CreateCommandRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCommandRequest setToolDescription(String toolDescription) {
        this.toolDescription = toolDescription;
        return this;
    }
    public String getToolDescription() {
        return this.toolDescription;
    }

    public CreateCommandRequest setToolExamples(java.util.List<CreateCommandRequestToolExamples> toolExamples) {
        this.toolExamples = toolExamples;
        return this;
    }
    public java.util.List<CreateCommandRequestToolExamples> getToolExamples() {
        return this.toolExamples;
    }

    public CreateCommandRequest setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public CreateCommandRequest setToolParams(java.util.List<CreateCommandRequestToolParams> toolParams) {
        this.toolParams = toolParams;
        return this;
    }
    public java.util.List<CreateCommandRequestToolParams> getToolParams() {
        return this.toolParams;
    }

    public CreateCommandRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreateCommandRequestToolExamples extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>给我xxx</p>
         */
        @NameInMap("Query")
        public String query;

        public static CreateCommandRequestToolExamples build(java.util.Map<String, ?> map) throws Exception {
            CreateCommandRequestToolExamples self = new CreateCommandRequestToolExamples();
            return TeaModel.build(map, self);
        }

        public CreateCommandRequestToolExamples setQuery(String query) {
            this.query = query;
            return this;
        }
        public String getQuery() {
            return this.query;
        }

    }

    public static class CreateCommandRequestToolParams extends TeaModel {
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

        public static CreateCommandRequestToolParams build(java.util.Map<String, ?> map) throws Exception {
            CreateCommandRequestToolParams self = new CreateCommandRequestToolParams();
            return TeaModel.build(map, self);
        }

        public CreateCommandRequestToolParams setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public CreateCommandRequestToolParams setParamExample(String paramExample) {
            this.paramExample = paramExample;
            return this;
        }
        public String getParamExample() {
            return this.paramExample;
        }

        public CreateCommandRequestToolParams setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
