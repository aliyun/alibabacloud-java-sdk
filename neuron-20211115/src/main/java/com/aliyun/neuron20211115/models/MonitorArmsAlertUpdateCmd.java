// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorArmsAlertUpdateCmd extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("id")
    public Long id;

    @NameInMap("monitorArmsAlertRules")
    public java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules;

    @NameInMap("monitorNotifyStrategy")
    public MonitorNotifyStrategy monitorNotifyStrategy;

    public static MonitorArmsAlertUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorArmsAlertUpdateCmd self = new MonitorArmsAlertUpdateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorArmsAlertUpdateCmd setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public MonitorArmsAlertUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorArmsAlertUpdateCmd setMonitorArmsAlertRules(java.util.List<MonitorArmsAlertRule> monitorArmsAlertRules) {
        this.monitorArmsAlertRules = monitorArmsAlertRules;
        return this;
    }
    public java.util.List<MonitorArmsAlertRule> getMonitorArmsAlertRules() {
        return this.monitorArmsAlertRules;
    }

    public MonitorArmsAlertUpdateCmd setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

}
