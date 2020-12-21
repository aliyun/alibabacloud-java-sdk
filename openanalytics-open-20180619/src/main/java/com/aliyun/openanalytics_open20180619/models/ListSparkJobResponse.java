// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DataResult")
    @Validation(required = true)
    public ListSparkJobResponseDataResult dataResult;

    public static ListSparkJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSparkJobResponse self = new ListSparkJobResponse();
        return TeaModel.build(map, self);
    }

    public ListSparkJobResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSparkJobResponse setDataResult(ListSparkJobResponseDataResult dataResult) {
        this.dataResult = dataResult;
        return this;
    }
    public ListSparkJobResponseDataResult getDataResult() {
        return this.dataResult;
    }

    public static class ListSparkJobResponseDataResultJobList extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("CreateTimeValue")
        @Validation(required = true)
        public String createTimeValue;

        @NameInMap("Detail")
        @Validation(required = true)
        public String detail;

        @NameInMap("DriverResourceSpec")
        @Validation(required = true)
        public String driverResourceSpec;

        @NameInMap("ExecutorInstances")
        @Validation(required = true)
        public String executorInstances;

        @NameInMap("ExecutorResourceSpec")
        @Validation(required = true)
        public String executorResourceSpec;

        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobName")
        @Validation(required = true)
        public String jobName;

        @NameInMap("SparkUI")
        @Validation(required = true)
        public String sparkUI;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SubmitTime")
        @Validation(required = true)
        public String submitTime;

        @NameInMap("SubmitTimeValue")
        @Validation(required = true)
        public String submitTimeValue;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("UpdateTimeValue")
        @Validation(required = true)
        public String updateTimeValue;

        @NameInMap("VcName")
        @Validation(required = true)
        public String vcName;

        public static ListSparkJobResponseDataResultJobList build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobResponseDataResultJobList self = new ListSparkJobResponseDataResultJobList();
            return TeaModel.build(map, self);
        }

        public ListSparkJobResponseDataResultJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSparkJobResponseDataResultJobList setCreateTimeValue(String createTimeValue) {
            this.createTimeValue = createTimeValue;
            return this;
        }
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        public ListSparkJobResponseDataResultJobList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListSparkJobResponseDataResultJobList setDriverResourceSpec(String driverResourceSpec) {
            this.driverResourceSpec = driverResourceSpec;
            return this;
        }
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        public ListSparkJobResponseDataResultJobList setExecutorInstances(String executorInstances) {
            this.executorInstances = executorInstances;
            return this;
        }
        public String getExecutorInstances() {
            return this.executorInstances;
        }

        public ListSparkJobResponseDataResultJobList setExecutorResourceSpec(String executorResourceSpec) {
            this.executorResourceSpec = executorResourceSpec;
            return this;
        }
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
        }

        public ListSparkJobResponseDataResultJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSparkJobResponseDataResultJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListSparkJobResponseDataResultJobList setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public ListSparkJobResponseDataResultJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSparkJobResponseDataResultJobList setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListSparkJobResponseDataResultJobList setSubmitTimeValue(String submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public ListSparkJobResponseDataResultJobList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSparkJobResponseDataResultJobList setUpdateTimeValue(String updateTimeValue) {
            this.updateTimeValue = updateTimeValue;
            return this;
        }
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
        }

        public ListSparkJobResponseDataResultJobList setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

    }

    public static class ListSparkJobResponseDataResult extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public String pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public String pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public String totalCount;

        @NameInMap("JobList")
        @Validation(required = true)
        public java.util.List<ListSparkJobResponseDataResultJobList> jobList;

        public static ListSparkJobResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobResponseDataResult self = new ListSparkJobResponseDataResult();
            return TeaModel.build(map, self);
        }

        public ListSparkJobResponseDataResult setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkJobResponseDataResult setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListSparkJobResponseDataResult setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public ListSparkJobResponseDataResult setJobList(java.util.List<ListSparkJobResponseDataResultJobList> jobList) {
            this.jobList = jobList;
            return this;
        }
        public java.util.List<ListSparkJobResponseDataResultJobList> getJobList() {
            return this.jobList;
        }

    }

}
