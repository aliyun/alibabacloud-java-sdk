// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskResponseBody extends TeaModel {
    /**
     * <p>Request status code</p>
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
     * <p>Labels available for filtering.</p>
     * <blockquote>
     * <p>Displays all labels with enumeration values in this job group.</p>
     * </blockquote>
     */
    @NameInMap("Labels")
    public java.util.List<SearchTaskResponseBodyLabels> labels;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>Number of items per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of tasks</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SearchTaskInfoList")
    public java.util.List<SearchTaskResponseBodySearchTaskInfoList> searchTaskInfoList;

    /**
     * <p>Indicates whether the request succeeded</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of items</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <p>Complete list of label keys</p>
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
         * <p>Label name</p>
         * 
         * <strong>example:</strong>
         * <p>是否满意</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>List of label values</p>
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
         * <p>Label name</p>
         * 
         * <strong>example:</strong>
         * <p>是否满意</p>
         */
        @NameInMap("K")
        public String k;

        /**
         * <p>Matched label value</p>
         * 
         * <strong>example:</strong>
         * <p>是</p>
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
         * <p>Actual execution time</p>
         * 
         * <strong>example:</strong>
         * <p>1643436089677</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <p>Call duration, in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>46000</p>
         */
        @NameInMap("CallDuration")
        public Integer callDuration;

        /**
         * <p>Call duration</p>
         * 
         * <strong>example:</strong>
         * <p>47″</p>
         */
        @NameInMap("CallDurationDisplay")
        public String callDurationDisplay;

        /**
         * <p>Called number</p>
         * 
         * <strong>example:</strong>
         * <p>15205879599</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>Calling number</p>
         * 
         * <strong>example:</strong>
         * <p>02152739269</p>
         */
        @NameInMap("CallingNumber")
        public String callingNumber;

        /**
         * <p>Exception details</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;code&quot;:&quot;OutboundCallError.SipCodeError&quot;, &quot;params&quot;:[{&quot;key&quot;:&quot;SipCode&quot;,&quot;value&quot;:&quot;500&quot;}]}]</p>
         */
        @NameInMap("DialException")
        public String dialException;

        /**
         * <p>Exception codes shown on the remarks page</p>
         */
        @NameInMap("DialExceptionCodes")
        public java.util.List<String> dialExceptionCodes;

        /**
         * <p>Exception details</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;OutboundCallError.SipTrunkError&quot;]</p>
         */
        @NameInMap("DialExceptionOld")
        public String dialExceptionOld;

        /**
         * <p>Indicates whether the called party answered</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAnswered")
        public Boolean hasAnswered;

        /**
         * <p>Indicates whether the call ended due to rejection</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasHangUpByRejection")
        public Boolean hasHangUpByRejection;

        /**
         * <p>Indicates whether the last audio playback completed before hangup</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        /**
         * <p>Indicates whether the conversation ended</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasReachedEndOfFlow")
        public Boolean hasReachedEndOfFlow;

        /**
         * <p>Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>73df6283-26b2-402d-bad0-ffa489923ea1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Job group ID</p>
         * 
         * <strong>example:</strong>
         * <p>37db3113-ad34-4ba3-b930-468f016bbf95</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>Job group name</p>
         * 
         * <strong>example:</strong>
         * <p>85成新（有笔记划线）2021_11_14_18_00_51</p>
         */
        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <p>Job ID</p>
         * 
         * <strong>example:</strong>
         * <p>6203248e-e652-4ef8-a1eb-586ed7b54dc2</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>Job status</p>
         * <ul>
         * <li><p>0: Scheduling</p>
         * </li>
         * <li><p>1: Executing</p>
         * </li>
         * <li><p>2: Succeeded</p>
         * </li>
         * <li><p>3: Paused</p>
         * </li>
         * <li><p>4: Failed</p>
         * </li>
         * <li><p>5: Cancelled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JobStatus")
        public Integer jobStatus;

        /**
         * <p>Display text for job status</p>
         * <ul>
         * <li><p>0: Scheduling</p>
         * </li>
         * <li><p>1: Executing</p>
         * </li>
         * <li><p>2: Succeeded</p>
         * </li>
         * <li><p>3: Paused</p>
         * </li>
         * <li><p>4: Failed</p>
         * </li>
         * <li><p>5: Cancelled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>调度中</p>
         */
        @NameInMap("JobStatusName")
        public String jobStatusName;

        /**
         * <p>Job status</p>
         * <ul>
         * <li><p>Scheduling (0)</p>
         * </li>
         * <li><p>Executing (1)</p>
         * </li>
         * <li><p>Completed—Reached (2)</p>
         * </li>
         * <li><p>Paused (3)</p>
         * </li>
         * <li><p>Failed—Line busy (4)</p>
         * </li>
         * <li><p>Cancelled (5)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("JobStatusString")
        public String jobStatusString;

        /**
         * <p>Labels matched for this outbound call</p>
         */
        @NameInMap("Labels")
        public java.util.List<SearchTaskResponseBodySearchTaskInfoListLabels> labels;

        /**
         * <p>Ringing duration, in seconds</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        /**
         * <p>Scenario name</p>
         * 
         * <strong>example:</strong>
         * <p>慢病线索</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>Task creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        /**
         * <p>Reason why the task ended</p>
         * <ul>
         * <li><p>FINISHED(1,&quot;Normal completion&quot;)</p>
         * </li>
         * <li><p>CHATBOT_HANGUP_AFTER_NOANSWER(2, &quot;Robot hangup after rejection&quot;)</p>
         * </li>
         * <li><p>CHATBOT_HANGUP_AFTER_SILENCE(3, &quot;Robot hangup after silence timeout&quot;)</p>
         * </li>
         * <li><p>CLIENT_HANGUP_AFTER_NOANSWER(4, &quot;Client hangup after rejection&quot;)</p>
         * </li>
         * <li><p>CLIENT_HANGUP(5, &quot;Client hangup without reason&quot;)</p>
         * </li>
         * <li><p>TRANSFER_BY_INTENT(6, &quot;Transfer to agent based on intent match&quot;)</p>
         * </li>
         * <li><p>TRANSFER_AFTER_NOANSWER(7, &quot;Transfer to agent after rejection&quot;)</p>
         * </li>
         * <li><p>INO_INTERACTION(8, &quot;No interaction from client side&quot;)</p>
         * </li>
         * <li><p>ERROR(9, &quot;System error interrupted&quot;)</p>
         * </li>
         * <li><p>SPECIAL_INTERCEPT_VOICE_ASSISTANT(10, &quot;Intercepted by voice assistant&quot;)</p>
         * </li>
         * <li><p>SPECIAL_INTERCEPT_EXTENSION_NUMBER_TRANSFER(11, &quot;Intercepted by extension transfer&quot;)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OutOfService</p>
         */
        @NameInMap("TaskEndReason")
        public Integer taskEndReason;

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>479aea04-3a92-4ac3-935d-c8798c667850</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>Executing</strong>: 0 (Calling).</p>
         * </li>
         * <li><p><strong>Succeeded</strong>: 1 (Connected).</p>
         * </li>
         * <li><p><strong>NoAnswer</strong>: 2 (No answer).</p>
         * </li>
         * <li><p><strong>NotExist</strong>: 3 (Nonexistent number).</p>
         * </li>
         * <li><p><strong>Busy</strong>: 4 (Line busy).</p>
         * </li>
         * <li><p><strong>Cancelled</strong>: 5 (Call canceled due to job stop).</p>
         * </li>
         * <li><p><strong>Failed</strong>: 6 (Call failed).</p>
         * </li>
         * <li><p><strong>NotConnected</strong>: 7 (Cannot connect).</p>
         * </li>
         * <li><p><strong>PoweredOff</strong>: 8 (Phone powered off).</p>
         * </li>
         * <li><p><strong>OutOfService</strong>: 9 (Called number out of service).</p>
         * </li>
         * <li><p><strong>InArrears</strong>: 10 (Called number overdue payment).</p>
         * </li>
         * <li><p><strong>EmptyNumber</strong>: 11 (Empty number, no outbound call).</p>
         * </li>
         * <li><p><strong>PerDayCallCountLimit</strong>: 12 (Daily call limit exceeded).</p>
         * </li>
         * <li><p><strong>ContactBlockList</strong>: 13 (Blacklisted).</p>
         * </li>
         * <li><p><strong>CallerNotRegistered</strong>: 14 (Caller number not registered).</p>
         * </li>
         * <li><p><strong>Terminated</strong>: 15 (Call terminated).</p>
         * </li>
         * <li><p><strong>VerificationCancelled</strong>: 16 (Call canceled due to pre-call validation failure).</p>
         * </li>
         * <li><p><strong>OutOfServiceNoCall</strong>: 17 (Called number out of service, no outbound call).</p>
         * </li>
         * <li><p><strong>InArrearsNoCall</strong>: 18 (Called number overdue payment, no outbound call).</p>
         * </li>
         * <li><p><strong>CallingNumberNotExist</strong>: 19 (Caller number does not exist).</p>
         * </li>
         * <li><p><strong>SucceededFinish</strong>: 20 (Connected and ended normally).</p>
         * </li>
         * <li><p><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected and robot hung up after rejection).</p>
         * </li>
         * <li><p><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected and robot hung up after silence timeout).</p>
         * </li>
         * <li><p><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected and client hung up after rejection).</p>
         * </li>
         * <li><p><strong>SucceededClientHangUp</strong>: 24 (Connected and client hung up without reason).</p>
         * </li>
         * <li><p><strong>SucceededTransferByIntent</strong>: 25 (Connected and transferred to agent based on intent match).</p>
         * </li>
         * <li><p><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected and transferred to agent after rejection).</p>
         * </li>
         * <li><p><strong>SucceededInoInterAction</strong>: 27 (Connected and no interaction from client side).</p>
         * </li>
         * <li><p><strong>SucceededError</strong>: 28 (Connected but system error interrupted).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected but intercepted by voice assistant).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected but intercepted by extension transfer).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>Display text for task status</p>
         * <ul>
         * <li><p><strong>Executing</strong>: 0 (Calling).</p>
         * </li>
         * <li><p><strong>Succeeded</strong>: 1 (Connected).</p>
         * </li>
         * <li><p><strong>NoAnswer</strong>: 2 (No answer).</p>
         * </li>
         * <li><p><strong>NotExist</strong>: 3 (Nonexistent number).</p>
         * </li>
         * <li><p><strong>Busy</strong>: 4 (Line busy).</p>
         * </li>
         * <li><p><strong>Cancelled</strong>: 5 (Call canceled due to job stop).</p>
         * </li>
         * <li><p><strong>Failed</strong>: 6 (Call failed).</p>
         * </li>
         * <li><p><strong>NotConnected</strong>: 7 (Cannot connect).</p>
         * </li>
         * <li><p><strong>PoweredOff</strong>: 8 (Phone powered off).</p>
         * </li>
         * <li><p><strong>OutOfService</strong>: 9 (Called number out of service).</p>
         * </li>
         * <li><p><strong>InArrears</strong>: 10 (Called number overdue payment).</p>
         * </li>
         * <li><p><strong>EmptyNumber</strong>: 11 (Empty number, no outbound call).</p>
         * </li>
         * <li><p><strong>PerDayCallCountLimit</strong>: 12 (Daily call limit exceeded).</p>
         * </li>
         * <li><p><strong>ContactBlockList</strong>: 13 (Blacklisted).</p>
         * </li>
         * <li><p><strong>CallerNotRegistered</strong>: 14 (Caller number not registered).</p>
         * </li>
         * <li><p><strong>Terminated</strong>: 15 (Call terminated).</p>
         * </li>
         * <li><p><strong>VerificationCancelled</strong>: 16 (Call canceled due to pre-call validation failure).</p>
         * </li>
         * <li><p><strong>OutOfServiceNoCall</strong>: 17 (Called number out of service, no outbound call).</p>
         * </li>
         * <li><p><strong>InArrearsNoCall</strong>: 18 (Called number overdue payment, no outbound call).</p>
         * </li>
         * <li><p><strong>CallingNumberNotExist</strong>: 19 (Caller number does not exist).</p>
         * </li>
         * <li><p><strong>SucceededFinish</strong>: 20 (Connected and ended normally).</p>
         * </li>
         * <li><p><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected and robot hung up after rejection).</p>
         * </li>
         * <li><p><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected and robot hung up after silence timeout).</p>
         * </li>
         * <li><p><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected and client hung up after rejection).</p>
         * </li>
         * <li><p><strong>SucceededClientHangUp</strong>: 24 (Connected and client hung up without reason).</p>
         * </li>
         * <li><p><strong>SucceededTransferByIntent</strong>: 25 (Connected and transferred to agent based on intent match).</p>
         * </li>
         * <li><p><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected and transferred to agent after rejection).</p>
         * </li>
         * <li><p><strong>SucceededInoInterAction</strong>: 27 (Connected and no interaction from client side).</p>
         * </li>
         * <li><p><strong>SucceededError</strong>: 28 (Connected but system error interrupted).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected but intercepted by voice assistant).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected but intercepted by extension transfer).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>正在拨打</p>
         */
        @NameInMap("TaskStatusName")
        public String taskStatusName;

        /**
         * <p>Task status</p>
         * <ul>
         * <li><p><strong>Executing</strong>: 0 (Calling).</p>
         * </li>
         * <li><p><strong>Succeeded</strong>: 1 (Connected).</p>
         * </li>
         * <li><p><strong>NoAnswer</strong>: 2 (No answer).</p>
         * </li>
         * <li><p><strong>NotExist</strong>: 3 (Nonexistent number).</p>
         * </li>
         * <li><p><strong>Busy</strong>: 4 (Line busy).</p>
         * </li>
         * <li><p><strong>Cancelled</strong>: 5 (Call canceled due to job stop).</p>
         * </li>
         * <li><p><strong>Failed</strong>: 6 (Call failed).</p>
         * </li>
         * <li><p><strong>NotConnected</strong>: 7 (Cannot connect).</p>
         * </li>
         * <li><p><strong>PoweredOff</strong>: 8 (Phone powered off).</p>
         * </li>
         * <li><p><strong>OutOfService</strong>: 9 (Called number out of service).</p>
         * </li>
         * <li><p><strong>InArrears</strong>: 10 (Called number overdue payment).</p>
         * </li>
         * <li><p><strong>EmptyNumber</strong>: 11 (Empty number, no outbound call).</p>
         * </li>
         * <li><p><strong>PerDayCallCountLimit</strong>: 12 (Daily call limit exceeded).</p>
         * </li>
         * <li><p><strong>ContactBlockList</strong>: 13 (Blacklisted).</p>
         * </li>
         * <li><p><strong>CallerNotRegistered</strong>: 14 (Caller number not registered).</p>
         * </li>
         * <li><p><strong>Terminated</strong>: 15 (Call terminated).</p>
         * </li>
         * <li><p><strong>VerificationCancelled</strong>: 16 (Call canceled due to pre-call validation failure).</p>
         * </li>
         * <li><p><strong>OutOfServiceNoCall</strong>: 17 (Called number out of service, no outbound call).</p>
         * </li>
         * <li><p><strong>InArrearsNoCall</strong>: 18 (Called number overdue payment, no outbound call).</p>
         * </li>
         * <li><p><strong>CallingNumberNotExist</strong>: 19 (Caller number does not exist).</p>
         * </li>
         * <li><p><strong>SucceededFinish</strong>: 20 (Connected and ended normally).</p>
         * </li>
         * <li><p><strong>SucceededChatbotHangUpAfterNoAnswer</strong>: 21 (Connected and robot hung up after rejection).</p>
         * </li>
         * <li><p><strong>SucceededChatbotHangUpAfterSilence</strong>: 22 (Connected and robot hung up after silence timeout).</p>
         * </li>
         * <li><p><strong>SucceededClientHangUpAfterNoAnswer</strong>: 23 (Connected and client hung up after rejection).</p>
         * </li>
         * <li><p><strong>SucceededClientHangUp</strong>: 24 (Connected and client hung up without reason).</p>
         * </li>
         * <li><p><strong>SucceededTransferByIntent</strong>: 25 (Connected and transferred to agent based on intent match).</p>
         * </li>
         * <li><p><strong>SucceededTransferAfterNoAnswer</strong>: 26 (Connected and transferred to agent after rejection).</p>
         * </li>
         * <li><p><strong>SucceededInoInterAction</strong>: 27 (Connected and no interaction from client side).</p>
         * </li>
         * <li><p><strong>SucceededError</strong>: 28 (Connected but system error interrupted).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptVoiceAssistant</strong>: 29 (Connected but intercepted by voice assistant).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptExtensionNumberTransfer</strong>: 30 (Connected but intercepted by extension transfer).</p>
         * </li>
         * <li><p><strong>SucceededSpecialInterceptCustomSpecialIntercept</strong>: 31 (Connected but intercepted by custom rule).</p>
         * </li>
         * <li><p><strong>HighRiskSipCode</strong>: 32 (High-risk SIP code, no outbound call).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("TaskStatusString")
        public String taskStatusString;

        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>12334134</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>Username</p>
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
