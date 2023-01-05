// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsAsyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("JobGroups")
    public java.util.List<ListJobGroupsAsyncResponseBodyJobGroups> jobGroups;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Timeout")
    public Boolean timeout;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Vaild")
    public Boolean vaild;

    public static ListJobGroupsAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsAsyncResponseBody self = new ListJobGroupsAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobGroupsAsyncResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobGroupsAsyncResponseBody setJobGroups(java.util.List<ListJobGroupsAsyncResponseBodyJobGroups> jobGroups) {
        this.jobGroups = jobGroups;
        return this;
    }
    public java.util.List<ListJobGroupsAsyncResponseBodyJobGroups> getJobGroups() {
        return this.jobGroups;
    }

    public ListJobGroupsAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobGroupsAsyncResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobGroupsAsyncResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJobGroupsAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobGroupsAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListJobGroupsAsyncResponseBody setTimeout(Boolean timeout) {
        this.timeout = timeout;
        return this;
    }
    public Boolean getTimeout() {
        return this.timeout;
    }

    public ListJobGroupsAsyncResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListJobGroupsAsyncResponseBody setVaild(Boolean vaild) {
        this.vaild = vaild;
        return this;
    }
    public Boolean getVaild() {
        return this.vaild;
    }

    public static class ListJobGroupsAsyncResponseBodyJobGroupsExportProgress extends TeaModel {
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("Status")
        public String status;

        public static ListJobGroupsAsyncResponseBodyJobGroupsExportProgress build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsAsyncResponseBodyJobGroupsExportProgress self = new ListJobGroupsAsyncResponseBodyJobGroupsExportProgress();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsExportProgress setFileHttpUrl(String fileHttpUrl) {
            this.fileHttpUrl = fileHttpUrl;
            return this;
        }
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsExportProgress setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsExportProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListJobGroupsAsyncResponseBodyJobGroupsProgress extends TeaModel {
        @NameInMap("CancelledNum")
        public Integer cancelledNum;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("ExecutingNum")
        public Integer executingNum;

        @NameInMap("FailedNum")
        public Integer failedNum;

        @NameInMap("PausedNum")
        public Integer pausedNum;

        @NameInMap("Scheduling")
        public Integer scheduling;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        @NameInMap("TotalJobs")
        public Integer totalJobs;

        @NameInMap("TotalNotAnswered")
        public Integer totalNotAnswered;

        public static ListJobGroupsAsyncResponseBodyJobGroupsProgress build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsAsyncResponseBodyJobGroupsProgress self = new ListJobGroupsAsyncResponseBodyJobGroupsProgress();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setCancelledNum(Integer cancelledNum) {
            this.cancelledNum = cancelledNum;
            return this;
        }
        public Integer getCancelledNum() {
            return this.cancelledNum;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setExecutingNum(Integer executingNum) {
            this.executingNum = executingNum;
            return this;
        }
        public Integer getExecutingNum() {
            return this.executingNum;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setPausedNum(Integer pausedNum) {
            this.pausedNum = pausedNum;
            return this;
        }
        public Integer getPausedNum() {
            return this.pausedNum;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setScheduling(Integer scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Integer getScheduling() {
            return this.scheduling;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsProgress setTotalNotAnswered(Integer totalNotAnswered) {
            this.totalNotAnswered = totalNotAnswered;
            return this;
        }
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

    }

    public static class ListJobGroupsAsyncResponseBodyJobGroupsStrategy extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListJobGroupsAsyncResponseBodyJobGroupsStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsAsyncResponseBodyJobGroupsStrategy self = new ListJobGroupsAsyncResponseBodyJobGroupsStrategy();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListJobGroupsAsyncResponseBodyJobGroupsStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListJobGroupsAsyncResponseBodyJobGroups extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("ExportProgress")
        public ListJobGroupsAsyncResponseBodyJobGroupsExportProgress exportProgress;

        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Progress")
        public ListJobGroupsAsyncResponseBodyJobGroupsProgress progress;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("ScriptVersion")
        public String scriptVersion;

        @NameInMap("Status")
        public String status;

        @NameInMap("Strategy")
        public ListJobGroupsAsyncResponseBodyJobGroupsStrategy strategy;

        @NameInMap("TotalCallNum")
        public Integer totalCallNum;

        public static ListJobGroupsAsyncResponseBodyJobGroups build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsAsyncResponseBodyJobGroups self = new ListJobGroupsAsyncResponseBodyJobGroups();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setExportProgress(ListJobGroupsAsyncResponseBodyJobGroupsExportProgress exportProgress) {
            this.exportProgress = exportProgress;
            return this;
        }
        public ListJobGroupsAsyncResponseBodyJobGroupsExportProgress getExportProgress() {
            return this.exportProgress;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setJobDataParsingTaskId(String jobDataParsingTaskId) {
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setProgress(ListJobGroupsAsyncResponseBodyJobGroupsProgress progress) {
            this.progress = progress;
            return this;
        }
        public ListJobGroupsAsyncResponseBodyJobGroupsProgress getProgress() {
            return this.progress;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setStrategy(ListJobGroupsAsyncResponseBodyJobGroupsStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListJobGroupsAsyncResponseBodyJobGroupsStrategy getStrategy() {
            return this.strategy;
        }

        public ListJobGroupsAsyncResponseBodyJobGroups setTotalCallNum(Integer totalCallNum) {
            this.totalCallNum = totalCallNum;
            return this;
        }
        public Integer getTotalCallNum() {
            return this.totalCallNum;
        }

    }

}
