// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RestoreDdrTableRequest extends TeaModel {
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

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RestoreType")
    @Validation(required = true)
    public String restoreType;

    @NameInMap("BackupId")
    public String backupId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    @NameInMap("TableMeta")
    public String tableMeta;

    public static RestoreDdrTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RestoreDdrTableRequest self = new RestoreDdrTableRequest();
        return TeaModel.build(map, self);
    }

}
