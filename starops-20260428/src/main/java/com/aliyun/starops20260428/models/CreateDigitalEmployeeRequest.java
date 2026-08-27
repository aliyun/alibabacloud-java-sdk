// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class CreateDigitalEmployeeRequest extends TeaModel {
    /**
     * <p>The attributes.</p>
     */
    @NameInMap("attributes")
    public java.util.Map<String, String> attributes;

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
     * <p>aaa</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The display name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>digial-employee-test</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The knowledge base list.</p>
     */
    @NameInMap("knowledges")
    public CreateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <p>The name of the digital employee.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-ae******ey</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ARN of the RAM role.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The sandbox network ACL policy configuration of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;allowFqdns&quot;:[&quot;api.example.com&quot;],&quot;allowCidrs&quot;:[&quot;1.2.3.0/24&quot;,&quot;8.8.8.8&quot;],&quot;enableAcl&quot;:false}</p>
     */
    @NameInMap("sandboxNetworkPolicy")
    public CreateDigitalEmployeeRequestSandboxNetworkPolicy sandboxNetworkPolicy;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<Tag> tags;

    /**
     * <p>The tool calling security policy configuration of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;aliyun&quot;:{&quot;enable&quot;:true,&quot;denyPolicy&quot;:[&quot;ecs:RunCommand&quot;,&quot;ecs:Delete*&quot;],&quot;autoPassPolicy&quot;:[&quot;log:Get*&quot;,&quot;log:List*&quot;],&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}}</p>
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

    public CreateDigitalEmployeeRequest setSandboxNetworkPolicy(CreateDigitalEmployeeRequestSandboxNetworkPolicy sandboxNetworkPolicy) {
        this.sandboxNetworkPolicy = sandboxNetworkPolicy;
        return this;
    }
    public CreateDigitalEmployeeRequestSandboxNetworkPolicy getSandboxNetworkPolicy() {
        return this.sandboxNetworkPolicy;
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
        /**
         * <p>The Bailian knowledge base list.</p>
         */
        @NameInMap("bailian")
        public java.util.List<CreateDigitalEmployeeRequestKnowledgesBailian> bailian;

        /**
         * <p>The SOP knowledge base list.</p>
         */
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

    public static class CreateDigitalEmployeeRequestSandboxNetworkPolicy extends TeaModel {
        /**
         * <p>The list of allowed CIDRs or IP addresses. A maximum of 50 entries are supported.</p>
         */
        @NameInMap("allowCidrs")
        public java.util.List<String> allowCidrs;

        /**
         * <p>The list of allowed FQDNs. A maximum of 50 entries are supported.</p>
         */
        @NameInMap("allowFqdns")
        public java.util.List<String> allowFqdns;

        /**
         * <p>Specifies whether to enable the sandbox network ACL.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableAcl")
        public Boolean enableAcl;

        public static CreateDigitalEmployeeRequestSandboxNetworkPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestSandboxNetworkPolicy self = new CreateDigitalEmployeeRequestSandboxNetworkPolicy();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestSandboxNetworkPolicy setAllowCidrs(java.util.List<String> allowCidrs) {
            this.allowCidrs = allowCidrs;
            return this;
        }
        public java.util.List<String> getAllowCidrs() {
            return this.allowCidrs;
        }

        public CreateDigitalEmployeeRequestSandboxNetworkPolicy setAllowFqdns(java.util.List<String> allowFqdns) {
            this.allowFqdns = allowFqdns;
            return this;
        }
        public java.util.List<String> getAllowFqdns() {
            return this.allowFqdns;
        }

        public CreateDigitalEmployeeRequestSandboxNetworkPolicy setEnableAcl(Boolean enableAcl) {
            this.enableAcl = enableAcl;
            return this;
        }
        public Boolean getEnableAcl() {
            return this.enableAcl;
        }

    }

    public static class CreateDigitalEmployeeRequestToolPolicyAliyunStatements extends TeaModel {
        /**
         * <p>The list of Aliyun OpenAPI actions. Format: product:ApiName, product:Prefix*, or product:*.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The Aliyun OpenAPI version that this statement applies to.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-30</p>
         */
        @NameInMap("apiVersion")
        @Deprecated
        public String apiVersion;

        /**
         * <p>The execution policy when the API is matched.</p>
         * 
         * <strong>example:</strong>
         * <p>user_ack</p>
         */
        @NameInMap("decision")
        public String decision;

        /**
         * <p>The Aliyun OpenAPI product name that this statement applies to.</p>
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

        @Deprecated
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
         * <p>The auto-pass policy. Entries are RAM Action strings in the format of product:ApiName, product:Prefix*, or product:<em>. Matched requests are automatically passed without human confirmation. If this parameter is empty or not configured, built-in read-only actions (Get</em>, List*, Describe*) are automatically passed. Unmatched requests require human-in-the-loop (HIL) confirmation.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:Get*&quot;,&quot;log:List*&quot;]</p>
         */
        @NameInMap("autoPassPolicy")
        public java.util.List<String> autoPassPolicy;

        /**
         * <p>The explicit deny policy with the highest priority. Entries are RAM Action strings in the format of product:ApiName, product:Prefix*, or product:*. If this parameter is empty or not configured, no operations are actively denied. When matched by STAROps, the request is directly denied. Pop performs a secondary fallback check.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs:RunCommand&quot;,&quot;ecs:Delete*&quot;]</p>
         */
        @NameInMap("denyPolicy")
        public java.util.List<String> denyPolicy;

        /**
         * <p>Specifies whether to enable the Aliyun MCP tool policy. The policy is enabled by default and is disabled only when this parameter is explicitly set to false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p><strong>[Deprecated]</strong> Use denyPolicy and autoPassPolicy instead. This parameter is still returned during the transition period. Original description: The list of Aliyun OpenAPI tool policy statements.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]</p>
         */
        @NameInMap("statements")
        @Deprecated
        public java.util.List<CreateDigitalEmployeeRequestToolPolicyAliyunStatements> statements;

        public static CreateDigitalEmployeeRequestToolPolicyAliyun build(java.util.Map<String, ?> map) throws Exception {
            CreateDigitalEmployeeRequestToolPolicyAliyun self = new CreateDigitalEmployeeRequestToolPolicyAliyun();
            return TeaModel.build(map, self);
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyun setAutoPassPolicy(java.util.List<String> autoPassPolicy) {
            this.autoPassPolicy = autoPassPolicy;
            return this;
        }
        public java.util.List<String> getAutoPassPolicy() {
            return this.autoPassPolicy;
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyun setDenyPolicy(java.util.List<String> denyPolicy) {
            this.denyPolicy = denyPolicy;
            return this;
        }
        public java.util.List<String> getDenyPolicy() {
            return this.denyPolicy;
        }

        public CreateDigitalEmployeeRequestToolPolicyAliyun setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
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
         * <p>The Aliyun MCP tool calling security policy configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable&quot;:true,&quot;denyPolicy&quot;:[&quot;ecs:RunCommand&quot;,&quot;ecs:Delete*&quot;],&quot;autoPassPolicy&quot;:[&quot;log:Get*&quot;,&quot;log:List*&quot;],&quot;statements&quot;:[{&quot;decision&quot;:&quot;user_ack&quot;,&quot;product&quot;:&quot;Sls&quot;,&quot;apiVersion&quot;:&quot;2020-12-30&quot;,&quot;actions&quot;:[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]}]}</p>
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
