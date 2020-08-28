// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateNetworkAclResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static AssociateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateNetworkAclResponse self = new AssociateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

}
