// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstancePayTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("OrderId")
    @Validation(required = true)
    public Long orderId;

    public static ModifyDBInstancePayTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstancePayTypeResponse self = new ModifyDBInstancePayTypeResponse();
        return TeaModel.build(map, self);
    }

}
