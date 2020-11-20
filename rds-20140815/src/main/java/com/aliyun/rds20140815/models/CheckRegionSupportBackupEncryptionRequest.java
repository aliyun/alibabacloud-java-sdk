// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRegionSupportBackupEncryptionRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DBInstanceID")
    public String DBInstanceID;

    public static CheckRegionSupportBackupEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRegionSupportBackupEncryptionRequest self = new CheckRegionSupportBackupEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public CheckRegionSupportBackupEncryptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckRegionSupportBackupEncryptionRequest setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

}
