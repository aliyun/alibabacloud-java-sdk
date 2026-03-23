// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDiskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteRCDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCDiskRequest self = new DeleteRCDiskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRCDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DeleteRCDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
