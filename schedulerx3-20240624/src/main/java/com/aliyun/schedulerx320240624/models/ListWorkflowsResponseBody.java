// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListWorkflowsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWorkflowsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Parameter error: content is null.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>39938688-0BAB-5AD8-BF02-F4910FAC7589</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowsResponseBody self = new ListWorkflowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWorkflowsResponseBody setData(ListWorkflowsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkflowsResponseBodyData getData() {
        return this.data;
    }

    public ListWorkflowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkflowsResponseBodyDataRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AppType")
        public Integer appType;

        /**
         * <strong>example:</strong>
         * <p>work-day</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CurrentExecuteStatus")
        public Integer currentExecuteStatus;

        /**
         * <strong>example:</strong>
         * <p>my first workflow</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2025-06-29 15:56:36</p>
         */
        @NameInMap("LastExecuteEndTime")
        public String lastExecuteEndTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("LastExecuteStatus")
        public Integer lastExecuteStatus;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxConcurrency")
        public Integer maxConcurrency;

        /**
         * <strong>example:</strong>
         * <p>myWorkflow</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>0 0 12 * * ?</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public Integer timeType;

        /**
         * <strong>example:</strong>
         * <p>HangKong</p>
         */
        @NameInMap("Timezone")
        public String timezone;

        /**
         * <strong>example:</strong>
         * <p>1963096506470832</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        @NameInMap("Xattrs")
        public String xattrs;

        public static ListWorkflowsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyDataRecords self = new ListWorkflowsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyDataRecords setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListWorkflowsResponseBodyDataRecords setAppType(Integer appType) {
            this.appType = appType;
            return this;
        }
        public Integer getAppType() {
            return this.appType;
        }

        public ListWorkflowsResponseBodyDataRecords setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public ListWorkflowsResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkflowsResponseBodyDataRecords setCurrentExecuteStatus(Integer currentExecuteStatus) {
            this.currentExecuteStatus = currentExecuteStatus;
            return this;
        }
        public Integer getCurrentExecuteStatus() {
            return this.currentExecuteStatus;
        }

        public ListWorkflowsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkflowsResponseBodyDataRecords setLastExecuteEndTime(String lastExecuteEndTime) {
            this.lastExecuteEndTime = lastExecuteEndTime;
            return this;
        }
        public String getLastExecuteEndTime() {
            return this.lastExecuteEndTime;
        }

        public ListWorkflowsResponseBodyDataRecords setLastExecuteStatus(Integer lastExecuteStatus) {
            this.lastExecuteStatus = lastExecuteStatus;
            return this;
        }
        public Integer getLastExecuteStatus() {
            return this.lastExecuteStatus;
        }

        public ListWorkflowsResponseBodyDataRecords setMaxConcurrency(Integer maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListWorkflowsResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkflowsResponseBodyDataRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListWorkflowsResponseBodyDataRecords setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public ListWorkflowsResponseBodyDataRecords setTimeType(Integer timeType) {
            this.timeType = timeType;
            return this;
        }
        public Integer getTimeType() {
            return this.timeType;
        }

        public ListWorkflowsResponseBodyDataRecords setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public ListWorkflowsResponseBodyDataRecords setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public ListWorkflowsResponseBodyDataRecords setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

        public ListWorkflowsResponseBodyDataRecords setXattrs(String xattrs) {
            this.xattrs = xattrs;
            return this;
        }
        public String getXattrs() {
            return this.xattrs;
        }

    }

    public static class ListWorkflowsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <strong>example:</strong>
         * <p>eCKqVlS5FKF5EWGGOo8EgQ==</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

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

        @NameInMap("Records")
        public java.util.List<ListWorkflowsResponseBodyDataRecords> records;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListWorkflowsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowsResponseBodyData self = new ListWorkflowsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListWorkflowsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListWorkflowsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWorkflowsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkflowsResponseBodyData setRecords(java.util.List<ListWorkflowsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListWorkflowsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListWorkflowsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
