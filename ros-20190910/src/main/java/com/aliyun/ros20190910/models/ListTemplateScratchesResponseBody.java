// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The scenarios.</p>
     */
    @NameInMap("TemplateScratches")
    public java.util.List<ListTemplateScratchesResponseBodyTemplateScratches> templateScratches;

    /**
     * <p>The total number of scenarios.</p>
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
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterKey")
        public String parameterKey;

        /**
         * <p>The value of the parameter.</p>
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
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The filters for resource types.</p>
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
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
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
         */
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

        /**
         * <p>The filters for resource types.</p>
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
         * <p>The tag key of the scenario.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the scenario.</p>
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
         * <p>The time when the scenario was created.</p>
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
         * <p>The status code that is returned if the scenario failed to be generated.</p>
         * <br>
         * <p>>  This parameter is returned only if Status is set to GENERATE_FAILED.</p>
         */
        @NameInMap("FailedCode")
        public String failedCode;

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
         * <p>The parameters that are configured for the scenario.</p>
         */
        @NameInMap("PreferenceParameters")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters> preferenceParameters;

        /**
         * <p>The ID of the resource group.</p>
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
         * <p>The state of the scenario.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the scenario failed to be generated.</p>
         * <br>
         * <p>>  This parameter is returned only if Status is set to GENERATE_FAILED.</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The tags of the scenario.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesTags> tags;

        /**
         * <p>The scenario ID.</p>
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
         * <p>The time when the scenario was updated.</p>
         * <br>
         * <p>The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
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
