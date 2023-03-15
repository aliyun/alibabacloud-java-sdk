// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateMonitorGroupMemberRequest extends TeaModel {
    @NameInMap("body")
    public MonitorGroupMemberCreateCmd body;

    public static CreateMonitorGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorGroupMemberRequest self = new CreateMonitorGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorGroupMemberRequest setBody(MonitorGroupMemberCreateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorGroupMemberCreateCmd getBody() {
        return this.body;
    }

}
