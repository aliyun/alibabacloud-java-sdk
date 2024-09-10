// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyParamRequest extends TeaModel {
    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSoarStrategies~~">DescribeSoarStrategies</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15553</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    public static DescribeSoarStrategyParamRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyParamRequest self = new DescribeSoarStrategyParamRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyParamRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
