// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopTSActivityInstanceRequest extends TeaModel {
    @NameInMap("ActivityInstanceId")
    public Long activityInstanceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Zone")
    public String zone;

    public static StopTSActivityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTSActivityInstanceRequest self = new StopTSActivityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopTSActivityInstanceRequest setActivityInstanceId(Long activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }
    public Long getActivityInstanceId() {
        return this.activityInstanceId;
    }

    public StopTSActivityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public StopTSActivityInstanceRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
