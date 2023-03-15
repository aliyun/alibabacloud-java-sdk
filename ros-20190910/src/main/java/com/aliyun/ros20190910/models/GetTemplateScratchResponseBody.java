// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scenario.</p>
     */
    @NameInMap("TemplateScratch")
    public GetTemplateScratchResponseBodyTemplateScratch templateScratch;

    public static GetTemplateScratchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateScratchResponseBody self = new GetTemplateScratchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateScratchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateScratchResponseBody setTemplateScratch(GetTemplateScratchResponseBodyTemplateScratch templateScratch) {
        this.templateScratch = templateScratch;
        return this;
    }
    public GetTemplateScratchResponseBodyTemplateScratch getTemplateScratch() {
        return this.templateScratch;
    }

    public static class GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The parameter value.</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters self = new GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup extends TeaModel {
        /**
         * <p>The ID of the source resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The filter for resource types.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup self = new GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class GetTemplateScratchResponseBodyTemplateScratchSourceResources extends TeaModel {
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

        public static GetTemplateScratchResponseBodyTemplateScratchSourceResources build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchSourceResources self = new GetTemplateScratchResponseBodyTemplateScratchSourceResources();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetTemplateScratchResponseBodyTemplateScratchSourceTag extends TeaModel {
        /**
         * <p>The resource tags.</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The filter for resource types.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static GetTemplateScratchResponseBodyTemplateScratchSourceTag build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchSourceTag self = new GetTemplateScratchResponseBodyTemplateScratchSourceTag();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class GetTemplateScratchResponseBodyTemplateScratchStackProvision extends TeaModel {
        /**
         * <p>Indicates whether the resource is replicated by calling the [CreateStack](~~132086~~) operation. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Creatable")
        public Boolean creatable;

        /**
         * <p>Indicates whether the resource is managed by calling the [CreateChangeSet](~~131051~~) operation. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Importable")
        public Boolean importable;

        public static GetTemplateScratchResponseBodyTemplateScratchStackProvision build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchStackProvision self = new GetTemplateScratchResponseBodyTemplateScratchStackProvision();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchStackProvision setCreatable(Boolean creatable) {
            this.creatable = creatable;
            return this;
        }
        public Boolean getCreatable() {
            return this.creatable;
        }

        public GetTemplateScratchResponseBodyTemplateScratchStackProvision setImportable(Boolean importable) {
            this.importable = importable;
            return this;
        }
        public Boolean getImportable() {
            return this.importable;
        }

    }

    public static class GetTemplateScratchResponseBodyTemplateScratchStacks extends TeaModel {
        /**
         * <p>The ID of the region to which the stack belongs.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the stack.</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The purpose of the stack. Valid values:</p>
         * <br>
         * <p>*   ResourceImport: resource management</p>
         * <p>*   ArchitectureReplication: resource replication</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        public static GetTemplateScratchResponseBodyTemplateScratchStacks build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchStacks self = new GetTemplateScratchResponseBodyTemplateScratchStacks();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchStacks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTemplateScratchResponseBodyTemplateScratchStacks setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public GetTemplateScratchResponseBodyTemplateScratchStacks setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
        public String getUsageType() {
            return this.usageType;
        }

    }

    public static class GetTemplateScratchResponseBodyTemplateScratch extends TeaModel {
        /**
         * <p>The time at which the scenario was created.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the scenario.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status code of the scenario that fails to be created.</p>
         * <br>
         * <p>>  This parameter is returned only if you set the Status parameter to GENERATE_FAILED.</p>
         */
        @NameInMap("FailedCode")
        public String failedCode;

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
         * <p>The parameters that are configured for the scenario.</p>
         */
        @NameInMap("PreferenceParameters")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters> preferenceParameters;

        /**
         * <p>The source resource group.</p>
         */
        @NameInMap("SourceResourceGroup")
        public GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup sourceResourceGroup;

        /**
         * <p>The source resource.</p>
         */
        @NameInMap("SourceResources")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchSourceResources> sourceResources;

        /**
         * <p>The source tag.</p>
         */
        @NameInMap("SourceTag")
        public GetTemplateScratchResponseBodyTemplateScratchSourceTag sourceTag;

        /**
         * <p>The preset information about the stack.</p>
         */
        @NameInMap("StackProvision")
        public GetTemplateScratchResponseBodyTemplateScratchStackProvision stackProvision;

        /**
         * <p>The list of stacks that are associated with the scenario.</p>
         */
        @NameInMap("Stacks")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchStacks> stacks;

        /**
         * <p>The status of the scenario. Valid values:</p>
         * <br>
         * <p>*   GENERATE_IN_PROGRESS: The scenario is being created.</p>
         * <p>*   GENERATE_COMPLETE: The scenario is created.</p>
         * <p>*   GENERATE_FAILED: The scenario fails to be created.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the scenario fails to be created.</p>
         * <br>
         * <p>>  This parameter is returned only if you set the Status parameter to GENERATE_FAILED.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The scenario data.</p>
         */
        @NameInMap("TemplateScratchData")
        public java.util.Map<String, ?> templateScratchData;

        /**
         * <p>The ID of the scenario.</p>
         */
        @NameInMap("TemplateScratchId")
        public String templateScratchId;

        /**
         * <p>The type of the scenario. Valid values:</p>
         * <br>
         * <p>*   ResourceImport: resource management</p>
         * <p>*   ArchitectureReplication: resource replication</p>
         */
        @NameInMap("TemplateScratchType")
        public String templateScratchType;

        /**
         * <p>The time at which the scenario was updated.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetTemplateScratchResponseBodyTemplateScratch build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratch self = new GetTemplateScratchResponseBodyTemplateScratch();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratch setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setFailedCode(String failedCode) {
            this.failedCode = failedCode;
            return this;
        }
        public String getFailedCode() {
            return this.failedCode;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setLogicalIdStrategy(String logicalIdStrategy) {
            this.logicalIdStrategy = logicalIdStrategy;
            return this;
        }
        public String getLogicalIdStrategy() {
            return this.logicalIdStrategy;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setPreferenceParameters(java.util.List<GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters> preferenceParameters) {
            this.preferenceParameters = preferenceParameters;
            return this;
        }
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters> getPreferenceParameters() {
            return this.preferenceParameters;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setSourceResourceGroup(GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup sourceResourceGroup) {
            this.sourceResourceGroup = sourceResourceGroup;
            return this;
        }
        public GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup getSourceResourceGroup() {
            return this.sourceResourceGroup;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setSourceResources(java.util.List<GetTemplateScratchResponseBodyTemplateScratchSourceResources> sourceResources) {
            this.sourceResources = sourceResources;
            return this;
        }
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchSourceResources> getSourceResources() {
            return this.sourceResources;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setSourceTag(GetTemplateScratchResponseBodyTemplateScratchSourceTag sourceTag) {
            this.sourceTag = sourceTag;
            return this;
        }
        public GetTemplateScratchResponseBodyTemplateScratchSourceTag getSourceTag() {
            return this.sourceTag;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setStackProvision(GetTemplateScratchResponseBodyTemplateScratchStackProvision stackProvision) {
            this.stackProvision = stackProvision;
            return this;
        }
        public GetTemplateScratchResponseBodyTemplateScratchStackProvision getStackProvision() {
            return this.stackProvision;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setStacks(java.util.List<GetTemplateScratchResponseBodyTemplateScratchStacks> stacks) {
            this.stacks = stacks;
            return this;
        }
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchStacks> getStacks() {
            return this.stacks;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setTemplateScratchData(java.util.Map<String, ?> templateScratchData) {
            this.templateScratchData = templateScratchData;
            return this;
        }
        public java.util.Map<String, ?> getTemplateScratchData() {
            return this.templateScratchData;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setTemplateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }
        public String getTemplateScratchId() {
            return this.templateScratchId;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setTemplateScratchType(String templateScratchType) {
            this.templateScratchType = templateScratchType;
            return this;
        }
        public String getTemplateScratchType() {
            return this.templateScratchType;
        }

        public GetTemplateScratchResponseBodyTemplateScratch setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
