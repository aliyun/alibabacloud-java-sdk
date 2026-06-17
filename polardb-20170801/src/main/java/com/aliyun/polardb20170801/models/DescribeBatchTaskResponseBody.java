// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBatchTaskResponseBody extends TeaModel {
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The ID of the batch task.</p>
     * 
     * <strong>example:</strong>
     * <p>pcb-xxx</p>
     */
    @NameInMap("BatchId")
    public String batchId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25C70FF3-D49B-594D-BECE-0DE2BA1D8BBB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>A list of subtasks.</p>
     */
    @NameInMap("SubTasks")
    public java.util.List<DescribeBatchTaskResponseBodySubTasks> subTasks;

    /**
     * <p>The number of successful subtasks.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("SuccessCount")
    public Integer successCount;

    /**
     * <p>The time when the task started.</p>
     * 
     * <strong>example:</strong>
     * <p>2026/05/28T16:38:20Z</p>
     */
    @NameInMap("TaskBegin")
    public String taskBegin;

    /**
     * <p>The time when the task ended.</p>
     * 
     * <strong>example:</strong>
     * <p>2026/05/28T15:23:47Z</p>
     */
    @NameInMap("TaskEnd")
    public String taskEnd;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>batch_task_test</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The type of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>polarclaw_install_skills</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>The total number of subtasks.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBatchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchTaskResponseBody self = new DescribeBatchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBatchTaskResponseBody setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public DescribeBatchTaskResponseBody setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public DescribeBatchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBatchTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeBatchTaskResponseBody setSubTasks(java.util.List<DescribeBatchTaskResponseBodySubTasks> subTasks) {
        this.subTasks = subTasks;
        return this;
    }
    public java.util.List<DescribeBatchTaskResponseBodySubTasks> getSubTasks() {
        return this.subTasks;
    }

    public DescribeBatchTaskResponseBody setSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public DescribeBatchTaskResponseBody setTaskBegin(String taskBegin) {
        this.taskBegin = taskBegin;
        return this;
    }
    public String getTaskBegin() {
        return this.taskBegin;
    }

    public DescribeBatchTaskResponseBody setTaskEnd(String taskEnd) {
        this.taskEnd = taskEnd;
        return this;
    }
    public String getTaskEnd() {
        return this.taskEnd;
    }

    public DescribeBatchTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public DescribeBatchTaskResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeBatchTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBatchTaskResponseBodySubTasks extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>aliuid:1422133474238823 assumeOssRole not exist,serviceName:aliyunesarealtimelogpushossrole</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-pz5f6mvi1p84t35d7</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the subtask started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026/05/28T17:38:20Z</p>
         */
        @NameInMap("TaskBegin")
        public String taskBegin;

        /**
         * <p>The time when the subtask ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2026/05/28T20:38:20Z</p>
         */
        @NameInMap("TaskEnd")
        public String taskEnd;

        /**
         * <p>The ID of the subtask.</p>
         * 
         * <strong>example:</strong>
         * <p>629271331</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeBatchTaskResponseBodySubTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBatchTaskResponseBodySubTasks self = new DescribeBatchTaskResponseBodySubTasks();
            return TeaModel.build(map, self);
        }

        public DescribeBatchTaskResponseBodySubTasks setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeBatchTaskResponseBodySubTasks setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBatchTaskResponseBodySubTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBatchTaskResponseBodySubTasks setTaskBegin(String taskBegin) {
            this.taskBegin = taskBegin;
            return this;
        }
        public String getTaskBegin() {
            return this.taskBegin;
        }

        public DescribeBatchTaskResponseBodySubTasks setTaskEnd(String taskEnd) {
            this.taskEnd = taskEnd;
            return this;
        }
        public String getTaskEnd() {
            return this.taskEnd;
        }

        public DescribeBatchTaskResponseBodySubTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
