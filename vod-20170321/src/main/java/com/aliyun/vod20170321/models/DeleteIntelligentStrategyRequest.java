// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteIntelligentStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static DeleteIntelligentStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntelligentStrategyRequest self = new DeleteIntelligentStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIntelligentStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
