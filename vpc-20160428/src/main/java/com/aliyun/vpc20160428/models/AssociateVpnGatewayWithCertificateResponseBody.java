// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpnGatewayWithCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AssociateVpnGatewayWithCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpnGatewayWithCertificateResponseBody self = new AssociateVpnGatewayWithCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateVpnGatewayWithCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
