// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCalculationJobsResponseBody extends TeaModel {
    @NameInMap("CalculationJobs")
    public java.util.List<ListCalculationJobsResponseBodyCalculationJobs> calculationJobs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCalculationJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCalculationJobsResponseBody self = new ListCalculationJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCalculationJobsResponseBody setCalculationJobs(java.util.List<ListCalculationJobsResponseBodyCalculationJobs> calculationJobs) {
        this.calculationJobs = calculationJobs;
        return this;
    }
    public java.util.List<ListCalculationJobsResponseBodyCalculationJobs> getCalculationJobs() {
        return this.calculationJobs;
    }

    public ListCalculationJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCalculationJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCalculationJobsResponseBodyCalculationJobs extends TeaModel {
        @NameInMap("ABMetricName")
        public String ABMetricName;

        @NameInMap("BizDate")
        public String bizDate;

        @NameInMap("CalculationJobId")
        public String calculationJobId;

        @NameInMap("Config")
        public String config;

        @NameInMap("GmtRanTime")
        public String gmtRanTime;

        @NameInMap("JobMessage")
        public java.util.List<String> jobMessage;

        @NameInMap("JobSource")
        public String jobSource;

        @NameInMap("Status")
        public String status;

        public static ListCalculationJobsResponseBodyCalculationJobs build(java.util.Map<String, ?> map) throws Exception {
            ListCalculationJobsResponseBodyCalculationJobs self = new ListCalculationJobsResponseBodyCalculationJobs();
            return TeaModel.build(map, self);
        }

        public ListCalculationJobsResponseBodyCalculationJobs setABMetricName(String ABMetricName) {
            this.ABMetricName = ABMetricName;
            return this;
        }
        public String getABMetricName() {
            return this.ABMetricName;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setCalculationJobId(String calculationJobId) {
            this.calculationJobId = calculationJobId;
            return this;
        }
        public String getCalculationJobId() {
            return this.calculationJobId;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setGmtRanTime(String gmtRanTime) {
            this.gmtRanTime = gmtRanTime;
            return this;
        }
        public String getGmtRanTime() {
            return this.gmtRanTime;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setJobMessage(java.util.List<String> jobMessage) {
            this.jobMessage = jobMessage;
            return this;
        }
        public java.util.List<String> getJobMessage() {
            return this.jobMessage;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setJobSource(String jobSource) {
            this.jobSource = jobSource;
            return this;
        }
        public String getJobSource() {
            return this.jobSource;
        }

        public ListCalculationJobsResponseBodyCalculationJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
