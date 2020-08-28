// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMaintainTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterMaintainTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMaintainTimeResponse self = new ModifyDBClusterMaintainTimeResponse();
        return TeaModel.build(map, self);
    }

}
