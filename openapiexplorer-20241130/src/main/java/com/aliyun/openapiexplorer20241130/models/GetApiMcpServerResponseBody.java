// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerResponseBody extends TeaModel {
    /**
     * <p>A list of supplementary API descriptions.</p>
     */
    @NameInMap("additionalApiDescriptions")
    public java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptions> additionalApiDescriptions;

    /**
     * <p>A list of API information for the API MCP service.</p>
     */
    @NameInMap("apiInfos")
    public java.util.List<GetApiMcpServerResponseBodyApiInfos> apiInfos;

    /**
     * <p>A list of API information.</p>
     */
    @NameInMap("apis")
    public java.util.List<GetApiMcpServerResponseBodyApis> apis;

    /**
     * <p>The extra policy for role assumption when multi-account access is enabled. If this policy is specified, the permissions for the role assumption are based on this policy and overwrite the permissions that are defined for the role.</p>
     * 
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
     * <p>The name of the RAM role of the destination account that is assumed when you perform cross-account operations with multi-account access enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("assumeRoleName")
    public String assumeRoleName;

    /**
     * <p>The time when the API MCP server was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-07T02:17:46Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <p>The description of the API MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个API MCP 服务器</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Indicates whether to enable multi-account access.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAssumeRole")
    public Boolean enableAssumeRole;

    /**
     * <p>Indicates whether to enable a custom VPC whitelist. If this parameter is not enabled, the account-level configuration is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableCustomVpcWhitelist")
    public Boolean enableCustomVpcWhitelist;

    /**
     * <p>The ID of the API MCP service.</p>
     * 
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>The MCP instruction. It prompts the large model on how to use the MCP. The client must support the Instructions field of the standard MCP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("instructions")
    public String instructions;

    /**
     * <p>The language of the API documentation for the API MCP service. You can select Chinese or English API documentation. The language of the prompt may affect the AI\&quot;s response.</p>
     * 
     * <strong>example:</strong>
     * <p>ZH_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The name of the MCP server. The name must be 3 to 64 characters in length and can contain lowercase letters and digits. It must not start with a digit. The name must be unique within the same Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>mcp-demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The custom OAuth client ID when you select a custom OAuth configuration.</p>
     * <p><code>Only web and native applications are supported. The OAuth scope must include /acs/mcp-server.</code></p>
     * 
     * <strong>example:</strong>
     * <p>403*************370</p>
     */
    @NameInMap("oauthClientId")
    public String oauthClientId;

    /**
     * <p>A list of prompt configurations.</p>
     */
    @NameInMap("prompts")
    public java.util.List<GetApiMcpServerResponseBodyPrompts> prompts;

    /**
     * <p>Indicates whether to enable public access.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("publicAccess")
    public String publicAccess;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The RAM access policy that is required by the API MCP service.</p>
     * 
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
     * <p>The type of the API MCP service.</p>
     * <ul>
     * <li><p>custom: a custom service</p>
     * </li>
     * <li><p>system: a system service</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>system</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>A list of system MCP services.</p>
     */
    @NameInMap("systemMcpServerInfo")
    public GetApiMcpServerResponseBodySystemMcpServerInfo systemMcpServerInfo;

    /**
     * <p>A list of system tools.</p>
     */
    @NameInMap("systemTools")
    public java.util.List<String> systemTools;

    /**
     * <p>A list of Terraform tools.</p>
     */
    @NameInMap("terraformTools")
    public java.util.List<GetApiMcpServerResponseBodyTerraformTools> terraformTools;

    /**
     * <p>The time when the API MCP server was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-02-05T02:26:04Z</p>
     */
    @NameInMap("updateTime")
    public String updateTime;

    /**
     * <p>The connection information for the MCP server.</p>
     */
    @NameInMap("urls")
    public GetApiMcpServerResponseBodyUrls urls;

    /**
     * <p>The VPC whitelist that specifies the allowed source VPCs after public access is disabled. If you do not set this parameter or leave it empty, access from all sources is allowed.</p>
     */
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
         * <p>The parameter name. Only first-level parameter names are supported. For ROA-style APIs, you can set parameters such as body.xx. You cannot set values that exceed the top-level parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the parameter.</p>
         * 
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
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The API metadata in JSON format. For an example of the format, see https\://api.aliyun.com/meta/v1/products/Ecs/versions/2014-05-26/apis/DescribeInstances/api.json. You can overwrite the summary and parameters fields.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;summary&quot;: &quot;本接口支持根据不同请求条件查询实例列表，并关联查询实例的详细信息。&quot;
         * }</p>
         */
        @NameInMap("apiOverrideJson")
        public String apiOverrideJson;

        /**
         * <p>The POP version of the API that is exposed to the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>A list of constant input parameters. These parameters are not included in the output during API parameter parsing.</p>
         */
        @NameInMap("constParameters")
        public java.util.List<GetApiMcpServerResponseBodyAdditionalApiDescriptionsConstParameters> constParameters;

        /**
         * <p>Indicates whether to return the schema of the response parameters. Returning the schema increases the size of the entire API MCP server. The default value is null, which means the schema is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOutputSchema")
        public Boolean enableOutputSchema;

        /**
         * <p>Indicates whether to return the command-line interface (CLI) command. In this mode, the API is not called. Instead, the corresponding CLI command is returned. This is suitable for long-running tasks that need to be executed using Alibaba Cloud CLI.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("executeCliCommand")
        public Boolean executeCliCommand;

        /**
         * <p>The product code.</p>
         * <ul>
         * <li>Call the GetRequestLog operation to obtain the product code from the response.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Find the corresponding product code from the URL of the OpenAPI Portal. For example, the URL of the OpenAPI Portal for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.</li>
         * </ul>
         * 
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
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The POP version of the API that is exposed to the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The product code.</p>
         * <ul>
         * <li>Call the GetRequestLog operation to obtain the product code from the response.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Find the corresponding product code from the URL of the OpenAPI Portal. For example, the URL of the OpenAPI Portal for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.</li>
         * </ul>
         * 
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
         * <p>The POP version of the API that is exposed to the MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The product code.</p>
         * <ul>
         * <li>Call the GetRequestLog operation to obtain the product code from the response.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Find the corresponding product code from the URL of the OpenAPI Portal. For example, the URL of the OpenAPI Portal for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>A list of API name matching rules.</p>
         */
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
         * <p>The description of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>argument description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Indicates whether this parameter is required.</p>
         */
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
        /**
         * <p>A list of parameters that the prompt supports.</p>
         */
        @NameInMap("arguments")
        public java.util.List<GetApiMcpServerResponseBodyPromptsArguments> arguments;

        /**
         * <p>The content of the prompt. Variables are specified in the {{xxx}} format. The xxx variable must be defined in the arguments parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>prompt正文，{{name}}</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>prompt description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The prompt name.</p>
         * 
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
         * <p>The name of the system MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-system</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The product code.</p>
         * <ul>
         * <li>Call the GetRequestLog operation to obtain the product code from the response.</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Find the corresponding product code from the URL of the OpenAPI Portal. For example, the URL of the OpenAPI Portal for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code for Short Message Service is Dysmsapi.</li>
         * </ul>
         * 
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
         * <p>Indicates whether to execute tasks asynchronously. If set to true, the system immediately starts the next task after the current task is initiated, without waiting for each resource operation to complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("async")
        public Boolean async;

        /**
         * <p>The code for the Terraform tool. For more information, see <a href="https://help.aliyun.com/zh/terraform/terraform-configuration-and-hcl-language-overview">HCL language overview</a>.</p>
         * 
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
         * <p>The description of the Terraform tool.</p>
         * 
         * <strong>example:</strong>
         * <p>Terraform Tool description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The destroy policy. After a task is complete, the system applies the following cleanup policy to temporary resources based on the task execution status.</p>
         * <ul>
         * <li><p>NEVER: All created resources are retained, regardless of whether the task succeeds or fails.</p>
         * </li>
         * <li><p>ALWAYS: All related resources are immediately destroyed after the task is complete, regardless of whether the task succeeds or fails.</p>
         * </li>
         * <li><p>ON_FAILURE: Related resources are deleted only if the task fails. If the task succeeds, the resources are retained.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON_FAILURE</p>
         */
        @NameInMap("destroyPolicy")
        public String destroyPolicy;

        /**
         * <p>The name of the Terraform tool.</p>
         * 
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
         * <p>The connection information for the streamable HTTP protocol. This protocol is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://openapi-mcp.cn-hangzhou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp">https://openapi-mcp.cn-hangzhou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp</a></p>
         */
        @NameInMap("mcp")
        public String mcp;

        /**
         * <p>The connection information for the Server-Sent Events (SSE) protocol.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://openapi-mcp.cn-hangzhou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse">https://openapi-mcp.cn-hangzhou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse</a></p>
         */
        @NameInMap("sse")
        public String sse;

        /**
         * <p>The endpoint of the streamable HTTP protocol in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://openapi-mcp-cn.vpc-proxy.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp">https://openapi-mcp-cn.vpc-proxy.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp</a></p>
         */
        @NameInMap("vpcMcp")
        public String vpcMcp;

        /**
         * <p>The endpoint of the SSE protocol in a VPC.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://openapi-mcp-cn.vpc-proxy.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse">https://openapi-mcp-cn.vpc-proxy.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse</a></p>
         */
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
