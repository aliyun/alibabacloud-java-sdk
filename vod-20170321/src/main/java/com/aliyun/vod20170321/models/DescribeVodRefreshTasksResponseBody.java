// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The information about the returned tasks.
    @NameInMap("Tasks")
    public DescribeVodRefreshTasksResponseBodyTasks tasks;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeVodRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshTasksResponseBody self = new DescribeVodRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodRefreshTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodRefreshTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodRefreshTasksResponseBody setTasks(DescribeVodRefreshTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeVodRefreshTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeVodRefreshTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeVodRefreshTasksResponseBodyTasksTask extends TeaModel {
        // The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
        @NameInMap("CreationTime")
        public String creationTime;

        // The type of the error that was returned when the refresh or prefetch task failed. Valid values:
        // 
        // *   **Internal Error**: indicates that an internal error occurred.
        // *   **Origin Timeout**: indicates that the response from the origin server timed out.
        // *   **Origin Return StatusCode 5XX**: indicates that the origin server returned a 5XX error.
        @NameInMap("Description")
        public String description;

        // The URL of the object to which the refresh or prefetch task is applied.
        @NameInMap("ObjectPath")
        public String objectPath;

        // The type of the task. Valid values:
        // 
        // *   **file**: refreshes one or more files. This is the default value.
        // *   **directory**: refreshes the files under one or more directories.
        // *   **preload**: prefetches one or more files.
        @NameInMap("ObjectType")
        public String objectType;

        // The progress of the task, in percentage.
        @NameInMap("Process")
        public String process;

        // The status of the task. Valid values:
        // 
        // *   **Complete**: indicates that the task is complete.
        // *   **Refreshing**: indicates that the task is in progress.
        // *   **Failed**: indicates that the task failed.
        // *   **Pending**: indicates that the task is pending.
        @NameInMap("Status")
        public String status;

        // The ID of the task.
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeVodRefreshTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodRefreshTasksResponseBodyTasksTask self = new DescribeVodRefreshTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeVodRefreshTasksResponseBodyTasksTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
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

        public DescribeVodRefreshTasksResponseBodyTasksTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
