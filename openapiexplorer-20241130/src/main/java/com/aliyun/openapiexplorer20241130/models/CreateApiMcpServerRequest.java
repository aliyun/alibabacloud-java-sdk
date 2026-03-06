// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class CreateApiMcpServerRequest extends TeaModel {
    /**
     * <p>The list of supplementary API descriptions.</p>
     */
    @NameInMap("additionalApiDescriptions")
    public java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptions> additionalApiDescriptions;

    /**
     * <p>The list of APIs to add. This parameter cannot be empty.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("apis")
    public java.util.List<CreateApiMcpServerRequestApis> apis;

    /**
     * <p>An additional policy for role assumption when multi-account access is enabled. If this policy exists, the permissions for role assumption are based on this policy, which overwrites the permissions defined for the role itself.</p>
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
     * <p>Ensures the idempotence of the request. Generate a parameter value from your client to make sure that the value is unique among different requests. The client token can contain only ASCII characters and cannot exceed 64 characters in length. Use a universally unique identifier (UUID). The token expires in three days.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The description of the API MCP service.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一个API MCP服务。</p>
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
     * <p>Specifies whether to enable a custom VPC whitelist. If not enabled, the account-level configuration is used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableCustomVpcWhitelist")
    public Boolean enableCustomVpcWhitelist;

    /**
     * <p>The MCP instruction. It prompts the large language model on how to use the MCP. The client must support the Instructions field of the standard MCP protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("instructions")
    public String instructions;

    /**
     * <p>The language of the API documentation for the API MCP service. You can select Chinese or English API documentation. The prompts in different languages may affect the AI\&quot;s response.</p>
     * 
     * <strong>example:</strong>
     * <p>ZH_CN</p>
     */
    @NameInMap("language")
    public String language;

    /**
     * <p>The name of the MCP server. The name must be 3 to 64 characters in length and can contain only lowercase letters, digits, underscores (_), and hyphens (-). It cannot start with a digit. The name must be unique within the same Alibaba Cloud account.</p>
     * <p>This parameter is required.</p>
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
     * <p>The list of prompt configurations.</p>
     */
    @NameInMap("prompts")
    public java.util.List<CreateApiMcpServerRequestPrompts> prompts;

    /**
     * <p>Specifies whether to enable public network access.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("publicAccess")
    public String publicAccess;

    /**
     * <p>The list of system tools.</p>
     */
    @NameInMap("systemTools")
    public java.util.List<String> systemTools;

    /**
     * <p>The list of Terraform tools.</p>
     */
    @NameInMap("terraformTools")
    public java.util.List<CreateApiMcpServerRequestTerraformTools> terraformTools;

    /**
     * <p>The VPC whitelist that restricts the source of access after public network access is disabled. If you do not set this parameter or leave it empty, the source is not restricted.</p>
     */
    @NameInMap("vpcWhitelists")
    public java.util.List<String> vpcWhitelists;

    public static CreateApiMcpServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiMcpServerRequest self = new CreateApiMcpServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiMcpServerRequest setAdditionalApiDescriptions(java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptions> additionalApiDescriptions) {
        this.additionalApiDescriptions = additionalApiDescriptions;
        return this;
    }
    public java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptions> getAdditionalApiDescriptions() {
        return this.additionalApiDescriptions;
    }

    public CreateApiMcpServerRequest setApis(java.util.List<CreateApiMcpServerRequestApis> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<CreateApiMcpServerRequestApis> getApis() {
        return this.apis;
    }

    public CreateApiMcpServerRequest setAssumeRoleExtraPolicy(String assumeRoleExtraPolicy) {
        this.assumeRoleExtraPolicy = assumeRoleExtraPolicy;
        return this;
    }
    public String getAssumeRoleExtraPolicy() {
        return this.assumeRoleExtraPolicy;
    }

    public CreateApiMcpServerRequest setAssumeRoleName(String assumeRoleName) {
        this.assumeRoleName = assumeRoleName;
        return this;
    }
    public String getAssumeRoleName() {
        return this.assumeRoleName;
    }

    public CreateApiMcpServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApiMcpServerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApiMcpServerRequest setEnableAssumeRole(Boolean enableAssumeRole) {
        this.enableAssumeRole = enableAssumeRole;
        return this;
    }
    public Boolean getEnableAssumeRole() {
        return this.enableAssumeRole;
    }

    public CreateApiMcpServerRequest setEnableCustomVpcWhitelist(Boolean enableCustomVpcWhitelist) {
        this.enableCustomVpcWhitelist = enableCustomVpcWhitelist;
        return this;
    }
    public Boolean getEnableCustomVpcWhitelist() {
        return this.enableCustomVpcWhitelist;
    }

    public CreateApiMcpServerRequest setInstructions(String instructions) {
        this.instructions = instructions;
        return this;
    }
    public String getInstructions() {
        return this.instructions;
    }

    public CreateApiMcpServerRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateApiMcpServerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApiMcpServerRequest setOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
        return this;
    }
    public String getOauthClientId() {
        return this.oauthClientId;
    }

    public CreateApiMcpServerRequest setPrompts(java.util.List<CreateApiMcpServerRequestPrompts> prompts) {
        this.prompts = prompts;
        return this;
    }
    public java.util.List<CreateApiMcpServerRequestPrompts> getPrompts() {
        return this.prompts;
    }

    public CreateApiMcpServerRequest setPublicAccess(String publicAccess) {
        this.publicAccess = publicAccess;
        return this;
    }
    public String getPublicAccess() {
        return this.publicAccess;
    }

    public CreateApiMcpServerRequest setSystemTools(java.util.List<String> systemTools) {
        this.systemTools = systemTools;
        return this;
    }
    public java.util.List<String> getSystemTools() {
        return this.systemTools;
    }

    public CreateApiMcpServerRequest setTerraformTools(java.util.List<CreateApiMcpServerRequestTerraformTools> terraformTools) {
        this.terraformTools = terraformTools;
        return this;
    }
    public java.util.List<CreateApiMcpServerRequestTerraformTools> getTerraformTools() {
        return this.terraformTools;
    }

    public CreateApiMcpServerRequest setVpcWhitelists(java.util.List<String> vpcWhitelists) {
        this.vpcWhitelists = vpcWhitelists;
        return this;
    }
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

    public static class CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters extends TeaModel {
        /**
         * <p>The parameter name. Only first-level parameter names are supported. For ROA-style APIs, you can set the parameter to body.xx. You cannot set values that exceed the top-level parameters.</p>
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

        public static CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters self = new CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class CreateApiMcpServerRequestAdditionalApiDescriptions extends TeaModel {
        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>DescribeRegions</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The API metadata in JSON format. For more information about the format, see https\://api.aliyun.com/meta/v1/products/Ecs/versions/2014-05-26/apis/DescribeInstances/api.json. You can overwrite the summary and parameters.</p>
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
         * <p>The list of constant input parameters. These parameters are not included in the output during API parameter parsing.</p>
         */
        @NameInMap("constParameters")
        public java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> constParameters;

        /**
         * <p>Specifies whether to return the schema of the response parameters. Returning the schema increases the size of the entire API MCP server. The default value is null, which means the schema is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableOutputSchema")
        public Boolean enableOutputSchema;

        /**
         * <p>Specifies whether to return the command-line interface (CLI) command for execution. In this mode, the API call is not executed. Instead, the corresponding CLI command is returned. This is suitable for long-running tasks that need to be executed using Alibaba Cloud CLI.</p>
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
         * <li><p>Find the product code from the URL of the product in OpenAPI Portal. For example, the URL of Short Message Service in OpenAPI Portal is https\://api.alibabacloud.com/product/Dysmsapi. The product code is Dysmsapi.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        public static CreateApiMcpServerRequestAdditionalApiDescriptions build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerRequestAdditionalApiDescriptions self = new CreateApiMcpServerRequestAdditionalApiDescriptions();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setApiOverrideJson(String apiOverrideJson) {
            this.apiOverrideJson = apiOverrideJson;
            return this;
        }
        public String getApiOverrideJson() {
            return this.apiOverrideJson;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setConstParameters(java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> constParameters) {
            this.constParameters = constParameters;
            return this;
        }
        public java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> getConstParameters() {
            return this.constParameters;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setEnableOutputSchema(Boolean enableOutputSchema) {
            this.enableOutputSchema = enableOutputSchema;
            return this;
        }
        public Boolean getEnableOutputSchema() {
            return this.enableOutputSchema;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setExecuteCliCommand(Boolean executeCliCommand) {
            this.executeCliCommand = executeCliCommand;
            return this;
        }
        public Boolean getExecuteCliCommand() {
            return this.executeCliCommand;
        }

        public CreateApiMcpServerRequestAdditionalApiDescriptions setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class CreateApiMcpServerRequestApis extends TeaModel {
        /**
         * <p>The POP version of the API that is exposed to the MCP server.</p>
         * <p>This parameter is required.</p>
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
         * <li><p>Find the product code from the URL of the product in OpenAPI Portal. For example, the URL of Short Message Service in OpenAPI Portal is https\://api.alibabacloud.com/product/Dysmsapi. The product code is Dysmsapi.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The list of API name matching rules. This parameter cannot be empty.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("selectors")
        public java.util.List<String> selectors;

        public static CreateApiMcpServerRequestApis build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerRequestApis self = new CreateApiMcpServerRequestApis();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerRequestApis setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public CreateApiMcpServerRequestApis setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public CreateApiMcpServerRequestApis setSelectors(java.util.List<String> selectors) {
            this.selectors = selectors;
            return this;
        }
        public java.util.List<String> getSelectors() {
            return this.selectors;
        }

    }

    public static class CreateApiMcpServerRequestPromptsArguments extends TeaModel {
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

        public static CreateApiMcpServerRequestPromptsArguments build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerRequestPromptsArguments self = new CreateApiMcpServerRequestPromptsArguments();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerRequestPromptsArguments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApiMcpServerRequestPromptsArguments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApiMcpServerRequestPromptsArguments setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class CreateApiMcpServerRequestPrompts extends TeaModel {
        /**
         * <p>The list of parameters supported by the prompt.</p>
         */
        @NameInMap("arguments")
        public java.util.List<CreateApiMcpServerRequestPromptsArguments> arguments;

        /**
         * <p>The content of the prompt. Variables are specified in the {{xxx}} format. xxx is a variable that must be defined in the arguments parameter.</p>
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

        public static CreateApiMcpServerRequestPrompts build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerRequestPrompts self = new CreateApiMcpServerRequestPrompts();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerRequestPrompts setArguments(java.util.List<CreateApiMcpServerRequestPromptsArguments> arguments) {
            this.arguments = arguments;
            return this;
        }
        public java.util.List<CreateApiMcpServerRequestPromptsArguments> getArguments() {
            return this.arguments;
        }

        public CreateApiMcpServerRequestPrompts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateApiMcpServerRequestPrompts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApiMcpServerRequestPrompts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateApiMcpServerRequestTerraformTools extends TeaModel {
        /**
         * <p>Specifies whether to execute the task asynchronously. If set to true, the system immediately proceeds to the next task after initiating a task execution, without waiting for each resource operation to complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("async")
        public Boolean async;

        /**
         * <p>The code of the Terraform tool. For more information, see <a href="https://www.alibabacloud.com/help/en/terraform/terraform-configuration-and-hcl-language-overview">HCL language overview</a>.</p>
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
         * <p>terraform tool description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The deletion policy. After a task is executed, the system applies the following cleanup policy to temporary resources based on the task execution status.</p>
         * <ul>
         * <li><p>NEVER: Does not delete any created resources, regardless of whether the task execution succeeds or fails.</p>
         * </li>
         * <li><p>ALWAYS: Immediately destroys all related resources after the task is executed, regardless of whether the execution succeeds or fails.</p>
         * </li>
         * <li><p>ON_FAILURE: Deletes related resources only when the task execution fails. If the task execution succeeds, the resources are retained.</p>
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

        public static CreateApiMcpServerRequestTerraformTools build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerRequestTerraformTools self = new CreateApiMcpServerRequestTerraformTools();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerRequestTerraformTools setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public CreateApiMcpServerRequestTerraformTools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateApiMcpServerRequestTerraformTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApiMcpServerRequestTerraformTools setDestroyPolicy(String destroyPolicy) {
            this.destroyPolicy = destroyPolicy;
            return this;
        }
        public String getDestroyPolicy() {
            return this.destroyPolicy;
        }

        public CreateApiMcpServerRequestTerraformTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
