// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteOutboundCallNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>33014787-cc13-49d3-ab2f-a98aa8f15fbb</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ffa367e0-58f3-43b6-9615-c63db99c5add</p>
     */
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
