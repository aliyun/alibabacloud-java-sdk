// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorWebhookRequest extends TeaModel {
    @NameInMap("body")
    public MonitorWebhook body;

    public static CreateMonitorWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorWebhookRequest self = new CreateMonitorWebhookRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorWebhookRequest setBody(MonitorWebhook body) {
        this.body = body;
        return this;
    }
    public MonitorWebhook getBody() {
        return this.body;
    }

}
