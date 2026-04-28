// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateBudgetPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AlertThresholdPct")
    public String alertThresholdPct;

    /**
     * <strong>example:</strong>
     * <p>mi-xxxxx</p>
     */
    @NameInMap("BudgetDimensionRefId")
    public String budgetDimensionRefId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("BudgetPoints")
    public String budgetPoints;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ConsumerTotal</p>
     */
    @NameInMap("BudgetType")
    public String budgetType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    @NameInMap("RegionId")
    public String regionId;

    /**
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
