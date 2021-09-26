// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20210416.models;

import com.aliyun.tea.*;

public class UpdateInstanceConnectionRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("VswitchIds")
    public java.util.List<String> vswitchIds;

    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    public static UpdateInstanceConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceConnectionRequest self = new UpdateInstanceConnectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceConnectionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateInstanceConnectionRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public UpdateInstanceConnectionRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public UpdateInstanceConnectionRequest setVswitchIds(java.util.List<String> vswitchIds) {
        this.vswitchIds = vswitchIds;
        return this;
    }
    public java.util.List<String> getVswitchIds() {
        return this.vswitchIds;
    }

    public UpdateInstanceConnectionRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

}
