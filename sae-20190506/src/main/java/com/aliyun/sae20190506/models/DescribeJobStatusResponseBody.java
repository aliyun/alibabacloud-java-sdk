// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobStatusResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirection.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeJobStatusResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section of this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidAppId.NotFound</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The request is successful.</li>
     * <li>Specific error code: An exception occurred and a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>53F15A18-8079-5992-810C-0211A5AE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the job status was queried successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The query was successful.</li>
     * <li><strong>false</strong>: The query failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to accurately query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0b1639af16575057857241351e****</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>The completion time of the job execution.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522839</p>
         */
        @NameInMap("CompletionTime")
        public Long completionTime;

        /**
         * <p>The number of instances that failed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>event-b798157b-40a2-4388-b578-71fb897103**-**</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The additional information. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The request is successful.</li>
         * <li>Specific error code: An exception occurred and a specific error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The creation time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522800</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The running status of the job. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not executed.</li>
         * <li><strong>1</strong>: Succeeded.</li>
         * <li><strong>2</strong>: Failed.</li>
         * <li><strong>3</strong>: Running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of instances that succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
