// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeRequest extends TeaModel {
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
     * <p>aaa</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>digial-employee-test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("knowledges")
    public CreateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>数字员工工具调用安全策略配置。</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aliyun&quot;:{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}}</p>
     */
    @NameInMap("toolPolicy")
    public CreateDigitalEmployeeRequestToolPolicy toolPolicy;

    public static CreateDigitalEmployeeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalEmployeeRequest self = new CreateDigitalEmployeeRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalEmployeeRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public CreateDigitalEmployeeRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public CreateDigitalEmployeeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDigitalEmployeeRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateDigitalEmployeeRequest setKnowledges(CreateDigitalEmployeeRequestKnowledges knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public CreateDigitalEmployeeRequestKnowledges getKnowledges() {
        return this.knowledges;
    }

    public CreateDigitalEmployeeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDigitalEmployeeRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDigitalEmployeeRequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public CreateDigitalEmployeeRequest setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public CreateDigitalEmployeeRequest setToolPolicy(CreateDigitalEmployeeRequestToolPolicy toolPolicy) {
        this.toolPolicy = toolPolicy;
        return this;
    }
    public CreateDigitalEmployeeRequestToolPolicy getToolPolicy() {
        return this.toolPolicy;
    }

    public static class CreateDigitalEmployeeRequestKnowledgesBailian extends TeaModel {
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
         * <p>llm-xxxxx</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static CreateDigitalEmployeeRequestKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestKnowledgesBailian self = new CreateDigitalEmployeeRequestKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateDigitalEmployeeRequestKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class CreateDigitalEmployeeRequestKnowledges extends TeaModel {
        @NameInMap("bailian")
        public java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> bailian;

        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

        public static CreateDigitalEmployeeRequestKnowledges build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestKnowledges self = new CreateDigitalEmployeeRequestKnowledges();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestKnowledges setBailian(java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> getBailian() {
            return this.bailian;
        }

        public CreateDigitalEmployeeRequestKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

    public static class CreateDigitalEmployeeRequestToolPolicyAliyunStatements extends TeaModel {
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

        public static CreateDigitalEmployeeRequestToolPolicyAliyunStatements build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestToolPolicyAliyunStatements self = new CreateDigitalEmployeeRequestToolPolicyAliyunStatements();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyunStatements setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyunStatements setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyunStatements setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyunStatements setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class CreateDigitalEmployeeRequestToolPolicyAliyun extends TeaModel {
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
        public java.util.List<CreateDigitalEmployeeRequestToolPolicyAliyunStatements> statements;

        public static CreateDigitalEmployeeRequestToolPolicyAliyun build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestToolPolicyAliyun self = new CreateDigitalEmployeeRequestToolPolicyAliyun();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyun setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyun setStatements(java.util.List<CreateDigitalEmployeeRequestToolPolicyAliyunStatements> statements) {
            this.statements = statements;
            return this;
        }
        public java.util.List<CreateDigitalEmployeeRequestToolPolicyAliyunStatements> getStatements() {
            return this.statements;
        }

    }

    public static class CreateDigitalEmployeeRequestToolPolicy extends TeaModel {
        /**
         * <p>Aliyun MCP 工具调用安全策略配置。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}</p>
         */
        @NameInMap("aliyun")
        public CreateDigitalEmployeeRequestToolPolicyAliyun aliyun;

        public static CreateDigitalEmployeeRequestToolPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestToolPolicy self = new CreateDigitalEmployeeRequestToolPolicy();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestToolPolicy setAliyun(CreateDigitalEmployeeRequestToolPolicyAliyun aliyun) {
            this.aliyun = aliyun;
            return this;
        }
        public CreateDigitalEmployeeRequestToolPolicyAliyun getAliyun() {
            return this.aliyun;
        }

    }

}
