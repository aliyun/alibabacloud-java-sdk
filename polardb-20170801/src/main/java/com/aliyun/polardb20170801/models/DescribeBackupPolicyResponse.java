// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BackupRetentionPeriod")
    @Validation(required = true)
    public Integer backupRetentionPeriod;

    @NameInMap("PreferredNextBackupTime")
    @Validation(required = true)
    public String preferredNextBackupTime;

    @NameInMap("PreferredBackupTime")
    @Validation(required = true)
    public String preferredBackupTime;

    @NameInMap("PreferredBackupPeriod")
    @Validation(required = true)
    public String preferredBackupPeriod;

    @NameInMap("DataLevel1BackupRetentionPeriod")
    @Validation(required = true)
    public String dataLevel1BackupRetentionPeriod;

    @NameInMap("DataLevel2BackupRetentionPeriod")
    @Validation(required = true)
    public String dataLevel2BackupRetentionPeriod;

    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    @Validation(required = true)
    public String backupRetentionPolicyOnClusterDeletion;

    public static DescribeBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupPolicyResponse self = new DescribeBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

}
