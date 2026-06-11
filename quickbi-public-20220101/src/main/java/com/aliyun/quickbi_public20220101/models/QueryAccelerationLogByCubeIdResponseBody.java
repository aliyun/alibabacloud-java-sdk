// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryAccelerationLogByCubeIdResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D8749D********80FF3B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the API request.</p>
     * <ul>
     * <li><p>true: The execution succeeded.</p>
     * </li>
     * <li><p>false: The execution failed.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Result")
    public QueryAccelerationLogByCubeIdResponseBodyResult result;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAccelerationLogByCubeIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccelerationLogByCubeIdResponseBody self = new QueryAccelerationLogByCubeIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccelerationLogByCubeIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAccelerationLogByCubeIdResponseBody setResult(QueryAccelerationLogByCubeIdResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryAccelerationLogByCubeIdResponseBodyResult getResult() {
        return this.result;
    }

    public QueryAccelerationLogByCubeIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAccelerationLogByCubeIdResponseBodyResultData extends TeaModel {
        /**
         * <p>The task duration in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The task history ID.</p>
         * 
         * <strong>example:</strong>
         * <p>REST_A***************6a8</p>
         */
        @NameInMap("JobHistoryId")
        public String jobHistoryId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>REST_A***************6a8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li><p>0: Pending</p>
         * </li>
         * <li><p>1: Running</p>
         * </li>
         * <li><p>2: Succeeded</p>
         * </li>
         * <li><p>3: Failed</p>
         * </li>
         * <li><p>4: Canceled</p>
         * </li>
         * <li><p>5: Warning</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JobStatus")
        public String jobStatus;

        /**
         * <p>The start time of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>REST_A***************6a8</p>
         */
        @NameInMap("JonStartDate")
        public String jonStartDate;

        /**
         * <p>The log content.</p>
         * 
         * <strong>example:</strong>
         * <p>asdav************</p>
         */
        @NameInMap("Log")
        public String log;

        public static QueryAccelerationLogByCubeIdResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            QueryAccelerationLogByCubeIdResponseBodyResultData self = new QueryAccelerationLogByCubeIdResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public QueryAccelerationLogByCubeIdResponseBodyResultData setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResultData setJobHistoryId(String jobHistoryId) {
            this.jobHistoryId = jobHistoryId;
            return this;
        }
        public String getJobHistoryId() {
            return this.jobHistoryId;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResultData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResultData setJobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }
        public String getJobStatus() {
            return this.jobStatus;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResultData setJonStartDate(String jonStartDate) {
            this.jonStartDate = jonStartDate;
            return this;
        }
        public String getJonStartDate() {
            return this.jonStartDate;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResultData setLog(String log) {
            this.log = log;
            return this;
        }
        public String getLog() {
            return this.log;
        }

    }

    public static class QueryAccelerationLogByCubeIdResponseBodyResult extends TeaModel {
        /**
         * <p>An array of acceleration task logs.</p>
         */
        @NameInMap("Data")
        public java.util.List<QueryAccelerationLogByCubeIdResponseBodyResultData> data;

        /**
         * <p>The next page. A value of NULL or 0 indicates that no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Next")
        public Integer next;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The previous page. A value of NULL or 0 indicates that no previous page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Pre")
        public Integer pre;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPages")
        public Integer totalPages;

        public static QueryAccelerationLogByCubeIdResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAccelerationLogByCubeIdResponseBodyResult self = new QueryAccelerationLogByCubeIdResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setData(java.util.List<QueryAccelerationLogByCubeIdResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryAccelerationLogByCubeIdResponseBodyResultData> getData() {
            return this.data;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setNext(Integer next) {
            this.next = next;
            return this;
        }
        public Integer getNext() {
            return this.next;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setPre(Integer pre) {
            this.pre = pre;
            return this;
        }
        public Integer getPre() {
            return this.pre;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public QueryAccelerationLogByCubeIdResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
