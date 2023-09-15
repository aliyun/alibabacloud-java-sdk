// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeletePublicIpAddressPoolCidrBlockResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePublicIpAddressPoolCidrBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePublicIpAddressPoolCidrBlockResponseBody self = new DeletePublicIpAddressPoolCidrBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePublicIpAddressPoolCidrBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
