// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorMqAlertsRequest extends TeaModel {
    @NameInMap("body")
    public MonitorMqAlerts body;

    public static CreateMonitorMqAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorMqAlertsRequest self = new CreateMonitorMqAlertsRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorMqAlertsRequest setBody(MonitorMqAlerts body) {
        this.body = body;
        return this;
    }
    public MonitorMqAlerts getBody() {
        return this.body;
    }

}
