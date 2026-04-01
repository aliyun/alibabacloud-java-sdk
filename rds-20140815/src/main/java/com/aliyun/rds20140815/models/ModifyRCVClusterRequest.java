// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCVClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cd21387ea640145bab79a78276c1a****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SupportDiskPerformanceLevel")
    public java.util.List<String> supportDiskPerformanceLevel;

    public static ModifyRCVClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCVClusterRequest self = new ModifyRCVClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCVClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyRCVClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRCVClusterRequest setSupportDiskPerformanceLevel(java.util.List<String> supportDiskPerformanceLevel) {
        this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
        return this;
    }
    public java.util.List<String> getSupportDiskPerformanceLevel() {
        return this.supportDiskPerformanceLevel;
    }

}
