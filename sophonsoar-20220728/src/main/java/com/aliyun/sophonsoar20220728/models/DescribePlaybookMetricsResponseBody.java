// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookMetricsResponseBody extends TeaModel {
    /**
     * <p>The details of the playbook.</p>
     */
    @NameInMap("Metrics")
    public DescribePlaybookMetricsResponseBodyMetrics metrics;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookMetricsResponseBody self = new DescribePlaybookMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookMetricsResponseBody setMetrics(DescribePlaybookMetricsResponseBodyMetrics metrics) {
        this.metrics = metrics;
        return this;
    }
    public DescribePlaybookMetricsResponseBodyMetrics getMetrics() {
        return this.metrics;
    }

    public DescribePlaybookMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookMetricsResponseBodyMetrics extends TeaModel {
        /**
         * <p>The status of the playbook. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("Active")
        public Integer active;

        /**
         * <p>The description of the playbook.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the playbook.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The number of the tasks that are created for the playbook and failed to run.</p>
         */
        @NameInMap("FailNum")
        public Integer failNum;

        /**
         * <p>The time when the playbook was created. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The number of historical versions of the playbook.</p>
         */
        @NameInMap("HistoryMd5")
        public Integer historyMd5;

        /**
         * <p>The time when the playbook was last run. The value is a 13-digit timestamp.</p>
         */
        @NameInMap("LastRuntime")
        public Long lastRuntime;

        /**
         * <p>The type of the playbook. Valid values:</p>
         * <br>
         * <p>*   **preset**: predefined playbook</p>
         * <p>*   **user**: custom playbook</p>
         */
        @NameInMap("OwnType")
        public String ownType;

        /**
         * <p>The UUID of the playbook.</p>
         */
        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        /**
         * <p>The number of the tasks that are created for the playbook and were successfully run.</p>
         */
        @NameInMap("SuccNum")
        public Integer succNum;

        public static DescribePlaybookMetricsResponseBodyMetrics build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookMetricsResponseBodyMetrics self = new DescribePlaybookMetricsResponseBodyMetrics();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookMetricsResponseBodyMetrics setActive(Integer active) {
            this.active = active;
            return this;
        }
        public Integer getActive() {
            return this.active;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setFailNum(Integer failNum) {
            this.failNum = failNum;
            return this;
        }
        public Integer getFailNum() {
            return this.failNum;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setHistoryMd5(Integer historyMd5) {
            this.historyMd5 = historyMd5;
            return this;
        }
        public Integer getHistoryMd5() {
            return this.historyMd5;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setLastRuntime(Long lastRuntime) {
            this.lastRuntime = lastRuntime;
            return this;
        }
        public Long getLastRuntime() {
            return this.lastRuntime;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setOwnType(String ownType) {
            this.ownType = ownType;
            return this;
        }
        public String getOwnType() {
            return this.ownType;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        public DescribePlaybookMetricsResponseBodyMetrics setSuccNum(Integer succNum) {
            this.succNum = succNum;
            return this;
        }
        public Integer getSuccNum() {
            return this.succNum;
        }

    }

}
