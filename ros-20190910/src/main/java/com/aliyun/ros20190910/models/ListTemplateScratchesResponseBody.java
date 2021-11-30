// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListTemplateScratchesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TemplateScratches")
    public java.util.List<ListTemplateScratchesResponseBodyTemplateScratches> templateScratches;

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
        @NameInMap("ParameterKey")
        public String parameterKey;

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
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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
        @NameInMap("ResourceId")
        public String resourceId;

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
        @NameInMap("ResourceTags")
        public java.util.Map<String, ?> resourceTags;

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

    public static class ListTemplateScratchesResponseBodyTemplateScratches extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("FailedCode")
        public String failedCode;

        @NameInMap("LogicalIdStrategy")
        public String logicalIdStrategy;

        @NameInMap("PreferenceParameters")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesPreferenceParameters> preferenceParameters;

        @NameInMap("SourceResourceGroup")
        public ListTemplateScratchesResponseBodyTemplateScratchesSourceResourceGroup sourceResourceGroup;

        @NameInMap("SourceResources")
        public java.util.List<ListTemplateScratchesResponseBodyTemplateScratchesSourceResources> sourceResources;

        @NameInMap("SourceTag")
        public ListTemplateScratchesResponseBodyTemplateScratchesSourceTag sourceTag;

        @NameInMap("Status")
        public String status;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("TemplateScratchId")
        public String templateScratchId;

        @NameInMap("TemplateScratchType")
        public String templateScratchType;

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
