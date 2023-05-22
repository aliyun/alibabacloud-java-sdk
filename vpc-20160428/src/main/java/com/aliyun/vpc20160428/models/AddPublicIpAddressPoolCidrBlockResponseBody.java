// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AddPublicIpAddressPoolCidrBlockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddPublicIpAddressPoolCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddPublicIpAddressPoolCidrBlockResponseBody self = new AddPublicIpAddressPoolCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public AddPublicIpAddressPoolCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
