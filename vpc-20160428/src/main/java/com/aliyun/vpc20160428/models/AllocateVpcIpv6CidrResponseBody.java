// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateVpcIpv6CidrResponseBody extends TeaModel {
    /**
     * <p>The IPv6 CIDR block that is reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/56</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D20C13EA-2584-53BC-8393-69DE6D98EFF1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AllocateVpcIpv6CidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AllocateVpcIpv6CidrResponseBody self = new AllocateVpcIpv6CidrResponseBody();
        return TeaModel.build(map, self);
    }

    public AllocateVpcIpv6CidrResponseBody setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public AllocateVpcIpv6CidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
