// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Tasks")
    public DescribeVodRefreshTasksResponseBodyTasks tasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeVodRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshTasksResponseBody self = new DescribeVodRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodRefreshTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeVodRefreshTasksResponseBody setTasks(DescribeVodRefreshTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeVodRefreshTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeVodRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodRefreshTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodRefreshTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeVodRefreshTasksResponseBodyTasksTask extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Process")
        public String process;

        @NameInMap("Description")
        public String description;

        @NameInMap("ObjectPath")
        public String objectPath;

        @NameInMap("TaskId")
        public String taskId;

        public static DescribeVodRefreshTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRefreshTasksResponseBodyTasksTask self = new DescribeVodRefreshTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeVodRefreshTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeVodRefreshTasksResponseBodyTasksTask> task;

        public static DescribeVodRefreshTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRefreshTasksResponseBodyTasks self = new DescribeVodRefreshTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeVodRefreshTasksResponseBodyTasks setTask(java.util.List<DescribeVodRefreshTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeVodRefreshTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
