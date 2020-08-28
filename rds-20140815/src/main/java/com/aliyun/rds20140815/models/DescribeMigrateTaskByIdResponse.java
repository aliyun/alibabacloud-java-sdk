// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMigrateTaskByIdResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("BackupMode")
    @Validation(required = true)
    public String backupMode;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("IsDBReplaced")
    @Validation(required = true)
    public String isDBReplaced;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    public static DescribeMigrateTaskByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrateTaskByIdResponse self = new DescribeMigrateTaskByIdResponse();
        return TeaModel.build(map, self);
    }

}
