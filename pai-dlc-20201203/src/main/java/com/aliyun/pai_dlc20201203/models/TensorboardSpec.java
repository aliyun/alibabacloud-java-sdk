// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class TensorboardSpec extends TeaModel {
    @NameInMap("EcsType")
    public String ecsType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SwitchId")
    public String switchId;

    @NameInMap("VpcId")
    public String vpcId;

    public static TensorboardSpec build(java.util.Map<String, ?> map) throws Exception {
        TensorboardSpec self = new TensorboardSpec();
        return TeaModel.build(map, self);
    }

    public TensorboardSpec setEcsType(String ecsType) {
        this.ecsType = ecsType;
        return this;
    }
    public String getEcsType() {
        return this.ecsType;
    }

    public TensorboardSpec setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public TensorboardSpec setSwitchId(String switchId) {
        this.switchId = switchId;
        return this;
    }
    public String getSwitchId() {
        return this.switchId;
    }

    public TensorboardSpec setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
