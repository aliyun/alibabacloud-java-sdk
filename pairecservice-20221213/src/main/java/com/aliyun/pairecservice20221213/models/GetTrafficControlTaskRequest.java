// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetTrafficControlTaskRequest extends TeaModel {
    /**
     * <p>The filter for traffic control targets.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ControlTargetFilter")
    public String controlTargetFilter;

    /**
     * <p>The environment to which the parameter belongs. Valid values:</p>
     * <ul>
     * <li>Daily: daily environment</li>
     * <li>Pre: staging environment</li>
     * <li>Prod: production environment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-1324***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The version.</p>
     * 
     * <strong>example:</strong>
     * <p>Latest</p>
     */
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
