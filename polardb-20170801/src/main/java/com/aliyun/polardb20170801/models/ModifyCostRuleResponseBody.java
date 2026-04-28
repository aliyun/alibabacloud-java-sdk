// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyCostRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>924d450014e64e88ac6e8486f8e990**</p>
     */
    @NameInMap("CostRuleId")
    public String costRuleId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6BD9CDE4-5E7B-4BF3-9BB8-83C73E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCostRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCostRuleResponseBody self = new ModifyCostRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCostRuleResponseBody setCostRuleId(String costRuleId) {
        this.costRuleId = costRuleId;
        return this;
    }
    public String getCostRuleId() {
        return this.costRuleId;
    }

    public ModifyCostRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
