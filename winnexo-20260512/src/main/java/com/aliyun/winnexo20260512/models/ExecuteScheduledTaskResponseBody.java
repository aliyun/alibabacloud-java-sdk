// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ExecuteScheduledTaskResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>执行记录 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleExecutionId</p>
     */
    @NameInMap("executionId")
    public String executionId;

    /**
     * <p>错误描述，成功时为空</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskExecution")
    public ExecuteScheduledTaskResponseBodyTaskExecution taskExecution;

    public static ExecuteScheduledTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScheduledTaskResponseBody self = new ExecuteScheduledTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteScheduledTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteScheduledTaskResponseBody setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public ExecuteScheduledTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteScheduledTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteScheduledTaskResponseBody setTaskExecution(ExecuteScheduledTaskResponseBodyTaskExecution taskExecution) {
        this.taskExecution = taskExecution;
        return this;
    }
    public ExecuteScheduledTaskResponseBodyTaskExecution getTaskExecution() {
        return this.taskExecution;
    }

    public static class ExecuteScheduledTaskResponseBodyTaskExecution extends TeaModel {
        /**
         * <p>任务 AUTO 偏好：none=默认、performance=效果优先、credit=成本优先</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("autoPreference")
        public String autoPreference;

        /**
         * <strong>example:</strong>
         * <p>BL-10000-0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("billingId")
        public String billingId;

        /**
         * <strong>example:</strong>
         * <p>exampleCollaborationGroupId</p>
         */
        @NameInMap("collaborationGroupId")
        public String collaborationGroupId;

        @NameInMap("enableWebSearch")
        public Boolean enableWebSearch;

        /**
         * <strong>example:</strong>
         * <p>exampleExecutionId</p>
         */
        @NameInMap("executionId")
        public String executionId;

        /**
         * <p>执行模型档位</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("model")
        public String model;

        @NameInMap("operatingObjectName")
        public java.util.List<String> operatingObjectName;

        @NameInMap("skillCodes")
        public java.util.List<String> skillCodes;

        /**
         * <strong>example:</strong>
         * <p>exampleTaskId</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>每日销售数据汇总</p>
         */
        @NameInMap("taskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>每日汇总销售数据并生成报告</p>
         */
        @NameInMap("taskUnderstand")
        public String taskUnderstand;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ExecuteScheduledTaskResponseBodyTaskExecution build(java.util.Map<String, ?> map) throws Exception {
            ExecuteScheduledTaskResponseBodyTaskExecution self = new ExecuteScheduledTaskResponseBodyTaskExecution();
            return TeaModel.build(map, self);
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setAutoPreference(String autoPreference) {
            this.autoPreference = autoPreference;
            return this;
        }
        public String getAutoPreference() {
            return this.autoPreference;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setBillingId(String billingId) {
            this.billingId = billingId;
            return this;
        }
        public String getBillingId() {
            return this.billingId;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setCollaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }
        public String getCollaborationGroupId() {
            return this.collaborationGroupId;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setEnableWebSearch(Boolean enableWebSearch) {
            this.enableWebSearch = enableWebSearch;
            return this;
        }
        public Boolean getEnableWebSearch() {
            return this.enableWebSearch;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setOperatingObjectName(java.util.List<String> operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public java.util.List<String> getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setSkillCodes(java.util.List<String> skillCodes) {
            this.skillCodes = skillCodes;
            return this;
        }
        public java.util.List<String> getSkillCodes() {
            return this.skillCodes;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setTaskUnderstand(String taskUnderstand) {
            this.taskUnderstand = taskUnderstand;
            return this;
        }
        public String getTaskUnderstand() {
            return this.taskUnderstand;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ExecuteScheduledTaskResponseBodyTaskExecution setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
