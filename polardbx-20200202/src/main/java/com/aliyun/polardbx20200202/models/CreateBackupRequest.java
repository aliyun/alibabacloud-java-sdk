// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateBackupRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupRequest self = new CreateBackupRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CreateBackupRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateBackupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
