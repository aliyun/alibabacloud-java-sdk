// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DissociateIpamResourceDiscoveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateIpamResourceDiscoveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateIpamResourceDiscoveryResponseBody self = new DissociateIpamResourceDiscoveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateIpamResourceDiscoveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
