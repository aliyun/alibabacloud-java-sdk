// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListDataDiagnosisJobsResponseBody extends TeaModel {
    @NameInMap("DataDiagnosisJobs")
    public java.util.List<ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs> dataDiagnosisJobs;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDataDiagnosisJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataDiagnosisJobsResponseBody self = new ListDataDiagnosisJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataDiagnosisJobsResponseBody setDataDiagnosisJobs(java.util.List<ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs> dataDiagnosisJobs) {
        this.dataDiagnosisJobs = dataDiagnosisJobs;
        return this;
    }
    public java.util.List<ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs> getDataDiagnosisJobs() {
        return this.dataDiagnosisJobs;
    }

    public ListDataDiagnosisJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataDiagnosisJobsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-05-28</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataDiagnosisConfigId")
        public String dataDiagnosisConfigId;

        @NameInMap("DataDiagnosisConfigName")
        public String dataDiagnosisConfigName;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("DataDiagnosisJobId")
        public String dataDiagnosisJobId;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <strong>example:</strong>
         * <p>Cycle</p>
         */
        @NameInMap("JobSource")
        public String jobSource;

        @NameInMap("Logs")
        public java.util.List<String> logs;

        /**
         * <strong>example:</strong>
         * <p>Initializing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>ChangeRate</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs build(java.util.Map<String, ?> map) throws Exception {
            ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs self = new ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs();
            return TeaModel.build(map, self);
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setDataDiagnosisConfigId(String dataDiagnosisConfigId) {
            this.dataDiagnosisConfigId = dataDiagnosisConfigId;
            return this;
        }
        public String getDataDiagnosisConfigId() {
            return this.dataDiagnosisConfigId;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setDataDiagnosisConfigName(String dataDiagnosisConfigName) {
            this.dataDiagnosisConfigName = dataDiagnosisConfigName;
            return this;
        }
        public String getDataDiagnosisConfigName() {
            return this.dataDiagnosisConfigName;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setDataDiagnosisJobId(String dataDiagnosisJobId) {
            this.dataDiagnosisJobId = dataDiagnosisJobId;
            return this;
        }
        public String getDataDiagnosisJobId() {
            return this.dataDiagnosisJobId;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setJobSource(String jobSource) {
            this.jobSource = jobSource;
            return this;
        }
        public String getJobSource() {
            return this.jobSource;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDataDiagnosisJobsResponseBodyDataDiagnosisJobs setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
