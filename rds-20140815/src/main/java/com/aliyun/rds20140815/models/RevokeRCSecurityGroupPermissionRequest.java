// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SecurityGroupRuleIdList")
    public java.util.List<String> securityGroupRuleIdList;

    public static RevokeRCSecurityGroupPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRCSecurityGroupPermissionRequest self = new RevokeRCSecurityGroupPermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRCSecurityGroupPermissionRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public RevokeRCSecurityGroupPermissionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RevokeRCSecurityGroupPermissionRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public RevokeRCSecurityGroupPermissionRequest setSecurityGroupRuleIdList(java.util.List<String> securityGroupRuleIdList) {
        this.securityGroupRuleIdList = securityGroupRuleIdList;
        return this;
    }
    public java.util.List<String> getSecurityGroupRuleIdList() {
        return this.securityGroupRuleIdList;
    }

}
