// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobAttemptResponseBody extends TeaModel {
    @NameInMap("DataResult")
    public ListSparkJobAttemptResponseBodyDataResult dataResult;

    /**
     * <strong>example:</strong>
     * <p>4A839055-70C7-423D-A6F2-E714EA4502DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkJobAttemptResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobAttemptResponseBody self = new ListSparkJobAttemptResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkJobAttemptResponseBody setDataResult(ListSparkJobAttemptResponseBodyDataResult dataResult) {
        this.dataResult = dataResult;
        return this;
    }
    public ListSparkJobAttemptResponseBodyDataResult getDataResult() {
        return this.dataResult;
    }

    public ListSparkJobAttemptResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSparkJobAttemptResponseBodyDataResultJobAttemptList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021-05-27 23:22:08</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1622128928000</p>
         */
        @NameInMap("CreateTimeValue")
        public String createTimeValue;

        /**
         * <strong>example:</strong>
         * <p>{&quot;xxx&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>00:01:12</p>
         */
        @NameInMap("DurationTime")
        public String durationTime;

        /**
         * <strong>example:</strong>
         * <p>72000</p>
         */
        @NameInMap("DurationTimeValue")
        public String durationTimeValue;

        /**
         * <strong>example:</strong>
         * <p>j202105272322hangzhou5d64f1560000128-0001</p>
         */
        @NameInMap("JobAttemptId")
        public String jobAttemptId;

        /**
         * <strong>example:</strong>
         * <p>j202105272322hangzhou5d64f1560000128</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SparkUI")
        public String sparkUI;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2021-05-27 23:23:20</p>
         */
        @NameInMap("TerminatedTime")
        public String terminatedTime;

        /**
         * <strong>example:</strong>
         * <p>1622129000000</p>
         */
        @NameInMap("TerminatedTimeValue")
        public String terminatedTimeValue;

        /**
         * <strong>example:</strong>
         * <p>release-test</p>
         */
        @NameInMap("VcName")
        public String vcName;

        public static ListSparkJobAttemptResponseBodyDataResultJobAttemptList build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobAttemptResponseBodyDataResultJobAttemptList self = new ListSparkJobAttemptResponseBodyDataResultJobAttemptList();
            return TeaModel.build(map, self);
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setCreateTimeValue(String createTimeValue) {
            this.createTimeValue = createTimeValue;
            return this;
        }
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setDurationTime(String durationTime) {
            this.durationTime = durationTime;
            return this;
        }
        public String getDurationTime() {
            return this.durationTime;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setDurationTimeValue(String durationTimeValue) {
            this.durationTimeValue = durationTimeValue;
            return this;
        }
        public String getDurationTimeValue() {
            return this.durationTimeValue;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setJobAttemptId(String jobAttemptId) {
            this.jobAttemptId = jobAttemptId;
            return this;
        }
        public String getJobAttemptId() {
            return this.jobAttemptId;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setTerminatedTime(String terminatedTime) {
            this.terminatedTime = terminatedTime;
            return this;
        }
        public String getTerminatedTime() {
            return this.terminatedTime;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setTerminatedTimeValue(String terminatedTimeValue) {
            this.terminatedTimeValue = terminatedTimeValue;
            return this;
        }
        public String getTerminatedTimeValue() {
            return this.terminatedTimeValue;
        }

        public ListSparkJobAttemptResponseBodyDataResultJobAttemptList setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

    }

    public static class ListSparkJobAttemptResponseBodyDataResult extends TeaModel {
        @NameInMap("JobAttemptList")
        public java.util.List<ListSparkJobAttemptResponseBodyDataResultJobAttemptList> jobAttemptList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public String pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListSparkJobAttemptResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobAttemptResponseBodyDataResult self = new ListSparkJobAttemptResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListSparkJobAttemptResponseBodyDataResult setJobAttemptList(java.util.List<ListSparkJobAttemptResponseBodyDataResultJobAttemptList> jobAttemptList) {
            this.jobAttemptList = jobAttemptList;
            return this;
        }
        public java.util.List<ListSparkJobAttemptResponseBodyDataResultJobAttemptList> getJobAttemptList() {
            return this.jobAttemptList;
        }

        public ListSparkJobAttemptResponseBodyDataResult setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkJobAttemptResponseBodyDataResult setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListSparkJobAttemptResponseBodyDataResult setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
