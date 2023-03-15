// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorMqAlertRequest extends TeaModel {
    @NameInMap("body")
    public MonitorMqAlertUpdateCmd body;

    public static UpdateMonitorMqAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorMqAlertRequest self = new UpdateMonitorMqAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorMqAlertRequest setBody(MonitorMqAlertUpdateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorMqAlertUpdateCmd getBody() {
        return this.body;
    }

}
