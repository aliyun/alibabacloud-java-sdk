// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddPublicIpAddressPoolCidrBlockResponseBody extends TeaModel {
    /**
     * <p>The CIDR blocks.</p>
     * 
     * <strong>example:</strong>
     * <p>47.0.XX.XX/28</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddPublicIpAddressPoolCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPublicIpAddressPoolCidrBlockResponseBody self = new AddPublicIpAddressPoolCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPublicIpAddressPoolCidrBlockResponseBody setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public AddPublicIpAddressPoolCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
