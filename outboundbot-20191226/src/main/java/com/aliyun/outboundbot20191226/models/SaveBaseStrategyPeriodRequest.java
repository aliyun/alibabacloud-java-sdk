// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveBaseStrategyPeriodRequest extends TeaModel {
    @NameInMap("EntryId")
    public String entryId;

    @NameInMap("OnlyWeekdays")
    public Boolean onlyWeekdays;

    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    @NameInMap("WorkingTime")
    public java.util.List<String> workingTime;

    @NameInMap("WorkingTimeFramesJson")
    public String workingTimeFramesJson;

    public static SaveBaseStrategyPeriodRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBaseStrategyPeriodRequest self = new SaveBaseStrategyPeriodRequest();
        return TeaModel.build(map, self);
    }

    public SaveBaseStrategyPeriodRequest setEntryId(String entryId) {
        this.entryId = entryId;
        return this;
    }
    public String getEntryId() {
        return this.entryId;
    }

    public SaveBaseStrategyPeriodRequest setOnlyWeekdays(Boolean onlyWeekdays) {
        this.onlyWeekdays = onlyWeekdays;
        return this;
    }
    public Boolean getOnlyWeekdays() {
        return this.onlyWeekdays;
    }

    public SaveBaseStrategyPeriodRequest setStrategyLevel(Integer strategyLevel) {
        this.strategyLevel = strategyLevel;
        return this;
    }
    public Integer getStrategyLevel() {
        return this.strategyLevel;
    }

    public SaveBaseStrategyPeriodRequest setWorkingTime(java.util.List<String> workingTime) {
        this.workingTime = workingTime;
        return this;
    }
    public java.util.List<String> getWorkingTime() {
        return this.workingTime;
    }

    public SaveBaseStrategyPeriodRequest setWorkingTimeFramesJson(String workingTimeFramesJson) {
        this.workingTimeFramesJson = workingTimeFramesJson;
        return this;
    }
    public String getWorkingTimeFramesJson() {
        return this.workingTimeFramesJson;
    }

}
