// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseColdDataVolumeRequest extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseColdDataVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseColdDataVolumeRequest self = new ReleaseColdDataVolumeRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseColdDataVolumeRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ReleaseColdDataVolumeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
