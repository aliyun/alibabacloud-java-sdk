// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsRequest extends TeaModel {
    @NameInMap("AsyncQuery")
    public Boolean asyncQuery;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupStatusFilter")
    public String jobGroupStatusFilter;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchText")
    public String searchText;

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
