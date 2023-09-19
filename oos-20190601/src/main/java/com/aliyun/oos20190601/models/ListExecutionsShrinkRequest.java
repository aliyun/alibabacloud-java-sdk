// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionsShrinkRequest extends TeaModel {
    /**
     * <p>The types of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger. You can specify only one of the Categories and Category parameters. We recommend that you specify Categories.</p>
     */
    @NameInMap("Categories")
    public String categories;

    /**
     * <p>The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The depth of execution. Valid values: RootDepth and FirstChildDepth. If you set this parameter to RootDepth, only the parent execution is returned. If you set this parameter to FirstChildDepth, only the child executions at the first level are returned. You can specify only one of the Depth and IncludeChildExecution parameters. We recommend that you specify Depth.</p>
     */
    @NameInMap("Depth")
    public String depth;

    @NameInMap("Description")
    public String description;

    /**
     * <p>The earliest end time. The executions that stop running at or later than the specified time are queried.</p>
     */
    @NameInMap("EndDateAfter")
    public String endDateAfter;

    /**
     * <p>The latest end time. The executions that stop running at or earlier than the specified time are queried.</p>
     */
    @NameInMap("EndDateBefore")
    public String endDateBefore;

    /**
     * <p>The executor.</p>
     */
    @NameInMap("ExecutedBy")
    public String executedBy;

    /**
     * <p>The ID of the execution.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>Specifies whether to include child executions. Default value: False.</p>
     */
    @NameInMap("IncludeChildExecution")
    public Boolean includeChildExecution;

    /**
     * <p>The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The execution mode. Valid values:</p>
     * <br>
     * <p>*   **Automatic**</p>
     * <p>*   **Debug**</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent execution.</p>
     */
    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    /**
     * <p>The RAM role.</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instances you want to query belong.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the Elastic Compute Service (ECS) resource.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource template.</p>
     */
    @NameInMap("ResourceTemplateName")
    public String resourceTemplateName;

    /**
     * <p>The field that is used to sort the executions to query. Valid values:</p>
     * <br>
     * <p>*   **StartDate**: specifies that the executions are sorted based on the time when they are created. This is the default value.</p>
     * <p>*   **EndDate**: specifies that the executions are sorted based on the time when they stop running.</p>
     * <p>*   **Status**: specifies that the executions are sorted based on their states.</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <br>
     * <p>*   **Ascending**: ascending order.</p>
     * <p>*   **Descending**: descending order. This is the default value.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The earliest start time. The executions that start to run at or later than the specified time are queried.</p>
     */
    @NameInMap("StartDateAfter")
    public String startDateAfter;

    /**
     * <p>The latest start time. The executions that start to run at or earlier than the specified point in time are queried.</p>
     */
    @NameInMap("StartDateBefore")
    public String startDateBefore;

    /**
     * <p>The status of the execution. Valid values: Running, Started, Success, Failed, Waiting, Cancelled, Pending, and Skipped.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags for the execution.</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The name of the template. All templates whose names contain the specified template name are queried.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListExecutionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsShrinkRequest self = new ListExecutionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionsShrinkRequest setCategories(String categories) {
        this.categories = categories;
        return this;
    }
    public String getCategories() {
        return this.categories;
    }

    public ListExecutionsShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListExecutionsShrinkRequest setDepth(String depth) {
        this.depth = depth;
        return this;
    }
    public String getDepth() {
        return this.depth;
    }

    public ListExecutionsShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListExecutionsShrinkRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListExecutionsShrinkRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListExecutionsShrinkRequest setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
        return this;
    }
    public String getExecutedBy() {
        return this.executedBy;
    }

    public ListExecutionsShrinkRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListExecutionsShrinkRequest setIncludeChildExecution(Boolean includeChildExecution) {
        this.includeChildExecution = includeChildExecution;
        return this;
    }
    public Boolean getIncludeChildExecution() {
        return this.includeChildExecution;
    }

    public ListExecutionsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionsShrinkRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListExecutionsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public ListExecutionsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListExecutionsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ListExecutionsShrinkRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListExecutionsShrinkRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListExecutionsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListExecutionsShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public ListExecutionsShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
