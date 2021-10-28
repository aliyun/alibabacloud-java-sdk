// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tasks")
    public DescribeTasksResponseBodyTasks tasks;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTasksResponseBody self = new DescribeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeTasksResponseBody setTasks(DescribeTasksResponseBodyTasks tasks) {
        this.tasks = tasks;
        return this;
    }
    public DescribeTasksResponseBodyTasks getTasks() {
        return this.tasks;
    }

    public DescribeTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTasksResponseBodyTasksSimpleTask extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("MessageKey")
        public String messageKey;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("RelatedResourceId")
        public String relatedResourceId;

        @NameInMap("StateCode")
        public String stateCode;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeTasksResponseBodyTasksSimpleTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasksSimpleTask self = new DescribeTasksResponseBodyTasksSimpleTask();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasksSimpleTask setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setMessageKey(String messageKey) {
            this.messageKey = messageKey;
            return this;
        }
        public String getMessageKey() {
            return this.messageKey;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setRelatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            return this;
        }
        public String getRelatedResourceId() {
            return this.relatedResourceId;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setStateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }
        public String getStateCode() {
            return this.stateCode;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeTasksResponseBodyTasksSimpleTask setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class DescribeTasksResponseBodyTasks extends TeaModel {
        @NameInMap("SimpleTask")
        public java.util.List<DescribeTasksResponseBodyTasksSimpleTask> simpleTask;

        public static DescribeTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeTasksResponseBodyTasks self = new DescribeTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeTasksResponseBodyTasks setSimpleTask(java.util.List<DescribeTasksResponseBodyTasksSimpleTask> simpleTask) {
            this.simpleTask = simpleTask;
            return this;
        }
        public java.util.List<DescribeTasksResponseBodyTasksSimpleTask> getSimpleTask() {
            return this.simpleTask;
        }

    }

}
