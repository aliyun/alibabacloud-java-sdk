// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class AddZoneToVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddZoneToVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddZoneToVpcEndpointResponseBody self = new AddZoneToVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public AddZoneToVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
