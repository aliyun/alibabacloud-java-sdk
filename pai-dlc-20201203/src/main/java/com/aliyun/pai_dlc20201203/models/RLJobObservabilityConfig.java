// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class RLJobObservabilityConfig extends TeaModel {
    /**
     * <p>是否开启 Ray Dashboard 入口。Ray 后端缺省 true，Monarch 后端缺省 false；Monarch 不接受 true</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RayDashboardEnabled")
    public Boolean rayDashboardEnabled;

    /**
     * <p>是否启用训练观测数据采集，默认 true。</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("XfuseEnabled")
    public Boolean xfuseEnabled;

    public static RLJobObservabilityConfig build(java.util.Map<String, ?> map) throws Exception {
        RLJobObservabilityConfig self = new RLJobObservabilityConfig();
        return TeaModel.build(map, self);
    }

    public RLJobObservabilityConfig setRayDashboardEnabled(Boolean rayDashboardEnabled) {
        this.rayDashboardEnabled = rayDashboardEnabled;
        return this;
    }
    public Boolean getRayDashboardEnabled() {
        return this.rayDashboardEnabled;
    }

    public RLJobObservabilityConfig setXfuseEnabled(Boolean xfuseEnabled) {
        this.xfuseEnabled = xfuseEnabled;
        return this;
    }
    public Boolean getXfuseEnabled() {
        return this.xfuseEnabled;
    }

}
