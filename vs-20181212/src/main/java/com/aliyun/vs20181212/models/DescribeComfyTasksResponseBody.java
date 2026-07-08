// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyTasksResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of 0 indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The message that provides details about the result of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned data. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of tasks per page.</p>
     * <blockquote>
     * <p>This parameter applies only to recording queries.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of Comfy tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribeComfyTasksResponseBodyTasks> tasks;

    /**
     * <p>The total number of tasks that match the filter criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeComfyTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyTasksResponseBody self = new DescribeComfyTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyTasksResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComfyTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComfyTasksResponseBody setTasks(java.util.List<DescribeComfyTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeComfyTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeComfyTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeComfyTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The creation time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1780387493000</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The end time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1780387494000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The ID of the resource pool used by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>hive-26cd567b35c04a0a90f017388207b2</p>
         */
        @NameInMap("HiveId")
        public String hiveId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6c8234f4-d1e1-4cea-b08b-7926fbdea144</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task state.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        /**
         * <p>The last modified time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1780387494000</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        /**
         * <p>The ID of the Comfy workflow associated with the task.</p>
         * 
         * <strong>example:</strong>
         * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static DescribeComfyTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeComfyTasksResponseBodyTasks self = new DescribeComfyTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeComfyTasksResponseBodyTasks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeComfyTasksResponseBodyTasks setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeComfyTasksResponseBodyTasks setHiveId(String hiveId) {
            this.hiveId = hiveId;
            return this;
        }
        public String getHiveId() {
            return this.hiveId;
        }

        public DescribeComfyTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeComfyTasksResponseBodyTasks setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

        public DescribeComfyTasksResponseBodyTasks setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeComfyTasksResponseBodyTasks setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
