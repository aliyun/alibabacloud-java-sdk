// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListResourceExecutionStatusResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceExecutionStatus")
    public java.util.List<ListResourceExecutionStatusResponseBodyResourceExecutionStatus> resourceExecutionStatus;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListResourceExecutionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExecutionStatusResponseBody self = new ListResourceExecutionStatusResponseBody();
        return TeaModel.build(map, self);
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

    public ListResourceExecutionStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListResourceExecutionStatusResponseBodyResourceExecutionStatus extends TeaModel {
        @NameInMap("Outputs")
        public String outputs;

        @NameInMap("Status")
        public String status;

        @NameInMap("ExecutionTime")
        public String executionTime;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ExecutionId")
        public String executionId;

        public static ListResourceExecutionStatusResponseBodyResourceExecutionStatus build(java.util.Map<String, ?> map) throws Exception {
            ListResourceExecutionStatusResponseBodyResourceExecutionStatus self = new ListResourceExecutionStatusResponseBodyResourceExecutionStatus();
            return TeaModel.build(map, self);
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setOutputs(String outputs) {
            this.outputs = outputs;
            return this;
        }
        public String getOutputs() {
            return this.outputs;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setExecutionTime(String executionTime) {
            this.executionTime = executionTime;
            return this;
        }
        public String getExecutionTime() {
            return this.executionTime;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListResourceExecutionStatusResponseBodyResourceExecutionStatus setExecutionId(String executionId) {
            this.executionId = executionId;
            return this;
        }
        public String getExecutionId() {
            return this.executionId;
        }

    }

}
