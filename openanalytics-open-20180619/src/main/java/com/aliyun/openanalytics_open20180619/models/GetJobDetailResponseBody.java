// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class GetJobDetailResponseBody extends TeaModel {
    @NameInMap("JobDetail")
    public GetJobDetailResponseBodyJobDetail jobDetail;

    /**
     * <strong>example:</strong>
     * <p>5F10AB6E-8984-4E32-B821-4E1512711B8C</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2020-10-27 16:23:16</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1603786996000</p>
         */
        @NameInMap("CreateTimeValue")
        public String createTimeValue;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;args\&quot;:[\&quot;100\&quot;],\&quot;name\&quot;:\&quot;SparkPi\&quot;,\&quot;className\&quot;:\&quot;org.apache.spark.examples.SparkPi\&quot;,\&quot;conf\&quot;:{\&quot;spark.driver.resourceSpec\&quot;:\&quot;medium\&quot;,\&quot;spark.executor.instances\&quot;:5,\&quot;spark.executor.resourceSpec\&quot;:\&quot;medium\&quot;},\&quot;file\&quot;:\&quot;local:///tmp/spark-examples.jar\&quot;}</p>
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
         * <p>1</p>
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
         * <p>j202010271622hangzhouf742a4330000923</p>
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
         * <p>202105251618hzslot9906b0b40000005-0001</p>
         */
        @NameInMap("LastJobAttemptId")
        public String lastJobAttemptId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://dlaui-cn-hangzhou.aliyuncs.com/?token=xxx">https://dlaui-cn-hangzhou.aliyuncs.com/?token=xxx</a></p>
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
         * <p>2020-10-27 16:23:16</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <strong>example:</strong>
         * <p>1603786996000</p>
         */
        @NameInMap("SubmitTimeValue")
        public String submitTimeValue;

        /**
         * <strong>example:</strong>
         * <p>2020-10-27 16:23:16</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1603786996000</p>
         */
        @NameInMap("UpdateTimeValue")
        public String updateTimeValue;

        /**
         * <strong>example:</strong>
         * <p>MyCluster</p>
         */
        @NameInMap("VcName")
        public String vcName;

        public static GetJobDetailResponseBodyJobDetail build(java.util.Map<String, ?> map) throws Exception {
            GetJobDetailResponseBodyJobDetail self = new GetJobDetailResponseBodyJobDetail();
            return TeaModel.build(map, self);
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

        public GetJobDetailResponseBodyJobDetail setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetJobDetailResponseBodyJobDetail setDriverResourceSpec(String driverResourceSpec) {
            this.driverResourceSpec = driverResourceSpec;
            return this;
        }
        public String getDriverResourceSpec() {
            return this.driverResourceSpec;
        }

        public GetJobDetailResponseBodyJobDetail setExecutorInstances(String executorInstances) {
            this.executorInstances = executorInstances;
            return this;
        }
        public String getExecutorInstances() {
            return this.executorInstances;
        }

        public GetJobDetailResponseBodyJobDetail setExecutorResourceSpec(String executorResourceSpec) {
            this.executorResourceSpec = executorResourceSpec;
            return this;
        }
        public String getExecutorResourceSpec() {
            return this.executorResourceSpec;
        }

        public GetJobDetailResponseBodyJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetJobDetailResponseBodyJobDetail setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetJobDetailResponseBodyJobDetail setLastJobAttemptId(String lastJobAttemptId) {
            this.lastJobAttemptId = lastJobAttemptId;
            return this;
        }
        public String getLastJobAttemptId() {
            return this.lastJobAttemptId;
        }

        public GetJobDetailResponseBodyJobDetail setSparkUI(String sparkUI) {
            this.sparkUI = sparkUI;
            return this;
        }
        public String getSparkUI() {
            return this.sparkUI;
        }

        public GetJobDetailResponseBodyJobDetail setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetJobDetailResponseBodyJobDetail setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public GetJobDetailResponseBodyJobDetail setSubmitTimeValue(String submitTimeValue) {
            this.submitTimeValue = submitTimeValue;
            return this;
        }
        public String getSubmitTimeValue() {
            return this.submitTimeValue;
        }

        public GetJobDetailResponseBodyJobDetail setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetJobDetailResponseBodyJobDetail setUpdateTimeValue(String updateTimeValue) {
            this.updateTimeValue = updateTimeValue;
            return this;
        }
        public String getUpdateTimeValue() {
            return this.updateTimeValue;
        }

        public GetJobDetailResponseBodyJobDetail setVcName(String vcName) {
            this.vcName = vcName;
            return this;
        }
        public String getVcName() {
            return this.vcName;
        }

    }

}
