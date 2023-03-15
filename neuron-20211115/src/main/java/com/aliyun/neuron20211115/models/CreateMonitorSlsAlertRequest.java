// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorSlsAlertRequest extends TeaModel {
    @NameInMap("body")
    public MonitorSlsAlert body;

    public static CreateMonitorSlsAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorSlsAlertRequest self = new CreateMonitorSlsAlertRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorSlsAlertRequest setBody(MonitorSlsAlert body) {
        this.body = body;
        return this;
    }
    public MonitorSlsAlert getBody() {
        return this.body;
    }

}
