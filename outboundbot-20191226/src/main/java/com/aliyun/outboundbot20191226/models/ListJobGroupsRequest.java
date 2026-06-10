// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsRequest extends TeaModel {
    /**
     * <p>Specifies whether to retrieve the query results asynchronously.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AsyncQuery")
    public Boolean asyncQuery;

    /**
     * <p>The end of the time range for the query, based on the creation time of the job group. Specify the time as a UNIX timestamp in milliseconds.</p>
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
     * <p>Filters results by job status. To specify multiple statuses, separate them with commas. The statuses are combined with a logical OR. Valid values:</p>
     * <ul>
     * <li><p><strong>Draft</strong>: The job group is a draft.</p>
     * </li>
     * <li><p><strong>Scheduling</strong>: The job group is being scheduled.</p>
     * </li>
     * <li><p><strong>Executing</strong>: The job group is executing.</p>
     * </li>
     * <li><p><strong>Completed</strong>: The job group has completed.</p>
     * </li>
     * <li><p><strong>Paused</strong>: The job group is paused.</p>
     * </li>
     * <li><p><strong>Failed</strong>: The job group has failed.</p>
     * </li>
     * <li><p><strong>Cancelled</strong>: The job group is canceled.</p>
     * </li>
     * <li><p><strong>Initializing</strong>: The job group is initializing.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Draft</p>
     */
    @NameInMap("JobGroupStatusFilter")
    public String jobGroupStatusFilter;

    /**
     * <p>Specifies whether to return only job groups with minimum concurrency enabled.</p>
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
     * <p>The number of entries to return per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search text.</p>
     * 
     * <strong>example:</strong>
     * <p>面试</p>
     */
    @NameInMap("SearchText")
    public String searchText;

    /**
     * <p>The start of the time range for the query, based on the creation time of the job group. Specify the time as a UNIX timestamp in milliseconds.</p>
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
