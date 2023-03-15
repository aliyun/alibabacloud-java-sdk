// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorContactRequest extends TeaModel {
    @NameInMap("body")
    public MonitorContactUpdateCmd body;

    public static UpdateMonitorContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorContactRequest self = new UpdateMonitorContactRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorContactRequest setBody(MonitorContactUpdateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorContactUpdateCmd getBody() {
        return this.body;
    }

}
