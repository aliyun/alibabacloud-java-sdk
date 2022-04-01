// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListWorkflowActivityInstancesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Data data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static ListWorkflowActivityInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowActivityInstancesResponseBody self = new ListWorkflowActivityInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowActivityInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWorkflowActivityInstancesResponseBody setData(Data data) {
        this.data = data;
        return this;
    }
    public Data getData() {
        return this.data;
    }

    public ListWorkflowActivityInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowActivityInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowActivityInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class Items extends TeaModel {
        @NameInMap("activityInstanceId")
        public Long activityInstanceId;

        @NameInMap("activityInstanceName")
        public String activityInstanceName;

        @NameInMap("activityInstanceStatus")
        public String activityInstanceStatus;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("executionMsg")
        public String executionMsg;

        @NameInMap("inputContext")
        public String inputContext;

        @NameInMap("outputContext")
        public String outputContext;

        @NameInMap("retriedTimes")
        public Integer retriedTimes;

        @NameInMap("signalBizCodeAfterExecution")
        public String signalBizCodeAfterExecution;

        @NameInMap("signalBizCodeBeforeExecution")
        public String signalBizCodeBeforeExecution;

        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("timeoutDate")
        public Long timeoutDate;

        @NameInMap("workflowInstanceId")
        public Long workflowInstanceId;

        public static Items build(java.util.Map<String, ?> map) throws Exception {
            Items self = new Items();
            return TeaModel.build(map, self);
        }

        public Items setActivityInstanceId(Long activityInstanceId) {
            this.activityInstanceId = activityInstanceId;
            return this;
        }
        public Long getActivityInstanceId() {
            return this.activityInstanceId;
        }

        public Items setActivityInstanceName(String activityInstanceName) {
            this.activityInstanceName = activityInstanceName;
            return this;
        }
        public String getActivityInstanceName() {
            return this.activityInstanceName;
        }

        public Items setActivityInstanceStatus(String activityInstanceStatus) {
            this.activityInstanceStatus = activityInstanceStatus;
            return this;
        }
        public String getActivityInstanceStatus() {
            return this.activityInstanceStatus;
        }

        public Items setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public Items setExecutionMsg(String executionMsg) {
            this.executionMsg = executionMsg;
            return this;
        }
        public String getExecutionMsg() {
            return this.executionMsg;
        }

        public Items setInputContext(String inputContext) {
            this.inputContext = inputContext;
            return this;
        }
        public String getInputContext() {
            return this.inputContext;
        }

        public Items setOutputContext(String outputContext) {
            this.outputContext = outputContext;
            return this;
        }
        public String getOutputContext() {
            return this.outputContext;
        }

        public Items setRetriedTimes(Integer retriedTimes) {
            this.retriedTimes = retriedTimes;
            return this;
        }
        public Integer getRetriedTimes() {
            return this.retriedTimes;
        }

        public Items setSignalBizCodeAfterExecution(String signalBizCodeAfterExecution) {
            this.signalBizCodeAfterExecution = signalBizCodeAfterExecution;
            return this;
        }
        public String getSignalBizCodeAfterExecution() {
            return this.signalBizCodeAfterExecution;
        }

        public Items setSignalBizCodeBeforeExecution(String signalBizCodeBeforeExecution) {
            this.signalBizCodeBeforeExecution = signalBizCodeBeforeExecution;
            return this;
        }
        public String getSignalBizCodeBeforeExecution() {
            return this.signalBizCodeBeforeExecution;
        }

        public Items setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public Items setTimeoutDate(Long timeoutDate) {
            this.timeoutDate = timeoutDate;
            return this;
        }
        public Long getTimeoutDate() {
            return this.timeoutDate;
        }

        public Items setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("items")
        public java.util.List<Items> items;

        @NameInMap("pageNumber")
        public Integer pageNumber;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setItems(java.util.List<Items> items) {
            this.items = items;
            return this;
        }
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public Data setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public Data setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public Data setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
