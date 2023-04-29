// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    /**
     * <p>The level-1 type of the check item. Examples: database, system, weak password, and middleware.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>Indicates whether the risk item can be exploited. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~182997~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the risk item.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The number of medium-risk items.</p>
     */
    @NameInMap("WarningSummarys")
    public java.util.List<DescribeCheckWarningSummaryResponseBodyWarningSummarys> warningSummarys;

    public static DescribeCheckWarningSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningSummaryResponseBody self = new DescribeCheckWarningSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningSummaryResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckWarningSummaryResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckWarningSummaryResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCheckWarningSummaryResponseBody setWarningSummarys(java.util.List<DescribeCheckWarningSummaryResponseBodyWarningSummarys> warningSummarys) {
        this.warningSummarys = warningSummarys;
        return this;
    }
    public java.util.List<DescribeCheckWarningSummaryResponseBodyWarningSummarys> getWarningSummarys() {
        return this.warningSummarys;
    }

    public static class DescribeCheckWarningSummaryResponseBodyWarningSummarys extends TeaModel {
        /**
         * <p>The statistics of check items.</p>
         */
        @NameInMap("CheckCount")
        public Integer checkCount;

        @NameInMap("CheckExploit")
        public Boolean checkExploit;

        @NameInMap("ContainerRisk")
        public Boolean containerRisk;

        @NameInMap("DatabaseRisk")
        public Boolean databaseRisk;

        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The number of low-risk items.</p>
         */
        @NameInMap("LastFoundTime")
        public String lastFoundTime;

        @NameInMap("Level")
        public String level;

        /**
         * <p>The number of entries to return on each page.</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>The number of check items returned on the current page.</p>
         */
        @NameInMap("RiskId")
        public Long riskId;

        @NameInMap("RiskName")
        public String riskName;

        /**
         * <p>Queries the statistical information about baseline check results. The information includes the number of servers on which a baseline check is performed, the number of baseline check items, and the pass rate of check items in the last baseline check.</p>
         */
        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        @NameInMap("TypeAlias")
        public String typeAlias;

        /**
         * <p>DescribeCheckWarningSummary</p>
         */
        @NameInMap("WarningMachineCount")
        public Integer warningMachineCount;

        public static DescribeCheckWarningSummaryResponseBodyWarningSummarys build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningSummaryResponseBodyWarningSummarys self = new DescribeCheckWarningSummaryResponseBodyWarningSummarys();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setCheckCount(Integer checkCount) {
            this.checkCount = checkCount;
            return this;
        }
        public Integer getCheckCount() {
            return this.checkCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setCheckExploit(Boolean checkExploit) {
            this.checkExploit = checkExploit;
            return this;
        }
        public Boolean getCheckExploit() {
            return this.checkExploit;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setContainerRisk(Boolean containerRisk) {
            this.containerRisk = containerRisk;
            return this;
        }
        public Boolean getContainerRisk() {
            return this.containerRisk;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setDatabaseRisk(Boolean databaseRisk) {
            this.databaseRisk = databaseRisk;
            return this;
        }
        public Boolean getDatabaseRisk() {
            return this.databaseRisk;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setLastFoundTime(String lastFoundTime) {
            this.lastFoundTime = lastFoundTime;
            return this;
        }
        public String getLastFoundTime() {
            return this.lastFoundTime;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setSubTypeAlias(String subTypeAlias) {
            this.subTypeAlias = subTypeAlias;
            return this;
        }
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setTypeAlias(String typeAlias) {
            this.typeAlias = typeAlias;
            return this;
        }
        public String getTypeAlias() {
            return this.typeAlias;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setWarningMachineCount(Integer warningMachineCount) {
            this.warningMachineCount = warningMachineCount;
            return this;
        }
        public Integer getWarningMachineCount() {
            return this.warningMachineCount;
        }

    }

}
