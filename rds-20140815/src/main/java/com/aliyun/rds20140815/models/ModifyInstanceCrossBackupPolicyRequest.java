// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyRequest extends TeaModel {
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
    @Validation(required = true)
    public String regionId;

    @NameInMap("CrossBackupType")
    public String crossBackupType;

    @NameInMap("LogBackupEnabled")
    public String logBackupEnabled;

    @NameInMap("BackupEnabled")
    public String backupEnabled;

    @NameInMap("CrossBackupRegion")
    public String crossBackupRegion;

    @NameInMap("RetentType")
    public Integer retentType;

    @NameInMap("Retention")
    public Integer retention;

    public static ModifyInstanceCrossBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCrossBackupPolicyRequest self = new ModifyInstanceCrossBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

}
