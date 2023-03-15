// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorArmsAlertRequest extends TeaModel {
    @NameInMap("body")
    public MonitorArmsAlert body;

    public static CreateMonitorArmsAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorArmsAlertRequest self = new CreateMonitorArmsAlertRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorArmsAlertRequest setBody(MonitorArmsAlert body) {
        this.body = body;
        return this;
    }
    public MonitorArmsAlert getBody() {
        return this.body;
    }

}
