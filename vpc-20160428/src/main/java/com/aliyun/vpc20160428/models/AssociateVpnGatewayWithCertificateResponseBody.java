// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpnGatewayWithCertificateResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
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
