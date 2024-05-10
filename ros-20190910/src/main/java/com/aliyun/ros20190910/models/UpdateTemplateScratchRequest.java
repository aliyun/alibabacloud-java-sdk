// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateTemplateScratchRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <br>
     * <p>For more information, see [How to ensure idempotence](https://help.aliyun.com/document_detail/134212.html).</p>
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
     * <p>*   LongTypePrefixAndIndexSuffix: long-type prefix + index-type suffix</p>
     * <p>*   LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</p>
     * <p>*   ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</p>
     * <br>
     * <p>>  If you set TemplateScratchType to ArchitectureDetection, the default value of LogicalIdStrategy is LongTypePrefixAndHashSuffix. In other cases, the default value of LogicalIdStrategy is LongTypePrefixAndIndexSuffix.</p>
     */
    @NameInMap("LogicalIdStrategy")
    public String logicalIdStrategy;

    /**
     * <p>The preference parameters of the resource scenario.</p>
     */
    @NameInMap("PreferenceParameters")
    public java.util.List<UpdateTemplateScratchRequestPreferenceParameters> preferenceParameters;

    /**
     * <p>The region ID of the scenario.</p>
     * <br>
     * <p>You can call the [DescribeRegions](https://help.aliyun.com/document_detail/131035.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The source resource group.</p>
     */
    @NameInMap("SourceResourceGroup")
    public UpdateTemplateScratchRequestSourceResourceGroup sourceResourceGroup;

    /**
     * <p>The source resources.</p>
     * <br>
     * <p>If you specify SourceResources when TemplateScratchType is set to ArchitectureDetection, the system detects the architecture of all resources that are associated with the specified source resources. For example, if you set the value of SourceResources to an ID of a Classic Load Balancer (CLB) instance, the system detects the architecture of resources, such as Elastic Compute Service (ECS) instances, vSwitches, and virtual private clouds (VPCs), that are associated with the CLB instance.</p>
     * <br>
     * <p>If you set TemplateScratchType to ArchitectureDetection, you can specify up to 20 source resources for SourceResources. In other cases, you can specify up to 200 source resources.</p>
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
     * <br>
     * <p>This parameter is required.</p>
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

    public UpdateTemplateScratchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The parameter name.</p>
         * <br>
         * <p>For more information about the valid values of ParameterKey, see the "**Additional information about request parameters**" section of this topic.</p>
         * <br>
         * <p>>- PreferenceParameters is optional. If you specify PreferenceParameters, you must specify both ParameterKey and ParameterValue.</p>
         * <p>> - If you set TemplateScratchType to ResourceImport, you must set ParameterKey to DeletionPolicy.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The parameter value. The value of ParameterValue varies based on the value of ParameterKey.</p>
         * <br>
         * <p>For more information about the valid values of ParameterKey, see the "**Additional information about request parameters**" section of this topic.</p>
         * <br>
         * <p>>  PreferenceParameters is optional. If you specify PreferenceParameters, you must specify both ParameterKey and ParameterValue.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource types.</p>
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
         * <p>The resource ID.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * <br>
         * <p>This parameter is required.</p>
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
         * <p>If you set TemplateScratchType to ArchitectureDetection, you can add up to five source tags. In other cases, you can add up to 10 source tags.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The resource types for filtering resources.</p>
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
