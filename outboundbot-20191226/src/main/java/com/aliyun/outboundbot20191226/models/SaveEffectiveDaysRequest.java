// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveEffectiveDaysRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("EffectiveDays")
    public Integer effectiveDays;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e90b5b8e-c8b4-4182-b28d-a5aa81685e49</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
