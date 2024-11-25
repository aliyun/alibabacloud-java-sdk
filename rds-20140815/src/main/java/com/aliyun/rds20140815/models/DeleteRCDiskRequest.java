// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDiskRequest extends TeaModel {
    /**
     * <p>The ID of the cloud disk that you want to release.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rcd-wz9c8isqly8637zw****</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
