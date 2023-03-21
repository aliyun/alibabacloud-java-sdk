// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageLatestScanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Create")
        public String create;

        @NameInMap("Finish")
        public Integer finish;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Modified")
        public String modified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Source")
        public String source;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Target")
        public String target;

        @NameInMap("TargetType")
        public String targetType;

        @NameInMap("TaskId")
        public String taskId;

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
