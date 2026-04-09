// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerResponseBody extends TeaModel {
    @NameInMap("additionalApiDescriptions")
    public java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptions> additionalApiDescriptions;

    @NameInMap("apiInfos")
    public java.util.List<GetApiMcpServerResponseBodyApiInfos> apiInfos;

    @NameInMap("apis")
    public java.util.List<GetApiMcpServerResponseBodyApis> apis;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Version&quot;: &quot;1&quot;,
     *   &quot;Statement&quot;: [
     *     {
     *       &quot;Effect&quot;: &quot;Allow&quot;,
     *       &quot;Action&quot;: [
     *         &quot;ecs:Describe*&quot;,
     *         &quot;vpc:Describe*&quot;,
     *         &quot;vpc:List*&quot;
     *       ],
     *       &quot;Resource&quot;: &quot;*&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("assumeRoleExtraPolicy")
    public String assumeRoleExtraPolicy;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("assumeRoleName")
    public String assumeRoleName;

    /**
     * <strong>example:</strong>
     * <p>2025-02-07T02:17:46Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAssumeRole")
    public Boolean enableAssumeRole;

    @NameInMap("enableCustomVpcWhitelist")
    public Boolean enableCustomVpcWhitelist;

    /**
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("instructions")
    public String instructions;

    /**
     * <strong>example:</strong>
     * <p>ZH_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>mcp-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>403*************370</p>
     */
    @NameInMap("oauthClientId")
    public String oauthClientId;

    @NameInMap("prompts")
    public java.util.List<GetApiMcpServerResponseBodyPrompts> prompts;

    @NameInMap("publicAccess")
    public String publicAccess;

    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;Version&quot;: &quot;1&quot;,
     *   &quot;Statement&quot;: [
     *     {
     *       &quot;Effect&quot;: &quot;Allow&quot;,
     *       &quot;Action&quot;: [
     *         &quot;ecs:Describe*&quot;,
     *         &quot;vpc:Describe*&quot;,
     *         &quot;vpc:List*&quot;
     *       ],
     *       &quot;Resource&quot;: &quot;*&quot;
     *     }
     *   ]
     * }</p>
     */
    @NameInMap("requiredRAMPolicy")
    public String requiredRAMPolicy;

    /**
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("systemMcpServerInfo")
    public GetApiMcpServerResponseBodySystemMcpServerInfo systemMcpServerInfo;

    @NameInMap("systemTools")
    public java.util.List<String> systemTools;

    @NameInMap("terraformTools")
    public java.util.List<GetApiMcpServerResponseBodyTerraformTools> terraformTools;

    /**
     * <strong>example:</strong>
     * <p>2025-02-05T02:26:04Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    @NameInMap("urls")
    public GetApiMcpServerResponseBodyUrls urls;

    @NameInMap("vpcWhitelists")
    public java.util.List<String> vpcWhitelists;

    public static GetApiMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiMcpServerResponseBody self = new GetApiMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiMcpServerResponseBody setAdditionalApiDescriptions(java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptions> additionalApiDescriptions) {
        this.additionalApiDescriptions = additionalApiDescriptions;
        return this;
    }
    public java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptions> getAdditionalApiDescriptions() {
        return this.additionalApiDescriptions;
    }

    public GetApiMcpServerResponseBody setApiInfos(java.util.List<GetApiMcpServerResponseBodyApiInfos> apiInfos) {
        this.apiInfos = apiInfos;
        return this;
    }
    public java.util.List<GetApiMcpServerResponseBodyApiInfos> getApiInfos() {
        return this.apiInfos;
    }

    public GetApiMcpServerResponseBody setApis(java.util.List<GetApiMcpServerResponseBodyApis> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<GetApiMcpServerResponseBodyApis> getApis() {
        return this.apis;
    }

    public GetApiMcpServerResponseBody setAssumeRoleExtraPolicy(String assumeRoleExtraPolicy) {
        this.assumeRoleExtraPolicy = assumeRoleExtraPolicy;
        return this;
    }
    public String getAssumeRoleExtraPolicy() {
        return this.assumeRoleExtraPolicy;
    }

    public GetApiMcpServerResponseBody setAssumeRoleName(String assumeRoleName) {
        this.assumeRoleName = assumeRoleName;
        return this;
    }
    public String getAssumeRoleName() {
        return this.assumeRoleName;
    }

    public GetApiMcpServerResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetApiMcpServerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetApiMcpServerResponseBody setEnableAssumeRole(Boolean enableAssumeRole) {
        this.enableAssumeRole = enableAssumeRole;
        return this;
    }
    public Boolean getEnableAssumeRole() {
        return this.enableAssumeRole;
    }

    public GetApiMcpServerResponseBody setEnableCustomVpcWhitelist(Boolean enableCustomVpcWhitelist) {
        this.enableCustomVpcWhitelist = enableCustomVpcWhitelist;
        return this;
    }
    public Boolean getEnableCustomVpcWhitelist() {
        return this.enableCustomVpcWhitelist;
    }

    public GetApiMcpServerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetApiMcpServerResponseBody setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public GetApiMcpServerResponseBody setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetApiMcpServerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetApiMcpServerResponseBody setOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
        return this;
    }
    public String getOauthClientId() {
        return this.oauthClientId;
    }

    public GetApiMcpServerResponseBody setPrompts(java.util.List<GetApiMcpServerResponseBodyPrompts> prompts) {
        this.prompts = prompts;
        return this;
    }
    public java.util.List<GetApiMcpServerResponseBodyPrompts> getPrompts() {
        return this.prompts;
    }

    public GetApiMcpServerResponseBody setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public String getPublicAccess() {
        return this.publicAccess;
    }

    public GetApiMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiMcpServerResponseBody setRequiredRAMPolicy(String requiredRAMPolicy) {
        this.requiredRAMPolicy = requiredRAMPolicy;
        return this;
    }
    public String getRequiredRAMPolicy() {
        return this.requiredRAMPolicy;
    }

    public GetApiMcpServerResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetApiMcpServerResponseBody setSystemMcpServerInfo(GetApiMcpServerResponseBodySystemMcpServerInfo systemMcpServerInfo) {
        this.systemMcpServerInfo = systemMcpServerInfo;
        return this;
    }
    public GetApiMcpServerResponseBodySystemMcpServerInfo getSystemMcpServerInfo() {
        return this.systemMcpServerInfo;
    }

    public GetApiMcpServerResponseBody setSystemTools(java.util.List<String> systemTools) {
        this.systemTools = systemTools;
        return this;
    }
    public java.util.List<String> getSystemTools() {
        return this.systemTools;
    }

    public GetApiMcpServerResponseBody setTerraformTools(java.util.List<GetApiMcpServerResponseBodyTerraformTools> terraformTools) {
        this.terraformTools = terraformTools;
        return this;
    }
    public java.util.List<GetApiMcpServerResponseBodyTerraformTools> getTerraformTools() {
        return this.terraformTools;
    }

    public GetApiMcpServerResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public GetApiMcpServerResponseBody setUrls(GetApiMcpServerResponseBodyUrls urls) {
        this.urls = urls;
        return this;
    }
    public GetApiMcpServerResponseBodyUrls getUrls() {
        return this.urls;
    }

    public GetApiMcpServerResponseBody setVpcWhitelists(java.util.List<String> vpcWhitelists) {
        this.vpcWhitelists = vpcWhitelists;
        return this;
    }
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

    public static class GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("value")
        public Object value;

        public static GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters self = new GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetApiMcpServerResponseBodyAdditionalApiDescriptions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        @NameInMap("apiName")
        public String apiName;

        @NameInMap("apiOverrideJson")
        public String apiOverrideJson;

        /**
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        @NameInMap("constParameters")
        public java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters> constParameters;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOutputSchema")
        public Boolean enableOutputSchema;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("executeCliCommand")
        public Boolean executeCliCommand;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        public static GetApiMcpServerResponseBodyAdditionalApiDescriptions build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyAdditionalApiDescriptions self = new GetApiMcpServerResponseBodyAdditionalApiDescriptions();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setApiOverrideJson(String apiOverrideJson) {
            this.apiOverrideJson = apiOverrideJson;
            return this;
        }
        public String getApiOverrideJson() {
            return this.apiOverrideJson;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setConstParameters(java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters> constParameters) {
            this.constParameters = constParameters;
            return this;
        }
        public java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters> getConstParameters() {
            return this.constParameters;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setEnableOutputSchema(Boolean enableOutputSchema) {
            this.enableOutputSchema = enableOutputSchema;
            return this;
        }
        public Boolean getEnableOutputSchema() {
            return this.enableOutputSchema;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setExecuteCliCommand(Boolean executeCliCommand) {
            this.executeCliCommand = executeCliCommand;
            return this;
        }
        public Boolean getExecuteCliCommand() {
            return this.executeCliCommand;
        }

        public GetApiMcpServerResponseBodyAdditionalApiDescriptions setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class GetApiMcpServerResponseBodyApiInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        public static GetApiMcpServerResponseBodyApiInfos build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyApiInfos self = new GetApiMcpServerResponseBodyApiInfos();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyApiInfos setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetApiMcpServerResponseBodyApiInfos setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetApiMcpServerResponseBodyApiInfos setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class GetApiMcpServerResponseBodyApis extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        @NameInMap("selectors")
        public java.util.List<String> selectors;

        public static GetApiMcpServerResponseBodyApis build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyApis self = new GetApiMcpServerResponseBodyApis();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyApis setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetApiMcpServerResponseBodyApis setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetApiMcpServerResponseBodyApis setSelectors(java.util.List<String> selectors) {
            this.selectors = selectors;
            return this;
        }
        public java.util.List<String> getSelectors() {
            return this.selectors;
        }

    }

    public static class GetApiMcpServerResponseBodyPromptsArguments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>argument description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("required")
        public Boolean required;

        public static GetApiMcpServerResponseBodyPromptsArguments build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyPromptsArguments self = new GetApiMcpServerResponseBodyPromptsArguments();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyPromptsArguments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiMcpServerResponseBodyPromptsArguments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApiMcpServerResponseBodyPromptsArguments setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class GetApiMcpServerResponseBodyPrompts extends TeaModel {
        @NameInMap("arguments")
        public java.util.List<GetApiMcpServerResponseBodyPromptsArguments> arguments;

        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>prompt description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static GetApiMcpServerResponseBodyPrompts build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyPrompts self = new GetApiMcpServerResponseBodyPrompts();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyPrompts setArguments(java.util.List<GetApiMcpServerResponseBodyPromptsArguments> arguments) {
            this.arguments = arguments;
            return this;
        }
        public java.util.List<GetApiMcpServerResponseBodyPromptsArguments> getArguments() {
            return this.arguments;
        }

        public GetApiMcpServerResponseBodyPrompts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetApiMcpServerResponseBodyPrompts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiMcpServerResponseBodyPrompts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetApiMcpServerResponseBodySystemMcpServerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mcp-system</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        public static GetApiMcpServerResponseBodySystemMcpServerInfo build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodySystemMcpServerInfo self = new GetApiMcpServerResponseBodySystemMcpServerInfo();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodySystemMcpServerInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApiMcpServerResponseBodySystemMcpServerInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class GetApiMcpServerResponseBodyTerraformTools extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("async")
        public Boolean async;

        /**
         * <strong>example:</strong>
         * <p>variable &quot;name&quot; {
         *   default = &quot;terraform-example&quot;
         * }</p>
         * <p>provider &quot;alicloud&quot; {
         *   region = &quot;cn-beijing&quot;
         * }</p>
         * <p>resource &quot;alicloud_vpc&quot; &quot;default&quot; {
         *   ipv6_isp    = &quot;BGP&quot;
         *   description = &quot;test&quot;
         *   cidr_block  = &quot;10.0.0.0/8&quot;
         *   vpc_name    = var.name
         *   enable_ipv6 = true
         * }</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>Terraform Tool description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ON_FAILURE</p>
         */
        @NameInMap("destroyPolicy")
        public String destroyPolicy;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        public static GetApiMcpServerResponseBodyTerraformTools build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyTerraformTools self = new GetApiMcpServerResponseBodyTerraformTools();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyTerraformTools setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public GetApiMcpServerResponseBodyTerraformTools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetApiMcpServerResponseBodyTerraformTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApiMcpServerResponseBodyTerraformTools setDestroyPolicy(String destroyPolicy) {
            this.destroyPolicy = destroyPolicy;
            return this;
        }
        public String getDestroyPolicy() {
            return this.destroyPolicy;
        }

        public GetApiMcpServerResponseBodyTerraformTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetApiMcpServerResponseBodyUrls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp">https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp</a></p>
         */
        @NameInMap("mcp")
        public String mcp;

        /**
         * <strong>example:</strong>
         * <p><a href="https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse">https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse</a></p>
         */
        @NameInMap("sse")
        public String sse;

        @NameInMap("vpcMcp")
        public String vpcMcp;

        @NameInMap("vpcSse")
        public String vpcSse;

        public static GetApiMcpServerResponseBodyUrls build(java.util.Map<String, ?> map) throws Exception {
            GetApiMcpServerResponseBodyUrls self = new GetApiMcpServerResponseBodyUrls();
            return TeaModel.build(map, self);
        }

        public GetApiMcpServerResponseBodyUrls setMcp(String mcp) {
            this.mcp = mcp;
            return this;
        }
        public String getMcp() {
            return this.mcp;
        }

        public GetApiMcpServerResponseBodyUrls setSse(String sse) {
            this.sse = sse;
            return this;
        }
        public String getSse() {
            return this.sse;
        }

        public GetApiMcpServerResponseBodyUrls setVpcMcp(String vpcMcp) {
            this.vpcMcp = vpcMcp;
            return this;
        }
        public String getVpcMcp() {
            return this.vpcMcp;
        }

        public GetApiMcpServerResponseBodyUrls setVpcSse(String vpcSse) {
            this.vpcSse = vpcSse;
            return this;
        }
        public String getVpcSse() {
            return this.vpcSse;
        }

    }

}
