// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class CreateIpamResourceDiscoveryResponseBody extends TeaModel {
    @NameInMap("IpamResourceDiscoveryId")
    public String ipamResourceDiscoveryId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpamResourceDiscoveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpamResourceDiscoveryResponseBody self = new CreateIpamResourceDiscoveryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpamResourceDiscoveryResponseBody setIpamResourceDiscoveryId(String ipamResourceDiscoveryId) {
        this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
        return this;
    }
    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    public CreateIpamResourceDiscoveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
