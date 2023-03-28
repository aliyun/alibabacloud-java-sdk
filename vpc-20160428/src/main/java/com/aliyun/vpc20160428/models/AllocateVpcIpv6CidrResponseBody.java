// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AllocateVpcIpv6CidrResponseBody extends TeaModel {
    /**
     * <p>The IPv6 CIDR block that is reserved.</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The ID of the request.</p>
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
