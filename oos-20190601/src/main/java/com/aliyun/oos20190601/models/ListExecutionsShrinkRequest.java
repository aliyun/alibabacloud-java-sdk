// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionsShrinkRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("Status")
    public String status;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("StartDateBefore")
    public String startDateBefore;

    @NameInMap("StartDateAfter")
    public String startDateAfter;

    @NameInMap("EndDateBefore")
    public String endDateBefore;

    @NameInMap("EndDateAfter")
    public String endDateAfter;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("ExecutedBy")
    public String executedBy;

    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    @NameInMap("RamRole")
    public String ramRole;

    @NameInMap("IncludeChildExecution")
    public Boolean includeChildExecution;

    @NameInMap("Category")
    public String category;

    @NameInMap("Tags")
    public String tagsShrink;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceTemplateName")
    public String resourceTemplateName;

    public static ListExecutionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsShrinkRequest self = new ListExecutionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListExecutionsShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ListExecutionsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListExecutionsShrinkRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListExecutionsShrinkRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListExecutionsShrinkRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListExecutionsShrinkRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListExecutionsShrinkRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListExecutionsShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListExecutionsShrinkRequest setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
        return this;
    }
    public String getExecutedBy() {
        return this.executedBy;
    }

    public ListExecutionsShrinkRequest setParentExecutionId(String parentExecutionId) {
        this.parentExecutionId = parentExecutionId;
        return this;
    }
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    public ListExecutionsShrinkRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public ListExecutionsShrinkRequest setIncludeChildExecution(Boolean includeChildExecution) {
        this.includeChildExecution = includeChildExecution;
        return this;
    }
    public Boolean getIncludeChildExecution() {
        return this.includeChildExecution;
    }

    public ListExecutionsShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListExecutionsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListExecutionsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsShrinkRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListExecutionsShrinkRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListExecutionsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListExecutionsShrinkRequest setResourceTemplateName(String resourceTemplateName) {
        this.resourceTemplateName = resourceTemplateName;
        return this;
    }
    public String getResourceTemplateName() {
        return this.resourceTemplateName;
    }

}
