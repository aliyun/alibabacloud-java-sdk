// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateScratchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
     * <br>
     * <p>For more information, see [Ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the scenario.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution mode. Default value: Async. Valid values:</p>
     * <br>
     * <p>*   Async: asynchronous mode</p>
     * <p>*   Sync: synchronous mode</p>
     * <br>
     * <p>>  If a wide scope of resources exist, the synchronous mode takes a longer period of time than the asynchronous mode. If you set the ExecutionMode parameter to Sync, we recommend that you configure the ClientToken parameter to prevent a timeout error.</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The policy based on which the logical ID is generated. Default value: LongTypePrefixAndIndexSuffix. Valid values:</p>
     * <br>
     * <p>*   LongTypePrefixAndIndexSuffix: long-type prefix + index-type suffix</p>
     * <p>*   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</p>
     * <p>*   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The parameters that you want to configure for the scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public java.util.List<CreateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    /**
     * <p>The ID of the region in which you want to create the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source resource group.</p>
     */
    @NameInMap("SourceResourceGroup")
    public CreateTemplateScratchRequestSourceResourceGroup sourceResourceGroup;

    /**
     * <p>The source resources.</p>
     */
    @NameInMap("SourceResources")
    public java.util.List<CreateTemplateScratchRequestSourceResources> sourceResources;

    /**
     * <p>The source tag.</p>
     */
    @NameInMap("SourceTag")
    public CreateTemplateScratchRequestSourceTag sourceTag;

    @NameInMap("Tags")
    public java.util.List<CreateTemplateScratchRequestTags> tags;

    /**
     * <p>The type of the scenario. Valid values:</p>
     * <br>
     * <p>*   ResourceImport: resource management</p>
     * <p>*   ArchitectureReplication: resource replication</p>
     * <p>*   ResourceMigration: resource migration</p>
     */
    @NameInMap("TemplateScratchType")
    public String templateScratchType;

    public static CreateTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateScratchRequest self = new CreateTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateScratchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTemplateScratchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTemplateScratchRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public CreateTemplateScratchRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public CreateTemplateScratchRequest setPreferenceParameters(java.util.List<CreateTemplateScratchRequestPreferenceParameters> preferenceParameters) {
        this.preferenceParameters = preferenceParameters;
        return this;
    }
    public java.util.List<CreateTemplateScratchRequestPreferenceParameters> getPreferenceParameters() {
        return this.preferenceParameters;
    }

    public CreateTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTemplateScratchRequest setSourceResourceGroup(CreateTemplateScratchRequestSourceResourceGroup sourceResourceGroup) {
        this.sourceResourceGroup = sourceResourceGroup;
        return this;
    }
    public CreateTemplateScratchRequestSourceResourceGroup getSourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    public CreateTemplateScratchRequest setSourceResources(java.util.List<CreateTemplateScratchRequestSourceResources> sourceResources) {
        this.sourceResources = sourceResources;
        return this;
    }
    public java.util.List<CreateTemplateScratchRequestSourceResources> getSourceResources() {
        return this.sourceResources;
    }

    public CreateTemplateScratchRequest setSourceTag(CreateTemplateScratchRequestSourceTag sourceTag) {
        this.sourceTag = sourceTag;
        return this;
    }
    public CreateTemplateScratchRequestSourceTag getSourceTag() {
        return this.sourceTag;
    }

    public CreateTemplateScratchRequest setTags(java.util.List<CreateTemplateScratchRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTemplateScratchRequestTags> getTags() {
        return this.tags;
    }

    public CreateTemplateScratchRequest setTemplateScratchType(String templateScratchType) {
        this.templateScratchType = templateScratchType;
        return this;
    }
    public String getTemplateScratchType() {
        return this.templateScratchType;
    }

    public static class CreateTemplateScratchRequestPreferenceParameters extends TeaModel {
        /**
         * <p>The name of the parameter.</p>
         * <br>
         * <p>For more information about the valid values of the ParameterKey parameter, see the "**Additional information about request parameters**" section of this topic.</p>
         * <br>
         * <p>> </p>
         * <p>*   The PreferenceParameters parameter is optional. If you want to specify the PreferenceParameters parameter, you must specify both the ParameterKey and ParameterValue parameters.</p>
         * <p>*   If you set the TemplateScratchType parameter to ResourceImport, you must set the ParameterKey parameter to DeletionPolicy.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter. The value of the ParameterValue parameter varies based on the value of the ParameterKey parameter.</p>
         * <br>
         * <p>For more information about the valid values of the ParameterValue parameter, see the "**Additional information about request parameters**" section of this topic.</p>
         * <br>
         * <p>>  The PreferenceParameters parameter is optional. If you want to specify the PreferenceParameters parameter, you must specify both the ParameterKey and ParameterValue parameters.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static CreateTemplateScratchRequestPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestPreferenceParameters self = new CreateTemplateScratchRequestPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public CreateTemplateScratchRequestPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class CreateTemplateScratchRequestSourceResourceGroup extends TeaModel {
        /**
         * <p>The ID of the source resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The filter for resource types. If you specify this parameter, only the resources of the specified types and in the specified resource groups are scanned. If you do not specify this parameter, all resources in the specified resource groups are scanned.</p>
         * <br>
         * <p>You can specify up to 20 resource types.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static CreateTemplateScratchRequestSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceResourceGroup self = new CreateTemplateScratchRequestSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateTemplateScratchRequestSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class CreateTemplateScratchRequestSourceResources extends TeaModel {
        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateTemplateScratchRequestSourceResources build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceResources self = new CreateTemplateScratchRequestSourceResources();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateTemplateScratchRequestSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class CreateTemplateScratchRequestSourceTag extends TeaModel {
        /**
         * <p>The source tags that consist of key-value pairs.</p>
         * <br>
         * <p>If you want to specify only the tag key, you must leave the tag value empty. Example: `{"TagKey": ""}`.</p>
         * <br>
         * <p>You can add up to 10 source tags.</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The filter for resource types. If you specify this parameter, only the resources of the specified types and have the specified tags are scanned. If you do not specify this parameter, all resources that have the specified tags are scanned.</p>
         * <br>
         * <p>You can specify up to 20 resource types.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static CreateTemplateScratchRequestSourceTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceTag self = new CreateTemplateScratchRequestSourceTag();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public CreateTemplateScratchRequestSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class CreateTemplateScratchRequestTags extends TeaModel {
        /**
         * <p>The key of tag N that you want to add to the scenario.</p>
         * <br>
         * <p>>  The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that you want to add to the scenario.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTemplateScratchRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestTags self = new CreateTemplateScratchRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTemplateScratchRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
