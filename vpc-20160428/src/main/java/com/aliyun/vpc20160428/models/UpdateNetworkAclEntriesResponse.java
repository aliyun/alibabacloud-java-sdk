// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNetworkAclEntriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateNetworkAclEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNetworkAclEntriesResponse self = new UpdateNetworkAclEntriesResponse();
        return TeaModel.build(map, self);
    }

}
