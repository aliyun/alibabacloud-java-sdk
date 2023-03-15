// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among the different requests. The token can be up to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).</p>
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
     * <p>The execution mode. Default value: Async. Valid values:</p>
     * <br>
     * <p>*   Async: asynchronous mode</p>
     * <p>*   Sync: synchronous mode</p>
     * <br>
     * <p>>  If you have a wide scope of resources, Sync takes longer. If you set ExecutionMode to Sync, we recommend that you set ClientToken to prevent the execution from timing out.</p>
     */
    @NameInMap("ExecutionMode")
    public String executionMode;

    /**
     * <p>The generation policy of the logical ID. Default value: LongTypePrefixAndIndexSuffix. Valid values:</p>
     * <br>
     * <p>*   LongTypePrefixAndIndexSuffix: long-type prefix + index-type suffix</p>
     * <p>*   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</p>
     * <p>*   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The parameters that are configured in the scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    /**
     * <p>The ID of the region in which the scenario is created.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source resource group.</p>
     */
    @NameInMap("SourceResourceGroup")
    public UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup;

    /**
     * <p>The source resource.</p>
     */
    @NameInMap("SourceResources")
    public java.util.List<UpdateTemplateScratchRequestSourceResources> sourceResources;

    /**
     * <p>The source tag.</p>
     */
    @NameInMap("SourceTag")
    public UpdateTemplateScratchRequestSourceTag sourceTag;

    /**
     * <p>The ID of the scenario.</p>
     */
    @NameInMap("TemplateScratchId")
    public String templateScratchId;

    public static UpdateTemplateScratchRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateScratchRequest self = new UpdateTemplateScratchRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateScratchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTemplateScratchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTemplateScratchRequest setExecutionMode(String executionMode) {
        this.executionMode = executionMode;
        return this;
    }
    public String getExecutionMode() {
        return this.executionMode;
    }

    public UpdateTemplateScratchRequest setLogicalIdStrategy(String logicalIdStrategy) {
        this.logicalIdStrategy = logicalIdStrategy;
        return this;
    }
    public String getLogicalIdStrategy() {
        return this.logicalIdStrategy;
    }

    public UpdateTemplateScratchRequest setPreferenceParameters(java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters) {
        this.preferenceParameters = preferenceParameters;
        return this;
    }
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> getPreferenceParameters() {
        return this.preferenceParameters;
    }

    public UpdateTemplateScratchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateScratchRequest setSourceResourceGroup(UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup) {
        this.sourceResourceGroup = sourceResourceGroup;
        return this;
    }
    public UpdateTemplateScratchRequestSourceResourceGroup getSourceResourceGroup() {
        return this.sourceResourceGroup;
    }

    public UpdateTemplateScratchRequest setSourceResources(java.util.List<UpdateTemplateScratchRequestSourceResources> sourceResources) {
        this.sourceResources = sourceResources;
        return this;
    }
    public java.util.List<UpdateTemplateScratchRequestSourceResources> getSourceResources() {
        return this.sourceResources;
    }

    public UpdateTemplateScratchRequest setSourceTag(UpdateTemplateScratchRequestSourceTag sourceTag) {
        this.sourceTag = sourceTag;
        return this;
    }
    public UpdateTemplateScratchRequestSourceTag getSourceTag() {
        return this.sourceTag;
    }

    public UpdateTemplateScratchRequest setTemplateScratchId(String templateScratchId) {
        this.templateScratchId = templateScratchId;
        return this;
    }
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static class UpdateTemplateScratchRequestPreferenceParameters extends TeaModel {
        /**
         * <p>The name of a request parameter.</p>
         * <br>
         * <p>For more information about ParameterKey, see **Additional description of request parameters**.</p>
         * <br>
         * <p>> </p>
         * <p>*   PreferenceParameters is optional. If you set PreferenceParameters, you must specify both ParameterKey and ParameterValue.</p>
         * <p>*   If you set TemplateScratchType to ResourceImport, you must set ParameterKey to DeletionPolicy.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of a request parameter. The value of ParameterValue varies based on the value of ParameterKey.</p>
         * <br>
         * <p>For more information about ParameterValue, see **Additional description of request parameters**.</p>
         * <br>
         * <p>>  PreferenceParameters is optional. If you set PreferenceParameters, you must specify both ParameterKey and ParameterValue.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static UpdateTemplateScratchRequestPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestPreferenceParameters self = new UpdateTemplateScratchRequestPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public UpdateTemplateScratchRequestPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class UpdateTemplateScratchRequestSourceResourceGroup extends TeaModel {
        /**
         * <p>The ID of the source resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The filter for resource types. If you specify this parameter, only the resources of the specified types and in the specified resource groups are scanned. If you do not specify this parameter, all the resources in the specified resource groups are scanned.</p>
         * <br>
         * <p>You can specify up to 20 resource types.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static UpdateTemplateScratchRequestSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceResourceGroup self = new UpdateTemplateScratchRequestSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public UpdateTemplateScratchRequestSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class UpdateTemplateScratchRequestSourceResources extends TeaModel {
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

        public static UpdateTemplateScratchRequestSourceResources build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceResources self = new UpdateTemplateScratchRequestSourceResources();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateTemplateScratchRequestSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class UpdateTemplateScratchRequestSourceTag extends TeaModel {
        /**
         * <p>The source tags that consist of key-value pairs.</p>
         * <br>
         * <p>If you want to specify only the tag key, you must set the tag value to an empty string. Example: {"TagKey": ""}.</p>
         * <br>
         * <p>You can configure up to 10 source tags.</p>
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

        public static UpdateTemplateScratchRequestSourceTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateTemplateScratchRequestSourceTag self = new UpdateTemplateScratchRequestSourceTag();
            return TeaModel.build(map, self);
        }

        public UpdateTemplateScratchRequestSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public UpdateTemplateScratchRequestSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

}
