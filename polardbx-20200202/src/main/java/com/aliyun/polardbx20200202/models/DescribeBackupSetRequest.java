// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetRequest extends TeaModel {
    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeBackupSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetRequest self = new DescribeBackupSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public DescribeBackupSetRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeBackupSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
