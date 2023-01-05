// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SearchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchTaskInfoList")
    public java.util.List<SearchTaskResponseBodySearchTaskInfoList> searchTaskInfoList;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("ActualTime")
        public Long actualTime;

        @NameInMap("CallDuration")
        public Integer callDuration;

        @NameInMap("CallDurationDisplay")
        public String callDurationDisplay;

        @NameInMap("CalledNumber")
        public String calledNumber;

        @NameInMap("DialException")
        public String dialException;

        @NameInMap("DialExceptionCodes")
        public java.util.List<String> dialExceptionCodes;

        @NameInMap("DialExceptionOld")
        public String dialExceptionOld;

        @NameInMap("HasAnswered")
        public Boolean hasAnswered;

        @NameInMap("HasHangUpByRejection")
        public Boolean hasHangUpByRejection;

        @NameInMap("HasLastPlaybackCompleted")
        public Boolean hasLastPlaybackCompleted;

        @NameInMap("HasReachedEndOfFlow")
        public Boolean hasReachedEndOfFlow;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("JobStatus")
        public Integer jobStatus;

        @NameInMap("JobStatusName")
        public String jobStatusName;

        @NameInMap("JobStatusString")
        public String jobStatusString;

        @NameInMap("RecordingDuration")
        public Integer recordingDuration;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("TaskCreateTime")
        public Long taskCreateTime;

        @NameInMap("TaskEndReason")
        public Integer taskEndReason;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TaskStatusName")
        public String taskStatusName;

        @NameInMap("TaskStatusString")
        public String taskStatusString;

        @NameInMap("UserId")
        public String userId;

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
