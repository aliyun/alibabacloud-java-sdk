// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the returned tasks.</p>
     */
    @NameInMap("Tasks")
    public DescribeVodRefreshTasksResponseBodyTasks tasks;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of the error that was returned when the refresh or prefetch task failed. Valid values:</p>
         * <br>
         * <p>*   **Internal Error**: indicates that an internal error occurred.</p>
         * <p>*   **Origin Timeout**: indicates that the response from the origin server timed out.</p>
         * <p>*   **Origin Return StatusCode 5XX**: indicates that the origin server returned a 5XX error.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the object to which the refresh or prefetch task is applied.</p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **file**: refreshes one or more files. This is the default value.</p>
         * <p>*   **directory**: refreshes the files under one or more directories.</p>
         * <p>*   **preload**: prefetches one or more files.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The progress of the task, in percentage.</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **Complete**: indicates that the task is complete.</p>
         * <p>*   **Refreshing**: indicates that the task is in progress.</p>
         * <p>*   **Failed**: indicates that the task failed.</p>
         * <p>*   **Pending**: indicates that the task is pending.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         */
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
