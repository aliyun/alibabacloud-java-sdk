// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveMaxAttemptsPerDayRequest extends TeaModel {
    @NameInMap("EntryId")
    public String entryId;

    @NameInMap("MaxAttemptsPerDay")
    public Integer maxAttemptsPerDay;

    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static SaveMaxAttemptsPerDayRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveMaxAttemptsPerDayRequest self = new SaveMaxAttemptsPerDayRequest();
        return TeaModel.build(map, self);
    }

    public SaveMaxAttemptsPerDayRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public SaveMaxAttemptsPerDayRequest setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
        this.maxAttemptsPerDay = maxAttemptsPerDay;
        return this;
    }
    public Integer getMaxAttemptsPerDay() {
        return this.maxAttemptsPerDay;
    }

    public SaveMaxAttemptsPerDayRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
