// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskRequest extends TeaModel {
    @NameInMap("ControlTargetFilter")
    public String controlTargetFilter;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Version")
    public String version;

    public static GetTrafficControlTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrafficControlTaskRequest self = new GetTrafficControlTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetTrafficControlTaskRequest setControlTargetFilter(String controlTargetFilter) {
        this.controlTargetFilter = controlTargetFilter;
        return this;
    }
    public String getControlTargetFilter() {
        return this.controlTargetFilter;
    }

    public GetTrafficControlTaskRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public GetTrafficControlTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTrafficControlTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetTrafficControlTaskRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
