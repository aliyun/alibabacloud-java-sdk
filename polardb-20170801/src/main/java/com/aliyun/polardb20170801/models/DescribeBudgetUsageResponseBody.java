// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBudgetUsageResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a budget alert is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AlertTriggered")
    public String alertTriggered;

    /**
     * <p>The dimension reference ID of the current budget.</p>
     * 
     * <strong>example:</strong>
     * <p>ref-001</p>
     */
    @NameInMap("DimensionRefId")
    public String dimensionRefId;

    /**
     * <p>The dimension type of the current budget.</p>
     * 
     * <strong>example:</strong>
     * <p>cluster</p>
     */
    @NameInMap("DimensionType")
    public String dimensionType;

    /**
     * <p>Indicates whether the budget is exceeded.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Exceeded")
    public String exceeded;

    /**
     * <p>The creation time of the budget usage record in RFC 3339 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <p>The last modification time of the budget usage record in RFC 3339 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-15T12:00:00Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>The ID of the gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-123</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The list of associated budget policies.</p>
     */
    @NameInMap("Policies")
    public java.util.List<DescribeBudgetUsageResponseBodyPolicies> policies;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of budget points used in the current statistical window.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("UsedPoints")
    public String usedPoints;

    /**
     * <p>The end time of the budget statistical window in RFC 3339 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-31T23:59:59Z</p>
     */
    @NameInMap("WindowEndTime")
    public String windowEndTime;

    /**
     * <p>The start time of the budget statistical window in RFC 3339 UTC format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-01-01T00:00:00Z</p>
     */
    @NameInMap("WindowStartTime")
    public String windowStartTime;

    public static DescribeBudgetUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBudgetUsageResponseBody self = new DescribeBudgetUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBudgetUsageResponseBody setAlertTriggered(String alertTriggered) {
        this.alertTriggered = alertTriggered;
        return this;
    }
    public String getAlertTriggered() {
        return this.alertTriggered;
    }

    public DescribeBudgetUsageResponseBody setDimensionRefId(String dimensionRefId) {
        this.dimensionRefId = dimensionRefId;
        return this;
    }
    public String getDimensionRefId() {
        return this.dimensionRefId;
    }

    public DescribeBudgetUsageResponseBody setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }
    public String getDimensionType() {
        return this.dimensionType;
    }

    public DescribeBudgetUsageResponseBody setExceeded(String exceeded) {
        this.exceeded = exceeded;
        return this;
    }
    public String getExceeded() {
        return this.exceeded;
    }

    public DescribeBudgetUsageResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeBudgetUsageResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeBudgetUsageResponseBody setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DescribeBudgetUsageResponseBody setPolicies(java.util.List<DescribeBudgetUsageResponseBodyPolicies> policies) {
        this.policies = policies;
        return this;
    }
    public java.util.List<DescribeBudgetUsageResponseBodyPolicies> getPolicies() {
        return this.policies;
    }

    public DescribeBudgetUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBudgetUsageResponseBody setUsedPoints(String usedPoints) {
        this.usedPoints = usedPoints;
        return this;
    }
    public String getUsedPoints() {
        return this.usedPoints;
    }

    public DescribeBudgetUsageResponseBody setWindowEndTime(String windowEndTime) {
        this.windowEndTime = windowEndTime;
        return this;
    }
    public String getWindowEndTime() {
        return this.windowEndTime;
    }

    public DescribeBudgetUsageResponseBody setWindowStartTime(String windowStartTime) {
        this.windowStartTime = windowStartTime;
        return this;
    }
    public String getWindowStartTime() {
        return this.windowStartTime;
    }

    public static class DescribeBudgetUsageResponseBodyPolicies extends TeaModel {
        /**
         * <p>The usage percentage that triggers a budget alert.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("AlertThresholdPct")
        public String alertThresholdPct;

        /**
         * <p>The budget dimension reference ID to which the policy applies.</p>
         * 
         * <strong>example:</strong>
         * <p>ref-001</p>
         */
        @NameInMap("BudgetDimensionRefId")
        public String budgetDimensionRefId;

        /**
         * <p>The budget dimension type to which the policy applies.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("BudgetDimensionType")
        public String budgetDimensionType;

        /**
         * <p>The number of budget points set by the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("BudgetPoints")
        public String budgetPoints;

        /**
         * <p>The ID of the budget policy.</p>
         * 
         * <strong>example:</strong>
         * <p>bp-001</p>
         */
        @NameInMap("BudgetPolicyId")
        public String budgetPolicyId;

        /**
         * <p>The budget type.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("BudgetType")
        public String budgetType;

        /**
         * <p>The day of the month when the budget is reset. For example, 1 indicates the first day of each month.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResetDayOfMonth")
        public String resetDayOfMonth;

        /**
         * <p>The status of the budget policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeBudgetUsageResponseBodyPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBudgetUsageResponseBodyPolicies self = new DescribeBudgetUsageResponseBodyPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBudgetUsageResponseBodyPolicies setAlertThresholdPct(String alertThresholdPct) {
            this.alertThresholdPct = alertThresholdPct;
            return this;
        }
        public String getAlertThresholdPct() {
            return this.alertThresholdPct;
        }

        public DescribeBudgetUsageResponseBodyPolicies setBudgetDimensionRefId(String budgetDimensionRefId) {
            this.budgetDimensionRefId = budgetDimensionRefId;
            return this;
        }
        public String getBudgetDimensionRefId() {
            return this.budgetDimensionRefId;
        }

        public DescribeBudgetUsageResponseBodyPolicies setBudgetDimensionType(String budgetDimensionType) {
            this.budgetDimensionType = budgetDimensionType;
            return this;
        }
        public String getBudgetDimensionType() {
            return this.budgetDimensionType;
        }

        public DescribeBudgetUsageResponseBodyPolicies setBudgetPoints(String budgetPoints) {
            this.budgetPoints = budgetPoints;
            return this;
        }
        public String getBudgetPoints() {
            return this.budgetPoints;
        }

        public DescribeBudgetUsageResponseBodyPolicies setBudgetPolicyId(String budgetPolicyId) {
            this.budgetPolicyId = budgetPolicyId;
            return this;
        }
        public String getBudgetPolicyId() {
            return this.budgetPolicyId;
        }

        public DescribeBudgetUsageResponseBodyPolicies setBudgetType(String budgetType) {
            this.budgetType = budgetType;
            return this;
        }
        public String getBudgetType() {
            return this.budgetType;
        }

        public DescribeBudgetUsageResponseBodyPolicies setResetDayOfMonth(String resetDayOfMonth) {
            this.resetDayOfMonth = resetDayOfMonth;
            return this;
        }
        public String getResetDayOfMonth() {
            return this.resetDayOfMonth;
        }

        public DescribeBudgetUsageResponseBodyPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
