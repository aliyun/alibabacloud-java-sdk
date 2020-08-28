// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public Integer taskId;

    @NameInMap("MigrationId")
    @Validation(required = true)
    public Integer migrationId;

    public static MigrateDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceResponse self = new MigrateDBInstanceResponse();
        return TeaModel.build(map, self);
    }

}
