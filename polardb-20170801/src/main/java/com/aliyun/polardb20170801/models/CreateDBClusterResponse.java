// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    @NameInMap("ResourceGroupId")
    @Validation(required = true)
    public String resourceGroupId;

    public static CreateDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterResponse self = new CreateDBClusterResponse();
        return TeaModel.build(map, self);
    }

}
