// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeInspectionTaskListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of inspection tasks.</p>
     */
    @NameInMap("TaskLists")
    public java.util.List<DescribeInspectionTaskListResponseBodyTaskLists> taskLists;

    public static DescribeInspectionTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInspectionTaskListResponseBody self = new DescribeInspectionTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInspectionTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInspectionTaskListResponseBody setTaskLists(java.util.List<DescribeInspectionTaskListResponseBodyTaskLists> taskLists) {
        this.taskLists = taskLists;
        return this;
    }
    public java.util.List<DescribeInspectionTaskListResponseBodyTaskLists> getTaskLists() {
        return this.taskLists;
    }

    public static class DescribeInspectionTaskListResponseBodyTaskLists extends TeaModel {
        /**
         * <p>The last modification date of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-06-01</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cron expression for periodically executing the inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 2 * * ?</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <p>The IDs of the PolarDB clusters to be inspected. Multiple IDs are separated by commas.</p>
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

        public static DescribeInspectionTaskListResponseBodyTaskLists build(java.util.Map<String, ?> map) throws Exception {
            DescribeInspectionTaskListResponseBodyTaskLists self = new DescribeInspectionTaskListResponseBodyTaskLists();
            return TeaModel.build(map, self);
        }

        public DescribeInspectionTaskListResponseBodyTaskLists setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInspectionTaskListResponseBodyTaskLists setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public DescribeInspectionTaskListResponseBodyTaskLists setDBClusterIds(String DBClusterIds) {
            this.DBClusterIds = DBClusterIds;
            return this;
        }
        public String getDBClusterIds() {
            return this.DBClusterIds;
        }

        public DescribeInspectionTaskListResponseBodyTaskLists setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInspectionTaskListResponseBodyTaskLists setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            return this;
        }
        public String getTaskDescription() {
            return this.taskDescription;
        }

        public DescribeInspectionTaskListResponseBodyTaskLists setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
