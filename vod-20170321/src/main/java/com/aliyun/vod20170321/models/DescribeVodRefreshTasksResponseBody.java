// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshTasksResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>174F6032-AA26-470D-****-36F0EB205BEE</p>
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
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
         * <p>The time when the task was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-11-27T08:23:22Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The type of error returned when the refresh or prefetch task failed. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>Internal Error</strong>: An internal error occurred.</li>
         * <li><strong>Origin Timeout</strong>: The response from the origin server timed out.</li>
         * <li><strong>Origin Return StatusCode 5XX</strong>: The origin server returned an HTTP status code 5xx.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Internal Error</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The URL of the object refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/****.txt">http://example.com/****.txt</a></p>
         */
        @NameInMap("ObjectPath")
        public String objectPath;

        /**
         * <p>The type of the task. Default value: file. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: refreshes one or more files.</li>
         * <li><strong>directory</strong>: refreshes files in the specified directory.</li>
         * <li><strong>preload</strong>: prefetches one or more files.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The progress of the task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Complete</strong>: The task is complete.</li>
         * <li><strong>Refreshing</strong>: The task is in progress.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Pending</strong>: The task is pending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>704225667</p>
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
