// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    @NameInMap("BackupMode")
    @Validation(required = true)
    public String backupMode;

    public static CreateMigrateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskResponse self = new CreateMigrateTaskResponse();
        return TeaModel.build(map, self);
    }

}
