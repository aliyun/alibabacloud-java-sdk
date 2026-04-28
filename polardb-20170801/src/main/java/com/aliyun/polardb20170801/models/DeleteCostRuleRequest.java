// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteCostRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>924d450014e64e88ac6e8486f8e990**</p>
     */
    @NameInMap("CostRuleId")
    public String costRuleId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-xxxxxxxx</p>
     */
    @NameInMap("GwClusterId")
    public String gwClusterId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCostRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCostRuleRequest self = new DeleteCostRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCostRuleRequest setCostRuleId(String costRuleId) {
        this.costRuleId = costRuleId;
        return this;
    }
    public String getCostRuleId() {
        return this.costRuleId;
    }

    public DeleteCostRuleRequest setGwClusterId(String gwClusterId) {
        this.gwClusterId = gwClusterId;
        return this;
    }
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    public DeleteCostRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
