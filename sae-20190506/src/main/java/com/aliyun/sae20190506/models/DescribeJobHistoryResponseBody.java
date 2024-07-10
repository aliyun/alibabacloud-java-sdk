// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobHistoryResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
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
    public DescribeJobHistoryResponseBodyData data;

    /**
     * <p>The error code returned. Take note of the following rules:</p>
     * <ul>
     * <li>If the call is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. Take note of the following rules:</p>
     * <ul>
     * <li>If the call is successful, <strong>success</strong> is returned.</li>
     * <li>If the call fails, an error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53F15A18-8079-5992-810C-0211A5AE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0b1639af16575057857241351e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeJobHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobHistoryResponseBody self = new DescribeJobHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeJobHistoryResponseBody setData(DescribeJobHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeJobHistoryResponseBodyData getData() {
        return this.data;
    }

    public DescribeJobHistoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeJobHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeJobHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeJobHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeJobHistoryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeJobHistoryResponseBodyDataJobs extends TeaModel {
        /**
         * <p>The number of running instances.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>The time when the job was executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522839</p>
         */
        @NameInMap("CompletionTime")
        public Long completionTime;

        /**
         * <p>The number of instances that failed to run.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Failed")
        public Long failed;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>manual-3db7a8fa-5d40-4edc-92e4-49d50eab****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message returned if exceptions occur during job running.</p>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1657522800</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The job was not executed.</li>
         * <li><strong>1</strong>: The job was executed.</li>
         * <li><strong>2</strong>: The job failed to be executed.</li>
         * <li><strong>3</strong>: The job is being executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of instances that are successfully run.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Succeeded")
        public Long succeeded;

        public static DescribeJobHistoryResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobHistoryResponseBodyDataJobs self = new DescribeJobHistoryResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public DescribeJobHistoryResponseBodyDataJobs setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public DescribeJobHistoryResponseBodyDataJobs setCompletionTime(Long completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Long getCompletionTime() {
            return this.completionTime;
        }

        public DescribeJobHistoryResponseBodyDataJobs setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public DescribeJobHistoryResponseBodyDataJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeJobHistoryResponseBodyDataJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeJobHistoryResponseBodyDataJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeJobHistoryResponseBodyDataJobs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeJobHistoryResponseBodyDataJobs setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

    }

    public static class DescribeJobHistoryResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        /**
         * <p>The jobs.</p>
         */
        @NameInMap("Jobs")
        public java.util.List<DescribeJobHistoryResponseBodyDataJobs> jobs;

        /**
         * <p>The number of entries to return on each page. Valid values: 0 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The total number of jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static DescribeJobHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobHistoryResponseBodyData self = new DescribeJobHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeJobHistoryResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public DescribeJobHistoryResponseBodyData setJobs(java.util.List<DescribeJobHistoryResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<DescribeJobHistoryResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

        public DescribeJobHistoryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeJobHistoryResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
