// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMiddlewareEndpointRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetMiddlewareEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMiddlewareEndpointRequest self = new GetMiddlewareEndpointRequest();
        return TeaModel.build(map, self);
    }

    public GetMiddlewareEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
