// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class CreateApiMcpServerRequest extends TeaModel {
    @NameInMap("additionalApiDescriptions")
    public java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptions> additionalApiDescriptions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("apis")
    public java.util.List<CreateApiMcpServerRequestApis> apis;

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
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

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
     * <p>This parameter is required.</p>
     * 
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
    public java.util.List<CreateApiMcpServerRequestPrompts> prompts;

    @NameInMap("publicAccess")
    public String publicAccess;

    @NameInMap("systemTools")
    public java.util.List<String> systemTools;

    @NameInMap("terraformTools")
    public java.util.List<CreateApiMcpServerRequestTerraformTools> terraformTools;

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
        public java.util.List<CreateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> constParameters;

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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-05-26</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        @NameInMap("product")
        public String product;

        /**
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

        /**
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
        @NameInMap("arguments")
        public java.util.List<CreateApiMcpServerRequestPromptsArguments> arguments;

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
         * <p>terraform tool description</p>
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
