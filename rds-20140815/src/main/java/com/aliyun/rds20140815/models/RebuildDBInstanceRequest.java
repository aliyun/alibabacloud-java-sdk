// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RebuildDBInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    @Validation(required = true)
    public String dedicatedHostGroupId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DedicatedHostId")
    public String dedicatedHostId;

    @NameInMap("RebuildNodeType")
    public String rebuildNodeType;

    public static RebuildDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RebuildDBInstanceRequest self = new RebuildDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RebuildDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RebuildDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public RebuildDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public RebuildDBInstanceRequest setDedicatedHostId(String dedicatedHostId) {
        this.dedicatedHostId = dedicatedHostId;
        return this;
    }
    public String getDedicatedHostId() {
        return this.dedicatedHostId;
    }

    public RebuildDBInstanceRequest setRebuildNodeType(String rebuildNodeType) {
        this.rebuildNodeType = rebuildNodeType;
        return this;
    }
    public String getRebuildNodeType() {
        return this.rebuildNodeType;
    }

}
