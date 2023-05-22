// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateVpnGatewayWithCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DissociateVpnGatewayWithCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DissociateVpnGatewayWithCertificateResponseBody self = new DissociateVpnGatewayWithCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DissociateVpnGatewayWithCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
