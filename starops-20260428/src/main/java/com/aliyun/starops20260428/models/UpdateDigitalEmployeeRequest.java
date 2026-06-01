// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeRequest extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("defaultRule")
    public String defaultRule;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("knowledges")
    public UpdateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>数字员工工具调用安全策略配置。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aliyun&quot;:{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}}</p>
     */
    @NameInMap("toolPolicy")
    public UpdateDigitalEmployeeRequestToolPolicy toolPolicy;

    public static UpdateDigitalEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDigitalEmployeeRequest self = new UpdateDigitalEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDigitalEmployeeRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public UpdateDigitalEmployeeRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public UpdateDigitalEmployeeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDigitalEmployeeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateDigitalEmployeeRequest setKnowledges(UpdateDigitalEmployeeRequestKnowledges knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public UpdateDigitalEmployeeRequestKnowledges getKnowledges() {
        return this.knowledges;
    }

    public UpdateDigitalEmployeeRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateDigitalEmployeeRequest setToolPolicy(UpdateDigitalEmployeeRequestToolPolicy toolPolicy) {
        this.toolPolicy = toolPolicy;
        return this;
    }
    public UpdateDigitalEmployeeRequestToolPolicy getToolPolicy() {
        return this.toolPolicy;
    }

    public static class UpdateDigitalEmployeeRequestKnowledgesBailian extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <strong>example:</strong>
         * <p>index-xxxx</p>
         */
        @NameInMap("indexId")
        public String indexId;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateDigitalEmployeeRequestKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestKnowledgesBailian self = new UpdateDigitalEmployeeRequestKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateDigitalEmployeeRequestKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class UpdateDigitalEmployeeRequestKnowledges extends TeaModel {
        @NameInMap("bailian")
        public java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> bailian;

        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

        public static UpdateDigitalEmployeeRequestKnowledges build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestKnowledges self = new UpdateDigitalEmployeeRequestKnowledges();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestKnowledges setBailian(java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> getBailian() {
            return this.bailian;
        }

        public UpdateDigitalEmployeeRequestKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

    public static class UpdateDigitalEmployeeRequestToolPolicyAliyunStatements extends TeaModel {
        /**
         * <p>Aliyun OpenAPI Action 列表，格式为 product:ApiName、product:Prefix* 或 product:*。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>本条语句对应的 Aliyun OpenAPI API 版本。</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-30</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>命中该 API 后的执行策略。</p>
         * 
         * <strong>example:</strong>
         * <p>user_ack</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <p>本条语句对应的 Aliyun OpenAPI 产品名。</p>
         * 
         * <strong>example:</strong>
         * <p>Sls</p>
         */
        @NameInMap("product")
        public String product;

        public static UpdateDigitalEmployeeRequestToolPolicyAliyunStatements build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestToolPolicyAliyunStatements self = new UpdateDigitalEmployeeRequestToolPolicyAliyunStatements();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyunStatements setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyunStatements setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyunStatements setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyunStatements setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class UpdateDigitalEmployeeRequestToolPolicyAliyun extends TeaModel {
        /**
         * <p>是否启用 Aliyun MCP 工具策略。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>Aliyun OpenAPI 工具策略语句列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]</p>
         */
        @NameInMap("statements")
        public java.util.List<UpdateDigitalEmployeeRequestToolPolicyAliyunStatements> statements;

        public static UpdateDigitalEmployeeRequestToolPolicyAliyun build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestToolPolicyAliyun self = new UpdateDigitalEmployeeRequestToolPolicyAliyun();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyun setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyun setStatements(java.util.List<UpdateDigitalEmployeeRequestToolPolicyAliyunStatements> statements) {
            this.statements = statements;
            return this;
        }
        public java.util.List<UpdateDigitalEmployeeRequestToolPolicyAliyunStatements> getStatements() {
            return this.statements;
        }

    }

    public static class UpdateDigitalEmployeeRequestToolPolicy extends TeaModel {
        /**
         * <p>Aliyun MCP 工具调用安全策略配置。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}</p>
         */
        @NameInMap("aliyun")
        public UpdateDigitalEmployeeRequestToolPolicyAliyun aliyun;

        public static UpdateDigitalEmployeeRequestToolPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestToolPolicy self = new UpdateDigitalEmployeeRequestToolPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestToolPolicy setAliyun(UpdateDigitalEmployeeRequestToolPolicyAliyun aliyun) {
            this.aliyun = aliyun;
            return this;
        }
        public UpdateDigitalEmployeeRequestToolPolicyAliyun getAliyun() {
            return this.aliyun;
        }

    }

}
