// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskForSQLServerRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("TaskType")
    @Validation(required = true)
    public String taskType;

    @NameInMap("IsOnlineDB")
    @Validation(required = true)
    public String isOnlineDB;

    @NameInMap("OSSUrls")
    @Validation(required = true)
    public String OSSUrls;

    public static CreateMigrateTaskForSQLServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskForSQLServerRequest self = new CreateMigrateTaskForSQLServerRequest();
        return TeaModel.build(map, self);
    }

}
