// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("MigrateIaskId")
    @Validation(required = true)
    public String migrateIaskId;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    public static CreateMigrateTaskForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerResponse self = new CreateMigrateTaskForSQLServerResponse();
        return TeaModel.build(map, self);
    }

}
