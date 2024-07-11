// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListResourceExecutionStatusResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>MTRBMDc0NjAtRUJFNy00N0NBLTk3NTctMTJDQzQ</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ED571CBD-9F96-419D-B919-CF340BBCA157</p>
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
         * 
         * <strong>example:</strong>
         * <p>exec-6be6d6ff805349d9ac13</p>
         */
        @NameInMap("ExecutionId")
        public String executionId;

        /**
         * <p>The time when the execution started running.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-13T08:48:34Z</p>
         */
        @NameInMap("ExecutionTime")
        public String executionTime;

        /**
         * <p>The output of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>{ 				&quot;commandOutput&quot;: &quot;hello\n&quot; 			}</p>
         */
        @NameInMap("Outputs")
        public String outputs;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1e1bxxxxxxxxxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The status of the execution.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
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
