// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceUsageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("DiskUsed")
    @Validation(required = true)
    public Long diskUsed;

    @NameInMap("DataSize")
    @Validation(required = true)
    public Long dataSize;

    @NameInMap("LogSize")
    @Validation(required = true)
    public Long logSize;

    @NameInMap("BackupSize")
    @Validation(required = true)
    public Long backupSize;

    @NameInMap("BackupOssDataSize")
    @Validation(required = true)
    public Long backupOssDataSize;

    @NameInMap("BackupOssLogSize")
    @Validation(required = true)
    public Long backupOssLogSize;

    @NameInMap("SQLSize")
    @Validation(required = true)
    public Long SQLSize;

    @NameInMap("ColdBackupSize")
    @Validation(required = true)
    public Long coldBackupSize;

    @NameInMap("BackupDataSize")
    @Validation(required = true)
    public Long backupDataSize;

    @NameInMap("BackupLogSize")
    @Validation(required = true)
    public Long backupLogSize;

    @NameInMap("PaidBackupSize")
    @Validation(required = true)
    public Long paidBackupSize;

    @NameInMap("ArchiveBackupSize")
    @Validation(required = true)
    public Long archiveBackupSize;

    public static DescribeResourceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceUsageResponse self = new DescribeResourceUsageResponse();
        return TeaModel.build(map, self);
    }

}
