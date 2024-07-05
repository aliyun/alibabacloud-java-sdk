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
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-01-01T12:30:20Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The path of the object. The path is used as a condition for exact matching.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/***.txt">http://example.com/***.txt</a></p>
     */
    @NameInMap("ObjectPath")
    public String objectPath;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>file</strong>: refreshes one or more files.</li>
     * <li><strong>directory</strong>: refreshes files in the specified directories.</li>
     * <li><strong>preload</strong>: prefetches one or more files.</li>
     * </ul>
     * <blockquote>
     * <p>If you specify the DomainName or Status parameter, you must also specify the ObjectType parameter.</p>
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
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>. Maximum value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You can query data that is collected in the last three days.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2017-01-01T12:12:20Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><strong>Complete</strong>: The task is complete.</li>
     * <li><strong>Refreshing</strong>: The task is in progress.</li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the task that you want to query.</p>
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
