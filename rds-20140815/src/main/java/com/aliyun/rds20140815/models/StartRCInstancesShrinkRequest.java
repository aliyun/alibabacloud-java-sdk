// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartRCInstancesShrinkRequest extends TeaModel {
    @NameInMap("BatchOptimization")
    public String batchOptimization;

    @NameInMap("InstanceIds")
    public String instanceIdsShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static StartRCInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRCInstancesShrinkRequest self = new StartRCInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartRCInstancesShrinkRequest setBatchOptimization(String batchOptimization) {
        this.batchOptimization = batchOptimization;
        return this;
    }
    public String getBatchOptimization() {
        return this.batchOptimization;
    }

    public StartRCInstancesShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public StartRCInstancesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
