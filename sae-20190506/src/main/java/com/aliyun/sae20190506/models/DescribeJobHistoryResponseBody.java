// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeJobHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeJobHistoryResponseBodyData data;

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
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Jobs")
        public java.util.List<DescribeJobHistoryResponseBodyDataJobs> jobs;

        @NameInMap("PageSize")
        public Long pageSize;

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
