// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UnassociateNetworkAclResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UnassociateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        UnassociateNetworkAclResponse self = new UnassociateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

}
