// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateTemplateScratchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](~~134212~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the scenario.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution mode. Valid values:</p>
     * <br>
     * <p>*   Async (default)</p>
     * <p>*   Sync</p>
     * <br>
     * <p>> If you have a wide scope of resources, Sync takes longer. If you set ExecutionMode to Sync, we recommend that you specify ClientToken to prevent the execution timeout.</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The policy based on which the logical ID is generated. Valid values:</p>
     * <br>
     * <p>*   LongTypePrefixAndIndexSuffix (default): long-type prefix + index-type suffix</p>
     * <p>*   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</p>
     * <p>*   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The preference parameters of the scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public java.util.List<CreateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    /**
     * <p>The region ID of the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

    /**
     * <p>The tags of the scenario.</p>
     */
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

    public CreateTemplateScratchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The key of the parameter.</p>
         * <br>
         * <p>For information about the valid values of ParameterKey, see the **Additional information about request parameters** section of this topic.</p>
         * <p>> - PreferenceParameters is optional. If you want to specify PreferenceParameters, you must specify ParameterKey and ParameterValue.</p>
         * <p>> -  If you set TemplateScratchType to ResourceImport, you must set ParameterKey to DeletionPolicy.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter. The value of ParameterValue varies based on the value of ParameterKey.</p>
         * <br>
         * <p>For information about the valid values of ParameterValue, see the **Additional information about request parameters** section of this topic.</p>
         * <br>
         * <p>> PreferenceParameters is optional. If you want to specify PreferenceParameters, you must specify ParameterKey and ParameterValue.</p>
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
         * <p>The resource types.</p>
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
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource.</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static CreateTemplateScratchRequestSourceResources build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateScratchRequestSourceResources self = new CreateTemplateScratchRequestSourceResources();
            return TeaModel.build(map, self);
        }

        public CreateTemplateScratchRequestSourceResources setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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
         * <p>The source tags that consist of key-value pairs. If you want to specify only the tag key, you must leave the tag value empty. Example: `{"TagKey": ""}`.</p>
         * <br>
         * <p>You can add up to 10 source tags.</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The resource types.</p>
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
         * <p>The tag key of the scenario.</p>
         * <br>
         * <p>> Tags is optional. If you want to specify Tags, you must specify Key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the scenario.</p>
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
