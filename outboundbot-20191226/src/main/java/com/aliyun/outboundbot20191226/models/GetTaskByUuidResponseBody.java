// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetTaskByUuidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Task")
    public GetTaskByUuidResponseBodyTask task;

    public static GetTaskByUuidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskByUuidResponseBody self = new GetTaskByUuidResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskByUuidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskByUuidResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTaskByUuidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskByUuidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskByUuidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskByUuidResponseBody setTask(GetTaskByUuidResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskByUuidResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskByUuidResponseBodyTaskConversations extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("Script")
        public String script;

        @NameInMap("SequenceId")
        public String sequenceId;

        @NameInMap("Speaker")
        public String speaker;

        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetTaskByUuidResponseBodyTaskConversations build(java.util.Map<String, ?> map) throws Exception {
            GetTaskByUuidResponseBodyTaskConversations self = new GetTaskByUuidResponseBodyTaskConversations();
            return TeaModel.build(map, self);
        }

        public GetTaskByUuidResponseBodyTaskConversations setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetTaskByUuidResponseBodyTaskConversations setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetTaskByUuidResponseBodyTaskConversations setSequenceId(String sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }
        public String getSequenceId() {
            return this.sequenceId;
        }

        public GetTaskByUuidResponseBodyTaskConversations setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }
        public String getSpeaker() {
            return this.speaker;
        }

        public GetTaskByUuidResponseBodyTaskConversations setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetTaskByUuidResponseBodyTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>13777777777</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <strong>example:</strong>
         * <p>057190294</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        @NameInMap("Conversations")
        public java.util.List<GetTaskByUuidResponseBodyTaskConversations> conversations;

        /**
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("EndReason")
        public Integer endReason;

        /**
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("PlannedTime")
        public Long plannedTime;

        public static GetTaskByUuidResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskByUuidResponseBodyTask self = new GetTaskByUuidResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskByUuidResponseBodyTask setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public GetTaskByUuidResponseBodyTask setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetTaskByUuidResponseBodyTask setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public GetTaskByUuidResponseBodyTask setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public GetTaskByUuidResponseBodyTask setConversations(java.util.List<GetTaskByUuidResponseBodyTaskConversations> conversations) {
            this.conversations = conversations;
            return this;
        }
        public java.util.List<GetTaskByUuidResponseBodyTaskConversations> getConversations() {
            return this.conversations;
        }

        public GetTaskByUuidResponseBodyTask setEndReason(Integer endReason) {
            this.endReason = endReason;
            return this;
        }
        public Integer getEndReason() {
            return this.endReason;
        }

        public GetTaskByUuidResponseBodyTask setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTaskByUuidResponseBodyTask setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTaskByUuidResponseBodyTask setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTaskByUuidResponseBodyTask setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public GetTaskByUuidResponseBodyTask setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTaskByUuidResponseBodyTask setPlannedTime(Long plannedTime) {
            this.plannedTime = plannedTime;
            return this;
        }
        public Long getPlannedTime() {
            return this.plannedTime;
        }

    }

}
