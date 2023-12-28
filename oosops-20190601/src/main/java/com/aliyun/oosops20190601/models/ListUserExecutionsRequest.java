// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserExecutionsRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("EndDateAfter")
    public String endDateAfter;

    @NameInMap("EndDateBefore")
    public String endDateBefore;

    @NameInMap("ExecutedBy")
    public String executedBy;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("IncludeChildExecution")
    public Boolean includeChildExecution;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ParentExecutionId")
    public String parentExecutionId;

    @NameInMap("RamRole")
    public String ramRole;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("StartDateAfter")
    public String startDateAfter;

    @NameInMap("StartDateBefore")
    public String startDateBefore;

    @NameInMap("Status")
    public String status;

    @NameInMap("TemplateName")
    public String templateName;

    public static ListUserExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserExecutionsRequest self = new ListUserExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserExecutionsRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public ListUserExecutionsRequest setEndDateAfter(String endDateAfter) {
        this.endDateAfter = endDateAfter;
        return this;
    }
    public String getEndDateAfter() {
        return this.endDateAfter;
    }

    public ListUserExecutionsRequest setEndDateBefore(String endDateBefore) {
        this.endDateBefore = endDateBefore;
        return this;
    }
    public String getEndDateBefore() {
        return this.endDateBefore;
    }

    public ListUserExecutionsRequest setExecutedBy(String executedBy) {
        this.executedBy = executedBy;
        return this;
    }
    public String getExecutedBy() {
        return this.executedBy;
    }

    public ListUserExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ListUserExecutionsRequest setIncludeChildExecution(Boolean includeChildExecution) {
        this.includeChildExecution = includeChildExecution;
        return this;
    }
    public Boolean getIncludeChildExecution() {
        return this.includeChildExecution;
    }

    public ListUserExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListUserExecutionsRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ListUserExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListUserExecutionsRequest setParentExecutionId(String parentExecutionId) {
        this.parentExecutionId = parentExecutionId;
        return this;
    }
    public String getParentExecutionId() {
        return this.parentExecutionId;
    }

    public ListUserExecutionsRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public ListUserExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListUserExecutionsRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public ListUserExecutionsRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListUserExecutionsRequest setStartDateAfter(String startDateAfter) {
        this.startDateAfter = startDateAfter;
        return this;
    }
    public String getStartDateAfter() {
        return this.startDateAfter;
    }

    public ListUserExecutionsRequest setStartDateBefore(String startDateBefore) {
        this.startDateBefore = startDateBefore;
        return this;
    }
    public String getStartDateBefore() {
        return this.startDateBefore;
    }

    public ListUserExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListUserExecutionsRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
