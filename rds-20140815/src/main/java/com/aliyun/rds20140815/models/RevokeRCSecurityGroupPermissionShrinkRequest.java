// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionShrinkRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

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
