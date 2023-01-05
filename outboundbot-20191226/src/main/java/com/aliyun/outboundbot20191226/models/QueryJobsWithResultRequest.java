// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsWithResultRequest extends TeaModel {
    @NameInMap("HasAnsweredFilter")
    public Boolean hasAnsweredFilter;

    @NameInMap("HasHangUpByRejectionFilter")
    public Boolean hasHangUpByRejectionFilter;

    @NameInMap("HasReachedEndOfFlowFilter")
    public Boolean hasReachedEndOfFlowFilter;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobStatusFilter")
    public String jobStatusFilter;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryText")
    public String queryText;

    @NameInMap("TaskStatusFilter")
    public String taskStatusFilter;

    public static QueryJobsWithResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsWithResultRequest self = new QueryJobsWithResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobsWithResultRequest setHasAnsweredFilter(Boolean hasAnsweredFilter) {
        this.hasAnsweredFilter = hasAnsweredFilter;
        return this;
    }
    public Boolean getHasAnsweredFilter() {
        return this.hasAnsweredFilter;
    }

    public QueryJobsWithResultRequest setHasHangUpByRejectionFilter(Boolean hasHangUpByRejectionFilter) {
        this.hasHangUpByRejectionFilter = hasHangUpByRejectionFilter;
        return this;
    }
    public Boolean getHasHangUpByRejectionFilter() {
        return this.hasHangUpByRejectionFilter;
    }

    public QueryJobsWithResultRequest setHasReachedEndOfFlowFilter(Boolean hasReachedEndOfFlowFilter) {
        this.hasReachedEndOfFlowFilter = hasReachedEndOfFlowFilter;
        return this;
    }
    public Boolean getHasReachedEndOfFlowFilter() {
        return this.hasReachedEndOfFlowFilter;
    }

    public QueryJobsWithResultRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryJobsWithResultRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public QueryJobsWithResultRequest setJobStatusFilter(String jobStatusFilter) {
        this.jobStatusFilter = jobStatusFilter;
        return this;
    }
    public String getJobStatusFilter() {
        return this.jobStatusFilter;
    }

    public QueryJobsWithResultRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryJobsWithResultRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryJobsWithResultRequest setQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }
    public String getQueryText() {
        return this.queryText;
    }

    public QueryJobsWithResultRequest setTaskStatusFilter(String taskStatusFilter) {
        this.taskStatusFilter = taskStatusFilter;
        return this;
    }
    public String getTaskStatusFilter() {
        return this.taskStatusFilter;
    }

}
