// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeJobStatusResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeJobStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobStatusResponseBody self = new DescribeJobStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobStatusResponseBody setData(DescribeJobStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeJobStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeJobStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeJobStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeJobStatusResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeJobStatusResponseBodyData extends TeaModel {
        @NameInMap("Active")
        public Long active;

        @NameInMap("CompletionTime")
        public Long completionTime;

        @NameInMap("Failed")
        public Long failed;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("Succeeded")
        public Long succeeded;

        public static DescribeJobStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobStatusResponseBodyData self = new DescribeJobStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJobStatusResponseBodyData setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public DescribeJobStatusResponseBodyData setCompletionTime(Long completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Long getCompletionTime() {
            return this.completionTime;
        }

        public DescribeJobStatusResponseBodyData setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public DescribeJobStatusResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobStatusResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeJobStatusResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeJobStatusResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeJobStatusResponseBodyData setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

    }

}
