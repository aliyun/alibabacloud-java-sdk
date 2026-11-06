// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskAttributeResponseBody extends TeaModel {
    /**
     * <p>The creation date of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-01</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The cron expression for scheduling periodic inspections.</p>
     * 
     * <strong>example:</strong>
     * <p>0 0 2 * * ?</p>
     */
    @NameInMap("CronExpression")
    public String cronExpression;

    /**
     * <p>The IDs of the PolarDB clusters to be inspected. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-001,pc-002</p>
     */
    @NameInMap("DBClusterIds")
    public String DBClusterIds;

    /**
     * <p>The expiration date of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-31</p>
     */
    @NameInMap("ExpireTime")
    public String expireTime;

    /**
     * <p>The last modification date of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-01</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The description of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>Periodic inspection task</p>
     */
    @NameInMap("TaskDescription")
    public String taskDescription;

    /**
     * <p>The ID of the inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>task-001</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeInspectionTaskAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskAttributeResponseBody self = new DescribeInspectionTaskAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskAttributeResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeInspectionTaskAttributeResponseBody setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public DescribeInspectionTaskAttributeResponseBody setDBClusterIds(String DBClusterIds) {
        this.DBClusterIds = DBClusterIds;
        return this;
    }
    public String getDBClusterIds() {
        return this.DBClusterIds;
    }

    public DescribeInspectionTaskAttributeResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeInspectionTaskAttributeResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeInspectionTaskAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionTaskAttributeResponseBody setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
        return this;
    }
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public DescribeInspectionTaskAttributeResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
