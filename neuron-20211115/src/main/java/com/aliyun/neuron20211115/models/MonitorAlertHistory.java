// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorAlertHistory extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("eventState")
    public String eventState;

    @NameInMap("id")
    public Long id;

    @NameInMap("name")
    public String name;

    @NameInMap("ruleDesc")
    public String ruleDesc;

    @NameInMap("ruleName")
    public String ruleName;

    @NameInMap("startTime")
    public String startTime;

    @NameInMap("type")
    public String type;

    @NameInMap("uuid")
    public String uuid;

    public static MonitorAlertHistory build(java.util.Map<String, ?> map) throws Exception {
        MonitorAlertHistory self = new MonitorAlertHistory();
        return TeaModel.build(map, self);
    }

    public MonitorAlertHistory setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public MonitorAlertHistory setEventState(String eventState) {
        this.eventState = eventState;
        return this;
    }
    public String getEventState() {
        return this.eventState;
    }

    public MonitorAlertHistory setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorAlertHistory setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MonitorAlertHistory setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
        return this;
    }
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    public MonitorAlertHistory setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public MonitorAlertHistory setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public MonitorAlertHistory setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MonitorAlertHistory setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
