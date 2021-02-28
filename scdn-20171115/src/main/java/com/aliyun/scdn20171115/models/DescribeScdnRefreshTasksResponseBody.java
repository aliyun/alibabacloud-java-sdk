// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class DescribeScdnRefreshTasksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Tasks")
    public DescribeScdnRefreshTasksResponseBodyTasks tasks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeScdnRefreshTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScdnRefreshTasksResponseBody self = new DescribeScdnRefreshTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScdnRefreshTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeScdnRefreshTasksResponseBody setTasks(DescribeScdnRefreshTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeScdnRefreshTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeScdnRefreshTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScdnRefreshTasksResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeScdnRefreshTasksResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeScdnRefreshTasksResponseBodyTasksTask extends TeaModel {
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

        public static DescribeScdnRefreshTasksResponseBodyTasksTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnRefreshTasksResponseBodyTasksTask self = new DescribeScdnRefreshTasksResponseBodyTasksTask();
            return TeaModel.build(map, self);
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setObjectPath(String objectPath) {
            this.objectPath = objectPath;
            return this;
        }
        public String getObjectPath() {
            return this.objectPath;
        }

        public DescribeScdnRefreshTasksResponseBodyTasksTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeScdnRefreshTasksResponseBodyTasks extends TeaModel {
        @NameInMap("Task")
        public java.util.List<DescribeScdnRefreshTasksResponseBodyTasksTask> task;

        public static DescribeScdnRefreshTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScdnRefreshTasksResponseBodyTasks self = new DescribeScdnRefreshTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeScdnRefreshTasksResponseBodyTasks setTask(java.util.List<DescribeScdnRefreshTasksResponseBodyTasksTask> task) {
            this.task = task;
            return this;
        }
        public java.util.List<DescribeScdnRefreshTasksResponseBodyTasksTask> getTask() {
            return this.task;
        }

    }

}
