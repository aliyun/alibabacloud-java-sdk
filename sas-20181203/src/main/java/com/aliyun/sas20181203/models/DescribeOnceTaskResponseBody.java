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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of returned information for the client task query.</p>
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
         * <p>The number of client tasks displayed on the current page for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of client tasks per page for paging. Default value: <strong>20</strong>, which indicates that each page contains 20 client tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of client tasks returned.</p>
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
         * <p>The task execution details. This parameter is in JSON format.</p>
         * <ul>
         * <li><strong>causeCode</strong>: The return code for the troubleshooting cause.</li>
         * <li><strong>causeMsg</strong>: The return message for the troubleshooting cause.</li>
         * <li><strong>resCode</strong>: The troubleshooting return code.</li>
         * <li><strong>resMsg</strong>: The troubleshooting return message.</li>
         * <li><strong>problemType</strong>: The problem type.</li>
         * <li><strong>dispatchType</strong>: The task dispatch method.</li>
         * <li><strong>uuid</strong>: The server UUID.</li>
         * <li><strong>instanceId</strong>: The server instance ID.</li>
         * <li><strong>internetIp</strong>: The public IP address of the server.</li>
         * <li><strong>intranetIp</strong>: The private IP address of the server.</li>
         * <li><strong>instanceName</strong>: The server instance name.</li>
         * <li><strong>url</strong>: The download link for the troubleshooting log.</li>
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
         * <p>The number of failed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The task progress. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>10%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The task execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        @NameInMap("ResultInfo")
        public String resultInfo;

        /**
         * <p>The number of successfully executed tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The timestamp when the task actually ends. Unit: milliseconds.</p>
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
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>CLIENT_PROBLEM_CHECK</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The timestamp when the task actually starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1649732012000</p>
         */
        @NameInMap("TaskStartTime")
        public Long taskStartTime;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Started.</li>
         * <li><strong>2</strong>: Completed.</li>
         * <li><strong>3</strong>: Failed.</li>
         * <li><strong>4</strong>: Timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The text object of the task status. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: Pending.</li>
         * <li><strong>START</strong>: Started.</li>
         * <li><strong>DISPATCH</strong>: Self-check command issued.</li>
         * <li><strong>SUCCESS</strong>: Self-check completed.</li>
         * <li><strong>FAIL</strong>: Execution failed.</li>
         * <li><strong>TIMEOUT</strong>: Timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("TaskStatusText")
        public String taskStatusText;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>CLIENT_PROBLEM_CHECK</strong>: client task</li>
         * <li><strong>CLIENT_DEV_OPS</strong>: cloud O&amp;M task</li>
         * <li><strong>ASSET_SECURITY_CHECK</strong>: asset collection task</li>
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
