// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAifgJobsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The data under the root node.</p>
     */
    @NameInMap("data")
    public java.util.List<ListAifgJobsResponseBodyData> data;

    /**
     * <p>The maximum number of records to retrieve at a time.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>Indicates the read position returned by the current call. An empty value indicates that all data has been read.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello, world!</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination cursor. A non-empty value indicates that more data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>U+w1wv2R4ZWR5oZLXD0+Dp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAifgJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAifgJobsResponseBody self = new ListAifgJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAifgJobsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAifgJobsResponseBody setData(java.util.List<ListAifgJobsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAifgJobsResponseBodyData> getData() {
        return this.data;
    }

    public ListAifgJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAifgJobsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAifgJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAifgJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAifgJobsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAifgJobsResponseBodyData extends TeaModel {
        /**
         * <p>The first command in the data list.</p>
         * 
         * <strong>example:</strong>
         * <p>start</p>
         */
        @NameInMap("command")
        public Object command;

        /**
         * <p>The ID of the first element in the data list.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The first parameter in the root data.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;key1\&quot;: \&quot;value1\&quot;}</p>
         */
        @NameInMap("params")
        public Object params;

        /**
         * <p>The first result in the root data.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("result")
        public Object result;

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        @NameInMap("serviceName")
        public String serviceName;

        /**
         * <p>The status of the data item.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The sub-status of data item 0.</p>
         * 
         * <strong>example:</strong>
         * <p>processing</p>
         */
        @NameInMap("subStatus")
        public String subStatus;

        /**
         * <p>The time when the data was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-09-01 12:00:00</p>
         */
        @NameInMap("submitTime")
        public String submitTime;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The unique identifier of the trace task.</p>
         * 
         * <strong>example:</strong>
         * <p>T123456789</p>
         */
        @NameInMap("traceTaskId")
        public String traceTaskId;

        public static ListAifgJobsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAifgJobsResponseBodyData self = new ListAifgJobsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAifgJobsResponseBodyData setCommand(Object command) {
            this.command = command;
            return this;
        }
        public Object getCommand() {
            return this.command;
        }

        public ListAifgJobsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAifgJobsResponseBodyData setParams(Object params) {
            this.params = params;
            return this;
        }
        public Object getParams() {
            return this.params;
        }

        public ListAifgJobsResponseBodyData setResult(Object result) {
            this.result = result;
            return this;
        }
        public Object getResult() {
            return this.result;
        }

        public ListAifgJobsResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAifgJobsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAifgJobsResponseBodyData setSubStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public String getSubStatus() {
            return this.subStatus;
        }

        public ListAifgJobsResponseBodyData setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListAifgJobsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAifgJobsResponseBodyData setTraceTaskId(String traceTaskId) {
            this.traceTaskId = traceTaskId;
            return this;
        }
        public String getTraceTaskId() {
            return this.traceTaskId;
        }

    }

}
