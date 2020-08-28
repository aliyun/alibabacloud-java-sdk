// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMigrateTaskRequest extends TeaModel {
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

    @NameInMap("BackupMode")
    @Validation(required = true)
    public String backupMode;

    @NameInMap("IsOnlineDB")
    @Validation(required = true)
    public String isOnlineDB;

    @NameInMap("CheckDBMode")
    public String checkDBMode;

    @NameInMap("OssObjectPositions")
    public String ossObjectPositions;

    @NameInMap("OSSUrls")
    public String OSSUrls;

    @NameInMap("MigrateTaskId")
    public String migrateTaskId;

    public static CreateMigrateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrateTaskRequest self = new CreateMigrateTaskRequest();
        return TeaModel.build(map, self);
    }

}
