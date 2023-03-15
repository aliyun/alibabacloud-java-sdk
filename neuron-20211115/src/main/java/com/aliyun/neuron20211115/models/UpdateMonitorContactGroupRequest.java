// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateMonitorContactGroupRequest extends TeaModel {
    @NameInMap("body")
    public MonitorContactGroupUpdateCmd body;

    public static UpdateMonitorContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorContactGroupRequest self = new UpdateMonitorContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorContactGroupRequest setBody(MonitorContactGroupUpdateCmd body) {
        this.body = body;
        return this;
    }
    public MonitorContactGroupUpdateCmd getBody() {
        return this.body;
    }

}
