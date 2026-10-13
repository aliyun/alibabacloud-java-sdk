// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskResponseBody extends TeaModel {
    /**
     * <p>The request status code.</p>
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
     * <p>The label information that can be used as filter conditions.</p>
     * <blockquote>
     * <p>Displays all label information with enumerated values in this job group.</p>
     * </blockquote>
     */
    @NameInMap("Labels")
    public java.util.List<SearchTaskResponseBodyLabels> labels;

    /**
     * <p>The message returned by the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SearchTaskInfoList")
    public java.util.List<SearchTaskResponseBodySearchTaskInfoList> searchTaskInfoList;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>The full set of label name keys.</p>
     */
    @NameInMap("VariableNames")
    public java.util.List<String> variableNames;

    public static SearchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTaskResponseBody self = new SearchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchTaskResponseBody setLabels(java.util.List<SearchTaskResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<SearchTaskResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public SearchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchTaskResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public SearchTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTaskResponseBody setSearchTaskInfoList(java.util.List<SearchTaskResponseBodySearchTaskInfoList> searchTaskInfoList) {
        this.searchTaskInfoList = searchTaskInfoList;
        return this;
    }
    public java.util.List<SearchTaskResponseBodySearchTaskInfoList> getSearchTaskInfoList() {
        return this.searchTaskInfoList;
    }

    public SearchTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchTaskResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public SearchTaskResponseBody setVariableNames(java.util.List<String> variableNames) {
        this.variableNames = variableNames;
        return this;
    }
    public java.util.List<String> getVariableNames() {
        return this.variableNames;
    }

    public static class SearchTaskResponseBodyLabels extends TeaModel {
        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>Satisfied</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of label values.</p>
         */
        @NameInMap("ValueList")
        public java.util.List<String> valueList;

        public static SearchTaskResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            SearchTaskResponseBodyLabels self = new SearchTaskResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public SearchTaskResponseBodyLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SearchTaskResponseBodyLabels setValueList(java.util.List<String> valueList) {
            this.valueList = valueList;
            return this;
        }
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

    }

    public static class SearchTaskResponseBodySearchTaskInfoListLabels extends TeaModel {
        /**
         * <p>The label name.</p>
         * 
         * <strong>example:</strong>
         * <p>Satisfied</p>
         */
        @NameInMap("K")
        public String k;

        /**
         * <p>The matched label value.</p>
         * 
         * <strong>example:</strong>
         * <p>Yes</p>
         */
        @NameInMap("V")
        public String v;

        public static SearchTaskResponseBodySearchTaskInfoListLabels build(java.util.Map<String, ?> map) throws Exception {
            SearchTaskResponseBodySearchTaskInfoListLabels self = new SearchTaskResponseBodySearchTaskInfoListLabels();
            return TeaModel.build(map, self);
        }

        public SearchTaskResponseBodySearchTaskInfoListLabels setK(String k) {
            this.k = k;
            return this;
        }
        public String getK() {
            return this.k;
        }

        public SearchTaskResponseBodySearchTaskInfoListLabels setV(String v) {
            this.v = v;
            return this;
        }
        public String getV() {
            return this.v;
        }

    }

    public static class SearchTaskResponseBodySearchTaskInfoList extends TeaModel {
        /**
         * <p>The actual execution time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1643436089677</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>The call duration, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>46000</p>
         */
        @NameInMap("CallDuration")
        public Integer callDuration;

        /**
         * <p>The call duration.</p>
         * 
         * <strong>example:</strong>
         * <p>47″</p>
         */
        @NameInMap("CallDurationDisplay")
        public String callDurationDisplay;

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>15205879599</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The calling number.</p>
         * 
         * <strong>example:</strong>
         * <p>02152739269</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>The exception information.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;code&quot;:&quot;OutboundCallError.SipCodeError&quot;, &quot;params&quot;:[{&quot;key&quot;:&quot;SipCode&quot;,&quot;value&quot;:&quot;500&quot;}]}]</p>
         */
        @NameInMap("DialException")
        public String dialException;

        /**
         * <p>The field used for displaying remarks on the page.</p>
         */
        @NameInMap("DialExceptionCodes")
        public java.util.List<String> dialExceptionCodes;

        /**
         * <p>The exception information.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;OutboundCallError.SipTrunkError&quot;]</p>
         */
        @NameInMap("DialExceptionOld")
        public String dialExceptionOld;

        /**
         * <p>Indicates whether the call is answered.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAnswered")
        public Boolean hasAnswered;

        /**
         * <p>Indicates whether the call is hung up due to unrecognized intent.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasHangUpByRejection")
        public Boolean hasHangUpByRejection;

        /**
         * <p>Indicates whether the last sentence is fully played before hanging up.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        /**
         * <p>Indicates whether the dialogue is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasReachedEndOfFlow")
        public Boolean hasReachedEndOfFlow;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>73df6283-26b2-402d-bad0-ffa489923ea1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The job group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37db3113-ad34-4ba3-b930-468f016bbf95</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>The name of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>85% new (with notes and underlines) 2021_11_14_18_00_51</p>
         */
        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6203248e-e652-4ef8-a1eb-586ed7b54dc2</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The job status. Valid values:</p>
         * <ul>
         * <li>0: Scheduling.</li>
         * <li>1: Executing.</li>
         * <li>2: Succeeded (Reached).</li>
         * <li>3: Paused.</li>
         * <li>4: Failed (Not connected - Busy).</li>
         * <li>5: Cancelled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JobStatus")
        public Integer jobStatus;

        /**
         * <p>The display content of the job status. Valid values:</p>
         * <ul>
         * <li>0: Scheduling.</li>
         * <li>1: Executing.</li>
         * <li>2: Succeeded (Reached).</li>
         * <li>3: Paused.</li>
         * <li>4: Failed (Not connected - Busy).</li>
         * <li>5: Cancelled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("JobStatusName")
        public String jobStatusName;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Scheduling: Scheduling (0).</li>
         * <li>Executing: Executing (1).</li>
         * <li>Succeeded: Reached (2).</li>
         * <li>Paused: Paused (3).</li>
         * <li>Failed: Not connected - Busy (4).</li>
         * <li>Cancelled: Cancelled (5).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("JobStatusString")
        public String jobStatusString;

        /**
         * <p>The label hit status of the current outbound call.</p>
         */
        @NameInMap("Labels")
        public java.util.List<SearchTaskResponseBodySearchTaskInfoListLabels> labels;

        /**
         * <p>The ringing duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>Chronic disease leads</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The task creation time. The value is a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        /**
         * <p>The reason why the task ended. Valid values:</p>
         * <ul>
         * <li>FINISHED (1): The task completed normally.</li>
         * <li>CHATBOT_HANGUP_AFTER_NOANSWER (2): The robot hung up after an unrecognized intent.</li>
         * <li>CHATBOT_HANGUP_AFTER_SILENCE (3): The robot hung up due to a silence timeout.</li>
         * <li>CLIENT_HANGUP_AFTER_NOANSWER (4): The user hung up after an unrecognized intent.</li>
         * <li>CLIENT_HANGUP (5): The user hung up without a specific reason.</li>
         * <li>TRANSFER_BY_INTENT (6): The call was transferred to an agent due to a matched intent.</li>
         * <li>TRANSFER_AFTER_NOANSWER (7): The call was transferred to an agent after an unrecognized intent.</li>
         * <li>INO_INTERACTION (8): No interaction occurred on the user side.</li>
         * <li>ERROR (9): The task was interrupted by a system exception.</li>
         * <li>SPECIAL_INTERCEPT_VOICE_ASSISTANT (10): The call was intercepted by the voice assistant.</li>
         * <li>SPECIAL_INTERCEPT_EXTENSION_NUMBER_TRANSFER (11): The call was intercepted during extension number transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutOfService</p>
         */
        @NameInMap("TaskEndReason")
        public Integer taskEndReason;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>479aea04-3a92-4ac3-935d-c8798c667850</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task status. Valid values:
         * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The general <strong>Succeeded</strong>: 1 (Connected) status is not displayed. Instead, specific subdivided causes are returned.)</p>
         * <ul>
         * <li><strong>Executing</strong>: 0 (Dialing).</li>
         * <li><strong>Succeeded</strong>: 1 (Connected).</li>
         * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
         * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
         * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
         * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
         * <li><strong>Failed</strong>: 6 (Failed).</li>
         * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
         * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
         * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
         * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
         * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
         * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
         * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
         * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
         * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
         * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
         * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee suspended, not dialed).</li>
         * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, not dialed).</li>
         * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
         * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
         * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized intent).</li>
         * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
         * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
         * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
         * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
         * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
         * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on user side).</li>
         * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system exception).</li>
         * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
         * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The display content of the call status. Valid values:
         * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The general <strong>Succeeded</strong>: 1 (Connected) status is not displayed. Instead, specific subdivided causes are returned.)</p>
         * <ul>
         * <li><strong>Executing</strong>: 0 (Dialing).</li>
         * <li><strong>Succeeded</strong>: 1 (Connected).</li>
         * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
         * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
         * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
         * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
         * <li><strong>Failed</strong>: 6 (Failed).</li>
         * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
         * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
         * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
         * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
         * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
         * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
         * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
         * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
         * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
         * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
         * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee suspended, not dialed).</li>
         * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, not dialed).</li>
         * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
         * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
         * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized intent).</li>
         * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
         * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
         * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
         * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
         * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
         * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on user side).</li>
         * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system exception).</li>
         * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
         * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Dialing</p>
         */
        @NameInMap("TaskStatusName")
        public String taskStatusName;

        /**
         * <p>The task status. Valid values:
         * (Note: The <strong>Succeeded</strong> status is subdivided into specific causes. The general <strong>Succeeded</strong>: 1 (Connected) status is not displayed. Instead, specific subdivided causes are returned.)</p>
         * <ul>
         * <li><strong>Executing</strong>: 0 (Dialing).</li>
         * <li><strong>Succeeded</strong>: 1 (Connected).</li>
         * <li><strong>NoAnswer</strong>: 2 (Not connected - No answer).</li>
         * <li><strong>NotExist</strong>: 3 (Not connected - Nonexistent number).</li>
         * <li><strong>Busy</strong>: 4 (Not connected - Busy).</li>
         * <li><strong>Cancelled</strong>: 5 (Not dialed - Task stopped).</li>
         * <li><strong>Failed</strong>: 6 (Failed).</li>
         * <li><strong>NotConnected</strong>: 7 (Not connected - Unreachable).</li>
         * <li><strong>PoweredOff</strong>: 8 (Not connected - Powered off).</li>
         * <li><strong>OutOfService</strong>: 9 (Not connected - Suspended).</li>
         * <li><strong>InArrears</strong>: 10 (Not connected - Overdue payment).</li>
         * <li><strong>EmptyNumber</strong>: 11 (Not dialed - Nonexistent number, not dialed).</li>
         * <li><strong>PerDayCallCountLimit</strong>: 12 (Not dialed - Daily limit exceeded).</li>
         * <li><strong>ContactBlockList</strong>: 13 (Not dialed - Blacklisted).</li>
         * <li><strong>CallerNotRegistered</strong>: 14 (Not dialed - Caller number not registered).</li>
         * <li><strong>Terminated</strong>: 15 (Not dialed - Terminated).</li>
         * <li><strong>VerificationCancelled</strong>: 16 (Not dialed - Canceled due to pre-call verification failure).</li>
         * <li><strong>OutOfServiceNoCall</strong>: 17 (Not dialed - Callee suspended, not dialed).</li>
         * <li><strong>InArrearsNoCall</strong>: 18 (Not dialed - Callee has overdue payment, not dialed).</li>
         * <li><strong>CallingNumberNotExist</strong>: 19 (Not dialed - Caller number does not exist).</li>
         * <li><strong>SucceededFinish</strong>: 20 (Connected - Normal completion).</li>
         * <li><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected - Robot hung up after unrecognized intent).</li>
         * <li><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected - Hung up due to silence timeout).</li>
         * <li><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected - User hung up after unrecognized intent).</li>
         * <li><strong>SucceededClientHangUp</strong>: 24 (Connected - User hung up without reason).</li>
         * <li><strong>SucceededTransferByIntent</strong>: 25 (Connected - Transferred to agent due to matched intent).</li>
         * <li><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected - Transferred to agent after unrecognized intent).</li>
         * <li><strong>SucceededInoInterAction</strong>: 27 (Connected - No interaction on user side).</li>
         * <li><strong>SucceededError</strong>: 28 (Connected - Interrupted by system exception).</li>
         * <li><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected - Special interception - Voice assistant).</li>
         * <li><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected - Special interception - Extension number transfer).</li>
         * <li><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected - Special interception - Custom interception).</li>
         * <li><strong>HighRiskSipCode</strong>: 32 (Not dialed - High risk, not dialed).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("TaskStatusString")
        public String taskStatusString;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12334134</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UserName")
        public String userName;

        public static SearchTaskResponseBodySearchTaskInfoList build(java.util.Map<String, ?> map) throws Exception {
            SearchTaskResponseBodySearchTaskInfoList self = new SearchTaskResponseBodySearchTaskInfoList();
            return TeaModel.build(map, self);
        }

        public SearchTaskResponseBodySearchTaskInfoList setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public SearchTaskResponseBodySearchTaskInfoList setCallDuration(Integer callDuration) {
            this.callDuration = callDuration;
            return this;
        }
        public Integer getCallDuration() {
            return this.callDuration;
        }

        public SearchTaskResponseBodySearchTaskInfoList setCallDurationDisplay(String callDurationDisplay) {
            this.callDurationDisplay = callDurationDisplay;
            return this;
        }
        public String getCallDurationDisplay() {
            return this.callDurationDisplay;
        }

        public SearchTaskResponseBodySearchTaskInfoList setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public SearchTaskResponseBodySearchTaskInfoList setCallingNumber(String callingNumber) {
            this.callingNumber = callingNumber;
            return this;
        }
        public String getCallingNumber() {
            return this.callingNumber;
        }

        public SearchTaskResponseBodySearchTaskInfoList setDialException(String dialException) {
            this.dialException = dialException;
            return this;
        }
        public String getDialException() {
            return this.dialException;
        }

        public SearchTaskResponseBodySearchTaskInfoList setDialExceptionCodes(java.util.List<String> dialExceptionCodes) {
            this.dialExceptionCodes = dialExceptionCodes;
            return this;
        }
        public java.util.List<String> getDialExceptionCodes() {
            return this.dialExceptionCodes;
        }

        public SearchTaskResponseBodySearchTaskInfoList setDialExceptionOld(String dialExceptionOld) {
            this.dialExceptionOld = dialExceptionOld;
            return this;
        }
        public String getDialExceptionOld() {
            return this.dialExceptionOld;
        }

        public SearchTaskResponseBodySearchTaskInfoList setHasAnswered(Boolean hasAnswered) {
            this.hasAnswered = hasAnswered;
            return this;
        }
        public Boolean getHasAnswered() {
            return this.hasAnswered;
        }

        public SearchTaskResponseBodySearchTaskInfoList setHasHangUpByRejection(Boolean hasHangUpByRejection) {
            this.hasHangUpByRejection = hasHangUpByRejection;
            return this;
        }
        public Boolean getHasHangUpByRejection() {
            return this.hasHangUpByRejection;
        }

        public SearchTaskResponseBodySearchTaskInfoList setHasLastPlaybackCompleted(Boolean hasLastPlaybackCompleted) {
            this.hasLastPlaybackCompleted = hasLastPlaybackCompleted;
            return this;
        }
        public Boolean getHasLastPlaybackCompleted() {
            return this.hasLastPlaybackCompleted;
        }

        public SearchTaskResponseBodySearchTaskInfoList setHasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
            this.hasReachedEndOfFlow = hasReachedEndOfFlow;
            return this;
        }
        public Boolean getHasReachedEndOfFlow() {
            return this.hasReachedEndOfFlow;
        }

        public SearchTaskResponseBodySearchTaskInfoList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public SearchTaskResponseBodySearchTaskInfoList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public SearchTaskResponseBodySearchTaskInfoList setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public SearchTaskResponseBodySearchTaskInfoList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SearchTaskResponseBodySearchTaskInfoList setJobStatus(Integer jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public Integer getJobStatus() {
            return this.jobStatus;
        }

        public SearchTaskResponseBodySearchTaskInfoList setJobStatusName(String jobStatusName) {
            this.jobStatusName = jobStatusName;
            return this;
        }
        public String getJobStatusName() {
            return this.jobStatusName;
        }

        public SearchTaskResponseBodySearchTaskInfoList setJobStatusString(String jobStatusString) {
            this.jobStatusString = jobStatusString;
            return this;
        }
        public String getJobStatusString() {
            return this.jobStatusString;
        }

        public SearchTaskResponseBodySearchTaskInfoList setLabels(java.util.List<SearchTaskResponseBodySearchTaskInfoListLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<SearchTaskResponseBodySearchTaskInfoListLabels> getLabels() {
            return this.labels;
        }

        public SearchTaskResponseBodySearchTaskInfoList setRecordingDuration(Integer recordingDuration) {
            this.recordingDuration = recordingDuration;
            return this;
        }
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        public SearchTaskResponseBodySearchTaskInfoList setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public SearchTaskResponseBodySearchTaskInfoList setTaskCreateTime(Long taskCreateTime) {
            this.taskCreateTime = taskCreateTime;
            return this;
        }
        public Long getTaskCreateTime() {
            return this.taskCreateTime;
        }

        public SearchTaskResponseBodySearchTaskInfoList setTaskEndReason(Integer taskEndReason) {
            this.taskEndReason = taskEndReason;
            return this;
        }
        public Integer getTaskEndReason() {
            return this.taskEndReason;
        }

        public SearchTaskResponseBodySearchTaskInfoList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public SearchTaskResponseBodySearchTaskInfoList setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public SearchTaskResponseBodySearchTaskInfoList setTaskStatusName(String taskStatusName) {
            this.taskStatusName = taskStatusName;
            return this;
        }
        public String getTaskStatusName() {
            return this.taskStatusName;
        }

        public SearchTaskResponseBodySearchTaskInfoList setTaskStatusString(String taskStatusString) {
            this.taskStatusString = taskStatusString;
            return this;
        }
        public String getTaskStatusString() {
            return this.taskStatusString;
        }

        public SearchTaskResponseBodySearchTaskInfoList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public SearchTaskResponseBodySearchTaskInfoList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
