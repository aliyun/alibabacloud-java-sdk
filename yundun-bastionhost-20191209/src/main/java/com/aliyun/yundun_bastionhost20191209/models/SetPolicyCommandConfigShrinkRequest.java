// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyCommandConfigShrinkRequest extends TeaModel {
    @NameInMap("CommandConfig")
    public String commandConfigShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyCommandConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyCommandConfigShrinkRequest self = new SetPolicyCommandConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyCommandConfigShrinkRequest setCommandConfigShrink(String commandConfigShrink) {
        this.commandConfigShrink = commandConfigShrink;
        return this;
    }
    public String getCommandConfigShrink() {
        return this.commandConfigShrink;
    }

    public SetPolicyCommandConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyCommandConfigShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyCommandConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
