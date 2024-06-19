// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceConnectionStringRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-unrf5ssig0ecg8.polarx.huhehaote.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-unrf5ssig0ecg8</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3300</p>
     */
    @NameInMap("NewPort")
    public String newPort;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test2</p>
     */
    @NameInMap("NewPrefix")
    public String newPrefix;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDBInstanceConnectionStringRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceConnectionStringRequest self = new ModifyDBInstanceConnectionStringRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceConnectionStringRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBInstanceConnectionStringRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyDBInstanceConnectionStringRequest setNewPort(String newPort) {
        this.newPort = newPort;
        return this;
    }
    public String getNewPort() {
        return this.newPort;
    }

    public ModifyDBInstanceConnectionStringRequest setNewPrefix(String newPrefix) {
        this.newPrefix = newPrefix;
        return this;
    }
    public String getNewPrefix() {
        return this.newPrefix;
    }

    public ModifyDBInstanceConnectionStringRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
