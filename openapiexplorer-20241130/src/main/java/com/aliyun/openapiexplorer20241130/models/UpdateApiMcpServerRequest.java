// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerRequest extends TeaModel {
    /**
     * <p>A list of supplementary API descriptions.</p>
     */
    @NameInMap("additionalApiDescriptions")
    public java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptions> additionalApiDescriptions;

    /**
     * <p>The list of APIs to modify.</p>
     */
    @NameInMap("apis")
    public java.util.List<UpdateApiMcpServerRequestApis> apis;

    /**
     * <p>An additional policy for role assumption when multi-account access is enabled. If this policy exists, the permissions for the role assumption are based on this policy, which overwrites the permissions defined for the role itself.</p>
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
     * <p>The name of the RAM role in the destination account that is assumed for cross-account operations when multi-account access is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("assumeRoleName")
    public String assumeRoleName;

    /**
     * <p>The description of the API MCP server.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个API MCP服务器。</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to enable multi-account access.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAssumeRole")
    public Boolean enableAssumeRole;

    /**
     * <p>Specifies whether to enable a custom VPC whitelist. If this is disabled, the account-level configuration is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableCustomVpcWhitelist")
    public Boolean enableCustomVpcWhitelist;

    /**
     * <p>The MCP instruction. It prompts the large language model on how to use this MCP. The client must support the Instructions field of the standard MCP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("instructions")
    public String instructions;

    /**
     * <p>The language of the API documentation for the API MCP service. You can select Chinese or English. Different language prompts may affect the AI\&quot;s response.</p>
     * 
     * <strong>example:</strong>
     * <p>ZH_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The custom OAuth client ID to use when you select a custom OAuth configuration.</p>
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
    public java.util.List<UpdateApiMcpServerRequestPrompts> prompts;

    /**
     * <p>Specifies whether to enable public network access.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("publicAccess")
    public String publicAccess;

    /**
     * <p>A list of system tools.</p>
     */
    @NameInMap("systemTools")
    public java.util.List<String> systemTools;

    /**
     * <p>A list of Terraform tools.</p>
     */
    @NameInMap("terraformTools")
    public java.util.List<UpdateApiMcpServerRequestTerraformTools> terraformTools;

    /**
     * <p>The VPC whitelist that specifies the allowed source VPCs after public network access is disabled. If you do not set this parameter or leave it empty, access from all sources is allowed.</p>
     */
    @NameInMap("vpcWhitelists")
    public java.util.List<String> vpcWhitelists;

    /**
     * <p>A client token that you can use to ensure the idempotence of the request. Generate a unique value from your client. The token can contain only ASCII characters and must be no more than 64 characters long. We recommend that you use a UUID. The token is valid for three days.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The ID of the API MCP service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    public static UpdateApiMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiMcpServerRequest self = new UpdateApiMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApiMcpServerRequest setAdditionalApiDescriptions(java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptions> additionalApiDescriptions) {
        this.additionalApiDescriptions = additionalApiDescriptions;
        return this;
    }
    public java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptions> getAdditionalApiDescriptions() {
        return this.additionalApiDescriptions;
    }

    public UpdateApiMcpServerRequest setApis(java.util.List<UpdateApiMcpServerRequestApis> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<UpdateApiMcpServerRequestApis> getApis() {
        return this.apis;
    }

    public UpdateApiMcpServerRequest setAssumeRoleExtraPolicy(String assumeRoleExtraPolicy) {
        this.assumeRoleExtraPolicy = assumeRoleExtraPolicy;
        return this;
    }
    public String getAssumeRoleExtraPolicy() {
        return this.assumeRoleExtraPolicy;
    }

    public UpdateApiMcpServerRequest setAssumeRoleName(String assumeRoleName) {
        this.assumeRoleName = assumeRoleName;
        return this;
    }
    public String getAssumeRoleName() {
        return this.assumeRoleName;
    }

    public UpdateApiMcpServerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateApiMcpServerRequest setEnableAssumeRole(Boolean enableAssumeRole) {
        this.enableAssumeRole = enableAssumeRole;
        return this;
    }
    public Boolean getEnableAssumeRole() {
        return this.enableAssumeRole;
    }

    public UpdateApiMcpServerRequest setEnableCustomVpcWhitelist(Boolean enableCustomVpcWhitelist) {
        this.enableCustomVpcWhitelist = enableCustomVpcWhitelist;
        return this;
    }
    public Boolean getEnableCustomVpcWhitelist() {
        return this.enableCustomVpcWhitelist;
    }

    public UpdateApiMcpServerRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public UpdateApiMcpServerRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateApiMcpServerRequest setOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
        return this;
    }
    public String getOauthClientId() {
        return this.oauthClientId;
    }

    public UpdateApiMcpServerRequest setPrompts(java.util.List<UpdateApiMcpServerRequestPrompts> prompts) {
        this.prompts = prompts;
        return this;
    }
    public java.util.List<UpdateApiMcpServerRequestPrompts> getPrompts() {
        return this.prompts;
    }

    public UpdateApiMcpServerRequest setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public String getPublicAccess() {
        return this.publicAccess;
    }

    public UpdateApiMcpServerRequest setSystemTools(java.util.List<String> systemTools) {
        this.systemTools = systemTools;
        return this;
    }
    public java.util.List<String> getSystemTools() {
        return this.systemTools;
    }

    public UpdateApiMcpServerRequest setTerraformTools(java.util.List<UpdateApiMcpServerRequestTerraformTools> terraformTools) {
        this.terraformTools = terraformTools;
        return this;
    }
    public java.util.List<UpdateApiMcpServerRequestTerraformTools> getTerraformTools() {
        return this.terraformTools;
    }

    public UpdateApiMcpServerRequest setVpcWhitelists(java.util.List<String> vpcWhitelists) {
        this.vpcWhitelists = vpcWhitelists;
        return this;
    }
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

    public UpdateApiMcpServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateApiMcpServerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public static class UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters extends TeaModel {
        /**
         * <p>The parameter name. Only first-level parameter names are supported. For ROA-style APIs, you can set parameters such as body.xx. You cannot set values for parameters beyond the top level.</p>
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

        public static UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters self = new UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters();
            return TeaModel.build(map, self);
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class UpdateApiMcpServerRequestAdditionalApiDescriptions extends TeaModel {
        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The API metadata in JSON format. For more information about the format, see https\://api.aliyun.com/meta/v1/products/Ecs/versions/2014-05-26/apis/DescribeInstances/api.json. You can overwrite the summary and parameters fields.</p>
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
        public java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> constParameters;

        /**
         * <p>Specifies whether to return the schema of the response parameters. Returning the response parameter schema increases the overall size of the API MCP server. The default value is null, which means the response parameter schema is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOutputSchema")
        public Boolean enableOutputSchema;

        /**
         * <p>Specifies whether to return the command-line interface (CLI) command for execution. In this mode, the API call is not actually executed. Instead, the corresponding CLI command is returned. This is suitable for long-running tasks that need to be executed using Alibaba Cloud CLI.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("executeCliCommand")
        public Boolean executeCliCommand;

        /**
         * <p>The product code.</p>
         * <ul>
         * <li><p>Call the GetRequestLog operation to obtain the product code from the response.</p>
         * </li>
         * <li><p>Find the product code from the URL of the product in OpenAPI Explorer. For example, the URL for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code is \<code>Dysmsapi\\</code>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        public static UpdateApiMcpServerRequestAdditionalApiDescriptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiMcpServerRequestAdditionalApiDescriptions self = new UpdateApiMcpServerRequestAdditionalApiDescriptions();
            return TeaModel.build(map, self);
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setApiOverrideJson(String apiOverrideJson) {
            this.apiOverrideJson = apiOverrideJson;
            return this;
        }
        public String getApiOverrideJson() {
            return this.apiOverrideJson;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setConstParameters(java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> constParameters) {
            this.constParameters = constParameters;
            return this;
        }
        public java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> getConstParameters() {
            return this.constParameters;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setEnableOutputSchema(Boolean enableOutputSchema) {
            this.enableOutputSchema = enableOutputSchema;
            return this;
        }
        public Boolean getEnableOutputSchema() {
            return this.enableOutputSchema;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setExecuteCliCommand(Boolean executeCliCommand) {
            this.executeCliCommand = executeCliCommand;
            return this;
        }
        public Boolean getExecuteCliCommand() {
            return this.executeCliCommand;
        }

        public UpdateApiMcpServerRequestAdditionalApiDescriptions setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class UpdateApiMcpServerRequestApis extends TeaModel {
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
         * <li><p>Call the GetRequestLog operation to obtain the product code from the response.</p>
         * </li>
         * <li><p>Find the product code from the URL of the product in OpenAPI Explorer. For example, the URL for Short Message Service is https\://api.alibabacloud.com/product/Dysmsapi. The product code is \<code>Dysmsapi\\</code>.</p>
         * </li>
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

        public static UpdateApiMcpServerRequestApis build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiMcpServerRequestApis self = new UpdateApiMcpServerRequestApis();
            return TeaModel.build(map, self);
        }

        public UpdateApiMcpServerRequestApis setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public UpdateApiMcpServerRequestApis setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public UpdateApiMcpServerRequestApis setSelectors(java.util.List<String> selectors) {
            this.selectors = selectors;
            return this;
        }
        public java.util.List<String> getSelectors() {
            return this.selectors;
        }

    }

    public static class UpdateApiMcpServerRequestPromptsArguments extends TeaModel {
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
         * <p>Specifies whether the parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        public static UpdateApiMcpServerRequestPromptsArguments build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiMcpServerRequestPromptsArguments self = new UpdateApiMcpServerRequestPromptsArguments();
            return TeaModel.build(map, self);
        }

        public UpdateApiMcpServerRequestPromptsArguments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApiMcpServerRequestPromptsArguments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApiMcpServerRequestPromptsArguments setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class UpdateApiMcpServerRequestPrompts extends TeaModel {
        /**
         * <p>A list of parameters that the prompt supports.</p>
         */
        @NameInMap("arguments")
        public java.util.List<UpdateApiMcpServerRequestPromptsArguments> arguments;

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

        public static UpdateApiMcpServerRequestPrompts build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiMcpServerRequestPrompts self = new UpdateApiMcpServerRequestPrompts();
            return TeaModel.build(map, self);
        }

        public UpdateApiMcpServerRequestPrompts setArguments(java.util.List<UpdateApiMcpServerRequestPromptsArguments> arguments) {
            this.arguments = arguments;
            return this;
        }
        public java.util.List<UpdateApiMcpServerRequestPromptsArguments> getArguments() {
            return this.arguments;
        }

        public UpdateApiMcpServerRequestPrompts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateApiMcpServerRequestPrompts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApiMcpServerRequestPrompts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateApiMcpServerRequestTerraformTools extends TeaModel {
        /**
         * <p>Specifies whether to execute the task asynchronously. If this is enabled, the system immediately proceeds to the next task after it initiates a task execution, without waiting for each resource operation to complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("async")
        public Boolean async;

        /**
         * <p>The Terraform tool code. For more information, see <a href="https://www.alibabacloud.com/help/en/terraform/latest/hcl-language-overview">HCL language overview</a>.</p>
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
         * <p>Terraform Tool  description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The deletion policy. After a task is executed, the system applies one of the following cleanup policies to the temporary resources based on the task execution status.</p>
         * <ul>
         * <li><p>NEVER: Does not delete any created resources, regardless of whether the task succeeds or fails.</p>
         * </li>
         * <li><p>ALWAYS: Immediately destroys all related resources after execution, regardless of whether the task succeeds or fails.</p>
         * </li>
         * <li><p>ON_FAILURE: Deletes related resources only if the task fails. If the task succeeds, the resources are retained.</p>
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

        public static UpdateApiMcpServerRequestTerraformTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateApiMcpServerRequestTerraformTools self = new UpdateApiMcpServerRequestTerraformTools();
            return TeaModel.build(map, self);
        }

        public UpdateApiMcpServerRequestTerraformTools setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public UpdateApiMcpServerRequestTerraformTools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public UpdateApiMcpServerRequestTerraformTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApiMcpServerRequestTerraformTools setDestroyPolicy(String destroyPolicy) {
            this.destroyPolicy = destroyPolicy;
            return this;
        }
        public String getDestroyPolicy() {
            return this.destroyPolicy;
        }

        public UpdateApiMcpServerRequestTerraformTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
