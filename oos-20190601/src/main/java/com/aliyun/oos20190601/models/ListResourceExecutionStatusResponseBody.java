// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListResourceExecutionStatusResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution information of the resource.</p>
     */
    @NameInMap("ResourceExecutionStatus")
    public java.util.List<ListResourceExecutionStatusResponseBodyResourceExecutionStatus> resourceExecutionStatus;

    public static ListResourceExecutionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExecutionStatusResponseBody self = new ListResourceExecutionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceExecutionStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceExecutionStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceExecutionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceExecutionStatusResponseBody setResourceExecutionStatus(java.util.List<ListResourceExecutionStatusResponseBodyResourceExecutionStatus> resourceExecutionStatus) {
        this.resourceExecutionStatus = resourceExecutionStatus;
        return this;
    }
    public java.util.List<ListResourceExecutionStatusResponseBodyResourceExecutionStatus> getResourceExecutionStatus() {
        return this.resourceExecutionStatus;
    }

    public static class ListResourceExecutionStatusResponseBodyResourceExecutionStatus extends TeaModel {
        /**
         * <p>The ID of the execution.</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>The time when the execution started running.</p>
         */
        @NameInMap("ExecutionTime")
        public String executionTime;

        /**
         * <p>The output of the template.</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The ID of the resource.</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The status of the execution.</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListResourceExecutionStatusResponseBodyResourceExecutionStatus build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExecutionStatusResponseBodyResourceExecutionStatus self = new ListResourceExecutionStatusResponseBodyResourceExecutionStatus();
            return TeaModel.build(map, self);
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
