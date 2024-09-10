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
     * 
     * <strong>example:</strong>
     * <p>1A975D03-5F49-5354-B2CB-3918D5DA****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1678895999999</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>s-wz95vuqky0ada4******</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The amount of data detected. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>154.11</p>
         */
        @NameInMap("MeasureSpace")
        public Long measureSpace;

        /**
         * <p>The progress of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The execution progress of the check items.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;scaVul\&quot;:100,\&quot;binary\&quot;:100,\&quot;baseline\&quot;:100,\&quot;vul\&quot;:100,\&quot;webshell\&quot;:100,\&quot;script\&quot;:100,\&quot;sensitiveInfo\&quot;:100}&quot;</p>
         */
        @NameInMap("ProgressByProject")
        public String progressByProject;

        /**
         * <p>The download URL of the report.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://newsas-oss-bucket.oss-cn-hangzhou.aliyuncs.com/agent_less_single_report">http://newsas-oss-bucket.oss-cn-hangzhou.aliyuncs.com/agent_less_single_report</a>****</p>
         */
        @NameInMap("ReportDownloadUrl")
        public String reportDownloadUrl;

        /**
         * <p>The status of the report. Valid values:</p>
         * <ul>
         * <li><strong>PREPARED</strong>: preparing</li>
         * <li><strong>RUNNING</strong>: running</li>
         * <li><strong>SUCCESS</strong>: succeeded</li>
         * <li><strong>TIMEOUT</strong>: timed out</li>
         * <li><strong>FAILED</strong>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("ReportStatus")
        public String reportStatus;

        /**
         * <p>The result of the detection.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The start timestamp of the task. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1672741657897</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the detection task.</p>
         * <ul>
         * <li><strong>1</strong>: The detection task is in progress.</li>
         * <li><strong>2</strong>: The detection task is complete.</li>
         * <li><strong>3</strong>: The detection task fails.</li>
         * <li><strong>4</strong>: The detection task times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The name of the asset that is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>hkdevt****</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the asset that is detected. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: snapshot</li>
         * <li><strong>2</strong>: image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TargetType")
        public Integer targetType;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1538****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the detection task.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENTLESS_SCAN</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
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

        public ListAgentlessTaskResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
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
