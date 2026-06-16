// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGdnInstanceRequest extends TeaModel {
    /**
     * <p>The name of the primary instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>FASTJSON 2.0.x has been released, faster and more secure, recommend you upgrade.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The GDN mode.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn_mode_master_slave, gdn_mode_bidirectional</p>
     */
    @NameInMap("GdnMode")
    public String gdnMode;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The conflict strategy.</p>
     * 
     * <strong>example:</strong>
     * <p>DIRECT_OVERWRITE, OVERWRITE, IGNORE, INTERRUPT</p>
     */
    @NameInMap("RplConflictStrategy")
    public String rplConflictStrategy;

    /**
     * <p>The DML replication policy.</p>
     * 
     * <strong>example:</strong>
     * <p>MERGE,  SERIAL, TRANSACTION, SPLIT</p>
     */
    @NameInMap("RplDmlStrategy")
    public String rplDmlStrategy;

    /**
     * <p>Specifies whether to synchronize DDL statements.</p>
     */
    @NameInMap("RplSyncDdl")
    public Boolean rplSyncDdl;

    public static CreateGdnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnInstanceRequest self = new CreateGdnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateGdnInstanceRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateGdnInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGdnInstanceRequest setGdnMode(String gdnMode) {
        this.gdnMode = gdnMode;
        return this;
    }
    public String getGdnMode() {
        return this.gdnMode;
    }

    public CreateGdnInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGdnInstanceRequest setRplConflictStrategy(String rplConflictStrategy) {
        this.rplConflictStrategy = rplConflictStrategy;
        return this;
    }
    public String getRplConflictStrategy() {
        return this.rplConflictStrategy;
    }

    public CreateGdnInstanceRequest setRplDmlStrategy(String rplDmlStrategy) {
        this.rplDmlStrategy = rplDmlStrategy;
        return this;
    }
    public String getRplDmlStrategy() {
        return this.rplDmlStrategy;
    }

    public CreateGdnInstanceRequest setRplSyncDdl(Boolean rplSyncDdl) {
        this.rplSyncDdl = rplSyncDdl;
        return this;
    }
    public Boolean getRplSyncDdl() {
        return this.rplSyncDdl;
    }

}
