// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceEngineVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static UpgradeDBInstanceEngineVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceEngineVersionResponse self = new UpgradeDBInstanceEngineVersionResponse();
        return TeaModel.build(map, self);
    }

}
