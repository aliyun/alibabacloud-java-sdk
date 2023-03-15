// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorArmsAlertRequest extends TeaModel {
    @NameInMap("body")
    public MonitorArmsAlertUpdateCmd body;

    public static UpdateMonitorArmsAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorArmsAlertRequest self = new UpdateMonitorArmsAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorArmsAlertRequest setBody(MonitorArmsAlertUpdateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorArmsAlertUpdateCmd getBody() {
        return this.body;
    }

}
