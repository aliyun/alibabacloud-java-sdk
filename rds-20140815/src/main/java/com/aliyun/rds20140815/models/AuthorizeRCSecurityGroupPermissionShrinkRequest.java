// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionShrinkRequest extends TeaModel {
    /**
     * <p>The direction of the rule. Valid values:</p>
     * <ul>
     * <li><strong>ingress</strong>: the inbound security group rule.</li>
     * <li><strong>egress</strong>: the outbound security group rule.</li>
     * </ul>
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
     * <p>The information about the security group.</p>
     */
    @NameInMap("SecurityGroupPermissions")
    public String securityGroupPermissionsShrink;

    public static AuthorizeRCSecurityGroupPermissionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeRCSecurityGroupPermissionShrinkRequest self = new AuthorizeRCSecurityGroupPermissionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeRCSecurityGroupPermissionShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public AuthorizeRCSecurityGroupPermissionShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AuthorizeRCSecurityGroupPermissionShrinkRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public AuthorizeRCSecurityGroupPermissionShrinkRequest setSecurityGroupPermissionsShrink(String securityGroupPermissionsShrink) {
        this.securityGroupPermissionsShrink = securityGroupPermissionsShrink;
        return this;
    }
    public String getSecurityGroupPermissionsShrink() {
        return this.securityGroupPermissionsShrink;
    }

}
