// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMqAlertUpdateCmd extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("id")
    public Long id;

    @NameInMap("monitorMqAlertRules")
    public java.util.List<MonitorMqAlertRule> monitorMqAlertRules;

    @NameInMap("monitorNotifyStrategy")
    public MonitorNotifyStrategy monitorNotifyStrategy;

    public static MonitorMqAlertUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorMqAlertUpdateCmd self = new MonitorMqAlertUpdateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorMqAlertUpdateCmd setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public MonitorMqAlertUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorMqAlertUpdateCmd setMonitorMqAlertRules(java.util.List<MonitorMqAlertRule> monitorMqAlertRules) {
        this.monitorMqAlertRules = monitorMqAlertRules;
        return this;
    }
    public java.util.List<MonitorMqAlertRule> getMonitorMqAlertRules() {
        return this.monitorMqAlertRules;
    }

    public MonitorMqAlertUpdateCmd setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

}
