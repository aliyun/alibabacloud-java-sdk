// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupRequest extends TeaModel {
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

    @NameInMap("BackupId")
    @Validation(required = true)
    public String backupId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeleteBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupRequest self = new DeleteBackupRequest();
        return TeaModel.build(map, self);
    }

}
