// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorSlsAlertUpdateCmd extends TeaModel {
    @NameInMap("condition")
    public String condition;

    @NameInMap("id")
    public Long id;

    @NameInMap("monitorNotifyStrategy")
    public MonitorNotifyStrategy monitorNotifyStrategy;

    @NameInMap("monitorSlsAlertRules")
    public java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules;

    public static MonitorSlsAlertUpdateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorSlsAlertUpdateCmd self = new MonitorSlsAlertUpdateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorSlsAlertUpdateCmd setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public MonitorSlsAlertUpdateCmd setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public MonitorSlsAlertUpdateCmd setMonitorNotifyStrategy(MonitorNotifyStrategy monitorNotifyStrategy) {
        this.monitorNotifyStrategy = monitorNotifyStrategy;
        return this;
    }
    public MonitorNotifyStrategy getMonitorNotifyStrategy() {
        return this.monitorNotifyStrategy;
    }

    public MonitorSlsAlertUpdateCmd setMonitorSlsAlertRules(java.util.List<MonitorSlsAlertRule> monitorSlsAlertRules) {
        this.monitorSlsAlertRules = monitorSlsAlertRules;
        return this;
    }
    public java.util.List<MonitorSlsAlertRule> getMonitorSlsAlertRules() {
        return this.monitorSlsAlertRules;
    }

}
