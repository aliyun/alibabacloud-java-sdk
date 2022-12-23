// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksRequest extends TeaModel {
    // The domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The end of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    @NameInMap("EndTime")
    public String endTime;

    // The object URL based on which the query is performed. The URL is used as a condition for an exact match.
    @NameInMap("ObjectPath")
    public String objectPath;

    // The type of the task. Valid values:
    // 
    // *   **file**: refreshes one or more files.
    // *   **directory**: refreshes the files under one or more directories.
    // *   **preload**: prefetches one or more files.
    // 
    // > If you specify the DomainName or TaskStatus parameter, you must also specify the ObjectType parameter.
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Default value: **20**. Maximum value: **50**.
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    // The beginning of the time range to query. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.
    // 
    // > You can query data that is collected in the last three days.
    @NameInMap("StartTime")
    public String startTime;

    // The status of the task. Valid values:
    // 
    // *   **Complete**: indicates that the task is complete.
    // *   **Refreshing**: indicates that the task is in progress.
    // *   **Failed**: indicates that the task failed.
    @NameInMap("Status")
    public String status;

    // The task ID based on which the query is performed.
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeVodRefreshTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshTasksRequest self = new DescribeVodRefreshTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVodRefreshTasksRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeVodRefreshTasksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVodRefreshTasksRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public DescribeVodRefreshTasksRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DescribeVodRefreshTasksRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVodRefreshTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodRefreshTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVodRefreshTasksRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeVodRefreshTasksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVodRefreshTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeVodRefreshTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
