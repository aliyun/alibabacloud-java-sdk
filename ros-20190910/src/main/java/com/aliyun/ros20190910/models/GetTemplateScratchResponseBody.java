// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateScratchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A8E0EF98-6FBD-5656-8298-FC8194F0F7B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource scenario.</p>
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
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>DeletionPolicy</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain</p>
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
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource types.</p>
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
        @NameInMap("RelatedResourceTypeFilter")
        public java.util.List<String> relatedResourceTypeFilter;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5e7cv7e9mz69sszb****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN::ECS::VPC</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetTemplateScratchResponseBodyTemplateScratchSourceResources build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateScratchResponseBodyTemplateScratchSourceResources self = new GetTemplateScratchResponseBodyTemplateScratchSourceResources();
            return TeaModel.build(map, self);
        }

        public GetTemplateScratchResponseBodyTemplateScratchSourceResources setRelatedResourceTypeFilter(java.util.List<String> relatedResourceTypeFilter) {
            this.relatedResourceTypeFilter = relatedResourceTypeFilter;
            return this;
        }
        public java.util.List<String> getRelatedResourceTypeFilter() {
            return this.relatedResourceTypeFilter;
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
         * <p>The source tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;b&quot;}</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The resource types.</p>
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
         * <p>Indicates whether the resource is replicated by calling the <a href="https://help.aliyun.com/document_detail/132086.html">CreateStack</a> operation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Creatable")
        public Boolean creatable;

        /**
         * <p>Indicates whether the resource is managed by calling the <a href="https://help.aliyun.com/document_detail/131051.html">CreateChangeSet</a> operation. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>The region ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The stack ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3708bf6a-3a67-44d4-9eb1-c56704b9****</p>
         */
        @NameInMap("StackId")
        public String stackId;

        /**
         * <p>The purpose of the stack. Valid values:</p>
         * <ul>
         * <li>ResourceImport: resource management</li>
         * <li>ArchitectureReplication: resource replication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ArchitectureReplication</p>
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
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22T01:49:22</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the scenario.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status code of the scenario that fails to be created.</p>
         * <blockquote>
         * <p>This parameter is returned only if you set Status to GENERATE_FAILED.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>InvalidZoneId</p>
         */
        @NameInMap("FailedCode")
        public String failedCode;

        /**
         * <p>The policy based on which the logical ID is generated. Valid values:</p>
         * <ul>
         * <li>LongTypePrefixAndIndexSuffix (default): long-type prefix + index-type suffix</li>
         * <li>LongTypePrefixAndHashSuffix: long-type prefix + hash-type suffix</li>
         * <li>ShortTypePrefixAndHashSuffix: short-type prefix + hash-type suffix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LongTypePrefixAndIndexSuffix</p>
         */
        @NameInMap("LogicalIdStrategy")
        public String logicalIdStrategy;

        /**
         * <p>The preference parameters of the scenario.</p>
         */
        @NameInMap("PreferenceParameters")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchPreferenceParameters> preferenceParameters;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzmhzoaad5oq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The source resource group.</p>
         */
        @NameInMap("SourceResourceGroup")
        public GetTemplateScratchResponseBodyTemplateScratchSourceResourceGroup sourceResourceGroup;

        /**
         * <p>The source resources.</p>
         */
        @NameInMap("SourceResources")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchSourceResources> sourceResources;

        /**
         * <p>The source tag.</p>
         */
        @NameInMap("SourceTag")
        public GetTemplateScratchResponseBodyTemplateScratchSourceTag sourceTag;

        /**
         * <p>The preset information of the stack.</p>
         */
        @NameInMap("StackProvision")
        public GetTemplateScratchResponseBodyTemplateScratchStackProvision stackProvision;

        /**
         * <p>The stacks that are associated with the scenario.</p>
         */
        @NameInMap("Stacks")
        public java.util.List<GetTemplateScratchResponseBodyTemplateScratchStacks> stacks;

        /**
         * <p>The state of the scenario. Valid values:</p>
         * <ul>
         * <li>GENERATE_IN_PROGRESS: The scenario is being created.</li>
         * <li>GENERATE_COMPLETE: The scenario is created.</li>
         * <li>GENERATE_FAILED: The scenario fails to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GENERATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the scenario fails to be created.</p>
         * <blockquote>
         * <p>This parameter is returned only if you set Status to GENERATE_FAILED.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Resource ALIYUN::ECS::VPC vpc-m5eauuq80anx59v28**** could not be found for template scratch.</p>
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
         * 
         * <strong>example:</strong>
         * <p>ts-7f7a704cf71c49a6****</p>
         */
        @NameInMap("TemplateScratchId")
        public String templateScratchId;

        /**
         * <p>The type of the scenario. Valid values:</p>
         * <ul>
         * <li>ResourceImport: resource management</li>
         * <li>ArchitectureReplication: resource replication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ArchitectureReplication</p>
         */
        @NameInMap("TemplateScratchType")
        public String templateScratchType;

        /**
         * <p>The time at which the scenario was updated.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-22T01:49:23</p>
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

        public GetTemplateScratchResponseBodyTemplateScratch setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
