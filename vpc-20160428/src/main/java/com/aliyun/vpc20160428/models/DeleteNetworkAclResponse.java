// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteNetworkAclResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkAclResponse self = new DeleteNetworkAclResponse();
        return TeaModel.build(map, self);
    }

}
