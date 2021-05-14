// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("WarningSummarys")
    public java.util.List<DescribeCheckWarningSummaryResponseBodyWarningSummarys> warningSummarys;

    public static DescribeCheckWarningSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningSummaryResponseBody self = new DescribeCheckWarningSummaryResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeCheckWarningSummaryResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckWarningSummaryResponseBody setWarningSummarys(java.util.List<DescribeCheckWarningSummaryResponseBodyWarningSummarys> warningSummarys) {
        this.warningSummarys = warningSummarys;
        return this;
    }
    public java.util.List<DescribeCheckWarningSummaryResponseBodyWarningSummarys> getWarningSummarys() {
        return this.warningSummarys;
    }

    public static class DescribeCheckWarningSummaryResponseBodyWarningSummarys extends TeaModel {
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        @NameInMap("CheckCount")
        public Integer checkCount;

        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        @NameInMap("LastFoundTime")
        public String lastFoundTime;

        @NameInMap("RiskId")
        public Long riskId;

        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        @NameInMap("WarningMachineCount")
        public Integer warningMachineCount;

        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        @NameInMap("TypeAlias")
        public String typeAlias;

        @NameInMap("RiskName")
        public String riskName;

        @NameInMap("Level")
        public String level;

        public static DescribeCheckWarningSummaryResponseBodyWarningSummarys build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningSummaryResponseBodyWarningSummarys self = new DescribeCheckWarningSummaryResponseBodyWarningSummarys();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setLowWarningCount(Integer lowWarningCount) {
            this.lowWarningCount = lowWarningCount;
            return this;
        }
        public Integer getLowWarningCount() {
            return this.lowWarningCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setCheckCount(Integer checkCount) {
            this.checkCount = checkCount;
            return this;
        }
        public Integer getCheckCount() {
            return this.checkCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setMediumWarningCount(Integer mediumWarningCount) {
            this.mediumWarningCount = mediumWarningCount;
            return this;
        }
        public Integer getMediumWarningCount() {
            return this.mediumWarningCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setLastFoundTime(String lastFoundTime) {
            this.lastFoundTime = lastFoundTime;
            return this;
        }
        public String getLastFoundTime() {
            return this.lastFoundTime;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setRiskId(Long riskId) {
            this.riskId = riskId;
            return this;
        }
        public Long getRiskId() {
            return this.riskId;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setSubTypeAlias(String subTypeAlias) {
            this.subTypeAlias = subTypeAlias;
            return this;
        }
        public String getSubTypeAlias() {
            return this.subTypeAlias;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setWarningMachineCount(Integer warningMachineCount) {
            this.warningMachineCount = warningMachineCount;
            return this;
        }
        public Integer getWarningMachineCount() {
            return this.warningMachineCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setHighWarningCount(Integer highWarningCount) {
            this.highWarningCount = highWarningCount;
            return this;
        }
        public Integer getHighWarningCount() {
            return this.highWarningCount;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setTypeAlias(String typeAlias) {
            this.typeAlias = typeAlias;
            return this;
        }
        public String getTypeAlias() {
            return this.typeAlias;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setRiskName(String riskName) {
            this.riskName = riskName;
            return this;
        }
        public String getRiskName() {
            return this.riskName;
        }

        public DescribeCheckWarningSummaryResponseBodyWarningSummarys setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
