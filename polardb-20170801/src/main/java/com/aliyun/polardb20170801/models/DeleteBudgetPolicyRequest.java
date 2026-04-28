// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteBudgetPolicyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>023aacc1effc4b56bb154bfbec6baxxx</p>
     */
    @NameInMap("BudgetPolicyId")
    public String budgetPolicyId;

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

    public static DeleteBudgetPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBudgetPolicyRequest self = new DeleteBudgetPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBudgetPolicyRequest setBudgetPolicyId(String budgetPolicyId) {
        this.budgetPolicyId = budgetPolicyId;
        return this;
    }
    public String getBudgetPolicyId() {
        return this.budgetPolicyId;
    }

    public DeleteBudgetPolicyRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DeleteBudgetPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
