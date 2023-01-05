// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetMaxAttemptsPerDayRequest extends TeaModel {
    @NameInMap("EntryId")
    public String entryId;

    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static GetMaxAttemptsPerDayRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaxAttemptsPerDayRequest self = new GetMaxAttemptsPerDayRequest();
        return TeaModel.build(map, self);
    }

    public GetMaxAttemptsPerDayRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public GetMaxAttemptsPerDayRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
