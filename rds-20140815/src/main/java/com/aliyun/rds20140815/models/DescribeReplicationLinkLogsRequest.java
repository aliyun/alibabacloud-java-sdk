// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeReplicationLinkLogsRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1trqb4p1xd****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The task ID. You must set this parameter to the ID of the task that you create by calling the <strong>CreateReplicationLink</strong> operation for the disaster recovery instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8413252</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <p>The task name. You must set this parameter to the name of the task that you create by calling the <strong>CreateReplicationLink</strong> operation for the disaster recovery instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test01</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task. Valid values:</p>
     * <ul>
     * <li><strong>create</strong>: creates a synchronization link.</li>
     * <li><strong>create-dryrun</strong>: performs a precheck before a synchronization link is created.</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>create: creates a replication link.</li>
     * <li>create-dryrun: performs a precheck before a replication link is created.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>create</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    public static DescribeReplicationLinkLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationLinkLogsRequest self = new DescribeReplicationLinkLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationLinkLogsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeReplicationLinkLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeReplicationLinkLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeReplicationLinkLogsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public DescribeReplicationLinkLogsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeReplicationLinkLogsRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

}
