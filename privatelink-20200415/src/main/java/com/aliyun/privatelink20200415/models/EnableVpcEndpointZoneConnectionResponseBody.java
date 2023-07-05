// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class EnableVpcEndpointZoneConnectionResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnableVpcEndpointZoneConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableVpcEndpointZoneConnectionResponseBody self = new EnableVpcEndpointZoneConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableVpcEndpointZoneConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
