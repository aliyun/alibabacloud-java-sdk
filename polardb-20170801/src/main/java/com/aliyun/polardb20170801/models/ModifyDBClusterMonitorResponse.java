// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterMonitorResponse self = new ModifyDBClusterMonitorResponse();
        return TeaModel.build(map, self);
    }

}
