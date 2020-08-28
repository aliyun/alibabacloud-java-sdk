// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    @NameInMap("MigrationId")
    @Validation(required = true)
    public Integer migrationId;

    public static StartDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceResponse self = new StartDBInstanceResponse();
        return TeaModel.build(map, self);
    }

}
