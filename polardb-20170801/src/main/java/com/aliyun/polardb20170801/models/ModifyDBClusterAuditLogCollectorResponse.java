// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAuditLogCollectorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBClusterAuditLogCollectorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAuditLogCollectorResponse self = new ModifyDBClusterAuditLogCollectorResponse();
        return TeaModel.build(map, self);
    }

}
