// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetCurrentConcurrencyRequest extends TeaModel {
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
