// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyEngineMigrationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{\&quot;pc-bp1m9tt23o5kh834y.rwlb.rds.aliyuncs.com\&quot;:\&quot;rm-bp1ycl5o6ojs957o0.mysql.rds.aliyuncs.com\&quot;}</p>
     */
    @NameInMap("ConnectionStrings")
    public String connectionStrings;

    /**
     * <strong>example:</strong>
     * <p>pxc-htri0****r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>newmaster789</p>
     */
    @NameInMap("NewMasterDBInstanceName")
    public String newMasterDBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>source456</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SwapConnectionString")
    public String swapConnectionString;

    public static ModifyEngineMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEngineMigrationRequest self = new ModifyEngineMigrationRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEngineMigrationRequest setConnectionStrings(String connectionStrings) {
        this.connectionStrings = connectionStrings;
        return this;
    }
    public String getConnectionStrings() {
        return this.connectionStrings;
    }

    public ModifyEngineMigrationRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyEngineMigrationRequest setNewMasterDBInstanceName(String newMasterDBInstanceName) {
        this.newMasterDBInstanceName = newMasterDBInstanceName;
        return this;
    }
    public String getNewMasterDBInstanceName() {
        return this.newMasterDBInstanceName;
    }

    public ModifyEngineMigrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyEngineMigrationRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public ModifyEngineMigrationRequest setSwapConnectionString(String swapConnectionString) {
        this.swapConnectionString = swapConnectionString;
        return this;
    }
    public String getSwapConnectionString() {
        return this.swapConnectionString;
    }

}
