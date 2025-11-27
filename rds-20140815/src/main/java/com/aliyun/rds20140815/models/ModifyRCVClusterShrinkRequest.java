// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCVClusterShrinkRequest extends TeaModel {
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
    public String supportDiskPerformanceLevelShrink;

    public static ModifyRCVClusterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCVClusterShrinkRequest self = new ModifyRCVClusterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRCVClusterShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyRCVClusterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRCVClusterShrinkRequest setSupportDiskPerformanceLevelShrink(String supportDiskPerformanceLevelShrink) {
        this.supportDiskPerformanceLevelShrink = supportDiskPerformanceLevelShrink;
        return this;
    }
    public String getSupportDiskPerformanceLevelShrink() {
        return this.supportDiskPerformanceLevelShrink;
    }

}
