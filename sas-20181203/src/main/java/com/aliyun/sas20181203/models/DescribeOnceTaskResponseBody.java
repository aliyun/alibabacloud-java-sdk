// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeOnceTaskResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array that consists of the tasks.</p>
     */
    @NameInMap("TaskManageResponseList")
    public java.util.List<DescribeOnceTaskResponseBodyTaskManageResponseList> taskManageResponseList;

    public static DescribeOnceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnceTaskResponseBody self = new DescribeOnceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnceTaskResponseBody setPageInfo(DescribeOnceTaskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeOnceTaskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeOnceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnceTaskResponseBody setTaskManageResponseList(java.util.List<DescribeOnceTaskResponseBodyTaskManageResponseList> taskManageResponseList) {
        this.taskManageResponseList = taskManageResponseList;
        return this;
    }
    public java.util.List<DescribeOnceTaskResponseBodyTaskManageResponseList> getTaskManageResponseList() {
        return this.taskManageResponseList;
    }

    public static class DescribeOnceTaskResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: **20**.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeOnceTaskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnceTaskResponseBodyPageInfo self = new DescribeOnceTaskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOnceTaskResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeOnceTaskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeOnceTaskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeOnceTaskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeOnceTaskResponseBodyTaskManageResponseList extends TeaModel {
        /**
         * <p>The execution details of the task. The value of this parameter is in the JSON format.</p>
         * <br>
         * <p>*   **causeCode**: the returned code for the cause</p>
         * <p>*   **causeMsg**: the returned information for the cause</p>
         * <p>*   **resCode**: the returned code of troubleshooting</p>
         * <p>*   **resMsg**: the returned information about troubleshooting</p>
         * <p>*   **problemType**: the type of the issue</p>
         * <p>*   **dispatchType**: the task delivery method</p>
         * <p>*   **uuid**: the UUID of the server</p>
         * <p>*   **instanceId**: the instance ID of the server</p>
         * <p>*   **internetIp**: the public IP address of the server</p>
         * <p>*   **intranetIp**: the private IP address of the server</p>
         * <p>*   **instanceName**: the instance name of the server</p>
         * <p>*   **url**: the download link of the troubleshooting log</p>
         */
        @NameInMap("DetailData")
        public String detailData;

        /**
         * <p>The number of tasks that failed.</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The execution result of the task.</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The number of tasks that succeeded.</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The timestamp when the task ends. Unit: milliseconds.</p>
         */
        @NameInMap("TaskEndTime")
        public Long taskEndTime;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The timestamp when the task starts. Unit: milliseconds.</p>
         */
        @NameInMap("TaskStartTime")
        public Long taskStartTime;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **1**: started</p>
         * <p>*   **2**: complete</p>
         * <p>*   **3**: failed</p>
         * <p>*   **4**: timed out</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The text description of the status for the task. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is pending start.</p>
         * <p>*   **START**: The task is started.</p>
         * <p>*   **DISPATCH**: The self-check command is issued.</p>
         * <p>*   **SUCCESS**: The self-check is complete.</p>
         * <p>*   **FAIL**: The task fails.</p>
         * <p>*   **TIMEOUT**: The task times out.</p>
         */
        @NameInMap("TaskStatusText")
        public String taskStatusText;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent</p>
         * <p>*   **CLIENT\_DEV_OPS**: an O\&M task of Cloud Assistant</p>
         * <p>*   **ASSET\_SECURITY_CHECK**: a task of asset information collection</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeOnceTaskResponseBodyTaskManageResponseList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOnceTaskResponseBodyTaskManageResponseList self = new DescribeOnceTaskResponseBodyTaskManageResponseList();
            return TeaModel.build(map, self);
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setDetailData(String detailData) {
            this.detailData = detailData;
            return this;
        }
        public String getDetailData() {
            return this.detailData;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setResultInfo(String resultInfo) {
            this.resultInfo = resultInfo;
            return this;
        }
        public String getResultInfo() {
            return this.resultInfo;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskEndTime(Long taskEndTime) {
            this.taskEndTime = taskEndTime;
            return this;
        }
        public Long getTaskEndTime() {
            return this.taskEndTime;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskStartTime(Long taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public Long getTaskStartTime() {
            return this.taskStartTime;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskStatusText(String taskStatusText) {
            this.taskStatusText = taskStatusText;
            return this;
        }
        public String getTaskStatusText() {
            return this.taskStatusText;
        }

        public DescribeOnceTaskResponseBodyTaskManageResponseList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
