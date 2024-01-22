// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobStatusResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: The call was successful.</p>
     * <p>*   **3xx**: The call was redirected.</p>
     * <p>*   **4xx**: The call failed.</p>
     * <p>*   **5xx**: A server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeJobStatusResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <br>
     * <p>*   **ErrorCode** is not returned if the request succeeds.</p>
     * <p>*   **ErrorCode** is returned if the request fails. For more information, see the "**Error codes**" section in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message. Take note of the following rules:</p>
     * <br>
     * <p>*   If the call is successful, **success** is returned.</p>
     * <p>*   If the call fails, an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     */
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
        /**
         * <p>The number of running instances.</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>The time when the job was executed.</p>
         */
        @NameInMap("CompletionTime")
        public Long completionTime;

        /**
         * <p>The number of instances that failed to run.</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The job ID.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The returned message. Take note of the following rules:</p>
         * <br>
         * <p>*   If the call is successful, **success** is returned.</p>
         * <p>*   If the call fails, an error code is returned.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **0**: The job is not executed.</p>
         * <p>*   **1**: The job was executed.</p>
         * <p>*   **2**: The job failed to be executed.</p>
         * <p>*   **3**: The job is being executed.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of instances that are successfully run.</p>
         */
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
