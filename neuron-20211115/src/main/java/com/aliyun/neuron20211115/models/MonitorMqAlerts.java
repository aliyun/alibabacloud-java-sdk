// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorMqAlerts extends TeaModel {
    @NameInMap("monitorMqAlerts")
    public java.util.List<MonitorMqAlert> monitorMqAlerts;

    public static MonitorMqAlerts build(java.util.Map<String, ?> map) throws Exception {
        MonitorMqAlerts self = new MonitorMqAlerts();
        return TeaModel.build(map, self);
    }

    public MonitorMqAlerts setMonitorMqAlerts(java.util.List<MonitorMqAlert> monitorMqAlerts) {
        this.monitorMqAlerts = monitorMqAlerts;
        return this;
    }
    public java.util.List<MonitorMqAlert> getMonitorMqAlerts() {
        return this.monitorMqAlerts;
    }

}
