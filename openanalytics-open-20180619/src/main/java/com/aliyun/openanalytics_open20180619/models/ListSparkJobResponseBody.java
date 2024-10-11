// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobResponseBody extends TeaModel {
    @NameInMap("DataResult")
    public ListSparkJobResponseBodyDataResult dataResult;

    /**
     * <strong>example:</strong>
     * <p>E18B0634-F003-486A-90B9-4AA6932DA3AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobResponseBody self = new ListSparkJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkJobResponseBody setDataResult(ListSparkJobResponseBodyDataResult dataResult) {
        this.dataResult = dataResult;
        return this;
    }
    public ListSparkJobResponseBodyDataResult getDataResult() {
        return this.dataResult;
    }

    public ListSparkJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSparkJobResponseBodyDataResultJobList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-10-27 17:51:05</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1603792267000</p>
         */
        @NameInMap("CreateTimeValue")
        public String createTimeValue;

        /**
         * <strong>example:</strong>
         * <p>{&quot;args&quot;:[&quot;100&quot;],&quot;name&quot;:...}</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("DriverResourceSpec")
        public String driverResourceSpec;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ExecutorInstances")
        public String executorInstances;

        /**
         * <strong>example:</strong>
         * <p>small</p>
         */
        @NameInMap("ExecutorResourceSpec")
        public String executorResourceSpec;

        /**
         * <strong>example:</strong>
         * <p>j202010271750hangzhouf742a4330000950</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>SparkPi</p>
         */
        @NameInMap("JobName")
        public String jobName;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dlaui-cn-hangzhou.aliyuncs.com/?token=xxx">https://dlaui-cn-hangzhou.aliyuncs.com/?token=xxx</a></p>
         */
        @NameInMap("SparkUI")
        public String sparkUI;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2020-10-27 17:51:05</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <strong>example:</strong>
         * <p>1603792267000</p>
         */
        @NameInMap("SubmitTimeValue")
        public String submitTimeValue;

        /**
         * <strong>example:</strong>
         * <p>2020-10-27 17:51:05</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1603792267000</p>
         */
        @NameInMap("UpdateTimeValue")
        public String updateTimeValue;

        /**
         * <strong>example:</strong>
         * <p>MyCluster</p>
         */
        @NameInMap("VcName")
        public String vcName;

        public static ListSparkJobResponseBodyDataResultJobList build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobResponseBodyDataResultJobList self = new ListSparkJobResponseBodyDataResultJobList();
            return TeaModel.build(map, self);
        }

        public ListSparkJobResponseBodyDataResultJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSparkJobResponseBodyDataResultJobList setCreateTimeValue(String createTimeValue) {
            this.createTimeValue = createTimeValue;
            return this;
        }
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        public ListSparkJobResponseBodyDataResultJobList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListSparkJobResponseBodyDataResultJobList setDriverResourceSpec(String driverResourceSpec) {
            this.driverResourceSpec = driverResourceSpec;
            return this;
        }
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        public ListSparkJobResponseBodyDataResultJobList setExecutorInstances(String executorInstances) {
            this.executorInstances = executorInstances;
            return this;
        }
        public String getExecutorInstances() {
            return this.executorInstances;
        }

        public ListSparkJobResponseBodyDataResultJobList setExecutorResourceSpec(String executorResourceSpec) {
            this.executorResourceSpec = executorResourceSpec;
            return this;
        }
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
        }

        public ListSparkJobResponseBodyDataResultJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSparkJobResponseBodyDataResultJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListSparkJobResponseBodyDataResultJobList setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public ListSparkJobResponseBodyDataResultJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSparkJobResponseBodyDataResultJobList setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListSparkJobResponseBodyDataResultJobList setSubmitTimeValue(String submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public ListSparkJobResponseBodyDataResultJobList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSparkJobResponseBodyDataResultJobList setUpdateTimeValue(String updateTimeValue) {
            this.updateTimeValue = updateTimeValue;
            return this;
        }
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
        }

        public ListSparkJobResponseBodyDataResultJobList setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

    }

    public static class ListSparkJobResponseBodyDataResult extends TeaModel {
        @NameInMap("JobList")
        public java.util.List<ListSparkJobResponseBodyDataResultJobList> jobList;

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
         * <p>4998</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static ListSparkJobResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobResponseBodyDataResult self = new ListSparkJobResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListSparkJobResponseBodyDataResult setJobList(java.util.List<ListSparkJobResponseBodyDataResultJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<ListSparkJobResponseBodyDataResultJobList> getJobList() {
            return this.jobList;
        }

        public ListSparkJobResponseBodyDataResult setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkJobResponseBodyDataResult setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListSparkJobResponseBodyDataResult setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
