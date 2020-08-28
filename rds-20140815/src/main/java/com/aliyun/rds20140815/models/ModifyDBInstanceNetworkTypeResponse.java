// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceNetworkTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ModifyDBInstanceNetworkTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceNetworkTypeResponse self = new ModifyDBInstanceNetworkTypeResponse();
        return TeaModel.build(map, self);
    }

}
