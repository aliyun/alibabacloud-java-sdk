// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateVirtualPhysicalConnectionRequest extends TeaModel {
    // DryRun
    @NameInMap("DryRun")
    public Boolean dryRun;

    // ExpectSpec
    @NameInMap("ExpectSpec")
    public String expectSpec;

    // Vpconn的实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    // 幂等Token
    @NameInMap("Token")
    public String token;

    // vpconn的VlanID
    @NameInMap("VlanId")
    public Long vlanId;

    public static UpdateVirtualPhysicalConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualPhysicalConnectionRequest self = new UpdateVirtualPhysicalConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualPhysicalConnectionRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateVirtualPhysicalConnectionRequest setExpectSpec(String expectSpec) {
        this.expectSpec = expectSpec;
        return this;
    }
    public String getExpectSpec() {
        return this.expectSpec;
    }

    public UpdateVirtualPhysicalConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateVirtualPhysicalConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateVirtualPhysicalConnectionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UpdateVirtualPhysicalConnectionRequest setVlanId(Long vlanId) {
        this.vlanId = vlanId;
        return this;
    }
    public Long getVlanId() {
        return this.vlanId;
    }

}
