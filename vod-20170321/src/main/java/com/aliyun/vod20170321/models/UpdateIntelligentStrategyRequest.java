// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateIntelligentStrategyRequest extends TeaModel {
    @NameInMap("Conditions")
    public String conditions;

    @NameInMap("ExecuteParams")
    public String executeParams;

    @NameInMap("Name")
    public String name;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("State")
    public String state;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StrategyId")
    public String strategyId;

    public static UpdateIntelligentStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntelligentStrategyRequest self = new UpdateIntelligentStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntelligentStrategyRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateIntelligentStrategyRequest setExecuteParams(String executeParams) {
        this.executeParams = executeParams;
        return this;
    }
    public String getExecuteParams() {
        return this.executeParams;
    }

    public UpdateIntelligentStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateIntelligentStrategyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateIntelligentStrategyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateIntelligentStrategyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public UpdateIntelligentStrategyRequest setStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public String getStrategyId() {
        return this.strategyId;
    }

}
