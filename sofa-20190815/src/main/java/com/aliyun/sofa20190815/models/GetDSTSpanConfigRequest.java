// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDSTSpanConfigRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDSTSpanConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDSTSpanConfigRequest self = new GetDSTSpanConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDSTSpanConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
