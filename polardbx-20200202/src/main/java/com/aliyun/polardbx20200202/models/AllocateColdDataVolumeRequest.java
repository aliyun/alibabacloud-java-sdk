// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AllocateColdDataVolumeRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static AllocateColdDataVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        AllocateColdDataVolumeRequest self = new AllocateColdDataVolumeRequest();
        return TeaModel.build(map, self);
    }

    public AllocateColdDataVolumeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public AllocateColdDataVolumeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
