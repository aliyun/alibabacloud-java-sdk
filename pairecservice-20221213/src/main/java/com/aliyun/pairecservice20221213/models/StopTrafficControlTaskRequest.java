// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class StopTrafficControlTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    public static StopTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopTrafficControlTaskRequest self = new StopTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopTrafficControlTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopTrafficControlTaskRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public StopTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
