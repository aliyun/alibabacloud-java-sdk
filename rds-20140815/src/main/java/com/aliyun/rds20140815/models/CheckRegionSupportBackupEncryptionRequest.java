// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRegionSupportBackupEncryptionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>rm-wz91q53f9*******</p>
     */
    @NameInMap("DBInstanceID")
    public String DBInstanceID;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckRegionSupportBackupEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckRegionSupportBackupEncryptionRequest self = new CheckRegionSupportBackupEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public CheckRegionSupportBackupEncryptionRequest setDBInstanceID(String DBInstanceID) {
        this.DBInstanceID = DBInstanceID;
        return this;
    }
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    public CheckRegionSupportBackupEncryptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckRegionSupportBackupEncryptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
