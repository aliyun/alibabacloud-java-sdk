// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetTaskByUuidResponseBody extends TeaModel {
    /**
     * <p>API status code</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Task information</p>
     * 
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
        /**
         * <p>Action type</p>
         * <ul>
         * <li><p>Dialogue: Dialogue</p>
         * </li>
         * <li><p>AbortDialogue: Abort a dialogue</p>
         * </li>
         * <li><p>SilenceTimeout: Silence timeout</p>
         * </li>
         * <li><p>CollectedNumber: Collected number</p>
         * </li>
         * <li><p>EndDialogue: End a dialogue</p>
         * </li>
         * <li><p>Broadcast: Greeting message</p>
         * </li>
         * <li><p>HangUp: Hang up</p>
         * </li>
         * <li><p>Authorize: Authorization</p>
         * </li>
         * <li><p>TransferToAgent: Transfer to an agent</p>
         * </li>
         * <li><p>TransferToIVR: Transfer to an IVR system</p>
         * </li>
         * <li><p>RedirectToPage: Redirect to a page</p>
         * </li>
         * <li><p>CollectNumber: Collect a number</p>
         * </li>
         * <li><p>WaitOnAsyncTask: Wait for an asynchronous task</p>
         * </li>
         * <li><p>Error: Error</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Broadcast</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>Conversation text.</p>
         * 
         * <strong>example:</strong>
         * <p>你好，我是**客服</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>Session ID</p>
         * 
         * <strong>example:</strong>
         * <p>fd279983-93b9-b13b-9a34-64e5df473225</p>
         */
        @NameInMap("SequenceId")
        public String sequenceId;

        /**
         * <p>Who spoke in the conversation. Valid values: Robot or Contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Robot</p>
         */
        @NameInMap("Speaker")
        public String speaker;

        /**
         * <p>Timestamp when the summary was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1579068424883</p>
         */
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
         * <p>Actual execution time</p>
         * 
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>Call ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>Callee number</p>
         * 
         * <strong>example:</strong>
         * <p>13777777777</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>Caller number</p>
         * 
         * <strong>example:</strong>
         * <p>057190294</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>List of conversations</p>
         */
        @NameInMap("Conversations")
        public java.util.List<GetTaskByUuidResponseBodyTaskConversations> conversations;

        /**
         * <p>Reason the task ended</p>
         * <ul>
         * <li><p>FINISHED: Task completed normally</p>
         * </li>
         * <li><p>CHATBOT_HANGUP_AFTER_NOANSWER: Bot hung up after no answer</p>
         * </li>
         * <li><p>CHATBOT_HANGUP_AFTER_SILENCE: Bot hung up after silence timeout</p>
         * </li>
         * <li><p>CLIENT_HANGUP_AFTER_NOANSWER: Client hung up after no answer</p>
         * </li>
         * <li><p>CLIENT_HANGUP: Client hung up without reason</p>
         * </li>
         * <li><p>TRANSFER_BY_INTENT: Transferred to agent after intent match</p>
         * </li>
         * <li><p>TRANSFER_AFTER_NOANSWER: Transferred to agent after no answer</p>
         * </li>
         * <li><p>INO_INTERACTION: No interaction from client</p>
         * </li>
         * <li><p>ERROR: System error interrupted the task</p>
         * </li>
         * <li><p>SPECIAL_INTERCEPT_VOICE_ASSISTANT: Intercepted due to voice assistant</p>
         * </li>
         * <li><p>SPECIAL_INTERCEPT_EXTENSION_NUMBER_TRANSFER: Intercepted due to extension number transfer</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is a string that returns an enumeration value such as FINISHED.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("EndReason")
        public String endReason;

        /**
         * <p>End time</p>
         * 
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Job group ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>Job ID</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Planned execution time (deprecated)</p>
         * 
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

        public GetTaskByUuidResponseBodyTask setEndReason(String endReason) {
            this.endReason = endReason;
            return this;
        }
        public String getEndReason() {
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
