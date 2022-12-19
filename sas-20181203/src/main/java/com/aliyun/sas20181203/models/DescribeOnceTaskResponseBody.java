// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeOnceTaskResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeOnceTaskResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the tasks.
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
        // The number of entries returned on the current page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
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
        // The execution details of the task. The value of this parameter is in the JSON format.
        // 
        // *   **causeCode**: the returned code for the cause
        // *   **causeMsg**: the returned information for the cause
        // *   **resCode**: the returned code of troubleshooting
        // *   **resMsg**: the returned information about troubleshooting
        // *   **problemType**: the type of the issue
        // *   **dispatchType**: the task delivery method
        // *   **uuid**: the UUID of the server
        // *   **instanceId**: the instance ID of the server
        // *   **internetIp**: the public IP address of the server
        // *   **intranetIp**: the private IP address of the server
        // *   **instanceName**: the instance name of the server
        // *   **url**: the download link of the troubleshooting log
        @NameInMap("DetailData")
        public String detailData;

        @NameInMap("FailCount")
        public Integer failCount;

        // The progress of the task. Unit: %.
        @NameInMap("Progress")
        public String progress;

        @NameInMap("ResultInfo")
        public String resultInfo;

        @NameInMap("SuccessCount")
        public Integer successCount;

        // The timestamp when the task ends. Unit: milliseconds.
        @NameInMap("TaskEndTime")
        public Long taskEndTime;

        // The ID of the task.
        @NameInMap("TaskId")
        public String taskId;

        // The name of the task.
        @NameInMap("TaskName")
        public String taskName;

        // The timestamp when the task starts. Unit: milliseconds.
        @NameInMap("TaskStartTime")
        public Long taskStartTime;

        // The status of the task. Valid values:
        // 
        // *   **1**: started
        // *   **2**: complete
        // *   **3**: failed
        // *   **4**: timed out
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        // The text description of the status for the task. Valid values:
        // 
        // *   **INIT**: The task is to be started.
        // *   **START**: The task is started.
        // *   **DISPATCH**: The self-check command is issued.
        // *   **SUCCESS**: The self-check is complete.
        // *   **FAIL**: The task fails.
        // *   **TIMEOUT**: The task times out.
        @NameInMap("TaskStatusText")
        public String taskStatusText;

        // The type of the task. Valid values:
        // 
        // *   **CLIENT\_PROBLEM_CHECK**: a task of the Security Center agent
        // *   **CLIENT\_DEV_OPS**: an O&M task of Cloud Assistant
        // *   **ASSET\_SECURITY_CHECK**: a task of asset information collection
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
