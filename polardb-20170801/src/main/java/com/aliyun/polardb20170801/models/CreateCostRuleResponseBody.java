// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateCostRuleResponseBody extends TeaModel {
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
     * <p>580EF224-9647-59E7-9950-D9EBFD6A2921</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCostRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCostRuleResponseBody self = new CreateCostRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCostRuleResponseBody setCostRuleId(String costRuleId) {
        this.costRuleId = costRuleId;
        return this;
    }
    public String getCostRuleId() {
        return this.costRuleId;
    }

    public CreateCostRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
