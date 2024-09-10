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
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
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
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
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
         * <p>100</p>
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
         * <ul>
         * <li><strong>causeCode</strong>: the returned code for the cause.</li>
         * <li><strong>causeMsg</strong>: the returned message for the cause.</li>
         * <li><strong>resCode</strong>: the returned code for troubleshooting.</li>
         * <li><strong>resMsg</strong>: the returned message for troubleshooting.</li>
         * <li><strong>problemType</strong>: the type of the issue.</li>
         * <li><strong>dispatchType</strong>: the task delivery method.</li>
         * <li><strong>uuid</strong>: the UUID of the server.</li>
         * <li><strong>instanceId</strong>: the instance ID of the server.</li>
         * <li><strong>internetIp</strong>: the public IP address of the server.</li>
         * <li><strong>intranetIp</strong>: the private IP address of the server.</li>
         * <li><strong>instanceName</strong>: the instance name of the server.</li>
         * <li><strong>url</strong>: the download URL of the troubleshooting log.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;dispatchType&quot;: &quot;manual&quot;,
         *             &quot;causeMsg&quot;: [],
         *             &quot;causeCode&quot;: [],
         *             &quot;resCode&quot;: [
         *                   &quot;1003&quot;
         *             ],
         *             &quot;resMsg&quot;: [
         *                   &quot;powershell -executionpolicy bypass -c \&quot;(New-Object Net.WebClient).DownloadFile(\&quot;<a href="http://aegis.alicdn.com/download/aegis_client_self_check/win32/aegis_checker.exe%5C%5C">http://aegis.alicdn.com/download/aegis_client_self_check/win32/aegis_checker.exe\\</a>&quot;, $ExecutionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath(\&quot;.\\\\aegis_checker.exe\&quot;))\&quot;; \&quot;./aegis_checker.exe -b eyJtb2RlIjoxLCJqc3J2X2RvbWFpbiI6W10sImlzc3VlIjoib2ZmbGluZSIsInVwZGF0ZV9kb21haW4iOltdLCJ1dWlkIjoiaW5ldC1lYWUwNDg2Ny0wMDJmLTQyM2QtYWYwMC1jNzJjZDYyOWIyNDgiLCJjbWRfaWR4IjoiNDRjZThiZWI3ZGYyYTQxMjQ1NGM4ZDc5OTE1ODI1MzMifQ==\&quot;&quot;
         *             ],
         *             &quot;problemType&quot;: &quot;offline&quot;,
         *             &quot;uuid&quot;: &quot;inet-eae04867-002f-423d-af00-c72cd629****&quot;
         *       }
         * ]</p>
         */
        @NameInMap("DetailData")
        public String detailData;

        /**
         * <p>The number of tasks that fail to be executed.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The progress of the task. Unit: percent (%).</p>
         * 
         * <strong>example:</strong>
         * <p>10%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The execution result of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The number of tasks that are executed.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The timestamp that indicates the time when the task ends. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1650267989000</p>
         */
        @NameInMap("TaskEndTime")
        public Long taskEndTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e900f528f5a6229bb640ca27cb44c98e</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The timestamp that indicates the time when the task starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649732012000</p>
         */
        @NameInMap("TaskStartTime")
        public Long taskStartTime;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The task is started.</li>
         * <li><strong>2</strong>: The task is complete.</li>
         * <li><strong>3</strong>: The task fails.</li>
         * <li><strong>4</strong>: The task times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The text description of the status for the task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is pending start.</li>
         * <li><strong>START</strong>: The task is started.</li>
         * <li><strong>DISPATCH</strong>: The self-check command is issued.</li>
         * <li><strong>SUCCESS</strong>: The self-check is complete.</li>
         * <li><strong>FAIL</strong>: The task fails.</li>
         * <li><strong>TIMEOUT</strong>: The task times out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("TaskStatusText")
        public String taskStatusText;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a task of the Security Center client</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: an O\&amp;M task of Cloud Assistant</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: a task for asset information collection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
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
