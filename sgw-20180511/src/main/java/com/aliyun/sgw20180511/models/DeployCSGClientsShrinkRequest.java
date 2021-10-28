// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeployCSGClientsShrinkRequest extends TeaModel {
    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("EcsInstanceIds")
    public String ecsInstanceIdsShrink;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("VpcId")
    public String vpcId;

    public static DeployCSGClientsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployCSGClientsShrinkRequest self = new DeployCSGClientsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeployCSGClientsShrinkRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public DeployCSGClientsShrinkRequest setEcsInstanceIdsShrink(String ecsInstanceIdsShrink) {
        this.ecsInstanceIdsShrink = ecsInstanceIdsShrink;
        return this;
    }
    public String getEcsInstanceIdsShrink() {
        return this.ecsInstanceIdsShrink;
    }

    public DeployCSGClientsShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeployCSGClientsShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
