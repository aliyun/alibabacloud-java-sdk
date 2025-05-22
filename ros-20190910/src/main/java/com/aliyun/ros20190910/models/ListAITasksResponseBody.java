// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListAITasksResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not authorized to complete this action.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>U12WEI6Ro2ol3wA54rBNS3Cltv2VJyA+7hP4GqbIOhmWU5mWU9ZE3cXLgDaH4KSMRfIYcIVrvtHaAzCoyfo7VQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The AI tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListAITasksResponseBodyTasks> tasks;

    public static ListAITasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAITasksResponseBody self = new ListAITasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAITasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAITasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAITasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAITasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAITasksResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListAITasksResponseBody setTasks(java.util.List<ListAITasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListAITasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ListAITasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The time when the AI task was created. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-15T03:15:53</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>Create an ECS instance and deploy the Nginx service.</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>The state of the AI task.</p>
         * <ul>
         * <li>PENDING</li>
         * <li>WAITING</li>
         * <li>RUNNING</li>
         * <li>SUCCESS</li>
         * <li>FAILURE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The reason why the AI task is in the state.</p>
         * 
         * <strong>example:</strong>
         * <p>Handler execution unexpected failure</p>
         */
        @NameInMap("StatusReason")
        public String statusReason;

        /**
         * <p>The ID of the AI task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-asasas*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the AI task.</p>
         * <ul>
         * <li>GenerateTemplate: The AI task is used to generate a template.</li>
         * <li>FixTemplate: The AI task is used to fix a template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GenerateTemplate</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The time when the AI task was updated. The time is displayed in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-20T22:00:50</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListAITasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListAITasksResponseBodyTasks self = new ListAITasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListAITasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAITasksResponseBodyTasks setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListAITasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAITasksResponseBodyTasks setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListAITasksResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAITasksResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListAITasksResponseBodyTasks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
