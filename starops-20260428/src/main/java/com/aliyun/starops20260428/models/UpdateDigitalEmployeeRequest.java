// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428.models;

import com.aliyun.tea.*;

public class UpdateDigitalEmployeeRequest extends TeaModel {
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
     * <p>The knowledge base list.</p>
     */
    @NameInMap("knowledges")
    public UpdateDigitalEmployeeRequestKnowledges knowledges;

    /**
     * <p>The ARN of the RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::12345678912:role/testrole</p>
     */
    @NameInMap("roleArn")
    public String roleArn;

    /**
     * <p>The list of CIDRs or IP addresses that are allowed to be accessed.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;allowFqdns&quot;:[&quot;api.example.com&quot;],&quot;allowCidrs&quot;:[&quot;1.2.3.0/24&quot;,&quot;8.8.8.8&quot;],&quot;enableAcl&quot;:false}</p>
     */
    @NameInMap("sandboxNetworkPolicy")
    public UpdateDigitalEmployeeRequestSandboxNetworkPolicy sandboxNetworkPolicy;

    /**
     * <p>The tool calling security policy configuration of the digital employee.</p>
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

    public UpdateDigitalEmployeeRequest setSandboxNetworkPolicy(UpdateDigitalEmployeeRequestSandboxNetworkPolicy sandboxNetworkPolicy) {
        this.sandboxNetworkPolicy = sandboxNetworkPolicy;
        return this;
    }
    public UpdateDigitalEmployeeRequestSandboxNetworkPolicy getSandboxNetworkPolicy() {
        return this.sandboxNetworkPolicy;
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
        /**
         * <p>The Bailian knowledge base list.</p>
         */
        @NameInMap("bailian")
        public java.util.List<UpdateDigitalEmployeeRequestKnowledgesBailian> bailian;

        /**
         * <p>The SOP knowledge base list.</p>
         */
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

    public static class UpdateDigitalEmployeeRequestSandboxNetworkPolicy extends TeaModel {
        /**
         * <p>The list of CIDRs or IP addresses that are allowed to be accessed.</p>
         */
        @NameInMap("allowCidrs")
        public java.util.List<String> allowCidrs;

        /**
         * <p>The list of FQDNs that are allowed to be accessed.</p>
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

        public static UpdateDigitalEmployeeRequestSandboxNetworkPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestSandboxNetworkPolicy self = new UpdateDigitalEmployeeRequestSandboxNetworkPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestSandboxNetworkPolicy setAllowCidrs(java.util.List<String> allowCidrs) {
            this.allowCidrs = allowCidrs;
            return this;
        }
        public java.util.List<String> getAllowCidrs() {
            return this.allowCidrs;
        }

        public UpdateDigitalEmployeeRequestSandboxNetworkPolicy setAllowFqdns(java.util.List<String> allowFqdns) {
            this.allowFqdns = allowFqdns;
            return this;
        }
        public java.util.List<String> getAllowFqdns() {
            return this.allowFqdns;
        }

        public UpdateDigitalEmployeeRequestSandboxNetworkPolicy setEnableAcl(Boolean enableAcl) {
            this.enableAcl = enableAcl;
            return this;
        }
        public Boolean getEnableAcl() {
            return this.enableAcl;
        }

    }

    public static class UpdateDigitalEmployeeRequestToolPolicyAliyunStatements extends TeaModel {
        /**
         * <p>RAM action</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:GetProject&quot;,&quot;log:CreateDashboard&quot;]</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p><strong>[Deprecated]</strong> The API version.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-30</p>
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
         * 
         * <strong>example:</strong>
         * <p>Cms</p>
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

        @Deprecated
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
         * <p>The automatic pass-through policy. Each entry is a RAM Action string in the format of product:ApiName, product:Prefix*, or product:<em>. Matched actions are automatically allowed without human confirmation. If this parameter is empty or not configured, built-in read-only actions (Get</em>, List*, Describe*) are automatically allowed. Unmatched actions require human-in-the-loop (HIL) confirmation.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;log:Get*&quot;,&quot;log:List*&quot;]</p>
         */
        @NameInMap("autoPassPolicy")
        public java.util.List<String> autoPassPolicy;

        /**
         * <p>The explicit deny policy with the highest priority. Each entry is a RAM Action string in the format of product:ApiName, product:Prefix*, or product:*. If this parameter is empty or not configured, no operations are actively denied. STAROps directly denies matched actions. Pop performs secondary enforcement.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs:RunCommand&quot;,&quot;ecs:Delete*&quot;]</p>
         */
        @NameInMap("denyPolicy")
        public java.util.List<String> denyPolicy;

        /**
         * <p>Specifies whether to enable the policy.</p>
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
        public java.util.List<UpdateDigitalEmployeeRequestToolPolicyAliyunStatements> statements;

        public static UpdateDigitalEmployeeRequestToolPolicyAliyun build(java.util.Map<String, ?> map) throws Exception {
            UpdateDigitalEmployeeRequestToolPolicyAliyun self = new UpdateDigitalEmployeeRequestToolPolicyAliyun();
            return TeaModel.build(map, self);
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyun setAutoPassPolicy(java.util.List<String> autoPassPolicy) {
            this.autoPassPolicy = autoPassPolicy;
            return this;
        }
        public java.util.List<String> getAutoPassPolicy() {
            return this.autoPassPolicy;
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyun setDenyPolicy(java.util.List<String> denyPolicy) {
            this.denyPolicy = denyPolicy;
            return this;
        }
        public java.util.List<String> getDenyPolicy() {
            return this.denyPolicy;
        }

        public UpdateDigitalEmployeeRequestToolPolicyAliyun setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        @Deprecated
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
         * <p>The Aliyun CLI tool calling security policy configuration.</p>
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
