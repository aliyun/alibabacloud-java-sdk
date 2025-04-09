// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListJobGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2bb0cf15-2126-4c9b-bc30-bb5301b96284</p>
     */
    @NameInMap("AsyncTaskId")
    public String asyncTaskId;

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

    @NameInMap("JobGroups")
    public ListJobGroupsResponseBodyJobGroups jobGroups;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListJobGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobGroupsResponseBody self = new ListJobGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobGroupsResponseBody setAsyncTaskId(String asyncTaskId) {
        this.asyncTaskId = asyncTaskId;
        return this;
    }
    public String getAsyncTaskId() {
        return this.asyncTaskId;
    }

    public ListJobGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListJobGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListJobGroupsResponseBody setJobGroups(ListJobGroupsResponseBodyJobGroups jobGroups) {
        this.jobGroups = jobGroups;
        return this;
    }
    public ListJobGroupsResponseBodyJobGroups getJobGroups() {
        return this.jobGroups;
    }

    public ListJobGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListJobGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListJobGroupsResponseBodyJobGroupsListExportProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.xxx.com/xxx">http://www.xxx.com/xxx</a></p>
         */
        @NameInMap("FileHttpUrl")
        public String fileHttpUrl;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListJobGroupsResponseBodyJobGroupsListExportProgress build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListExportProgress self = new ListJobGroupsResponseBodyJobGroupsListExportProgress();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListExportProgress setFileHttpUrl(String fileHttpUrl) {
            this.fileHttpUrl = fileHttpUrl;
            return this;
        }
        public String getFileHttpUrl() {
            return this.fileHttpUrl;
        }

        public ListJobGroupsResponseBodyJobGroupsListExportProgress setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListJobGroupsResponseBodyJobGroupsListExportProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsListProgress extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CancelledNum")
        public Integer cancelledNum;

        /**
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ExecutingNum")
        public Integer executingNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FailedNum")
        public Integer failedNum;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PausedNum")
        public Integer pausedNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Scheduling")
        public Integer scheduling;

        /**
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCompleted")
        public Integer totalCompleted;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalJobs")
        public Integer totalJobs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNotAnswered")
        public Integer totalNotAnswered;

        public static ListJobGroupsResponseBodyJobGroupsListProgress build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListProgress self = new ListJobGroupsResponseBodyJobGroupsListProgress();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setCancelledNum(Integer cancelledNum) {
            this.cancelledNum = cancelledNum;
            return this;
        }
        public Integer getCancelledNum() {
            return this.cancelledNum;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setExecutingNum(Integer executingNum) {
            this.executingNum = executingNum;
            return this;
        }
        public Integer getExecutingNum() {
            return this.executingNum;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setFailedNum(Integer failedNum) {
            this.failedNum = failedNum;
            return this;
        }
        public Integer getFailedNum() {
            return this.failedNum;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setPausedNum(Integer pausedNum) {
            this.pausedNum = pausedNum;
            return this;
        }
        public Integer getPausedNum() {
            return this.pausedNum;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setScheduling(Integer scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Integer getScheduling() {
            return this.scheduling;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setTotalCompleted(Integer totalCompleted) {
            this.totalCompleted = totalCompleted;
            return this;
        }
        public Integer getTotalCompleted() {
            return this.totalCompleted;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setTotalJobs(Integer totalJobs) {
            this.totalJobs = totalJobs;
            return this;
        }
        public Integer getTotalJobs() {
            return this.totalJobs;
        }

        public ListJobGroupsResponseBodyJobGroupsListProgress setTotalNotAnswered(Integer totalNotAnswered) {
            this.totalNotAnswered = totalNotAnswered;
            return this;
        }
        public Integer getTotalNotAnswered() {
            return this.totalNotAnswered;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsListStrategy extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        public static ListJobGroupsResponseBodyJobGroupsListStrategy build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsListStrategy self = new ListJobGroupsResponseBodyJobGroupsListStrategy();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListJobGroupsResponseBodyJobGroupsListStrategy setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroupsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("CreationTime")
        public Long creationTime;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ExportProgress")
        public ListJobGroupsResponseBodyJobGroupsListExportProgress exportProgress;

        /**
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        @NameInMap("JobDataParsingTaskId")
        public String jobDataParsingTaskId;

        @NameInMap("JobGroupDescription")
        public String jobGroupDescription;

        /**
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        @NameInMap("JobGroupId")
        public String jobGroupId;

        @NameInMap("JobGroupName")
        public String jobGroupName;

        @NameInMap("MinConcurrency")
        public Integer minConcurrency;

        /**
         * <strong>example:</strong>
         * <p>1578550074361</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Progress")
        public ListJobGroupsResponseBodyJobGroupsListProgress progress;

        /**
         * <strong>example:</strong>
         * <p>c62e6789-28a8-41db-941e-171a01d3b3b9</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("ScriptName")
        public String scriptName;

        @NameInMap("ScriptVersion")
        public String scriptVersion;

        /**
         * <strong>example:</strong>
         * <p>Draft</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Strategy")
        public ListJobGroupsResponseBodyJobGroupsListStrategy strategy;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCallNum")
        public Integer totalCallNum;

        public static ListJobGroupsResponseBodyJobGroupsList build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroupsList self = new ListJobGroupsResponseBodyJobGroupsList();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroupsList setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ListJobGroupsResponseBodyJobGroupsList setExportProgress(ListJobGroupsResponseBodyJobGroupsListExportProgress exportProgress) {
            this.exportProgress = exportProgress;
            return this;
        }
        public ListJobGroupsResponseBodyJobGroupsListExportProgress getExportProgress() {
            return this.exportProgress;
        }

        public ListJobGroupsResponseBodyJobGroupsList setJobDataParsingTaskId(String jobDataParsingTaskId) {
            this.jobDataParsingTaskId = jobDataParsingTaskId;
            return this;
        }
        public String getJobDataParsingTaskId() {
            return this.jobDataParsingTaskId;
        }

        public ListJobGroupsResponseBodyJobGroupsList setJobGroupDescription(String jobGroupDescription) {
            this.jobGroupDescription = jobGroupDescription;
            return this;
        }
        public String getJobGroupDescription() {
            return this.jobGroupDescription;
        }

        public ListJobGroupsResponseBodyJobGroupsList setJobGroupId(String jobGroupId) {
            this.jobGroupId = jobGroupId;
            return this;
        }
        public String getJobGroupId() {
            return this.jobGroupId;
        }

        public ListJobGroupsResponseBodyJobGroupsList setJobGroupName(String jobGroupName) {
            this.jobGroupName = jobGroupName;
            return this;
        }
        public String getJobGroupName() {
            return this.jobGroupName;
        }

        public ListJobGroupsResponseBodyJobGroupsList setMinConcurrency(Integer minConcurrency) {
            this.minConcurrency = minConcurrency;
            return this;
        }
        public Integer getMinConcurrency() {
            return this.minConcurrency;
        }

        public ListJobGroupsResponseBodyJobGroupsList setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListJobGroupsResponseBodyJobGroupsList setProgress(ListJobGroupsResponseBodyJobGroupsListProgress progress) {
            this.progress = progress;
            return this;
        }
        public ListJobGroupsResponseBodyJobGroupsListProgress getProgress() {
            return this.progress;
        }

        public ListJobGroupsResponseBodyJobGroupsList setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListJobGroupsResponseBodyJobGroupsList setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public ListJobGroupsResponseBodyJobGroupsList setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

        public ListJobGroupsResponseBodyJobGroupsList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListJobGroupsResponseBodyJobGroupsList setStrategy(ListJobGroupsResponseBodyJobGroupsListStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public ListJobGroupsResponseBodyJobGroupsListStrategy getStrategy() {
            return this.strategy;
        }

        public ListJobGroupsResponseBodyJobGroupsList setTotalCallNum(Integer totalCallNum) {
            this.totalCallNum = totalCallNum;
            return this;
        }
        public Integer getTotalCallNum() {
            return this.totalCallNum;
        }

    }

    public static class ListJobGroupsResponseBodyJobGroups extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListJobGroupsResponseBodyJobGroupsList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListJobGroupsResponseBodyJobGroups build(java.util.Map<String, ?> map) throws Exception {
            ListJobGroupsResponseBodyJobGroups self = new ListJobGroupsResponseBodyJobGroups();
            return TeaModel.build(map, self);
        }

        public ListJobGroupsResponseBodyJobGroups setList(java.util.List<ListJobGroupsResponseBodyJobGroupsList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListJobGroupsResponseBodyJobGroupsList> getList() {
            return this.list;
        }

        public ListJobGroupsResponseBodyJobGroups setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListJobGroupsResponseBodyJobGroups setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListJobGroupsResponseBodyJobGroups setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
