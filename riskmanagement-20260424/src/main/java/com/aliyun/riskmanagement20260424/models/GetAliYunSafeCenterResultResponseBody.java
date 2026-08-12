// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetAliYunSafeCenterResultResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p>200: Success. Other values (500, 400, etc.): Error codes.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAliYunSafeCenterResultResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3C107939-59BD-5EB9-B250-39559C830A85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the current API call is successful. Valid values: True/False. This does not indicate the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAliYunSafeCenterResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliYunSafeCenterResultResponseBody self = new GetAliYunSafeCenterResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliYunSafeCenterResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAliYunSafeCenterResultResponseBody setData(GetAliYunSafeCenterResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAliYunSafeCenterResultResponseBodyData getData() {
        return this.data;
    }

    public GetAliYunSafeCenterResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAliYunSafeCenterResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAliYunSafeCenterResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAliYunSafeCenterResultResponseBodyData extends TeaModel {
        /**
         * <p>The status of the Security Center Agent.</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AgentStatus")
        public Boolean agentStatus;

        /**
         * <p>The running status of the ECS instance.</p>
         * <ul>
         * <li><strong>true</strong>: Running.</li>
         * <li><strong>false</strong>: Not running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EcsInstanceStatus")
        public Boolean ecsInstanceStatus;

        /**
         * <p>The list of instance IDs of identical security alert events in Security Center.</p>
         */
        @NameInMap("InstanceIds")
        public java.util.List<Long> instanceIds;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8169D779-3391-541F-936B-11F4EC09AD0D</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The running status of the simple application server.</p>
         * <ul>
         * <li><strong>true</strong>: Running.</li>
         * <li><strong>false</strong>: Not running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SwasInstanceStatus")
        public Boolean swasInstanceStatus;

        /**
         * <p>The task ID for querying security alerting events triggered by the same rule or alerting type.</p>
         * 
         * <strong>example:</strong>
         * <p>12313123</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>Indicates whether the list of security alerting events that match the same IP rule or same alerting type as the alerting event to be handled is empty.</p>
         * <ul>
         * <li><strong>true</strong>: Empty.</li>
         * <li><strong>false</strong>: Not empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TaskStatus")
        public Boolean taskStatus;

        public static GetAliYunSafeCenterResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAliYunSafeCenterResultResponseBodyData self = new GetAliYunSafeCenterResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAliYunSafeCenterResultResponseBodyData setAgentStatus(Boolean agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public Boolean getAgentStatus() {
            return this.agentStatus;
        }

        public GetAliYunSafeCenterResultResponseBodyData setEcsInstanceStatus(Boolean ecsInstanceStatus) {
            this.ecsInstanceStatus = ecsInstanceStatus;
            return this;
        }
        public Boolean getEcsInstanceStatus() {
            return this.ecsInstanceStatus;
        }

        public GetAliYunSafeCenterResultResponseBodyData setInstanceIds(java.util.List<Long> instanceIds) {
            this.instanceIds = instanceIds;
            return this;
        }
        public java.util.List<Long> getInstanceIds() {
            return this.instanceIds;
        }

        public GetAliYunSafeCenterResultResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public GetAliYunSafeCenterResultResponseBodyData setSwasInstanceStatus(Boolean swasInstanceStatus) {
            this.swasInstanceStatus = swasInstanceStatus;
            return this;
        }
        public Boolean getSwasInstanceStatus() {
            return this.swasInstanceStatus;
        }

        public GetAliYunSafeCenterResultResponseBodyData setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetAliYunSafeCenterResultResponseBodyData setTaskStatus(Boolean taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Boolean getTaskStatus() {
            return this.taskStatus;
        }

    }

}
