// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetPoliciesResponseBody extends TeaModel {
    /**
     * <p>A list of budget policies.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeBudgetPoliciesResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The number of records to return on each page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A1990B-4F6E-482B-B8CB-75C612******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeBudgetPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetPoliciesResponseBody self = new DescribeBudgetPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetPoliciesResponseBody setItems(java.util.List<DescribeBudgetPoliciesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeBudgetPoliciesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeBudgetPoliciesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBudgetPoliciesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeBudgetPoliciesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBudgetPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBudgetPoliciesResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeBudgetPoliciesResponseBodyItems extends TeaModel {
        /**
         * <p>The alert threshold, as a percentage (0 to 100).</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("AlertThresholdPct")
        public String alertThresholdPct;

        /**
         * <p>Indicates whether the alert threshold was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AlertTriggered")
        public Boolean alertTriggered;

        /**
         * <p>The ID of the dimension object. This parameter is required when <code>BudgetDimensionType</code> is set to <code>ConsumerGroup</code> or <code>Consumer</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-p3gk2oh55c**</p>
         */
        @NameInMap("BudgetDimensionRefId")
        public String budgetDimensionRefId;

        /**
         * <p>The dimension of the budget policy. Valid values:</p>
         * <ul>
         * <li><p><strong>ConsumerGroup</strong>: consumer group</p>
         * </li>
         * <li><p><strong>Consumer</strong>: consumer</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ConsumerGroup</p>
         */
        @NameInMap("BudgetDimensionType")
        public String budgetDimensionType;

        /**
         * <p>The number of budget points.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BudgetPoints")
        public String budgetPoints;

        /**
         * <p>The budget policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>023aacc1effc4b56bb154bfbec6ba9**</p>
         */
        @NameInMap("BudgetPolicyId")
        public String budgetPolicyId;

        /**
         * <p>The budget type. Valid values:</p>
         * <ul>
         * <li><p><strong>GlobalTotal</strong>: Global budget</p>
         * </li>
         * <li><p><strong>ConsumerTotal</strong>: Consumer budget</p>
         * </li>
         * <li><p><strong>ConsumerGroupTotal</strong>: Consumer group budget</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GlobalTotal</p>
         */
        @NameInMap("BudgetType")
        public String budgetType;

        /**
         * <p>Indicates whether the budget was exceeded.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Exceeded")
        public String exceeded;

        /**
         * <p>The time when the policy was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-19T14:13:53+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the policy was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-08T10:43:28+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The gateway cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <p>The day of the month (1 to 28) on which the budget is reset.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ResetDayOfMonth")
        public String resetDayOfMonth;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: enabled</p>
         * </li>
         * <li><p><strong>Disabled</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The number of used points.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("UsedPoints")
        public Integer usedPoints;

        public static DescribeBudgetPoliciesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetPoliciesResponseBodyItems self = new DescribeBudgetPoliciesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetPoliciesResponseBodyItems setAlertThresholdPct(String alertThresholdPct) {
            this.alertThresholdPct = alertThresholdPct;
            return this;
        }
        public String getAlertThresholdPct() {
            return this.alertThresholdPct;
        }

        public DescribeBudgetPoliciesResponseBodyItems setAlertTriggered(Boolean alertTriggered) {
            this.alertTriggered = alertTriggered;
            return this;
        }
        public Boolean getAlertTriggered() {
            return this.alertTriggered;
        }

        public DescribeBudgetPoliciesResponseBodyItems setBudgetDimensionRefId(String budgetDimensionRefId) {
            this.budgetDimensionRefId = budgetDimensionRefId;
            return this;
        }
        public String getBudgetDimensionRefId() {
            return this.budgetDimensionRefId;
        }

        public DescribeBudgetPoliciesResponseBodyItems setBudgetDimensionType(String budgetDimensionType) {
            this.budgetDimensionType = budgetDimensionType;
            return this;
        }
        public String getBudgetDimensionType() {
            return this.budgetDimensionType;
        }

        public DescribeBudgetPoliciesResponseBodyItems setBudgetPoints(String budgetPoints) {
            this.budgetPoints = budgetPoints;
            return this;
        }
        public String getBudgetPoints() {
            return this.budgetPoints;
        }

        public DescribeBudgetPoliciesResponseBodyItems setBudgetPolicyId(String budgetPolicyId) {
            this.budgetPolicyId = budgetPolicyId;
            return this;
        }
        public String getBudgetPolicyId() {
            return this.budgetPolicyId;
        }

        public DescribeBudgetPoliciesResponseBodyItems setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }
        public String getBudgetType() {
            return this.budgetType;
        }

        public DescribeBudgetPoliciesResponseBodyItems setExceeded(String exceeded) {
            this.exceeded = exceeded;
            return this;
        }
        public String getExceeded() {
            return this.exceeded;
        }

        public DescribeBudgetPoliciesResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeBudgetPoliciesResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBudgetPoliciesResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeBudgetPoliciesResponseBodyItems setResetDayOfMonth(String resetDayOfMonth) {
            this.resetDayOfMonth = resetDayOfMonth;
            return this;
        }
        public String getResetDayOfMonth() {
            return this.resetDayOfMonth;
        }

        public DescribeBudgetPoliciesResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBudgetPoliciesResponseBodyItems setUsedPoints(Integer usedPoints) {
            this.usedPoints = usedPoints;
            return this;
        }
        public Integer getUsedPoints() {
            return this.usedPoints;
        }

    }

}
