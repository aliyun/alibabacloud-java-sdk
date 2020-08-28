// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseBetweenInstancesRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("TargetDBInstanceId")
    @Validation(required = true)
    public String targetDBInstanceId;

    @NameInMap("DbNames")
    @Validation(required = true)
    public String dbNames;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SyncUserPrivilege")
    public String syncUserPrivilege;

    public static CopyDatabaseBetweenInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseBetweenInstancesRequest self = new CopyDatabaseBetweenInstancesRequest();
        return TeaModel.build(map, self);
    }

}
