// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyApprovalConfigRequest extends TeaModel {
    /**
     * <p>The O&amp;M approval configuration in the control policy.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApprovalConfig")
    public SetPolicyApprovalConfigRequestApprovalConfig approvalConfig;

    /**
     * <p>The Bastionhost instance ID.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to obtain the Bastionhost instance ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the control policy that you want to modify.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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

    public SetPolicyApprovalConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SetPolicyApprovalConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class SetPolicyApprovalConfigRequestApprovalConfig extends TeaModel {
        /**
         * <p>The O&amp;M approval configuration in the control policy. Valid values:</p>
         * <ul>
         * <li><strong>On</strong>: Enables O&amp;M approval.</li>
         * <li><strong>Off</strong>: Disables O&amp;M approval.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>On</p>
         */
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
