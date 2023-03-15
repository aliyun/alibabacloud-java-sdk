// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorSlsAlertRequest extends TeaModel {
    @NameInMap("body")
    public MonitorSlsAlertUpdateCmd body;

    public static UpdateMonitorSlsAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorSlsAlertRequest self = new UpdateMonitorSlsAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorSlsAlertRequest setBody(MonitorSlsAlertUpdateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorSlsAlertUpdateCmd getBody() {
        return this.body;
    }

}
