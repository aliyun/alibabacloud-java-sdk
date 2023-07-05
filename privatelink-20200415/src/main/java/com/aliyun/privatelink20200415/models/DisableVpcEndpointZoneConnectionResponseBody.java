// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointZoneConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableVpcEndpointZoneConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointZoneConnectionResponseBody self = new DisableVpcEndpointZoneConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointZoneConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
