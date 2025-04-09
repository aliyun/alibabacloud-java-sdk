// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryJobsWithResultRequest extends TeaModel {
    @NameInMap("EndActualTimeFilter")
    public Long endActualTimeFilter;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasAnsweredFilter")
    public Boolean hasAnsweredFilter;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasHangUpByRejectionFilter")
    public Boolean hasHangUpByRejectionFilter;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("HasReachedEndOfFlowFilter")
    public Boolean hasReachedEndOfFlowFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9d53cd72-4050-4419-8c17-acc0bf158147</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;NoAnswer&quot;]</p>
     */
    @NameInMap("JobFailureReasonsFilter")
    public String jobFailureReasonsFilter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ad16fc35-d824-4102-a606-2be51c1aa6dd</p>
     */
    @NameInMap("JobGroupId")
    public String jobGroupId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("JobStatusFilter")
    public String jobStatusFilter;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1882020****</p>
     */
    @NameInMap("QueryText")
    public String queryText;

    @NameInMap("StartActualTimeFilter")
    public Long startActualTimeFilter;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("TaskStatusFilter")
    public String taskStatusFilter;

    public static QueryJobsWithResultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryJobsWithResultRequest self = new QueryJobsWithResultRequest();
        return TeaModel.build(map, self);
    }

    public QueryJobsWithResultRequest setEndActualTimeFilter(Long endActualTimeFilter) {
        this.endActualTimeFilter = endActualTimeFilter;
        return this;
    }
    public Long getEndActualTimeFilter() {
        return this.endActualTimeFilter;
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

    public QueryJobsWithResultRequest setJobFailureReasonsFilter(String jobFailureReasonsFilter) {
        this.jobFailureReasonsFilter = jobFailureReasonsFilter;
        return this;
    }
    public String getJobFailureReasonsFilter() {
        return this.jobFailureReasonsFilter;
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

    public QueryJobsWithResultRequest setStartActualTimeFilter(Long startActualTimeFilter) {
        this.startActualTimeFilter = startActualTimeFilter;
        return this;
    }
    public Long getStartActualTimeFilter() {
        return this.startActualTimeFilter;
    }

    public QueryJobsWithResultRequest setTaskStatusFilter(String taskStatusFilter) {
        this.taskStatusFilter = taskStatusFilter;
        return this;
    }
    public String getTaskStatusFilter() {
        return this.taskStatusFilter;
    }

}
