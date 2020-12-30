// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class ListSparkJobResponseBody extends TeaModel {
    @NameInMap("DataResult")
    public ListSparkJobResponseBodyDataResult dataResult;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ExecutorResourceSpec")
        public String executorResourceSpec;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DriverResourceSpec")
        public String driverResourceSpec;

        @NameInMap("CreateTimeValue")
        public String createTimeValue;

        @NameInMap("UpdateTimeValue")
        public String updateTimeValue;

        @NameInMap("SparkUI")
        public String sparkUI;

        @NameInMap("SubmitTimeValue")
        public String submitTimeValue;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("VcName")
        public String vcName;

        @NameInMap("ExecutorInstances")
        public String executorInstances;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("Detail")
        public String detail;

        public static ListSparkJobResponseBodyDataResultJobList build(java.util.Map<String, ?> map) throws Exception {
            ListSparkJobResponseBodyDataResultJobList self = new ListSparkJobResponseBodyDataResultJobList();
            return TeaModel.build(map, self);
        }

        public ListSparkJobResponseBodyDataResultJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSparkJobResponseBodyDataResultJobList setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSparkJobResponseBodyDataResultJobList setExecutorResourceSpec(String executorResourceSpec) {
            this.executorResourceSpec = executorResourceSpec;
            return this;
        }
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
        }

        public ListSparkJobResponseBodyDataResultJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSparkJobResponseBodyDataResultJobList setDriverResourceSpec(String driverResourceSpec) {
            this.driverResourceSpec = driverResourceSpec;
            return this;
        }
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        public ListSparkJobResponseBodyDataResultJobList setCreateTimeValue(String createTimeValue) {
            this.createTimeValue = createTimeValue;
            return this;
        }
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        public ListSparkJobResponseBodyDataResultJobList setUpdateTimeValue(String updateTimeValue) {
            this.updateTimeValue = updateTimeValue;
            return this;
        }
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
        }

        public ListSparkJobResponseBodyDataResultJobList setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public ListSparkJobResponseBodyDataResultJobList setSubmitTimeValue(String submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public ListSparkJobResponseBodyDataResultJobList setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListSparkJobResponseBodyDataResultJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListSparkJobResponseBodyDataResultJobList setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

        public ListSparkJobResponseBodyDataResultJobList setExecutorInstances(String executorInstances) {
            this.executorInstances = executorInstances;
            return this;
        }
        public String getExecutorInstances() {
            return this.executorInstances;
        }

        public ListSparkJobResponseBodyDataResultJobList setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListSparkJobResponseBodyDataResultJobList setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class ListSparkJobResponseBodyDataResult extends TeaModel {
        @NameInMap("JobList")
        public java.util.List<ListSparkJobResponseBodyDataResultJobList> jobList;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

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
