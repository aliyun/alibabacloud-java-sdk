// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeResponseBody extends TeaModel {
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

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

    /**
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("employeeType")
    public String employeeType;

    @NameInMap("knowledges")
    public GetDigitalEmployeeResponseBodyKnowledges knowledges;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
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
    public GetDigitalEmployeeResponseBodyToolPolicy toolPolicy;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-18T02:25:06Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    public static GetDigitalEmployeeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalEmployeeResponseBody self = new GetDigitalEmployeeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDigitalEmployeeResponseBody setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
        return this.attributes;
    }

    public GetDigitalEmployeeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetDigitalEmployeeResponseBody setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public GetDigitalEmployeeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetDigitalEmployeeResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetDigitalEmployeeResponseBody setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
        return this;
    }
    public String getEmployeeType() {
        return this.employeeType;
    }

    public GetDigitalEmployeeResponseBody setKnowledges(GetDigitalEmployeeResponseBodyKnowledges knowledges) {
        this.knowledges = knowledges;
        return this;
    }
    public GetDigitalEmployeeResponseBodyKnowledges getKnowledges() {
        return this.knowledges;
    }

    public GetDigitalEmployeeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetDigitalEmployeeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDigitalEmployeeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDigitalEmployeeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetDigitalEmployeeResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public GetDigitalEmployeeResponseBody setTags(java.util.List<Tag> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tag> getTags() {
        return this.tags;
    }

    public GetDigitalEmployeeResponseBody setToolPolicy(GetDigitalEmployeeResponseBodyToolPolicy toolPolicy) {
        this.toolPolicy = toolPolicy;
        return this;
    }
    public GetDigitalEmployeeResponseBodyToolPolicy getToolPolicy() {
        return this.toolPolicy;
    }

    public GetDigitalEmployeeResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class GetDigitalEmployeeResponseBodyKnowledgesBailian extends TeaModel {
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

        public static GetDigitalEmployeeResponseBodyKnowledgesBailian build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyKnowledgesBailian self = new GetDigitalEmployeeResponseBodyKnowledgesBailian();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }
        public String getAttributes() {
            return this.attributes;
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setIndexId(String indexId) {
            this.indexId = indexId;
            return this;
        }
        public String getIndexId() {
            return this.indexId;
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetDigitalEmployeeResponseBodyKnowledgesBailian setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

    public static class GetDigitalEmployeeResponseBodyKnowledges extends TeaModel {
        @NameInMap("bailian")
        public java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> bailian;

        @NameInMap("sop")
        public java.util.List<java.util.Map<String, ?>> sop;

        public static GetDigitalEmployeeResponseBodyKnowledges build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyKnowledges self = new GetDigitalEmployeeResponseBodyKnowledges();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyKnowledges setBailian(java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> bailian) {
            this.bailian = bailian;
            return this;
        }
        public java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> getBailian() {
            return this.bailian;
        }

        public GetDigitalEmployeeResponseBodyKnowledges setSop(java.util.List<java.util.Map<String, ?>> sop) {
            this.sop = sop;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getSop() {
            return this.sop;
        }

    }

    public static class GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements extends TeaModel {
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Sls</p>
         */
        @NameInMap("product")
        public String product;

        public static GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements self = new GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class GetDigitalEmployeeResponseBodyToolPolicyAliyun extends TeaModel {
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
        public java.util.List<GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements> statements;

        public static GetDigitalEmployeeResponseBodyToolPolicyAliyun build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyToolPolicyAliyun self = new GetDigitalEmployeeResponseBodyToolPolicyAliyun();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyun setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyun setStatements(java.util.List<GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements> statements) {
            this.statements = statements;
            return this;
        }
        public java.util.List<GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements> getStatements() {
            return this.statements;
        }

    }

    public static class GetDigitalEmployeeResponseBodyToolPolicy extends TeaModel {
        /**
         * <p>Aliyun MCP 工具调用安全策略配置。</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}</p>
         */
        @NameInMap("aliyun")
        public GetDigitalEmployeeResponseBodyToolPolicyAliyun aliyun;

        public static GetDigitalEmployeeResponseBodyToolPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyToolPolicy self = new GetDigitalEmployeeResponseBodyToolPolicy();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyToolPolicy setAliyun(GetDigitalEmployeeResponseBodyToolPolicyAliyun aliyun) {
            this.aliyun = aliyun;
            return this;
        }
        public GetDigitalEmployeeResponseBodyToolPolicyAliyun getAliyun() {
            return this.aliyun;
        }

    }

}
