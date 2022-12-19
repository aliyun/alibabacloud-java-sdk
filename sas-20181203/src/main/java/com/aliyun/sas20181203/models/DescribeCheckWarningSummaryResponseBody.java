// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    // The number of check items returned on the current page.
    @NameInMap("Count")
    public Integer count;

    // The page number of the current page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of check items.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // The statistics of check items.
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
        // The number of check items.
        @NameInMap("CheckCount")
        public Integer checkCount;

        // Indicates whether the risk item can be exploited. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CheckExploit")
        public Boolean checkExploit;

        // Indicates whether the risk item is a database risk item. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("DatabaseRisk")
        public Boolean databaseRisk;

        // The number of high-risk items.
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        // The time when the last baseline check was performed.
        @NameInMap("LastFoundTime")
        public String lastFoundTime;

        // The risk level of the risk item. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("Level")
        public String level;

        // The number of low-risk items.
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        // The number of medium-risk items.
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        // The ID of the risk item.
        @NameInMap("RiskId")
        public Long riskId;

        // The name of the risk item.
        @NameInMap("RiskName")
        public String riskName;

        // The level-2 type of the risk item.
        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        // The level-1 type of the check item. Examples: database, system, weak password, and middleware.
        @NameInMap("TypeAlias")
        public String typeAlias;

        // The number of assets on which risk items are detected.
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
