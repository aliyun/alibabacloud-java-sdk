// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetRealtimeInstanceStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatsRequest self = new GetRealtimeInstanceStatsRequest();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
