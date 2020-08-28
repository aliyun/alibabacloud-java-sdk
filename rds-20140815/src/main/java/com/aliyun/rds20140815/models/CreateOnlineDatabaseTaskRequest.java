// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateOnlineDatabaseTaskRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBName")
    @Validation(required = true)
    public String DBName;

    @NameInMap("MigrateTaskId")
    @Validation(required = true)
    public String migrateTaskId;

    @NameInMap("CheckDBMode")
    @Validation(required = true)
    public String checkDBMode;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CreateOnlineDatabaseTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOnlineDatabaseTaskRequest self = new CreateOnlineDatabaseTaskRequest();
        return TeaModel.build(map, self);
    }

}
