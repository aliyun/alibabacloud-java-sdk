// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class ListApiMcpServersResponseBody extends TeaModel {
    @NameInMap("apiMcpServers")
    public java.util.List<ListApiMcpServersResponseBodyApiMcpServers> apiMcpServers;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAZjtYxxxxxxxx</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListApiMcpServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiMcpServersResponseBody self = new ListApiMcpServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiMcpServersResponseBody setApiMcpServers(java.util.List<ListApiMcpServersResponseBodyApiMcpServers> apiMcpServers) {
        this.apiMcpServers = apiMcpServers;
        return this;
    }
    public java.util.List<ListApiMcpServersResponseBodyApiMcpServers> getApiMcpServers() {
        return this.apiMcpServers;
    }

    public ListApiMcpServersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApiMcpServersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApiMcpServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApiMcpServersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters extends TeaModel {
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

        public static ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters self = new ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions extends TeaModel {
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
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters> constParameters;

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

        public static ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions self = new ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setApiOverrideJson(String apiOverrideJson) {
            this.apiOverrideJson = apiOverrideJson;
            return this;
        }
        public String getApiOverrideJson() {
            return this.apiOverrideJson;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setConstParameters(java.util.List<ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters> constParameters) {
            this.constParameters = constParameters;
            return this;
        }
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptionsConstParameters> getConstParameters() {
            return this.constParameters;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setEnableOutputSchema(Boolean enableOutputSchema) {
            this.enableOutputSchema = enableOutputSchema;
            return this;
        }
        public Boolean getEnableOutputSchema() {
            return this.enableOutputSchema;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setExecuteCliCommand(Boolean executeCliCommand) {
            this.executeCliCommand = executeCliCommand;
            return this;
        }
        public Boolean getExecuteCliCommand() {
            return this.executeCliCommand;
        }

        public ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersApis extends TeaModel {
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

        public static ListApiMcpServersResponseBodyApiMcpServersApis build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersApis self = new ListApiMcpServersResponseBodyApiMcpServersApis();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersApis setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListApiMcpServersResponseBodyApiMcpServersApis setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListApiMcpServersResponseBodyApiMcpServersApis setSelectors(java.util.List<String> selectors) {
            this.selectors = selectors;
            return this;
        }
        public java.util.List<String> getSelectors() {
            return this.selectors;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersPromptsArguments extends TeaModel {
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

        public static ListApiMcpServersResponseBodyApiMcpServersPromptsArguments build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersPromptsArguments self = new ListApiMcpServersResponseBodyApiMcpServersPromptsArguments();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersPromptsArguments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiMcpServersResponseBodyApiMcpServersPromptsArguments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApiMcpServersResponseBodyApiMcpServersPromptsArguments setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersPrompts extends TeaModel {
        @NameInMap("arguments")
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersPromptsArguments> arguments;

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

        public static ListApiMcpServersResponseBodyApiMcpServersPrompts build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersPrompts self = new ListApiMcpServersResponseBodyApiMcpServersPrompts();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersPrompts setArguments(java.util.List<ListApiMcpServersResponseBodyApiMcpServersPromptsArguments> arguments) {
            this.arguments = arguments;
            return this;
        }
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersPromptsArguments> getArguments() {
            return this.arguments;
        }

        public ListApiMcpServersResponseBodyApiMcpServersPrompts setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListApiMcpServersResponseBodyApiMcpServersPrompts setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiMcpServersResponseBodyApiMcpServersPrompts setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo extends TeaModel {
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

        public static ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo self = new ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersTerraformTools extends TeaModel {
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

        public static ListApiMcpServersResponseBodyApiMcpServersTerraformTools build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersTerraformTools self = new ListApiMcpServersResponseBodyApiMcpServersTerraformTools();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersTerraformTools setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public ListApiMcpServersResponseBodyApiMcpServersTerraformTools setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListApiMcpServersResponseBodyApiMcpServersTerraformTools setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiMcpServersResponseBodyApiMcpServersTerraformTools setDestroyPolicy(String destroyPolicy) {
            this.destroyPolicy = destroyPolicy;
            return this;
        }
        public String getDestroyPolicy() {
            return this.destroyPolicy;
        }

        public ListApiMcpServersResponseBodyApiMcpServersTerraformTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServersUrls extends TeaModel {
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

        public static ListApiMcpServersResponseBodyApiMcpServersUrls build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServersUrls self = new ListApiMcpServersResponseBodyApiMcpServersUrls();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServersUrls setMcp(String mcp) {
            this.mcp = mcp;
            return this;
        }
        public String getMcp() {
            return this.mcp;
        }

        public ListApiMcpServersResponseBodyApiMcpServersUrls setSse(String sse) {
            this.sse = sse;
            return this;
        }
        public String getSse() {
            return this.sse;
        }

        public ListApiMcpServersResponseBodyApiMcpServersUrls setVpcMcp(String vpcMcp) {
            this.vpcMcp = vpcMcp;
            return this;
        }
        public String getVpcMcp() {
            return this.vpcMcp;
        }

        public ListApiMcpServersResponseBodyApiMcpServersUrls setVpcSse(String vpcSse) {
            this.vpcSse = vpcSse;
            return this;
        }
        public String getVpcSse() {
            return this.vpcSse;
        }

    }

    public static class ListApiMcpServersResponseBodyApiMcpServers extends TeaModel {
        @NameInMap("additionalApiDescriptions")
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions> additionalApiDescriptions;

        @NameInMap("apis")
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersApis> apis;

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
         * <p>2024-12-10T03:20:21Z</p>
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
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersPrompts> prompts;

        @NameInMap("publicAccess")
        public String publicAccess;

        /**
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        @NameInMap("systemMcpServerInfo")
        public ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo systemMcpServerInfo;

        @NameInMap("systemTools")
        public java.util.List<String> systemTools;

        @NameInMap("terraformTools")
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersTerraformTools> terraformTools;

        /**
         * <strong>example:</strong>
         * <p>2025-01-10T02:11:43Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        @NameInMap("urls")
        public ListApiMcpServersResponseBodyApiMcpServersUrls urls;

        @NameInMap("vpcWhitelists")
        public java.util.List<String> vpcWhitelists;

        public static ListApiMcpServersResponseBodyApiMcpServers build(java.util.Map<String, ?> map) throws Exception {
            ListApiMcpServersResponseBodyApiMcpServers self = new ListApiMcpServersResponseBodyApiMcpServers();
            return TeaModel.build(map, self);
        }

        public ListApiMcpServersResponseBodyApiMcpServers setAdditionalApiDescriptions(java.util.List<ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions> additionalApiDescriptions) {
            this.additionalApiDescriptions = additionalApiDescriptions;
            return this;
        }
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersAdditionalApiDescriptions> getAdditionalApiDescriptions() {
            return this.additionalApiDescriptions;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setApis(java.util.List<ListApiMcpServersResponseBodyApiMcpServersApis> apis) {
            this.apis = apis;
            return this;
        }
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersApis> getApis() {
            return this.apis;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setAssumeRoleExtraPolicy(String assumeRoleExtraPolicy) {
            this.assumeRoleExtraPolicy = assumeRoleExtraPolicy;
            return this;
        }
        public String getAssumeRoleExtraPolicy() {
            return this.assumeRoleExtraPolicy;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setAssumeRoleName(String assumeRoleName) {
            this.assumeRoleName = assumeRoleName;
            return this;
        }
        public String getAssumeRoleName() {
            return this.assumeRoleName;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setEnableAssumeRole(Boolean enableAssumeRole) {
            this.enableAssumeRole = enableAssumeRole;
            return this;
        }
        public Boolean getEnableAssumeRole() {
            return this.enableAssumeRole;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setEnableCustomVpcWhitelist(Boolean enableCustomVpcWhitelist) {
            this.enableCustomVpcWhitelist = enableCustomVpcWhitelist;
            return this;
        }
        public Boolean getEnableCustomVpcWhitelist() {
            return this.enableCustomVpcWhitelist;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setInstructions(String instructions) {
            this.instructions = instructions;
            return this;
        }
        public String getInstructions() {
            return this.instructions;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setOauthClientId(String oauthClientId) {
            this.oauthClientId = oauthClientId;
            return this;
        }
        public String getOauthClientId() {
            return this.oauthClientId;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setPrompts(java.util.List<ListApiMcpServersResponseBodyApiMcpServersPrompts> prompts) {
            this.prompts = prompts;
            return this;
        }
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersPrompts> getPrompts() {
            return this.prompts;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setPublicAccess(String publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }
        public String getPublicAccess() {
            return this.publicAccess;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setSystemMcpServerInfo(ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo systemMcpServerInfo) {
            this.systemMcpServerInfo = systemMcpServerInfo;
            return this;
        }
        public ListApiMcpServersResponseBodyApiMcpServersSystemMcpServerInfo getSystemMcpServerInfo() {
            return this.systemMcpServerInfo;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setSystemTools(java.util.List<String> systemTools) {
            this.systemTools = systemTools;
            return this;
        }
        public java.util.List<String> getSystemTools() {
            return this.systemTools;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setTerraformTools(java.util.List<ListApiMcpServersResponseBodyApiMcpServersTerraformTools> terraformTools) {
            this.terraformTools = terraformTools;
            return this;
        }
        public java.util.List<ListApiMcpServersResponseBodyApiMcpServersTerraformTools> getTerraformTools() {
            return this.terraformTools;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setUrls(ListApiMcpServersResponseBodyApiMcpServersUrls urls) {
            this.urls = urls;
            return this;
        }
        public ListApiMcpServersResponseBodyApiMcpServersUrls getUrls() {
            return this.urls;
        }

        public ListApiMcpServersResponseBodyApiMcpServers setVpcWhitelists(java.util.List<String> vpcWhitelists) {
            this.vpcWhitelists = vpcWhitelists;
            return this;
        }
        public java.util.List<String> getVpcWhitelists() {
            return this.vpcWhitelists;
        }

    }

}
