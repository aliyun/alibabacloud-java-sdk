// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("JobDetail")
    @Validation(required = true)
    public GetJobDetailResponseJobDetail jobDetail;

    public static GetJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobDetailResponse self = new GetJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetJobDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJobDetailResponse setJobDetail(GetJobDetailResponseJobDetail jobDetail) {
        this.jobDetail = jobDetail;
        return this;
    }
    public GetJobDetailResponseJobDetail getJobDetail() {
        return this.jobDetail;
    }

    public static class GetJobDetailResponseJobDetail extends TeaModel {
        @NameInMap("JobId")
        @Validation(required = true)
        public String jobId;

        @NameInMap("JobName")
        @Validation(required = true)
        public String jobName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Detail")
        @Validation(required = true)
        public String detail;

        @NameInMap("SparkUI")
        @Validation(required = true)
        public String sparkUI;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("SubmitTime")
        @Validation(required = true)
        public String submitTime;

        @NameInMap("CreateTimeValue")
        @Validation(required = true)
        public String createTimeValue;

        @NameInMap("UpdateTimeValue")
        @Validation(required = true)
        public String updateTimeValue;

        @NameInMap("SubmitTimeValue")
        @Validation(required = true)
        public String submitTimeValue;

        @NameInMap("VcName")
        @Validation(required = true)
        public String vcName;

        @NameInMap("DriverResourceSpec")
        @Validation(required = true)
        public String driverResourceSpec;

        @NameInMap("ExecutorResourceSpec")
        @Validation(required = true)
        public String executorResourceSpec;

        @NameInMap("ExecutorInstances")
        @Validation(required = true)
        public String executorInstances;

        public static GetJobDetailResponseJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseJobDetail self = new GetJobDetailResponseJobDetail();
            return TeaModel.build(map, self);
        }

        public GetJobDetailResponseJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobDetailResponseJobDetail setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobDetailResponseJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseJobDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetJobDetailResponseJobDetail setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public GetJobDetailResponseJobDetail setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetJobDetailResponseJobDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetJobDetailResponseJobDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetJobDetailResponseJobDetail setCreateTimeValue(String createTimeValue) {
            this.createTimeValue = createTimeValue;
            return this;
        }
        public String getCreateTimeValue() {
            return this.createTimeValue;
        }

        public GetJobDetailResponseJobDetail setUpdateTimeValue(String updateTimeValue) {
            this.updateTimeValue = updateTimeValue;
            return this;
        }
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
        }

        public GetJobDetailResponseJobDetail setSubmitTimeValue(String submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public GetJobDetailResponseJobDetail setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

        public GetJobDetailResponseJobDetail setDriverResourceSpec(String driverResourceSpec) {
            this.driverResourceSpec = driverResourceSpec;
            return this;
        }
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        public GetJobDetailResponseJobDetail setExecutorResourceSpec(String executorResourceSpec) {
            this.executorResourceSpec = executorResourceSpec;
            return this;
        }
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
        }

        public GetJobDetailResponseJobDetail setExecutorInstances(String executorInstances) {
            this.executorInstances = executorInstances;
            return this;
        }
        public String getExecutorInstances() {
            return this.executorInstances;
        }

    }

}
