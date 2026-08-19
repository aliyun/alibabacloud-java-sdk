// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksRequest extends TeaModel {
    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-01T12:30:20Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The path used to query. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/***.txt">http://example.com/***.txt</a></p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li><strong>file</strong>: file purge.</li>
     * <li><strong>directory</strong>: directory purge.</li>
     * <li><strong>preload</strong>: file prefetch.</li>
     * </ul>
     * <blockquote>
     * <p>When DomainName or Status is specified, ObjectType is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>file</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>Only data within the last 3 days can be queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-01-01T12:12:20Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><strong>Complete</strong>: completed.</li>
     * <li><strong>Refreshing</strong>: in progress.</li>
     * <li><strong>Failed</strong>: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task ID used to query the purge status.</p>
     * 
     * <strong>example:</strong>
     * <p>70422****</p>
     */
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
