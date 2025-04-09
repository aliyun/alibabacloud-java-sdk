// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncQuery")
    public Boolean asyncQuery;

    /**
     * <strong>example:</strong>
     * <p>1579965079000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupStatusFilter")
    public String jobGroupStatusFilter;

    @NameInMap("OnlyMinConcurrencyEnabled")
    public Boolean onlyMinConcurrencyEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchText")
    public String searchText;

    /**
     * <strong>example:</strong>
     * <p>1578965079000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListJobGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsRequest self = new ListJobGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsRequest setAsyncQuery(Boolean asyncQuery) {
        this.asyncQuery = asyncQuery;
        return this;
    }
    public Boolean getAsyncQuery() {
        return this.asyncQuery;
    }

    public ListJobGroupsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListJobGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListJobGroupsRequest setJobGroupStatusFilter(String jobGroupStatusFilter) {
        this.jobGroupStatusFilter = jobGroupStatusFilter;
        return this;
    }
    public String getJobGroupStatusFilter() {
        return this.jobGroupStatusFilter;
    }

    public ListJobGroupsRequest setOnlyMinConcurrencyEnabled(Boolean onlyMinConcurrencyEnabled) {
        this.onlyMinConcurrencyEnabled = onlyMinConcurrencyEnabled;
        return this;
    }
    public Boolean getOnlyMinConcurrencyEnabled() {
        return this.onlyMinConcurrencyEnabled;
    }

    public ListJobGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobGroupsRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }
    public String getSearchText() {
        return this.searchText;
    }

    public ListJobGroupsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
