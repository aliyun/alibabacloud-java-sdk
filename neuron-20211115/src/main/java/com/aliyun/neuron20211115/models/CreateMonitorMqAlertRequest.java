// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorMqAlertRequest extends TeaModel {
    @NameInMap("body")
    public MonitorMqAlert body;

    public static CreateMonitorMqAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorMqAlertRequest self = new CreateMonitorMqAlertRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorMqAlertRequest setBody(MonitorMqAlert body) {
        this.body = body;
        return this;
    }
    public MonitorMqAlert getBody() {
        return this.body;
    }

}
