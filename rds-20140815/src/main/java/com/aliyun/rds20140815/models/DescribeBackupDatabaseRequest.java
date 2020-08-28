// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupDatabaseRequest extends TeaModel {
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
    public String backupId;

    public static DescribeBackupDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDatabaseRequest self = new DescribeBackupDatabaseRequest();
        return TeaModel.build(map, self);
    }

}
