// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageLatestScanTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the information about the task.</p>
     */
    @NameInMap("Task")
    public java.util.List<DescribeImageLatestScanTaskResponseBodyTask> task;

    public static DescribeImageLatestScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageLatestScanTaskResponseBody self = new DescribeImageLatestScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageLatestScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageLatestScanTaskResponseBody setTask(java.util.List<DescribeImageLatestScanTaskResponseBodyTask> task) {
        this.task = task;
        return this;
    }
    public java.util.List<DescribeImageLatestScanTaskResponseBodyTask> getTask() {
        return this.task;
    }

    public static class DescribeImageLatestScanTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The time when the task was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("Create")
        public String create;

        /**
         * <p>The number of images that are scanned.</p>
         */
        @NameInMap("Finish")
        public Integer finish;

        /**
         * <p>The end time of the task. A value is returned only when the task is in the Finished state. Otherwise, the returned value is empty.</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The task ID.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The time when the task was last modified. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         */
        @NameInMap("Modified")
        public String modified;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The method in which the task was created. A task can be created in the Security Center console or by calling an API operation. Valid values:</p>
         * <br>
         * <p>*   **console_batch**: The task was created in the Security Center console.</p>
         * <p>*   **openapi**: The task was created by calling an API operation.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The start time of the task.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the task. Valid value:</p>
         * <br>
         * <p>*   **PROCESSING**: The task is running.</p>
         * <p>*   **START**: The task is being started.</p>
         * <p>*   **MESSAGE_SEND**: The scan task is sent.</p>
         * <p>*   **PRE_ANALYZER**: The image is in precheck.</p>
         * <p>*   **SUCCESS**: The task was successful.</p>
         * <p>*   **FAIL**: The task failed.</p>
         * <p>*   **TIMOUT**: The task timed out.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The digest value of the image.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the scanned asset. Valid value:</p>
         * <br>
         * <p>*   **IMAGE**</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The ID of the scan task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. Valid value:</p>
         * <br>
         * <p>*   **IMAGE_SCAN**</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeImageLatestScanTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageLatestScanTaskResponseBodyTask self = new DescribeImageLatestScanTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public DescribeImageLatestScanTaskResponseBodyTask setCreate(String create) {
            this.create = create;
            return this;
        }
        public String getCreate() {
            return this.create;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setFinish(Integer finish) {
            this.finish = finish;
            return this;
        }
        public Integer getFinish() {
            return this.finish;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setModified(String modified) {
            this.modified = modified;
            return this;
        }
        public String getModified() {
            return this.modified;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeImageLatestScanTaskResponseBodyTask setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
