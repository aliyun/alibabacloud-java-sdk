// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListCalculationJobsResponseBody extends TeaModel {
    /**
     * <p>The calculation tasks.</p>
     */
    @NameInMap("CalculationJobs")
    public java.util.List<ListCalculationJobsResponseBodyCalculationJobs> calculationJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7AC05FF-EDE7-5C2B-B9AE-33D6DF4178BA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <p>The name of the A/B metric.</p>
         * 
         * <strong>example:</strong>
         * <p>pv</p>
         */
        @NameInMap("ABMetricName")
        public String ABMetricName;

        /**
         * <p>The business date. The date is in the YYYY-MM-DD format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <p>The ID of the calculation task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CalculationJobId")
        public String calculationJobId;

        /**
         * <p>The task configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The execution time. The time is in the ISO 8601 format and includes the time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtRanTime")
        public String gmtRanTime;

        /**
         * <p>The task message.</p>
         */
        @NameInMap("JobMessage")
        public java.util.List<String> jobMessage;

        /**
         * <p>The task source. Valid values:</p>
         * <ul>
         * <li>CronOffline: Offline scheduled task.</li>
         * <li>DataRerun: Data rerun task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CronOffline</p>
         */
        @NameInMap("JobSource")
        public String jobSource;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Success: Succeeded.</li>
         * <li>Failure: Failed.</li>
         * <li>Initializing: Initializing.</li>
         * <li>Running: Running.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
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
