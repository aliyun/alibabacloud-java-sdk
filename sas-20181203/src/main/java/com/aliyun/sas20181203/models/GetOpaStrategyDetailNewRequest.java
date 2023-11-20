// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaStrategyDetailNewRequest extends TeaModel {
    @NameInMap("StrategyId")
    public Long strategyId;

    public static GetOpaStrategyDetailNewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpaStrategyDetailNewRequest self = new GetOpaStrategyDetailNewRequest();
        return TeaModel.build(map, self);
    }

    public GetOpaStrategyDetailNewRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
