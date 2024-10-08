// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningSummaryResponseBody extends TeaModel {
    /**
     * <p>The number of check items returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00BD7CE2-284A-4534-BD09-FB69836DD750</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of check items.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The statistics of check items.</p>
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
         * <p>The number of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CheckCount")
        public Integer checkCount;

        /**
         * <p>Indicates whether the risk item can be exploited. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CheckExploit")
        public Boolean checkExploit;

        /**
         * <p>Indicates  whether the risk item is a container runtime risk item. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainerRisk")
        public Boolean containerRisk;

        /**
         * <p>Indicates whether the risk item is a database risk item. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DatabaseRisk")
        public Boolean databaseRisk;

        /**
         * <p>The number of high-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HighWarningCount")
        public Integer highWarningCount;

        /**
         * <p>The time when the last baseline check was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-01 12:23:00</p>
         */
        @NameInMap("LastFoundTime")
        public String lastFoundTime;

        /**
         * <p>The risk level of the risk item. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The number of low-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("LowWarningCount")
        public Integer lowWarningCount;

        /**
         * <p>The number of medium-risk items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MediumWarningCount")
        public Integer mediumWarningCount;

        /**
         * <p>The ID of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>118</p>
         */
        @NameInMap("RiskId")
        public Long riskId;

        /**
         * <p>The name of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("RiskName")
        public String riskName;

        /**
         * <p>The level-2 type of the risk item.</p>
         * 
         * <strong>example:</strong>
         * <p>Redis</p>
         */
        @NameInMap("SubTypeAlias")
        public String subTypeAlias;

        /**
         * <p>The level-1 type of the check item. Examples: database, system, weak password, and middleware.</p>
         * 
         * <strong>example:</strong>
         * <p>databases</p>
         */
        @NameInMap("TypeAlias")
        public String typeAlias;

        /**
         * <p>The number of assets on which risk items are detected.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
