// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkExpireTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyDBInstanceNetworkExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkExpireTimeResponse self = new ModifyDBInstanceNetworkExpireTimeResponse();
        return TeaModel.build(map, self);
    }

}
