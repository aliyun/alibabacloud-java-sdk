// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetTaskByUuidResponseBody extends TeaModel {
    /**
     * <p>The API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The task information.</p>
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
         * <p>The instruction. Valid values:</p>
         * <ul>
         * <li>BeginDialogue: starts the conversation.</li>
         * <li>Dialogue: indicates a conversation.</li>
         * <li>AbortDialogue: aborts the conversation.</li>
         * <li>SilenceTimeout: indicates a silence timeout.</li>
         * <li>CollectedNumber: indicates a collected number.</li>
         * <li>EndDialogue: ends the conversation.</li>
         * <li>Broadcast: indicates an opening remark.</li>
         * <li>HangUp: hangs up the call.</li>
         * <li>Authorize: grants authorization.</li>
         * <li>TransferToAgent: transfers the call to an agent.</li>
         * <li>TransferToIVR: transfers the call to an IVR.</li>
         * <li>RedirectToPage: redirects to a page.</li>
         * <li>CollectNumber: collects a number.</li>
         * <li>WaitOnAsyncTask: waits for an asynchronous task.</li>
         * <li>Error: indicates an error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Broadcast</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The conversation text.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, I am **customer service</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fd279983-93b9-b13b-9a34-64e5df473225</p>
         */
        @NameInMap("SequenceId")
        public String sequenceId;

        /**
         * <p>The speaker of the conversation. Valid values: Robot and Contact.</p>
         * 
         * <strong>example:</strong>
         * <p>Robot</p>
         */
        @NameInMap("Speaker")
        public String speaker;

        /**
         * <p>The time when the summary was created. The value is a UNIX timestamp in milliseconds.</p>
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
         * <p>The actual execution time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>The call ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>13777777777</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>057190294</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The list of conversation information.</p>
         */
        @NameInMap("Conversations")
        public java.util.List<GetTaskByUuidResponseBodyTaskConversations> conversations;

        /**
         * <p>The end reason. Valid values:</p>
         * <ul>
         * <li>FINISHED: normal completion.</li>
         * <li>CHATBOT_HANGUP_AFTER_NOANSWER: the robot hangs up after unrecognized input.</li>
         * <li>CHATBOT_HANGUP_AFTER_SILENCE: the robot hangs up after a silence timeout.</li>
         * <li>CLIENT_HANGUP_AFTER_NOANSWER: the user hangs up after unrecognized input.</li>
         * <li>CLIENT_HANGUP: the user hangs up without a reason.</li>
         * <li>TRANSFER_BY_INTENT: the call is transferred to a human agent due to intent matching.</li>
         * <li>TRANSFER_AFTER_NOANSWER: the call is transferred to a human agent after unrecognized input.</li>
         * <li>INO_INTERACTION: no interaction from the user.</li>
         * <li>ERROR: the system is interrupted due to an exception.</li>
         * <li>SPECIAL_INTERCEPT_VOICE_ASSISTANT: intercepted due to special circumstances - voice assistant.</li>
         * <li>SPECIAL_INTERCEPT_EXTENSION_NUMBER_TRANSFER: intercepted due to special circumstances - extension number transfer.</li>
         * </ul>
         * <blockquote>
         * <p>Notice: The data type of this parameter is String. The returned value is an enumerated value such as FINISHED.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("EndReason")
        public String endReason;

        /**
         * <p>The end time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640090211434</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The job group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p><strong>[Deprecated]</strong> The planned execution time of the task. The value is a UNIX timestamp in milliseconds.</p>
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
