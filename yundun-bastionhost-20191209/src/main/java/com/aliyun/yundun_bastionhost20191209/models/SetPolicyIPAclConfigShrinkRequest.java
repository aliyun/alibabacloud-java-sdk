// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyIPAclConfigShrinkRequest extends TeaModel {
    /**
     * <p>The access control settings for source IP addresses.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("IPAclConfig")
    public String IPAclConfigShrink;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the DescribeInstances operation to query the bastion host ID.<a href="~~153281~~"></a></p>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
