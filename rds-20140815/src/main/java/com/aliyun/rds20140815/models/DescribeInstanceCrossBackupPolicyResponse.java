// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeInstanceCrossBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DBInstanceDescription")
    @Validation(required = true)
    public String DBInstanceDescription;

    @NameInMap("DBInstanceStatus")
    @Validation(required = true)
    public String DBInstanceStatus;

    @NameInMap("DBInstanceStatusDesc")
    @Validation(required = true)
    public String DBInstanceStatusDesc;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CrossBackupRegion")
    @Validation(required = true)
    public String crossBackupRegion;

    @NameInMap("CrossBackupType")
    @Validation(required = true)
    public String crossBackupType;

    @NameInMap("BackupEnabledTime")
    @Validation(required = true)
    public String backupEnabledTime;

    @NameInMap("BackupEnabled")
    @Validation(required = true)
    public String backupEnabled;

    @NameInMap("LogBackupEnabled")
    @Validation(required = true)
    public String logBackupEnabled;

    @NameInMap("LogBackupEnabledTime")
    @Validation(required = true)
    public String logBackupEnabledTime;

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

    @NameInMap("LockMode")
    @Validation(required = true)
    public String lockMode;

    @NameInMap("RelService")
    @Validation(required = true)
    public String relService;

    @NameInMap("RelServiceId")
    @Validation(required = true)
    public String relServiceId;

    public static DescribeInstanceCrossBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCrossBackupPolicyResponse self = new DescribeInstanceCrossBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

}
