// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAgentTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID, which can be used for end-to-end diagnostics.</p>
     * 
     * <strong>example:</strong>
     * <p>2E75336A-0DB2-5263-B201-A6488EC97B50</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code.</p>
     * <ul>
     * <li><code>code == Success</code> indicates that the authorization is successful.</li>
     * <li>Other status codes indicate that the authorization failed. Check the <code>message</code> field for the detailed fault message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetAgentTaskResponseBodyData data;

    /**
     * <p>The error message.</p>
     * <ul>
     * <li>If <code>code == Success</code>, this field is empty.</li>
     * <li>Otherwise, this field contains the request error information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SysomOpenAPIException: SysomOpenAPI.InvalidParameter Invalid params, should be json string or dict</p>
     */
    @NameInMap("message")
    public String message;

    public static GetAgentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentTaskResponseBody self = new GetAgentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentTaskResponseBody setData(GetAgentTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentTaskResponseBodyData getData() {
        return this.data;
    }

    public GetAgentTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetAgentTaskResponseBodyDataJobs extends TeaModel {
        /**
         * <p>The cause of the task failure. This field is returned only when the task fails.</p>
         * 
         * <strong>example:</strong>
         * <p>已废弃（误用）</p>
         */
        @NameInMap("error")
        public String error;

        /**
         * <p>The error code of the subtask failure. Valid values:</p>
         * <ul>
         * <li>Empty: The task is executed normally.</li>
         * <li>INSTANCE_NOT_SUPPORTED: The instance type is not supported.</li>
         * <li>INSTANCE_NOT_EXISTS: The instance does not exist.</li>
         * <li>INSTANCE_RELEASED: The instance has been released.</li>
         * <li>INSTANCE_NOT_RUNNING: The instance is not running.</li>
         * <li>INSTANCE_NOT_OWNED: The instance does not belong to the current account.</li>
         * <li>AGENT_ALREADY_INSTALLED: The Agent is already installed.</li>
         * <li>AGENT_NOT_INSTALLED: The Agent is not installed.</li>
         * <li>AGENT_SAME_VERSION: The version is the same.</li>
         * <li>HAS_RUNNING_JOB: A running task exists.</li>
         * <li>RPM_LOCK_HELD: The RPM lock is held.</li>
         * <li>DISK_SPACE_INSUFFICIENT: Insufficient disk space.</li>
         * <li>NODE_LOAD_HIGH: The node load is high.</li>
         * <li>COMMAND_FAILED: Command execution failed.</li>
         * <li>CLIENT_NOT_RUNNING: The Cloud Assistant Agent is not running.</li>
         * <li>CLIENT_NOT_RESPONSE: The Cloud Assistant Agent is not responding.</li>
         * <li>DELIVERY_TIMEOUT: Command delivery timed out.</li>
         * <li>EXECUTION_TIMEOUT: Command execution timed out.</li>
         * <li>TASK_CONCURRENCY_LIMIT: The task concurrency limit is reached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISK_SPACE_INSUFFICIENT</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

        /**
         * <p>The detailed description of the subtask failure. Valid values:</p>
         * <ul>
         * <li>The instance type is not supported.</li>
         * <li>The instance does not exist.</li>
         * <li>The instance has been released.</li>
         * <li>The instance is not running.</li>
         * <li>The instance does not belong to the current account.</li>
         * <li>The Agent is already installed.</li>
         * <li>The Agent is not installed.</li>
         * <li>The Agent version is the same. No upgrade is required.</li>
         * <li>A running task exists. Try again later.</li>
         * <li>The RPM lock is held. Try again later.</li>
         * <li>Insufficient disk space.</li>
         * <li>The node load is too high. Try again later.</li>
         * <li>Command execution failed. Try again later.</li>
         * <li>The Cloud Assistant Agent is not running.</li>
         * <li>The Cloud Assistant Agent is not responding.</li>
         * <li>Command delivery timed out.</li>
         * <li>Command execution timed out.</li>
         * <li>The task concurrency limit is reached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>磁盘空间不足</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zehme0rs1tc090fdl3n</p>
         */
        @NameInMap("instance")
        public String instance;

        /**
         * <p>The subtask parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;agent_version&quot;: &quot;3.5.0-beta&quot;,
         *     &quot;opt&quot;: &quot;install&quot;,
         *     &quot;agent_id&quot;: &quot;74a86327-3170-412c-8fd67-da3389ec56a9&quot;,
         *     &quot;install_type&quot;: &quot;InstallAndUpgrade&quot;
         * }</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("region")
        public String region;

        /**
         * <p>The subtask execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>已废弃（误用）</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>The subtask status. Valid values:</p>
         * <ul>
         * <li>Created: Created.</li>
         * <li>Running: Running.</li>
         * <li>Success: The task succeeded.</li>
         * <li>Fail: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        public static GetAgentTaskResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResponseBodyDataJobs self = new GetAgentTaskResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResponseBodyDataJobs setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetAgentTaskResponseBodyDataJobs setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetAgentTaskResponseBodyDataJobs setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetAgentTaskResponseBodyDataJobs setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public GetAgentTaskResponseBodyDataJobs setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public GetAgentTaskResponseBodyDataJobs setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAgentTaskResponseBodyDataJobs setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetAgentTaskResponseBodyDataJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetAgentTaskResponseBodyData extends TeaModel {
        /**
         * <p>The list of subtasks.</p>
         */
        @NameInMap("jobs")
        public java.util.List<GetAgentTaskResponseBodyDataJobs> jobs;

        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c41d8e3506224184a714682fea86d22d</p>
         */
        @NameInMap("task_id")
        public String taskId;

        public static GetAgentTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentTaskResponseBodyData self = new GetAgentTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentTaskResponseBodyData setJobs(java.util.List<GetAgentTaskResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetAgentTaskResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

        public GetAgentTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAgentTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
