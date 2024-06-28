// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ReleaseIpv6AddressResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C44F62BE-9CE7-4277-B117-69243F3988BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseIpv6AddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseIpv6AddressResponseBody self = new ReleaseIpv6AddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseIpv6AddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
