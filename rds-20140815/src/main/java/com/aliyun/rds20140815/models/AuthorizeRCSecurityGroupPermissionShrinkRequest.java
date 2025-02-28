// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeRCSecurityGroupPermissionShrinkRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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
