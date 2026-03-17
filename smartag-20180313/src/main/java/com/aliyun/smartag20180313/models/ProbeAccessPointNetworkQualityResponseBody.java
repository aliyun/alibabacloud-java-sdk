// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ProbeAccessPointNetworkQualityResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E26DBAAE-A796-4A48-98B4-B45AFCD1F299</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ProbeAccessPointNetworkQualityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProbeAccessPointNetworkQualityResponseBody self = new ProbeAccessPointNetworkQualityResponseBody();
        return TeaModel.build(map, self);
    }

    public ProbeAccessPointNetworkQualityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
