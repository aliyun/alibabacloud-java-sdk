// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorContactGroupRequest extends TeaModel {
    @NameInMap("body")
    public MonitorContactGroupCreateCmd body;

    public static CreateMonitorContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorContactGroupRequest self = new CreateMonitorContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorContactGroupRequest setBody(MonitorContactGroupCreateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorContactGroupCreateCmd getBody() {
        return this.body;
    }

}
