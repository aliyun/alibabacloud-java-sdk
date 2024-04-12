// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyIPAclConfigShrinkRequest extends TeaModel {
    @NameInMap("IPAclConfig")
    public String IPAclConfigShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyIPAclConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyIPAclConfigShrinkRequest self = new SetPolicyIPAclConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyIPAclConfigShrinkRequest setIPAclConfigShrink(String IPAclConfigShrink) {
        this.IPAclConfigShrink = IPAclConfigShrink;
        return this;
    }
    public String getIPAclConfigShrink() {
        return this.IPAclConfigShrink;
    }

    public SetPolicyIPAclConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyIPAclConfigShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyIPAclConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
