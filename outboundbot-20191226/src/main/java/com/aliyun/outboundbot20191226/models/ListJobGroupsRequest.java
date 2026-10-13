// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsRequest extends TeaModel {
    /**
     * <p>Specifies whether to asynchronously obtain the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncQuery")
    public Boolean asyncQuery;

    /**
     * <p>The end time to filter job groups by creation time. Use a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1579965079000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The filter condition. Filters by job status. You can specify multiple statuses separated by commas. The logical OR operator is used. Valid values:</p>
     * <ul>
     * <li><strong>Draft</strong>: Draft.</li>
     * <li><strong>Scheduling</strong>: Scheduling.</li>
     * <li><strong>Executing</strong>: Executing.</li>
     * <li><strong>Completed</strong>: Completed.</li>
     * <li><strong>Paused</strong>: Paused.</li>
     * <li><strong>Failed</strong>: Failed.</li>
     * <li><strong>Cancelled</strong>: Cancelled.</li>
     * <li><strong>Initializing</strong>: Initializing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Draft</p>
     */
    @NameInMap("JobGroupStatusFilter")
    public String jobGroupStatusFilter;

    /**
     * <p>Specifies whether to query tasks with a valid minimum concurrency guarantee.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyMinConcurrencyEnabled")
    public Boolean onlyMinConcurrencyEnabled;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>Interview</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    /**
     * <p>The start time to filter job groups by creation time. Use a UNIX timestamp in milliseconds.</p>
     * 
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
