// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateNatIpCidrResponseBody extends TeaModel {
    /**
     * <p>The ID of the NAT CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcnatcidr-gw8lhqtvdn4qnea****</p>
     */
    @NameInMap("NatIpCidrId")
    public String natIpCidrId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7021BEB1-210F-48A9-AB82-BE9A9110BB89</p>
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
