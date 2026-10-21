// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBudgetPolicyRequest extends TeaModel {
    /**
     * <p>The alert threshold percentage (0 to 100).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AlertThresholdPct")
    public String alertThresholdPct;

    /**
     * <p>The ID of the dimension object. This parameter is required when BudgetType is set to ConsumerGroupTotal or Consumer.</p>
     * 
     * <strong>example:</strong>
     * <p>mi-xxxxx</p>
     */
    @NameInMap("BudgetDimensionRefId")
    public String budgetDimensionRefId;

    /**
     * <p>The budget points.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BudgetPoints")
    public String budgetPoints;

    /**
     * <p>The budget type. Valid values:</p>
     * <ul>
     * <li><strong>GlobalTotal</strong>: Global total budget.</li>
     * <li><strong>ConsumerGroupTotal</strong>: Total budget for a consumer group.</li>
     * <li><strong>ConsumerGroupMemberDefault</strong>: Default budget for a consumer group member.</li>
     * <li><strong>Consumer</strong>: Budget for a single consumer.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GlobalTotal</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <p>The gateway instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The day of the month when the budget is reset (1 to 28).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResetDayOfMonth")
    public String resetDayOfMonth;

    public static CreateBudgetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBudgetPolicyRequest self = new CreateBudgetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateBudgetPolicyRequest setAlertThresholdPct(String alertThresholdPct) {
        this.alertThresholdPct = alertThresholdPct;
        return this;
    }
    public String getAlertThresholdPct() {
        return this.alertThresholdPct;
    }

    public CreateBudgetPolicyRequest setBudgetDimensionRefId(String budgetDimensionRefId) {
        this.budgetDimensionRefId = budgetDimensionRefId;
        return this;
    }
    public String getBudgetDimensionRefId() {
        return this.budgetDimensionRefId;
    }

    public CreateBudgetPolicyRequest setBudgetPoints(String budgetPoints) {
        this.budgetPoints = budgetPoints;
        return this;
    }
    public String getBudgetPoints() {
        return this.budgetPoints;
    }

    public CreateBudgetPolicyRequest setBudgetType(String budgetType) {
        this.budgetType = budgetType;
        return this;
    }
    public String getBudgetType() {
        return this.budgetType;
    }

    public CreateBudgetPolicyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public CreateBudgetPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBudgetPolicyRequest setResetDayOfMonth(String resetDayOfMonth) {
        this.resetDayOfMonth = resetDayOfMonth;
        return this;
    }
    public String getResetDayOfMonth() {
        return this.resetDayOfMonth;
    }

}
