// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorWebhookRequest extends TeaModel {
    @NameInMap("body")
    public MonitorWebhookUpdateCmd body;

    public static UpdateMonitorWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorWebhookRequest self = new UpdateMonitorWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorWebhookRequest setBody(MonitorWebhookUpdateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorWebhookUpdateCmd getBody() {
        return this.body;
    }

}
