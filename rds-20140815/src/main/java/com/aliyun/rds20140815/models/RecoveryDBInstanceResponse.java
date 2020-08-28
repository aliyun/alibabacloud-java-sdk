// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RecoveryDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static RecoveryDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoveryDBInstanceResponse self = new RecoveryDBInstanceResponse();
        return TeaModel.build(map, self);
    }

}
