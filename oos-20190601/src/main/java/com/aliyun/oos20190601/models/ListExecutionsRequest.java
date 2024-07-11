// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListExecutionsRequest extends TeaModel {
    /**
     * <p>The types of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger. You can specify only one of the Categories and Category parameters. We recommend that you specify Categories.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;TimerTrigger&quot;、&quot;EventTrigger&quot;]</p>
     */
    @NameInMap("Categories")
    public String categories;

    /**
     * <p>The type of the execution template. Valid values: Other, TimerTrigger, EventTrigger, and AlarmTrigger.</p>
     * 
     * <strong>example:</strong>
     * <p>Other</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The depth of execution. Valid values: RootDepth and FirstChildDepth. If you set this parameter to RootDepth, only the parent execution is returned. If you set this parameter to FirstChildDepth, only the child executions at the first level are returned. You can specify only one of the Depth and IncludeChildExecution parameters. We recommend that you specify Depth.</p>
     * 
     * <strong>example:</strong>
     * <p>RootDepth</p>
     */
    @NameInMap("Depth")
    public String depth;

    /**
     * <p>The description of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>MyDescription</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The earliest end time. The executions that stop running at or later than the specified time are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("EndDateAfter")
    public String endDateAfter;

    /**
     * <p>The latest end time. The executions that stop running at or earlier than the specified time are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("EndDateBefore")
    public String endDateBefore;

    /**
     * <p>The executor.</p>
     * 
     * <strong>example:</strong>
     * <p>vme</p>
     */
    @NameInMap("ExecutedBy")
    public String executedBy;

    /**
     * <p>The ID of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-xxx</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    /**
     * <p>Specifies whether to include child executions. Default value: False.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeChildExecution")
    public Boolean includeChildExecution;

    /**
     * <p>The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The execution mode. Valid values:</p>
     * <ul>
     * <li><strong>Automatic</strong></li>
     * <li><strong>Debug</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Automatic</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The token that is used to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the parent execution.</p>
     * 
     * <strong>example:</strong>
     * <p>exec-xxx</p>
     */
    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    /**
     * <p>The RAM role.</p>
     * 
     * <strong>example:</strong>
     * <p>OOSServiceRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instances you want to query belong.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the Elastic Compute Service (ECS) resource.</p>
     * 
     * <strong>example:</strong>
     * <p>i-xxx</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The name of the resource template.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-ECS-TEST</p>
     */
    @NameInMap("ResourceTemplateName")
    public String resourceTemplateName;

    /**
     * <p>The field that is used to sort the executions to query. Valid values:</p>
     * <ul>
     * <li><strong>StartDate</strong>: specifies that the executions are sorted based on the time when they are created. This is the default value.</li>
     * <li><strong>EndDate</strong>: specifies that the executions are sorted based on the time when they stop running.</li>
     * <li><strong>Status</strong>: specifies that the executions are sorted based on their states.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>StartDate</p>
     */
    @NameInMap("SortField")
    public String sortField;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>Ascending</strong>: ascending order.</li>
     * <li><strong>Descending</strong>: descending order. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ascending</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <p>The earliest start time. The executions that start to run at or later than the specified time are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("StartDateAfter")
    public String startDateAfter;

    /**
     * <p>The latest start time. The executions that start to run at or earlier than the specified point in time are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-05-16T10:26:14Z</p>
     */
    @NameInMap("StartDateBefore")
    public String startDateBefore;

    /**
     * <p>The status of the execution. Valid values: Running, Started, Success, Failed, Waiting, Cancelled, Pending, and Skipped.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags for the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The name of the template. All templates whose names contain the specified template name are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ListExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsRequest self = new ListExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListExecutionsRequest setCategories(String categories) {
        this.categories = categories;
        return this;
    }
    public String getCategories() {
        return this.categories;
    }

    public ListExecutionsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListExecutionsRequest setDepth(String depth) {
        this.depth = depth;
        return this;
    }
    public String getDepth() {
        return this.depth;
    }

    public ListExecutionsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListExecutionsRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListExecutionsRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListExecutionsRequest setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
        return this;
    }
    public String getExecutedBy() {
        return this.executedBy;
    }

    public ListExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListExecutionsRequest setIncludeChildExecution(Boolean includeChildExecution) {
        this.includeChildExecution = includeChildExecution;
        return this;
    }
    public Boolean getIncludeChildExecution() {
        return this.includeChildExecution;
    }

    public ListExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListExecutionsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListExecutionsRequest setParentExecutionId(String parentExecutionId) {
        this.parentExecutionId = parentExecutionId;
        return this;
    }
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    public ListExecutionsRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public ListExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListExecutionsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListExecutionsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListExecutionsRequest setResourceTemplateName(String resourceTemplateName) {
        this.resourceTemplateName = resourceTemplateName;
        return this;
    }
    public String getResourceTemplateName() {
        return this.resourceTemplateName;
    }

    public ListExecutionsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListExecutionsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListExecutionsRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListExecutionsRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListExecutionsRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public ListExecutionsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
