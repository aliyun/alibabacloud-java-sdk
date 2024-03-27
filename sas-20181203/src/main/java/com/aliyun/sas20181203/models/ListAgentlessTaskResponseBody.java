// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessTaskResponseBody extends TeaModel {
    /**
     * <p>The tasks.</p>
     */
    @NameInMap("List")
    public java.util.List<ListAgentlessTaskResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAgentlessTaskResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessTaskResponseBody self = new ListAgentlessTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessTaskResponseBody setList(java.util.List<ListAgentlessTaskResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentlessTaskResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentlessTaskResponseBody setPageInfo(ListAgentlessTaskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAgentlessTaskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentlessTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentlessTaskResponseBodyList extends TeaModel {
        /**
         * <p>The end timestamp of the task. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The volume of detection data, in MB.</p>
         */
        @NameInMap("MeasureSpace")
        public Long measureSpace;

        /**
         * <p>The progress of the task.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The execution progress of the inspection items.</p>
         */
        @NameInMap("ProgressByProject")
        public String progressByProject;

        /**
         * <p>The download link for the report.</p>
         */
        @NameInMap("ReportDownloadUrl")
        public String reportDownloadUrl;

        /**
         * <p>The status of the report. Possible values:</p>
         * <br>
         * <p>*   **PREPARED**: In preparation.</p>
         * <p>*   **RUNNING**: In progress.</p>
         * <p>*   **SUCCESS**: Successful.</p>
         * <p>*   **TIMEOUT**: Timeout.</p>
         * <p>*   **FAILED**: Failed.</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The result of the detection.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The start timestamp of the task. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the detection task.</p>
         * <br>
         * <p>*   **1**: The detection task is in progress.</p>
         * <p>*   **2**: The detection task is complete.</p>
         * <p>*   **3**: The detection task fails.</p>
         * <p>*   **4**: The detection task times out.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the asset that is detected.</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset that is detected. Valid values:</p>
         * <br>
         * <p>*   **1**: snapshot</p>
         * <p>*   **2**: image</p>
         */
        @NameInMap("TargetType")
        public Integer targetType;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the detection task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The UUID of the asset.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListAgentlessTaskResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessTaskResponseBodyList self = new ListAgentlessTaskResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessTaskResponseBodyList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAgentlessTaskResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAgentlessTaskResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListAgentlessTaskResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListAgentlessTaskResponseBodyList setMeasureSpace(Long measureSpace) {
            this.measureSpace = measureSpace;
            return this;
        }
        public Long getMeasureSpace() {
            return this.measureSpace;
        }

        public ListAgentlessTaskResponseBodyList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListAgentlessTaskResponseBodyList setProgressByProject(String progressByProject) {
            this.progressByProject = progressByProject;
            return this;
        }
        public String getProgressByProject() {
            return this.progressByProject;
        }

        public ListAgentlessTaskResponseBodyList setReportDownloadUrl(String reportDownloadUrl) {
            this.reportDownloadUrl = reportDownloadUrl;
            return this;
        }
        public String getReportDownloadUrl() {
            return this.reportDownloadUrl;
        }

        public ListAgentlessTaskResponseBodyList setReportStatus(String reportStatus) {
            this.reportStatus = reportStatus;
            return this;
        }
        public String getReportStatus() {
            return this.reportStatus;
        }

        public ListAgentlessTaskResponseBodyList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListAgentlessTaskResponseBodyList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAgentlessTaskResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAgentlessTaskResponseBodyList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAgentlessTaskResponseBodyList setTargetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }
        public Integer getTargetType() {
            return this.targetType;
        }

        public ListAgentlessTaskResponseBodyList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAgentlessTaskResponseBodyList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListAgentlessTaskResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListAgentlessTaskResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentlessTaskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessTaskResponseBodyPageInfo self = new ListAgentlessTaskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAgentlessTaskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAgentlessTaskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentlessTaskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
