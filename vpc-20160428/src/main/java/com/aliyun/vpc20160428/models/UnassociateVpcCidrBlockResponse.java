// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateVpcCidrBlockResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateVpcCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateVpcCidrBlockResponse self = new UnassociateVpcCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public UnassociateVpcCidrBlockResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
