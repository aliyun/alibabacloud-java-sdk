// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSTriggerInstancesRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobItemId")
    public Long jobItemId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    public static QueryTSTriggerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSTriggerInstancesRequest self = new QueryTSTriggerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSTriggerInstancesRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTSTriggerInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryTSTriggerInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSTriggerInstancesRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryTSTriggerInstancesRequest setJobItemId(Long jobItemId) {
        this.jobItemId = jobItemId;
        return this;
    }
    public Long getJobItemId() {
        return this.jobItemId;
    }

    public QueryTSTriggerInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSTriggerInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryTSTriggerInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
