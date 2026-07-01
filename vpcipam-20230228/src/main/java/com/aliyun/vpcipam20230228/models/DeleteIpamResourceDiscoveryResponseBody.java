// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamResourceDiscoveryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpamResourceDiscoveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamResourceDiscoveryResponseBody self = new DeleteIpamResourceDiscoveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpamResourceDiscoveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
