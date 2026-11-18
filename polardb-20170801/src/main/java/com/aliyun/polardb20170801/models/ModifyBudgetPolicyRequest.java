// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyBudgetPolicyRequest extends TeaModel {
    /**
     * <p>The alert threshold percentage. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("AlertThresholdPct")
    public String alertThresholdPct;

    /**
     * <p>The budget points.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("BudgetPoints")
    public String budgetPoints;

    /**
     * <p>The ID of the budget policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>023aacc1effc4b56bb154bfbec6ba9**</p>
     */
    @NameInMap("BudgetPolicyId")
    public String budgetPolicyId;

    /**
     * <p>The instance ID of the gateway instance. Usage note: In the full API reference, the description of the GwClusterId parameter must specify the resource type (gateway instance), how to obtain the instance ID (which Describe or List API to invoke), and the difference between GwClusterId and DBClusterId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxx</p>
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
     * <p>The day of the month when the reset occurs. Valid values: 1 to 28.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ResetDayOfMonth")
    public String resetDayOfMonth;

    public static ModifyBudgetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBudgetPolicyRequest self = new ModifyBudgetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBudgetPolicyRequest setAlertThresholdPct(String alertThresholdPct) {
        this.alertThresholdPct = alertThresholdPct;
        return this;
    }
    public String getAlertThresholdPct() {
        return this.alertThresholdPct;
    }

    public ModifyBudgetPolicyRequest setBudgetPoints(String budgetPoints) {
        this.budgetPoints = budgetPoints;
        return this;
    }
    public String getBudgetPoints() {
        return this.budgetPoints;
    }

    public ModifyBudgetPolicyRequest setBudgetPolicyId(String budgetPolicyId) {
        this.budgetPolicyId = budgetPolicyId;
        return this;
    }
    public String getBudgetPolicyId() {
        return this.budgetPolicyId;
    }

    public ModifyBudgetPolicyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public ModifyBudgetPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBudgetPolicyRequest setResetDayOfMonth(String resetDayOfMonth) {
        this.resetDayOfMonth = resetDayOfMonth;
        return this;
    }
    public String getResetDayOfMonth() {
        return this.resetDayOfMonth;
    }

}
