// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class GetJobHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetJobHistoryResponseBodyData data;

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

    public static GetJobHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobHistoryResponseBody self = new GetJobHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobHistoryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetJobHistoryResponseBody setData(GetJobHistoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetJobHistoryResponseBodyData getData() {
        return this.data;
    }

    public GetJobHistoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetJobHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetJobHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetJobHistoryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetJobHistoryResponseBodyDataJobs extends TeaModel {
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

        @NameInMap("Succeeded")
        public Long succeeded;

        public static GetJobHistoryResponseBodyDataJobs build(java.util.Map<String, ?> map) throws Exception {
            GetJobHistoryResponseBodyDataJobs self = new GetJobHistoryResponseBodyDataJobs();
            return TeaModel.build(map, self);
        }

        public GetJobHistoryResponseBodyDataJobs setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public GetJobHistoryResponseBodyDataJobs setCompletionTime(Long completionTime) {
            this.completionTime = completionTime;
            return this;
        }
        public Long getCompletionTime() {
            return this.completionTime;
        }

        public GetJobHistoryResponseBodyDataJobs setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public GetJobHistoryResponseBodyDataJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobHistoryResponseBodyDataJobs setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetJobHistoryResponseBodyDataJobs setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetJobHistoryResponseBodyDataJobs setSucceeded(Long succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Long getSucceeded() {
            return this.succeeded;
        }

    }

    public static class GetJobHistoryResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Jobs")
        public java.util.List<GetJobHistoryResponseBodyDataJobs> jobs;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static GetJobHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetJobHistoryResponseBodyData self = new GetJobHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetJobHistoryResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public GetJobHistoryResponseBodyData setJobs(java.util.List<GetJobHistoryResponseBodyDataJobs> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<GetJobHistoryResponseBodyDataJobs> getJobs() {
            return this.jobs;
        }

        public GetJobHistoryResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetJobHistoryResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
