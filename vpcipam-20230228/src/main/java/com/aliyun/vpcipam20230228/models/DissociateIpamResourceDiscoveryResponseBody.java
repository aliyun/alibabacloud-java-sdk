// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DissociateIpamResourceDiscoveryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86137597-443F-5B66-B9B6-8514E0C50B8F</p>
     */
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
