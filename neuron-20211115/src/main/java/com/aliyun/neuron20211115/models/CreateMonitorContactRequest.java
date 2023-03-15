// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorContactRequest extends TeaModel {
    @NameInMap("body")
    public MonitorContact body;

    public static CreateMonitorContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorContactRequest self = new CreateMonitorContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorContactRequest setBody(MonitorContact body) {
        this.body = body;
        return this;
    }
    public MonitorContact getBody() {
        return this.body;
    }

}
