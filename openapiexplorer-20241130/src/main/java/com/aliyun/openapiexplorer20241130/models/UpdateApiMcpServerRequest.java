// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class UpdateApiMcpServerRequest extends TeaModel {
    @NameInMap("additionalApiDescriptions")
    public java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptions> additionalApiDescriptions;

    @NameInMap("apis")
    public java.util.List<UpdateApiMcpServerRequestApis> apis;

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
     * <strong>example:</strong>
     * <p>403*************370</p>
     */
    @NameInMap("oauthClientId")
    public String oauthClientId;

    @NameInMap("prompts")
    public java.util.List<UpdateApiMcpServerRequestPrompts> prompts;

    @NameInMap("publicAccess")
    public String publicAccess;

    @NameInMap("systemTools")
    public java.util.List<String> systemTools;

    @NameInMap("terraformTools")
    public java.util.List<UpdateApiMcpServerRequestTerraformTools> terraformTools;

    @NameInMap("vpcWhitelists")
    public java.util.List<String> vpcWhitelists;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
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
        public java.util.List<UpdateApiMcpServerRequestAdditionalApiDescriptionsConstParameters> constParameters;

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
        @NameInMap("arguments")
        public java.util.List<UpdateApiMcpServerRequestPromptsArguments> arguments;

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
         * <p>Terraform Tool  description</p>
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
