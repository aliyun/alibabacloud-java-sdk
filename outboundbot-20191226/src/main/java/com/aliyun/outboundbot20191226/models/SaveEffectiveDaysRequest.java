// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveEffectiveDaysRequest extends TeaModel {
    @NameInMap("EffectiveDays")
    public Integer effectiveDays;

    @NameInMap("EntryId")
    public String entryId;

    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    public static SaveEffectiveDaysRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveEffectiveDaysRequest self = new SaveEffectiveDaysRequest();
        return TeaModel.build(map, self);
    }

    public SaveEffectiveDaysRequest setEffectiveDays(Integer effectiveDays) {
        this.effectiveDays = effectiveDays;
        return this;
    }
    public Integer getEffectiveDays() {
        return this.effectiveDays;
    }

    public SaveEffectiveDaysRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public SaveEffectiveDaysRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

}
