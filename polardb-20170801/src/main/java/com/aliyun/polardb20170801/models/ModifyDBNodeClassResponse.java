// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBNodeClassResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static ModifyDBNodeClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBNodeClassResponse self = new ModifyDBNodeClassResponse();
        return TeaModel.build(map, self);
    }

}
