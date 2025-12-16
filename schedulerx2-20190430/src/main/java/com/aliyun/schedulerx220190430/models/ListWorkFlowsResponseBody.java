// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListWorkFlowsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data of the workflow.</p>
     */
    @NameInMap("Data")
    public ListWorkFlowsResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>workflow is not existed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>883AFE93-FB03-4FA9-A958-E750C6DE120C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListWorkFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkFlowsResponseBody self = new ListWorkFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkFlowsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWorkFlowsResponseBody setData(ListWorkFlowsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkFlowsResponseBodyData getData() {
        return this.data;
    }

    public ListWorkFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkFlowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkFlowsResponseBodyDataRecords extends TeaModel {
        /**
         * <p>The calendar.</p>
         * 
         * <strong>example:</strong>
         * <p>workday</p>
         */
        @NameInMap("Calendar")
        public String calendar;

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>1144881807903942</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The job description.</p>
         * 
         * <strong>example:</strong>
         * <p>No description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hxm.test</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The maximum concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxConcurrency")
        public String maxConcurrency;

        /**
         * <p>The workflow name.</p>
         * 
         * <strong>example:</strong>
         * <p>test3</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
         * 
         * <strong>example:</strong>
         * <p>4a06d5ea-f576-4326-842c-fb14ea043d8d</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The time expression.</p>
         */
        @NameInMap("TimeExpression")
        public String timeExpression;

        /**
         * <p>The time type of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>cron</p>
         */
        @NameInMap("TimeType")
        public String timeType;

        /**
         * <p>The updater.</p>
         * 
         * <strong>example:</strong>
         * <p>1144881807903942</p>
         */
        @NameInMap("Updater")
        public String updater;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1339</p>
         */
        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListWorkFlowsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowsResponseBodyDataRecords self = new ListWorkFlowsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowsResponseBodyDataRecords setCalendar(String calendar) {
            this.calendar = calendar;
            return this;
        }
        public String getCalendar() {
            return this.calendar;
        }

        public ListWorkFlowsResponseBodyDataRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkFlowsResponseBodyDataRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkFlowsResponseBodyDataRecords setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListWorkFlowsResponseBodyDataRecords setMaxConcurrency(String maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public String getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public ListWorkFlowsResponseBodyDataRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkFlowsResponseBodyDataRecords setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ListWorkFlowsResponseBodyDataRecords setTimeExpression(String timeExpression) {
            this.timeExpression = timeExpression;
            return this;
        }
        public String getTimeExpression() {
            return this.timeExpression;
        }

        public ListWorkFlowsResponseBodyDataRecords setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public ListWorkFlowsResponseBodyDataRecords setUpdater(String updater) {
            this.updater = updater;
            return this;
        }
        public String getUpdater() {
            return this.updater;
        }

        public ListWorkFlowsResponseBodyDataRecords setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListWorkFlowsResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The row of data.</p>
         */
        @NameInMap("Records")
        public java.util.List<ListWorkFlowsResponseBodyDataRecords> records;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListWorkFlowsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkFlowsResponseBodyData self = new ListWorkFlowsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkFlowsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListWorkFlowsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListWorkFlowsResponseBodyData setRecords(java.util.List<ListWorkFlowsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<ListWorkFlowsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public ListWorkFlowsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
