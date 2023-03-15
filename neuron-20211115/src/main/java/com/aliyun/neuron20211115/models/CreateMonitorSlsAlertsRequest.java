// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorSlsAlertsRequest extends TeaModel {
    @NameInMap("body")
    public MonitorSlsAlerts body;

    public static CreateMonitorSlsAlertsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorSlsAlertsRequest self = new CreateMonitorSlsAlertsRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorSlsAlertsRequest setBody(MonitorSlsAlerts body) {
        this.body = body;
        return this;
    }
    public MonitorSlsAlerts getBody() {
        return this.body;
    }

}
