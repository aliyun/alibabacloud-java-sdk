// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceTDERequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("TDEStatus")
    public Integer TDEStatus;

    @NameInMap("EncryptionKey")
    public String encryptionKey;

    @NameInMap("RoleArn")
    public String roleArn;

    public static UpdateDBInstanceTDERequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDBInstanceTDERequest self = new UpdateDBInstanceTDERequest();
        return TeaModel.build(map, self);
    }

    public UpdateDBInstanceTDERequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDBInstanceTDERequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpdateDBInstanceTDERequest setTDEStatus(Integer TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public Integer getTDEStatus() {
        return this.TDEStatus;
    }

    public UpdateDBInstanceTDERequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    public UpdateDBInstanceTDERequest setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

}
