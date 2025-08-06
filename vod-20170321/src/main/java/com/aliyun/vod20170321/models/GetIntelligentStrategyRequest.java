// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetIntelligentStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static GetIntelligentStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIntelligentStrategyRequest self = new GetIntelligentStrategyRequest();
        return TeaModel.build(map, self);
    }

    public GetIntelligentStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
