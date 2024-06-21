// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D1C09606-C58B-558F-9B4E-5BF263D17D09</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource scenarios.</p>
     */
    @NameInMap("TemplateScratches")
    public java.util.List<ListTemplateScratchesResponseBodyTemplateScratches> templateScratches;

    /**
     * <p>The total number of scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplateScratchesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateScratchesResponseBody self = new ListTemplateScratchesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateScratchesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplateScratchesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplateScratchesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateScratchesResponseBody setTemplateScratches(java.util.List<ListTemplateScratchesResponseBodyTemplateScratches> templateScratches) {
        this.templateScratches = templateScratches;
        return this;
    }
    public java.util.List<ListTemplateScratchesResponseBodyTemplateScratches> getTemplateScratches() {
        return this.templateScratches;
    }

    public ListTemplateScratchesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>DeletionPolicy</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain</p>
         */
        @NameInMap("ParameterValue")
        public String parameterValue;

        public static ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters self = new ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters setParameterKey(String parameterKey) {
            this.parameterKey = parameterKey;
            return this;
        }
        public String getParameterKey() {
            return this.parameterKey;
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters setParameterValue(String parameterValue) {
            this.parameterValue = parameterValue;
            return this;
        }
        public String getParameterValue() {
            return this.parameterValue;
        }

    }

    public static class ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup extends TeaModel {
        /**
         * <p>The ID of the source resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The resource types for filtering resources.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup self = new ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class ListTemplateScratchesResponseBodyTemplateScratchesSourceResources extends TeaModel {
        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5eauuq80anx59v28****</p>
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

        public static ListTemplateScratchesResponseBodyTemplateScratchesSourceResources build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesResponseBodyTemplateScratchesSourceResources self = new ListTemplateScratchesResponseBodyTemplateScratchesSourceResources();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListTemplateScratchesResponseBodyTemplateScratchesSourceTag extends TeaModel {
        /**
         * <p>The source tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;a&quot;: &quot;b&quot;}</p>
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The resource types for filtering resources.</p>
         */
        @NameInMap("ResourceTypeFilter")
        public java.util.List<String> resourceTypeFilter;

        public static ListTemplateScratchesResponseBodyTemplateScratchesSourceTag build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesResponseBodyTemplateScratchesSourceTag self = new ListTemplateScratchesResponseBodyTemplateScratchesSourceTag();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesSourceTag setResourceTags(java.util.Map<String, ?> resourceTags) {
            this.resourceTags = resourceTags;
            return this;
        }
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesSourceTag setResourceTypeFilter(java.util.List<String> resourceTypeFilter) {
            this.resourceTypeFilter = resourceTypeFilter;
            return this;
        }
        public java.util.List<String> getResourceTypeFilter() {
            return this.resourceTypeFilter;
        }

    }

    public static class ListTemplateScratchesResponseBodyTemplateScratchesTags extends TeaModel {
        /**
         * <p>The tag key of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>usage1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListTemplateScratchesResponseBodyTemplateScratchesTags build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesResponseBodyTemplateScratchesTags self = new ListTemplateScratchesResponseBodyTemplateScratchesTags();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTemplateScratchesResponseBodyTemplateScratchesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListTemplateScratchesResponseBodyTemplateScratches extends TeaModel {
        /**
         * <p>The time when the resource scenario was created.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-07T08:06:44</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the scenario.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The status code of the resource scenario that failed to be generated.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of Status is GENERATE_FAILED.</p>
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
         * <p>The preference parameters of the resource scenario.</p>
         */
        @NameInMap("PreferenceParameters")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters> preferenceParameters;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4nxcvht4pmi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The source resource group.</p>
         */
        @NameInMap("SourceResourceGroup")
        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup sourceResourceGroup;

        /**
         * <p>The source resources.</p>
         */
        @NameInMap("SourceResources")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesSourceResources> sourceResources;

        /**
         * <p>The source tag.</p>
         */
        @NameInMap("SourceTag")
        public ListTemplateScratchesResponseBodyTemplateScratchesSourceTag sourceTag;

        /**
         * <p>The state of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>GENERATE_COMPLETE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the resource scenario failed to be generated.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of Status is GENERATE_FAILED.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Resource ALIYUN::ECS::VPC vpc-m5eauuq80anx59v28**** could not be found for template scratch.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The tags of the resource scenario.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesTags> tags;

        /**
         * <p>The ID of the resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>ts-48ad85d66cca4620****</p>
         */
        @NameInMap("TemplateScratchId")
        public String templateScratchId;

        /**
         * <p>The type of the resource scenario. Valid values:</p>
         * <ul>
         * <li>ResourceImport: resource management</li>
         * <li>ArchitectureReplication: resource replication</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceImport</p>
         */
        @NameInMap("TemplateScratchType")
        public String templateScratchType;

        /**
         * <p>The time when the resource scenario was updated.</p>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-07T08:06:44</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListTemplateScratchesResponseBodyTemplateScratches build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateScratchesResponseBodyTemplateScratches self = new ListTemplateScratchesResponseBodyTemplateScratches();
            return TeaModel.build(map, self);
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setFailedCode(String failedCode) {
            this.failedCode = failedCode;
            return this;
        }
        public String getFailedCode() {
            return this.failedCode;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setLogicalIdStrategy(String logicalIdStrategy) {
            this.logicalIdStrategy = logicalIdStrategy;
            return this;
        }
        public String getLogicalIdStrategy() {
            return this.logicalIdStrategy;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setPreferenceParameters(java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters> preferenceParameters) {
            this.preferenceParameters = preferenceParameters;
            return this;
        }
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters> getPreferenceParameters() {
            return this.preferenceParameters;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setSourceResourceGroup(ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup sourceResourceGroup) {
            this.sourceResourceGroup = sourceResourceGroup;
            return this;
        }
        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup getSourceResourceGroup() {
            return this.sourceResourceGroup;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setSourceResources(java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesSourceResources> sourceResources) {
            this.sourceResources = sourceResources;
            return this;
        }
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesSourceResources> getSourceResources() {
            return this.sourceResources;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setSourceTag(ListTemplateScratchesResponseBodyTemplateScratchesSourceTag sourceTag) {
            this.sourceTag = sourceTag;
            return this;
        }
        public ListTemplateScratchesResponseBodyTemplateScratchesSourceTag getSourceTag() {
            return this.sourceTag;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setTags(java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesTags> getTags() {
            return this.tags;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setTemplateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }
        public String getTemplateScratchId() {
            return this.templateScratchId;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setTemplateScratchType(String templateScratchType) {
            this.templateScratchType = templateScratchType;
            return this;
        }
        public String getTemplateScratchType() {
            return this.templateScratchType;
        }

        public ListTemplateScratchesResponseBodyTemplateScratches setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
