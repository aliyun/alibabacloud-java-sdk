// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorArmsAlertsRequest extends TeaModel {
    @NameInMap("body")
    public MonitorArmsAlerts body;

    public static CreateMonitorArmsAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorArmsAlertsRequest self = new CreateMonitorArmsAlertsRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorArmsAlertsRequest setBody(MonitorArmsAlerts body) {
        this.body = body;
        return this;
    }
    public MonitorArmsAlerts getBody() {
        return this.body;
    }

}
