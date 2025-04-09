// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("SearchTaskInfoList")
    public java.util.List<SearchTaskResponseBodySearchTaskInfoList> searchTaskInfoList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Total")
    public Long total;

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

    public static class SearchTaskResponseBodySearchTaskInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1643436089677</p>
         */
        @NameInMap("ActualTime")
        public Long actualTime;

        /**
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        @NameInMap("CallDuration")
        public Integer callDuration;

        /**
         * <strong>example:</strong>
         * <p>ActualTime</p>
         */
        @NameInMap("CallDurationDisplay")
        public String callDurationDisplay;

        /**
         * <strong>example:</strong>
         * <p>15205879599</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <strong>example:</strong>
         * <p>[{&quot;code&quot;:&quot;OutboundCallError.SipCodeError&quot;, &quot;params&quot;:[{&quot;key&quot;:&quot;SipCode&quot;,&quot;value&quot;:&quot;500&quot;}]}]</p>
         */
        @NameInMap("DialException")
        public String dialException;

        @NameInMap("DialExceptionCodes")
        public java.util.List<String> dialExceptionCodes;

        /**
         * <strong>example:</strong>
         * <p>[&quot;OutboundCallError.SipTrunkError&quot;]</p>
         */
        @NameInMap("DialExceptionOld")
        public String dialExceptionOld;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasAnswered")
        public Boolean hasAnswered;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasHangUpByRejection")
        public Boolean hasHangUpByRejection;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasReachedEndOfFlow")
        public Boolean hasReachedEndOfFlow;

        /**
         * <strong>example:</strong>
         * <p>73df6283-26b2-402d-bad0-ffa489923ea1</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>37db3113-ad34-4ba3-b930-468f016bbf95</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <strong>example:</strong>
         * <p>6203248e-e652-4ef8-a1eb-586ed7b54dc2</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        @NameInMap("JobStatus")
        public Integer jobStatus;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("JobStatusName")
        public String jobStatusName;

        /**
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("JobStatusString")
        public String jobStatusString;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <strong>example:</strong>
         * <p>1646792941</p>
         */
        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        /**
         * <strong>example:</strong>
         * <p>OutOfService</p>
         */
        @NameInMap("TaskEndReason")
        public Integer taskEndReason;

        /**
         * <strong>example:</strong>
         * <p>479aea04-3a92-4ac3-935d-c8798c667850</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TaskStatusName")
        public String taskStatusName;

        /**
         * <strong>example:</strong>
         * <p>Executing</p>
         */
        @NameInMap("TaskStatusString")
        public String taskStatusString;

        /**
         * <strong>example:</strong>
         * <p>12334134</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
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
