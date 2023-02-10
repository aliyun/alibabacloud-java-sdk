// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("CheckCount")
        public Integer checkCount;

        @NameInMap("CheckExploit")
        public Boolean checkExploit;

        @NameInMap("DatabaseRisk")
        public Boolean databaseRisk;

        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        @NameInMap("LastFoundTime")
        public String lastFoundTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        @NameInMap("RiskId")
        public Long riskId;

        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        @NameInMap("TypeAlias")
        public String typeAlias;

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
