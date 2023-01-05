// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetBaseStrategyPeriodRequest extends TeaModel {
    @NameInMap("EntryId")
    public String entryId;

    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static GetBaseStrategyPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBaseStrategyPeriodRequest self = new GetBaseStrategyPeriodRequest();
        return TeaModel.build(map, self);
    }

    public GetBaseStrategyPeriodRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public GetBaseStrategyPeriodRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
