// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeCSGClientTasksResponseBody extends TeaModel {
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
    public java.util.List<DescribeCSGClientTasksResponseBodyTasks> tasks;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCSGClientTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCSGClientTasksResponseBody self = new DescribeCSGClientTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCSGClientTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCSGClientTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCSGClientTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCSGClientTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCSGClientTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCSGClientTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeCSGClientTasksResponseBody setTasks(java.util.List<DescribeCSGClientTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeCSGClientTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeCSGClientTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCSGClientTasksResponseBodyTasks extends TeaModel {
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("MessageKey")
        public String messageKey;

        @NameInMap("MessageParams")
        public String messageParams;

        @NameInMap("Name")
        public String name;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StateCode")
        public String stateCode;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static DescribeCSGClientTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeCSGClientTasksResponseBodyTasks self = new DescribeCSGClientTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeCSGClientTasksResponseBodyTasks setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public DescribeCSGClientTasksResponseBodyTasks setMessageKey(String messageKey) {
            this.messageKey = messageKey;
            return this;
        }
        public String getMessageKey() {
            return this.messageKey;
        }

        public DescribeCSGClientTasksResponseBodyTasks setMessageParams(String messageParams) {
            this.messageParams = messageParams;
            return this;
        }
        public String getMessageParams() {
            return this.messageParams;
        }

        public DescribeCSGClientTasksResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeCSGClientTasksResponseBodyTasks setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeCSGClientTasksResponseBodyTasks setStateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }
        public String getStateCode() {
            return this.stateCode;
        }

        public DescribeCSGClientTasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeCSGClientTasksResponseBodyTasks setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
