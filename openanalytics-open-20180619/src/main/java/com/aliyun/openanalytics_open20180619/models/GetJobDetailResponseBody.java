// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobDetailResponseBody extends TeaModel {
    @NameInMap("JobDetail")
    public GetJobDetailResponseBodyJobDetail jobDetail;

    @NameInMap("RequestId")
    public String requestId;

    public static GetJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobDetailResponseBody self = new GetJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobDetailResponseBody setJobDetail(GetJobDetailResponseBodyJobDetail jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }
    public GetJobDetailResponseBodyJobDetail getJobDetail() {
        return this.jobDetail;
    }

    public GetJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetJobDetailResponseBodyJobDetail extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ExecutorResourceSpec")
        public String executorResourceSpec;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimeValue")
        public String createTimeValue;

        @NameInMap("DriverResourceSpec")
        public String driverResourceSpec;

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

        @NameInMap("ExecutorInstances")
        public String executorInstances;

        @NameInMap("VcName")
        public String vcName;

        @NameInMap("SubmitTime")
        public String submitTime;

        @NameInMap("Detail")
        public String detail;

        public static GetJobDetailResponseBodyJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodyJobDetail self = new GetJobDetailResponseBodyJobDetail();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseBodyJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodyJobDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetJobDetailResponseBodyJobDetail setExecutorResourceSpec(String executorResourceSpec) {
            this.executorResourceSpec = executorResourceSpec;
            return this;
        }
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
        }

        public GetJobDetailResponseBodyJobDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseBodyJobDetail setCreateTimeValue(String createTimeValue) {
            this.createTimeValue = createTimeValue;
            return this;
        }
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        public GetJobDetailResponseBodyJobDetail setDriverResourceSpec(String driverResourceSpec) {
            this.driverResourceSpec = driverResourceSpec;
            return this;
        }
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        public GetJobDetailResponseBodyJobDetail setUpdateTimeValue(String updateTimeValue) {
            this.updateTimeValue = updateTimeValue;
            return this;
        }
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
        }

        public GetJobDetailResponseBodyJobDetail setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public GetJobDetailResponseBodyJobDetail setSubmitTimeValue(String submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public GetJobDetailResponseBodyJobDetail setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobDetailResponseBodyJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobDetailResponseBodyJobDetail setExecutorInstances(String executorInstances) {
            this.executorInstances = executorInstances;
            return this;
        }
        public String getExecutorInstances() {
            return this.executorInstances;
        }

        public GetJobDetailResponseBodyJobDetail setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

        public GetJobDetailResponseBodyJobDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetJobDetailResponseBodyJobDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

}
