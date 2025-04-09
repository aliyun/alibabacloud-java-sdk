// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetCurrentConcurrencyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>361c8a53-0e29-42f3-8aa7-c7752d010399</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCurrentConcurrencyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentConcurrencyRequest self = new GetCurrentConcurrencyRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentConcurrencyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
