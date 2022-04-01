// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CostOptimizedConfig extends TeaModel {
    // onDemandBaseCapacity
    @NameInMap("onDemandBaseCapacity")
    public Integer onDemandBaseCapacity;

    // onDemandPercentageAboveBaseCapacity
    @NameInMap("onDemandPercentageAboveBaseCapacity")
    public Integer onDemandPercentageAboveBaseCapacity;

    // spotInstancePools
    @NameInMap("spotInstancePools")
    public Integer spotInstancePools;

    public static CostOptimizedConfig build(java.util.Map<String, ?> map) throws Exception {
        CostOptimizedConfig self = new CostOptimizedConfig();
        return TeaModel.build(map, self);
    }

    public CostOptimizedConfig setOnDemandBaseCapacity(Integer onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }
    public Integer getOnDemandBaseCapacity() {
        return this.onDemandBaseCapacity;
    }

    public CostOptimizedConfig setOnDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }
    public Integer getOnDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity;
    }

    public CostOptimizedConfig setSpotInstancePools(Integer spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }
    public Integer getSpotInstancePools() {
        return this.spotInstancePools;
    }

}
