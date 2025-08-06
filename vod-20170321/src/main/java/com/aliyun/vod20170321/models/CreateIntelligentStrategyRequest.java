// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateIntelligentStrategyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Conditions")
    public String conditions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExecuteParams")
    public String executeParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("State")
    public String state;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateIntelligentStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIntelligentStrategyRequest self = new CreateIntelligentStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateIntelligentStrategyRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public CreateIntelligentStrategyRequest setExecuteParams(String executeParams) {
        this.executeParams = executeParams;
        return this;
    }
    public String getExecuteParams() {
        return this.executeParams;
    }

    public CreateIntelligentStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateIntelligentStrategyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateIntelligentStrategyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateIntelligentStrategyRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateIntelligentStrategyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
