// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyAccessTimeRangeConfigShrinkRequest extends TeaModel {
    /**
     * <p>The logon period limits.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccessTimeRangeConfig")
    public String accessTimeRangeConfigShrink;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The control policy ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/2758876.html">ListPolicies</a> operation to query the control policy ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
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
