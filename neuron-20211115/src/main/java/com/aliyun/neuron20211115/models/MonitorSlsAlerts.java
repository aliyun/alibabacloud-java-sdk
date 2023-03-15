// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorSlsAlerts extends TeaModel {
    @NameInMap("monitorSlsAlerts")
    public java.util.List<MonitorSlsAlert> monitorSlsAlerts;

    public static MonitorSlsAlerts build(java.util.Map<String, ?> map) throws Exception {
        MonitorSlsAlerts self = new MonitorSlsAlerts();
        return TeaModel.build(map, self);
    }

    public MonitorSlsAlerts setMonitorSlsAlerts(java.util.List<MonitorSlsAlert> monitorSlsAlerts) {
        this.monitorSlsAlerts = monitorSlsAlerts;
        return this;
    }
    public java.util.List<MonitorSlsAlert> getMonitorSlsAlerts() {
        return this.monitorSlsAlerts;
    }

}
