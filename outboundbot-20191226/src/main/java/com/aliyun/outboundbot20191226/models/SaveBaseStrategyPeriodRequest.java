// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveBaseStrategyPeriodRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe51eca2-a904-4b4d-b3ff-31be334b9500</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyWeekdays")
    public Boolean onlyWeekdays;

    @NameInMap("OnlyWorkdays")
    public Boolean onlyWorkdays;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("WorkingTime")
    public java.util.List<String> workingTime;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;beginTime\&quot;:\&quot;09:00:00\&quot;,\&quot;beginTimeMillis\&quot;:324000000000,\&quot;endTime\&quot;:\&quot;21:00:00\&quot;,\&quot;endTimeMillis\&quot;:756000000000}]</p>
     */
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

    public SaveBaseStrategyPeriodRequest setOnlyWorkdays(Boolean onlyWorkdays) {
        this.onlyWorkdays = onlyWorkdays;
        return this;
    }
    public Boolean getOnlyWorkdays() {
        return this.onlyWorkdays;
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
