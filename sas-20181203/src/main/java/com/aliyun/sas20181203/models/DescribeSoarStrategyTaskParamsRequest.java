// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskParamsRequest extends TeaModel {
    /**
     * <p>Strategy task ID.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StrategyTaskId")
    public Long strategyTaskId;

    public static DescribeSoarStrategyTaskParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskParamsRequest self = new DescribeSoarStrategyTaskParamsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskParamsRequest setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

}
