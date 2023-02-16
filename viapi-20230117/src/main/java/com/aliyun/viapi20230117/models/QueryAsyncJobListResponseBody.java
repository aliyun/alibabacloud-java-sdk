// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20230117.models;

import com.aliyun.tea.*;

public class QueryAsyncJobListResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryAsyncJobListResponseBodyData data;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAsyncJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncJobListResponseBody self = new QueryAsyncJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAsyncJobListResponseBody setData(QueryAsyncJobListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAsyncJobListResponseBodyData getData() {
        return this.data;
    }

    public QueryAsyncJobListResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public QueryAsyncJobListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAsyncJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAsyncJobListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAsyncJobListResponseBodyDataResult extends TeaModel {
        @NameInMap("CallerParentId")
        public String callerParentId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PopApiName")
        public String popApiName;

        @NameInMap("PopProduct")
        public String popProduct;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        public static QueryAsyncJobListResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAsyncJobListResponseBodyDataResult self = new QueryAsyncJobListResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public QueryAsyncJobListResponseBodyDataResult setCallerParentId(String callerParentId) {
            this.callerParentId = callerParentId;
            return this;
        }
        public String getCallerParentId() {
            return this.callerParentId;
        }

        public QueryAsyncJobListResponseBodyDataResult setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAsyncJobListResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryAsyncJobListResponseBodyDataResult setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryAsyncJobListResponseBodyDataResult setPopApiName(String popApiName) {
            this.popApiName = popApiName;
            return this;
        }
        public String getPopApiName() {
            return this.popApiName;
        }

        public QueryAsyncJobListResponseBodyDataResult setPopProduct(String popProduct) {
            this.popProduct = popProduct;
            return this;
        }
        public String getPopProduct() {
            return this.popProduct;
        }

        public QueryAsyncJobListResponseBodyDataResult setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryAsyncJobListResponseBodyDataResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class QueryAsyncJobListResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<QueryAsyncJobListResponseBodyDataResult> result;

        @NameInMap("TotalPage")
        public Integer totalPage;

        @NameInMap("TotalRecord")
        public Integer totalRecord;

        public static QueryAsyncJobListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAsyncJobListResponseBodyData self = new QueryAsyncJobListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAsyncJobListResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryAsyncJobListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAsyncJobListResponseBodyData setResult(java.util.List<QueryAsyncJobListResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryAsyncJobListResponseBodyDataResult> getResult() {
            return this.result;
        }

        public QueryAsyncJobListResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public QueryAsyncJobListResponseBodyData setTotalRecord(Integer totalRecord) {
            this.totalRecord = totalRecord;
            return this;
        }
        public Integer getTotalRecord() {
            return this.totalRecord;
        }

    }

}
