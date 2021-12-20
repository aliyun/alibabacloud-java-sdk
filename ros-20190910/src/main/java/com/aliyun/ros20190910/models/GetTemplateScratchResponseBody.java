// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ParameterKey")
        public String parameterKey;

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
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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
        @NameInMap("ResourceId")
        public String resourceId;

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
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

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
        @NameInMap("Creatable")
        public Boolean creatable;

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
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("StackId")
        public String stackId;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailedCode")
        public String failedCode;

        @NameInMap("LogicalIdStrategy")
        public String logicalIdStrategy;

        @NameInMap("PreferenceParameters")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters> preferenceParameters;

        @NameInMap("SourceResourceGroup")
        public GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup sourceResourceGroup;

        @NameInMap("SourceResources")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchSourceResources> sourceResources;

        @NameInMap("SourceTag")
        public GetTemplateScratchResponseBodyTemplateScratchSourceTag sourceTag;

        @NameInMap("StackProvision")
        public GetTemplateScratchResponseBodyTemplateScratchStackProvision stackProvision;

        @NameInMap("Stacks")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchStacks> stacks;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("TemplateScratchData")
        public java.util.Map<String, ?> templateScratchData;

        @NameInMap("TemplateScratchId")
        public String templateScratchId;

        @NameInMap("TemplateScratchType")
        public String templateScratchType;

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
