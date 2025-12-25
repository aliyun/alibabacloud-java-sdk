// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListWorkflowExecutionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Data")
    public ListWorkflowExecutionsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BAC1ADB5-EEB5-5834-93D8-522E067AF8D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkflowExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowExecutionsResponseBody self = new ListWorkflowExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowExecutionsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWorkflowExecutionsResponseBody setData(ListWorkflowExecutionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkflowExecutionsResponseBodyData getData() {
        return this.data;
    }

    public ListWorkflowExecutionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWorkflowExecutionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowExecutionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWorkflowExecutionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowExecutionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkflowExecutionsResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>1827811800526000</p>
         */
        @NameInMap("Executor")
        public String executor;

        /**
         * <strong>example:</strong>
         * <p>2024-11-12 14:52:42</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <strong>example:</strong>
         * <p>2025-11-04 01:09:27</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WorkflowExecutionId")
        public String workflowExecutionId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        /**
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("WorkflowName")
        public String workflowName;

        public static ListWorkflowExecutionsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowExecutionsResponseBodyDataRecords self = new ListWorkflowExecutionsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setExecutor(String executor) {
            this.executor = executor;
            return this;
        }
        public String getExecutor() {
            return this.executor;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setWorkflowExecutionId(String workflowExecutionId) {
            this.workflowExecutionId = workflowExecutionId;
            return this;
        }
        public String getWorkflowExecutionId() {
            return this.workflowExecutionId;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

        public ListWorkflowExecutionsResponseBodyDataRecords setWorkflowName(String workflowName) {
            this.workflowName = workflowName;
            return this;
        }
        public String getWorkflowName() {
            return this.workflowName;
        }

    }

    public static class ListWorkflowExecutionsResponseBodyData extends TeaModel {
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
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("Records")
        public java.util.List<ListWorkflowExecutionsResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>65</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListWorkflowExecutionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowExecutionsResponseBodyData self = new ListWorkflowExecutionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowExecutionsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWorkflowExecutionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkflowExecutionsResponseBodyData setRecords(java.util.List<ListWorkflowExecutionsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListWorkflowExecutionsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListWorkflowExecutionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
