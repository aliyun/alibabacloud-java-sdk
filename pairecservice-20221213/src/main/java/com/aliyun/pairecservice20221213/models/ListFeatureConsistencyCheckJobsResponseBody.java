// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobsResponseBody extends TeaModel {
    /**
     * <p>The list of feature consistency check jobs.</p>
     */
    @NameInMap("FeatureConsistencyCheckJobs")
    public java.util.List<ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs> featureConsistencyCheckJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A04CB8C0-E74A-5E83-BC61-64D153574EC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListFeatureConsistencyCheckJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobsResponseBody self = new ListFeatureConsistencyCheckJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobsResponseBody setFeatureConsistencyCheckJobs(java.util.List<ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs> featureConsistencyCheckJobs) {
        this.featureConsistencyCheckJobs = featureConsistencyCheckJobs;
        return this;
    }
    public java.util.List<ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs> getFeatureConsistencyCheckJobs() {
        return this.featureConsistencyCheckJobs;
    }

    public ListFeatureConsistencyCheckJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFeatureConsistencyCheckJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs extends TeaModel {
        /**
         * <p>The configuration of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The ID of the feature consistency check configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("FeatureConsistencyCheckJobConfigId")
        public String featureConsistencyCheckJobConfigId;

        /**
         * <p>The name of the feature consistency check job configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>feature_consistency_check_1</p>
         */
        @NameInMap("FeatureConsistencyCheckJobConfigName")
        public String featureConsistencyCheckJobConfigName;

        /**
         * <p>The ID of the feature consistency check job.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FeatureConsistencyCheckJobId")
        public String featureConsistencyCheckJobId;

        /**
         * <p>The end time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtEndTime")
        public String gmtEndTime;

        /**
         * <p>The start time of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        @NameInMap("GmtStartTime")
        public String gmtStartTime;

        /**
         * <p>A list of log entries.</p>
         */
        @NameInMap("Logs")
        public java.util.List<String> logs;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><p><code>ToRun</code>: Waiting to run.</p>
         * </li>
         * <li><p><code>Running</code>: In progress.</p>
         * </li>
         * <li><p><code>Success</code>: Successful.</p>
         * </li>
         * <li><p><code>Failure</code>: Failed.</p>
         * </li>
         * <li><p><code>Stopped</code>: Stopped or canceled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs build(java.util.Map<String, ?> map) throws Exception {
            ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs self = new ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs();
            return TeaModel.build(map, self);
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setFeatureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }
        public String getFeatureConsistencyCheckJobConfigId() {
            return this.featureConsistencyCheckJobConfigId;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setFeatureConsistencyCheckJobConfigName(String featureConsistencyCheckJobConfigName) {
            this.featureConsistencyCheckJobConfigName = featureConsistencyCheckJobConfigName;
            return this;
        }
        public String getFeatureConsistencyCheckJobConfigName() {
            return this.featureConsistencyCheckJobConfigName;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setFeatureConsistencyCheckJobId(String featureConsistencyCheckJobId) {
            this.featureConsistencyCheckJobId = featureConsistencyCheckJobId;
            return this;
        }
        public String getFeatureConsistencyCheckJobId() {
            return this.featureConsistencyCheckJobId;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setGmtEndTime(String gmtEndTime) {
            this.gmtEndTime = gmtEndTime;
            return this;
        }
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setGmtStartTime(String gmtStartTime) {
            this.gmtStartTime = gmtStartTime;
            return this;
        }
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setLogs(java.util.List<String> logs) {
            this.logs = logs;
            return this;
        }
        public java.util.List<String> getLogs() {
            return this.logs;
        }

        public ListFeatureConsistencyCheckJobsResponseBodyFeatureConsistencyCheckJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
