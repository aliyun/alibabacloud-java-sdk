// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EnableBackupEncryptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-wz951f7f******</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>564cf6c4-d2ee-495b-b265-5724******</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static EnableBackupEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupEncryptionRequest self = new EnableBackupEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public EnableBackupEncryptionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public EnableBackupEncryptionRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public EnableBackupEncryptionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
