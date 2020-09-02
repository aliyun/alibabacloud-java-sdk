// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeactiveFlowLogRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("FlowLogId")
    @Validation(required = true)
    public String flowLogId;

    public static DeactiveFlowLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactiveFlowLogRequest self = new DeactiveFlowLogRequest();
        return TeaModel.build(map, self);
    }

    public DeactiveFlowLogRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeactiveFlowLogRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

}
