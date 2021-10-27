// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceTDERequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("TDEStatus")
    public Integer TDEStatus;

    public static UpdateDBInstanceTDERequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceTDERequest self = new UpdateDBInstanceTDERequest();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceTDERequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdateDBInstanceTDERequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public UpdateDBInstanceTDERequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDBInstanceTDERequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateDBInstanceTDERequest setTDEStatus(Integer TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public Integer getTDEStatus() {
        return this.TDEStatus;
    }

}
