// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class DeleteIpamPoolCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpamPoolCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpamPoolCidrResponseBody self = new DeleteIpamPoolCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpamPoolCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
