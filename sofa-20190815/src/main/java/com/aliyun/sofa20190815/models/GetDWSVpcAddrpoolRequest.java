// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSVpcAddrpoolRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDWSVpcAddrpoolRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDWSVpcAddrpoolRequest self = new GetDWSVpcAddrpoolRequest();
        return TeaModel.build(map, self);
    }

    public GetDWSVpcAddrpoolRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
