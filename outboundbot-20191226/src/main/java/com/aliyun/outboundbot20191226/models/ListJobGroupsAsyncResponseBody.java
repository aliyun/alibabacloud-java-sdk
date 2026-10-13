// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsAsyncResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
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
     * <p>The list of job groups.</p>
     */
    @NameInMap("JobGroups")
    public java.util.List<ListJobGroupsAsyncResponseBodyJobGroups> jobGroups;

    /**
     * <p>The response message.</p>
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
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Indicates whether the request timed out.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Timeout")
    public Boolean timeout;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Indicates whether the request is valid.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p><strong>[Deprecated]</strong> The download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.com/xxx">http://www.xxx.com/xxx</a></p>
         */
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        /**
         * <p>The progress.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
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
        /**
         * <p>The number of canceled jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CancelledNum")
        public Integer cancelledNum;

        /**
         * <p><strong>[Deprecated]</strong> The total execution duration up to the current time.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The number of jobs being executed.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ExecutingNum")
        public Integer executingNum;

        /**
         * <p>The number of failed jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("FailedNum")
        public Integer failedNum;

        /**
         * <p>The number of paused jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PausedNum")
        public Integer pausedNum;

        /**
         * <p>The number of jobs being scheduled.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Scheduling")
        public Integer scheduling;

        /**
         * <p><strong>[Deprecated]</strong> The start time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640316786259</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The execution status. Valid values:</p>
         * <ul>
         * <li>Draft: The job group is a draft.</li>
         * <li>Scheduling: The job group is being scheduled.</li>
         * <li>Executing: The job group is being executed.</li>
         * <li>Completed: The job group is completed.</li>
         * <li>Paused: The job group is paused.</li>
         * <li>Failed: The job group failed.</li>
         * <li>Cancelled: The job group is canceled.</li>
         * <li>Initializing: The job group is being initialized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of completed jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        /**
         * <p>The total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalJobs")
        public Integer totalJobs;

        /**
         * <p><strong>[Deprecated]</strong> The number of unanswered jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The end time of the strategy. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640316786259</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the strategy. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640316786259</p>
         */
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
        /**
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640316786259</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <p>The export progress.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExportProgress")
        public ListJobGroupsAsyncResponseBodyJobGroupsExportProgress exportProgress;

        /**
         * <p><strong>[Deprecated]</strong> The ID of the jobFile parsing task.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        /**
         * <p>The description of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        /**
         * <p>The ID of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        /**
         * <p>The name of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("JobGroupName")
        public String jobGroupName;

        /**
         * <p>The minimum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinConcurrency")
        public Integer minConcurrency;

        /**
         * <p>The modification time in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1640316786259</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The node statistics information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Progress")
        public ListJobGroupsAsyncResponseBodyJobGroupsProgress progress;

        /**
         * <p>The ID of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The name of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The version of the script.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        /**
         * <p>The status of the job group.</p>
         * 
         * <strong>example:</strong>
         * <p>Scheduling</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p><strong>[Deprecated]</strong> The strategy.</p>
         * <blockquote>
         * <p>To view the strategy information of the job group, call the DescribeJobGroup operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Strategy")
        public ListJobGroupsAsyncResponseBodyJobGroupsStrategy strategy;

        /**
         * <p>The total number of calls.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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

        public ListJobGroupsAsyncResponseBodyJobGroups setMinConcurrency(Integer minConcurrency) {
            this.minConcurrency = minConcurrency;
            return this;
        }
        public Integer getMinConcurrency() {
            return this.minConcurrency;
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
