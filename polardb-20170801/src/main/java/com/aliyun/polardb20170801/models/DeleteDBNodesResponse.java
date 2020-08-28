// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBNodesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static DeleteDBNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBNodesResponse self = new DeleteDBNodesResponse();
        return TeaModel.build(map, self);
    }

}
