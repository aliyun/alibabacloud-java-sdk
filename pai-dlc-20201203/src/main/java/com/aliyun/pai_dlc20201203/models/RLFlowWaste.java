// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLFlowWaste extends TeaModel {
    /**
     * <p>The cumulative duration of trained trajectories, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>183</p>
     */
    @NameInMap("UsefulSec")
    public Long usefulSec;

    public static RLFlowWaste build(java.util.Map<String, ?> map) throws Exception {
        RLFlowWaste self = new RLFlowWaste();
        return TeaModel.build(map, self);
    }

    public RLFlowWaste setUsefulSec(Long usefulSec) {
        this.usefulSec = usefulSec;
        return this;
    }
    public Long getUsefulSec() {
        return this.usefulSec;
    }

}
