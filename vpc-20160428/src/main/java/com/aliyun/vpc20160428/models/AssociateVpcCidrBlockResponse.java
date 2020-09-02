// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateVpcCidrBlockResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateVpcCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateVpcCidrBlockResponse self = new AssociateVpcCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public AssociateVpcCidrBlockResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
