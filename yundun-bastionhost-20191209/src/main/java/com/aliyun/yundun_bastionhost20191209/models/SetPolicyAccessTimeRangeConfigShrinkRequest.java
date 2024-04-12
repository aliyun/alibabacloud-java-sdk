// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAccessTimeRangeConfigShrinkRequest extends TeaModel {
    @NameInMap("AccessTimeRangeConfig")
    public String accessTimeRangeConfigShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyAccessTimeRangeConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyAccessTimeRangeConfigShrinkRequest self = new SetPolicyAccessTimeRangeConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyAccessTimeRangeConfigShrinkRequest setAccessTimeRangeConfigShrink(String accessTimeRangeConfigShrink) {
        this.accessTimeRangeConfigShrink = accessTimeRangeConfigShrink;
        return this;
    }
    public String getAccessTimeRangeConfigShrink() {
        return this.accessTimeRangeConfigShrink;
    }

    public SetPolicyAccessTimeRangeConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyAccessTimeRangeConfigShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyAccessTimeRangeConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
