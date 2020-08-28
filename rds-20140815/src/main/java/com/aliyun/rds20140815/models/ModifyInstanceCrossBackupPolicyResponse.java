// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CrossBackupRegion")
    @Validation(required = true)
    public String crossBackupRegion;

    @NameInMap("CrossBackupType")
    @Validation(required = true)
    public String crossBackupType;

    @NameInMap("BackupEnabled")
    @Validation(required = true)
    public String backupEnabled;

    @NameInMap("LogBackupEnabled")
    @Validation(required = true)
    public String logBackupEnabled;

    @NameInMap("StorageOwner")
    @Validation(required = true)
    public String storageOwner;

    @NameInMap("StorageType")
    @Validation(required = true)
    public String storageType;

    @NameInMap("Endpoint")
    @Validation(required = true)
    public String endpoint;

    @NameInMap("RetentType")
    @Validation(required = true)
    public Integer retentType;

    @NameInMap("Retention")
    @Validation(required = true)
    public Integer retention;

    public static ModifyInstanceCrossBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCrossBackupPolicyResponse self = new ModifyInstanceCrossBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

}
