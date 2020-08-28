// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupFileRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("BackupTime")
    public String backupTime;

    public static DeleteBackupFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileRequest self = new DeleteBackupFileRequest();
        return TeaModel.build(map, self);
    }

}
