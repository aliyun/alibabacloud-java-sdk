// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterSSLResponse self = new ModifyDBClusterSSLResponse();
        return TeaModel.build(map, self);
    }

}
