// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningSummaryResponseBody extends TeaModel {
    /**
     * <p>List of check item risk statistics.</p>
     */
    @NameInMap("List")
    public java.util.List<ListCheckItemWarningSummaryResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListCheckItemWarningSummaryResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>DC97C9EC-4B7D-5EFF-8A5E-A5CCC9ED****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListCheckItemWarningSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemWarningSummaryResponseBody self = new ListCheckItemWarningSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckItemWarningSummaryResponseBody setList(java.util.List<ListCheckItemWarningSummaryResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListCheckItemWarningSummaryResponseBodyList> getList() {
        return this.list;
    }

    public ListCheckItemWarningSummaryResponseBody setPageInfo(ListCheckItemWarningSummaryResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListCheckItemWarningSummaryResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListCheckItemWarningSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCheckItemWarningSummaryResponseBodyList extends TeaModel {
        /**
         * <p>The suggestion on the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>In the Administrative Tools window, double-click Local Security Policy. In the Local Security Policy window that appears, choose Security Settings\\Local Policies\\Audit Policy, configure all audit policies as: <code>Success, Failure</code>.</p>
         */
        @NameInMap("Advice")
        public String advice;

        /**
         * <p>The types of the baselines to which the check item belongs.</p>
         */
        @NameInMap("AffiliatedRiskTypes")
        public java.util.List<String> affiliatedRiskTypes;

        /**
         * <p>The baselines to which the check item belongs.</p>
         */
        @NameInMap("AffiliatedRisks")
        public java.util.List<String> affiliatedRisks;

        /**
         * <p>The alias of the baseline type.</p>
         * 
         * <strong>example:</strong>
         * <p>week_pa****</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>696</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Config the Event Audit policys</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("CheckLevel")
        public String checkLevel;

        /**
         * <p>The type of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Security audit</p>
         */
        @NameInMap("CheckType")
        public String checkType;

        /**
         * <p>Indicates whether the check item belongs to the container runtime type. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ContainerCheckItem")
        public Boolean containerCheckItem;

        /**
         * <p>The description of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Config the Event Audit policys</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The baselines in which the check item is enabled.</p>
         */
        @NameInMap("EnableRisks")
        public java.util.List<String> enableRisks;

        /**
         * <p>The type of the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>weak_password</p>
         */
        @NameInMap("RiskType")
        public String riskType;

        /**
         * <p>Risk status of check items. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: failed</li>
         * <li><strong>3</strong>: passed</li>
         * <li><strong>6</strong>: whitelisted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The number of servers that are affected by the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WarningMachineCount")
        public Integer warningMachineCount;

        public static ListCheckItemWarningSummaryResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningSummaryResponseBodyList self = new ListCheckItemWarningSummaryResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListCheckItemWarningSummaryResponseBodyList setAdvice(String advice) {
            this.advice = advice;
            return this;
        }
        public String getAdvice() {
            return this.advice;
        }

        public ListCheckItemWarningSummaryResponseBodyList setAffiliatedRiskTypes(java.util.List<String> affiliatedRiskTypes) {
            this.affiliatedRiskTypes = affiliatedRiskTypes;
            return this;
        }
        public java.util.List<String> getAffiliatedRiskTypes() {
            return this.affiliatedRiskTypes;
        }

        public ListCheckItemWarningSummaryResponseBodyList setAffiliatedRisks(java.util.List<String> affiliatedRisks) {
            this.affiliatedRisks = affiliatedRisks;
            return this;
        }
        public java.util.List<String> getAffiliatedRisks() {
            return this.affiliatedRisks;
        }

        public ListCheckItemWarningSummaryResponseBodyList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListCheckItemWarningSummaryResponseBodyList setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListCheckItemWarningSummaryResponseBodyList setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public ListCheckItemWarningSummaryResponseBodyList setCheckLevel(String checkLevel) {
            this.checkLevel = checkLevel;
            return this;
        }
        public String getCheckLevel() {
            return this.checkLevel;
        }

        public ListCheckItemWarningSummaryResponseBodyList setCheckType(String checkType) {
            this.checkType = checkType;
            return this;
        }
        public String getCheckType() {
            return this.checkType;
        }

        public ListCheckItemWarningSummaryResponseBodyList setContainerCheckItem(Boolean containerCheckItem) {
            this.containerCheckItem = containerCheckItem;
            return this;
        }
        public Boolean getContainerCheckItem() {
            return this.containerCheckItem;
        }

        public ListCheckItemWarningSummaryResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCheckItemWarningSummaryResponseBodyList setEnableRisks(java.util.List<String> enableRisks) {
            this.enableRisks = enableRisks;
            return this;
        }
        public java.util.List<String> getEnableRisks() {
            return this.enableRisks;
        }

        public ListCheckItemWarningSummaryResponseBodyList setRiskType(String riskType) {
            this.riskType = riskType;
            return this;
        }
        public String getRiskType() {
            return this.riskType;
        }

        public ListCheckItemWarningSummaryResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListCheckItemWarningSummaryResponseBodyList setWarningMachineCount(Integer warningMachineCount) {
            this.warningMachineCount = warningMachineCount;
            return this;
        }
        public Integer getWarningMachineCount() {
            return this.warningMachineCount;
        }

    }

    public static class ListCheckItemWarningSummaryResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCheckItemWarningSummaryResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCheckItemWarningSummaryResponseBodyPageInfo self = new ListCheckItemWarningSummaryResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListCheckItemWarningSummaryResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListCheckItemWarningSummaryResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListCheckItemWarningSummaryResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCheckItemWarningSummaryResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
