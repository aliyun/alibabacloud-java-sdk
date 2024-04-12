// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigShrinkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("ProtocolConfig")
    public String protocolConfigShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyProtocolConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyProtocolConfigShrinkRequest self = new SetPolicyProtocolConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyProtocolConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyProtocolConfigShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyProtocolConfigShrinkRequest setProtocolConfigShrink(String protocolConfigShrink) {
        this.protocolConfigShrink = protocolConfigShrink;
        return this;
    }
    public String getProtocolConfigShrink() {
        return this.protocolConfigShrink;
    }

    public SetPolicyProtocolConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
