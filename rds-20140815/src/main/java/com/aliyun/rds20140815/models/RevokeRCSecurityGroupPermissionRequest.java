// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RevokeRCSecurityGroupPermissionRequest extends TeaModel {
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
