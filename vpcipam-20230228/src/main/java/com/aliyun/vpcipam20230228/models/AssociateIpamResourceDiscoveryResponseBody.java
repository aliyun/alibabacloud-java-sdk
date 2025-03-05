// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AssociateIpamResourceDiscoveryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E897D16A-50EB-543F-B002-C5A26AB818FF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateIpamResourceDiscoveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateIpamResourceDiscoveryResponseBody self = new AssociateIpamResourceDiscoveryResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateIpamResourceDiscoveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
