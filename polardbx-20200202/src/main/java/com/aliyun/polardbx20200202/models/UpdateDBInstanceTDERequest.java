// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateDBInstanceTDERequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>RkVBNURDMjAtNkQ4QS01OTc5LTk3QUEtRkM1NzU0Nk******</p>
     */
    @NameInMap("EncryptionKey")
    public String encryptionKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::1406926****:role/aliyunrdsinstanceencryptiondefaultrole</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
