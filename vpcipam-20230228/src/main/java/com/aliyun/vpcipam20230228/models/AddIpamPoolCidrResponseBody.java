// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class AddIpamPoolCidrResponseBody extends TeaModel {
    /**
     * <p>The successfully provisioned CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("Cidr")
    public String cidr;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>558BC336-8B88-53B0-B4AD-980EE900AB01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddIpamPoolCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddIpamPoolCidrResponseBody self = new AddIpamPoolCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public AddIpamPoolCidrResponseBody setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public AddIpamPoolCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
