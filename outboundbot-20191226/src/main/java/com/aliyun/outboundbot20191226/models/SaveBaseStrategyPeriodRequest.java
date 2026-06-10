// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveBaseStrategyPeriodRequest extends TeaModel {
    /**
     * <p>Instance ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe51eca2-a904-4b4d-b3ff-31be334b9500</p>
     */
    @NameInMap("EntryId")
    public String entryId;

    /**
     * <p>Make outbound calls only on weekdays. Defaults to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyWeekdays")
    public Boolean onlyWeekdays;

    /**
     * <p>Make outbound calls only on non-holiday days. Defaults to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OnlyWorkdays")
    public Boolean onlyWorkdays;

    /**
     * <p>Policy level (required)</p>
     * <ul>
     * <li>2: Instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StrategyLevel")
    public Integer strategyLevel;

    /**
     * <p>Running time (deprecated)</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("WorkingTime")
    public java.util.List<String> workingTime;

    /**
     * <p>Running time</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;beginTime&quot;:&quot;09:00:00&quot;,&quot;endTime&quot;:&quot;21:00:00&quot;}]</p>
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
