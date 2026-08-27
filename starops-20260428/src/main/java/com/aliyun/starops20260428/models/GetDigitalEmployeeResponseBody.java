// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class GetDigitalEmployeeResponseBody extends TeaModel {
    /**
     * <p>The attributes.</p>
     */
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>The creation time.</p>
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T08:21:58Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The default rule of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("defaultRule")
    public String defaultRule;

    /**
     * <p>The description of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The type of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("employeeType")
    public String employeeType;

    /**
     * <p>The knowledge base list.</p>
     */
    @NameInMap("knowledges")
    public GetDigitalEmployeeResponseBodyKnowledges knowledges;

    /**
     * <p>The name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0B9377D9-C56B-5C2E-A8A4-************</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The sandbox network ACL policy configuration for the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;allowFqdns&quot;:[&quot;api.example.com&quot;],&quot;allowCidrs&quot;:[&quot;1.2.3.0/24&quot;,&quot;8.8.8.8&quot;],&quot;enableAcl&quot;:false}</p>
     */
    @NameInMap("sandboxNetworkPolicy")
    public GetDigitalEmployeeResponseBodySandboxNetworkPolicy sandboxNetworkPolicy;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The tool policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aliyun&quot;:{&quot;enable&quot;:true,&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}}</p>
     */
    @NameInMap("toolPolicy")
    public GetDigitalEmployeeResponseBodyToolPolicy toolPolicy;

    /**
     * <p>The update time.</p>
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

    public GetDigitalEmployeeResponseBody setSandboxNetworkPolicy(GetDigitalEmployeeResponseBodySandboxNetworkPolicy sandboxNetworkPolicy) {
        this.sandboxNetworkPolicy = sandboxNetworkPolicy;
        return this;
    }
    public GetDigitalEmployeeResponseBodySandboxNetworkPolicy getSandboxNetworkPolicy() {
        return this.sandboxNetworkPolicy;
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
         * <p>The knowledge base attributes.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("attributes")
        public String attributes;

        /**
         * <p>The Bailian index ID.</p>
         * 
         * <strong>example:</strong>
         * <p>index-xxxx</p>
         */
        @NameInMap("indexId")
        public String indexId;

        /**
         * <p>The region of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The Bailian workspace ID.</p>
         * 
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
        /**
         * <p>The Bailian knowledge base list.</p>
         */
        @NameInMap("bailian")
        public java.util.List<GetDigitalEmployeeResponseBodyKnowledgesBailian> bailian;

        /**
         * <p>The SOP knowledge base list.</p>
         */
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

    public static class GetDigitalEmployeeResponseBodySandboxNetworkPolicy extends TeaModel {
        /**
         * <p>The list of allowed CIDRs or IP addresses.</p>
         */
        @NameInMap("allowCidrs")
        public java.util.List<String> allowCidrs;

        /**
         * <p>The list of allowed FQDNs.</p>
         */
        @NameInMap("allowFqdns")
        public java.util.List<String> allowFqdns;

        /**
         * <p>Indicates whether the sandbox network ACL is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAcl")
        public Boolean enableAcl;

        public static GetDigitalEmployeeResponseBodySandboxNetworkPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodySandboxNetworkPolicy self = new GetDigitalEmployeeResponseBodySandboxNetworkPolicy();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodySandboxNetworkPolicy setAllowCidrs(java.util.List<String> allowCidrs) {
            this.allowCidrs = allowCidrs;
            return this;
        }
        public java.util.List<String> getAllowCidrs() {
            return this.allowCidrs;
        }

        public GetDigitalEmployeeResponseBodySandboxNetworkPolicy setAllowFqdns(java.util.List<String> allowFqdns) {
            this.allowFqdns = allowFqdns;
            return this;
        }
        public java.util.List<String> getAllowFqdns() {
            return this.allowFqdns;
        }

        public GetDigitalEmployeeResponseBodySandboxNetworkPolicy setEnableAcl(Boolean enableAcl) {
            this.enableAcl = enableAcl;
            return this;
        }
        public Boolean getEnableAcl() {
            return this.enableAcl;
        }

    }

    public static class GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements extends TeaModel {
        /**
         * <p>The list of RAM actions.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The API version.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-30</p>
         */
        @NameInMap("apiVersion")
        @Deprecated
        public String apiVersion;

        /**
         * <p>The execution policy.</p>
         * 
         * <strong>example:</strong>
         * <p>user_ack</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <p>The cloud product code.</p>
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

        @Deprecated
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
         * <p>The auto-pass policy. Each entry is a RAM Action string in the format of product:ApiName, product:Prefix*, or product:<em>. Matched requests are automatically approved without human confirmation. If empty or not configured, built-in read-only operations (Get</em>, List*, Describe*) are automatically approved. Unmatched requests require human-in-the-loop (HIL) confirmation.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:Get*&quot;,&quot;log:List*&quot;]</p>
         */
        @NameInMap("autoPassPolicy")
        public java.util.List<String> autoPassPolicy;

        /**
         * <p>The explicit deny policy with the highest priority. Each entry is a RAM Action string in the format of product:ApiName, product:Prefix*, or product:*. If empty or not configured, no operations are actively denied. STAROps directly rejects matched requests. The Pop side performs a secondary fallback check.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs:RunCommand&quot;,&quot;ecs:Delete*&quot;]</p>
         */
        @NameInMap("denyPolicy")
        public java.util.List<String> denyPolicy;

        /**
         * <p>Indicates whether the policy is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The list of Aliyun CLI tool policy statements.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]</p>
         */
        @NameInMap("statements")
        @Deprecated
        public java.util.List<GetDigitalEmployeeResponseBodyToolPolicyAliyunStatements> statements;

        public static GetDigitalEmployeeResponseBodyToolPolicyAliyun build(java.util.Map<String, ?> map) throws Exception {
            GetDigitalEmployeeResponseBodyToolPolicyAliyun self = new GetDigitalEmployeeResponseBodyToolPolicyAliyun();
            return TeaModel.build(map, self);
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyun setAutoPassPolicy(java.util.List<String> autoPassPolicy) {
            this.autoPassPolicy = autoPassPolicy;
            return this;
        }
        public java.util.List<String> getAutoPassPolicy() {
            return this.autoPassPolicy;
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyun setDenyPolicy(java.util.List<String> denyPolicy) {
            this.denyPolicy = denyPolicy;
            return this;
        }
        public java.util.List<String> getDenyPolicy() {
            return this.denyPolicy;
        }

        public GetDigitalEmployeeResponseBodyToolPolicyAliyun setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
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
         * <p>The security policy configuration for Aliyun CLI tool calling.</p>
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
