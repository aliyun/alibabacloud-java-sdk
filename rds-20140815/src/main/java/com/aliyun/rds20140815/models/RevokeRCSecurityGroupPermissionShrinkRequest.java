// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionShrinkRequest extends TeaModel {
    /**
     * <p>The direction of the security group rules that you want to delete. Valid values:</p>
     * <ul>
     * <li><strong>ingress</strong>: inbound security group rules.</li>
     * <li><strong>egress</strong>: outbound security group rules.</li>
     * </ul>
     * <blockquote>
     * <p> You can specify security group rules only in the same direction in a request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ingress</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-2ze27hs990o2hn9****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The IDs of the security group rules that you want to delete.</p>
     */
    @NameInMap("SecurityGroupRuleIdList")
    public String securityGroupRuleIdListShrink;

    public static RevokeRCSecurityGroupPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRCSecurityGroupPermissionShrinkRequest self = new RevokeRCSecurityGroupPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRCSecurityGroupPermissionShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public RevokeRCSecurityGroupPermissionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeRCSecurityGroupPermissionShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeRCSecurityGroupPermissionShrinkRequest setSecurityGroupRuleIdListShrink(String securityGroupRuleIdListShrink) {
        this.securityGroupRuleIdListShrink = securityGroupRuleIdListShrink;
        return this;
    }
    public String getSecurityGroupRuleIdListShrink() {
        return this.securityGroupRuleIdListShrink;
    }

}
