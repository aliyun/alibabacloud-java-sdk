// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorArmsAlerts extends TeaModel {
    @NameInMap("monitorArmsAlerts")
    public java.util.List<MonitorArmsAlert> monitorArmsAlerts;

    public static MonitorArmsAlerts build(java.util.Map<String, ?> map) throws Exception {
        MonitorArmsAlerts self = new MonitorArmsAlerts();
        return TeaModel.build(map, self);
    }

    public MonitorArmsAlerts setMonitorArmsAlerts(java.util.List<MonitorArmsAlert> monitorArmsAlerts) {
        this.monitorArmsAlerts = monitorArmsAlerts;
        return this;
    }
    public java.util.List<MonitorArmsAlert> getMonitorArmsAlerts() {
        return this.monitorArmsAlerts;
    }

}
