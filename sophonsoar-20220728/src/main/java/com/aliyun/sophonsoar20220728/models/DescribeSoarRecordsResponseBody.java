// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("Page")
    public DescribeSoarRecordsResponseBodyPage page;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution records.</p>
     */
    @NameInMap("SoarExecuteRecords")
    public java.util.List<DescribeSoarRecordsResponseBodySoarExecuteRecords> soarExecuteRecords;

    public static DescribeSoarRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarRecordsResponseBody self = new DescribeSoarRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarRecordsResponseBody setPage(DescribeSoarRecordsResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribeSoarRecordsResponseBodyPage getPage() {
        return this.page;
    }

    public DescribeSoarRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSoarRecordsResponseBody setSoarExecuteRecords(java.util.List<DescribeSoarRecordsResponseBodySoarExecuteRecords> soarExecuteRecords) {
        this.soarExecuteRecords = soarExecuteRecords;
        return this;
    }
    public java.util.List<DescribeSoarRecordsResponseBodySoarExecuteRecords> getSoarExecuteRecords() {
        return this.soarExecuteRecords;
    }

    public static class DescribeSoarRecordsResponseBodyPage extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSoarRecordsResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarRecordsResponseBodyPage self = new DescribeSoarRecordsResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribeSoarRecordsResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeSoarRecordsResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSoarRecordsResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSoarRecordsResponseBodySoarExecuteRecords extends TeaModel {
        /**
         * <p>The end of the time range to query. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The error message of the task. If the task is successful, this field is empty.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The request parameters of the task.</p>
         */
        @NameInMap("RawEventReq")
        public String rawEventReq;

        /**
         * <p>The request ID of the task. The value is unique.</p>
         */
        @NameInMap("RequestUuid")
        public String requestUuid;

        /**
         * <p>The returned information about the playbook. You can define the value in the playbook.</p>
         */
        @NameInMap("ResultMessage")
        public String resultMessage;

        /**
         * <p>The beginning of the time range to query. The value is a 13-byte timestamp.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **success**</p>
         * <p>*   **fail**</p>
         * <p>*   **running**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the task. The value is the same as the playbook UUID.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **general**: a common task</p>
         * <p>*   **standard**: a component task</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <p>The MD5 value of the playbook.</p>
         */
        @NameInMap("TaskflowMd5")
        public String taskflowMd5;

        /**
         * <p>The type of the task. Valid values:</p>
         * <br>
         * <p>*   **debug**: a debugging task</p>
         * <p>*   **manual**: a manual task</p>
         * <p>*   **siem**: a task that is triggered by an event or alert</p>
         */
        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to execute the task.</p>
         */
        @NameInMap("TriggerUser")
        public String triggerUser;

        public static DescribeSoarRecordsResponseBodySoarExecuteRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarRecordsResponseBodySoarExecuteRecords self = new DescribeSoarRecordsResponseBodySoarExecuteRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setRawEventReq(String rawEventReq) {
            this.rawEventReq = rawEventReq;
            return this;
        }
        public String getRawEventReq() {
            return this.rawEventReq;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setRequestUuid(String requestUuid) {
            this.requestUuid = requestUuid;
            return this;
        }
        public String getRequestUuid() {
            return this.requestUuid;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setTaskflowMd5(String taskflowMd5) {
            this.taskflowMd5 = taskflowMd5;
            return this;
        }
        public String getTaskflowMd5() {
            return this.taskflowMd5;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public DescribeSoarRecordsResponseBodySoarExecuteRecords setTriggerUser(String triggerUser) {
            this.triggerUser = triggerUser;
            return this;
        }
        public String getTriggerUser() {
            return this.triggerUser;
        }

    }

}
