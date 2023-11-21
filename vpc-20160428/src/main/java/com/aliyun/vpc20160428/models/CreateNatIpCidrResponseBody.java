// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpCidrResponseBody extends TeaModel {
    /**
     * <p>The ID of the NAT CIDR block.</p>
     */
    @NameInMap("NatIpCidrId")
    public String natIpCidrId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateNatIpCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateNatIpCidrResponseBody self = new CreateNatIpCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateNatIpCidrResponseBody setNatIpCidrId(String natIpCidrId) {
        this.natIpCidrId = natIpCidrId;
        return this;
    }
    public String getNatIpCidrId() {
        return this.natIpCidrId;
    }

    public CreateNatIpCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
