// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyApprovalConfigRequest extends TeaModel {
    @NameInMap("ApprovalConfig")
    public SetPolicyApprovalConfigRequestApprovalConfig approvalConfig;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static SetPolicyApprovalConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyApprovalConfigRequest self = new SetPolicyApprovalConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyApprovalConfigRequest setApprovalConfig(SetPolicyApprovalConfigRequestApprovalConfig approvalConfig) {
        this.approvalConfig = approvalConfig;
        return this;
    }
    public SetPolicyApprovalConfigRequestApprovalConfig getApprovalConfig() {
        return this.approvalConfig;
    }

    public SetPolicyApprovalConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyApprovalConfigRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyApprovalConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyApprovalConfigRequestApprovalConfig extends TeaModel {
        @NameInMap("SwitchStatus")
        public String switchStatus;

        public static SetPolicyApprovalConfigRequestApprovalConfig build(java.util.Map<String, ?> map) throws Exception {
            SetPolicyApprovalConfigRequestApprovalConfig self = new SetPolicyApprovalConfigRequestApprovalConfig();
            return TeaModel.build(map, self);
        }

        public SetPolicyApprovalConfigRequestApprovalConfig setSwitchStatus(String switchStatus) {
            this.switchStatus = switchStatus;
            return this;
        }
        public String getSwitchStatus() {
            return this.switchStatus;
        }

    }

}
