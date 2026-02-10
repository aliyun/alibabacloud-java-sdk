// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class TensorboardSpec extends TeaModel {
    /**
     * <p>The specifications of the ECS instance configured for the pay-as-you-go Tensorboard task.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("EcsType")
    public String ecsType;

    /**
     * <p>The ID of the security group configured for the pay-as-you-go Tensorboard task.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-xxxxx</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the vSwitch configured for the pay-as-you-go Tensorboard task.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-xxxx</p>
     */
    @NameInMap("SwitchId")
    public String switchId;

    /**
     * <p>The ID of the virtual private cloud (VPC) configured for the pay-as-you-go Tensorboard task.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
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
