// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteOutboundCallNumberRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundCallNumberId")
    public String outboundCallNumberId;

    public static DeleteOutboundCallNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOutboundCallNumberRequest self = new DeleteOutboundCallNumberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOutboundCallNumberRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteOutboundCallNumberRequest setOutboundCallNumberId(String outboundCallNumberId) {
        this.outboundCallNumberId = outboundCallNumberId;
        return this;
    }
    public String getOutboundCallNumberId() {
        return this.outboundCallNumberId;
    }

}
