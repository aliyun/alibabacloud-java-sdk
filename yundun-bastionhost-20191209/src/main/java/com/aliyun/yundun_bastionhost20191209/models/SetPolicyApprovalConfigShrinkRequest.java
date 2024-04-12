// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyApprovalConfigShrinkRequest extends TeaModel {
    @NameInMap("ApprovalConfig")
    public String approvalConfigShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyApprovalConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyApprovalConfigShrinkRequest self = new SetPolicyApprovalConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyApprovalConfigShrinkRequest setApprovalConfigShrink(String approvalConfigShrink) {
        this.approvalConfigShrink = approvalConfigShrink;
        return this;
    }
    public String getApprovalConfigShrink() {
        return this.approvalConfigShrink;
    }

    public SetPolicyApprovalConfigShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyApprovalConfigShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyApprovalConfigShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
