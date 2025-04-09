// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveMaxAttemptsPerDayRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c8bf820a-6a8a-47bc-99bf-97593df8faa8</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxAttemptsPerDay")
    public Integer maxAttemptsPerDay;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
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
