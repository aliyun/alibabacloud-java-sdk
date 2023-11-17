// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeSoarRecordsResponseBody extends TeaModel {
    @NameInMap("Page")
    public DescribeSoarRecordsResponseBodyPage page;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("RawEventReq")
        public String rawEventReq;

        @NameInMap("RequestUuid")
        public String requestUuid;

        @NameInMap("ResultMessage")
        public String resultMessage;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskflowMd5")
        public String taskflowMd5;

        @NameInMap("TriggerType")
        public String triggerType;

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
