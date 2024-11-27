// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyUserScopeRequest extends TeaModel {
    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
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
     * <p>1</p>
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

    /**
     * <p>The scope of users to whom the control policy applies. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: The control policy applies to all users.</li>
     * <li><strong>User</strong>: The control policy applies to specified users.</li>
     * <li><strong>UserGroup</strong>: The control policy applies to specified user groups.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ScopeType")
    public String scopeType;

    /**
     * <p>The user groups to which the control policy applies.</p>
     * <blockquote>
     * <p>This parameter is required if ScopeType is set to UserGroup. You can specify up to 100 user group IDs.</p>
     * </blockquote>
     */
    @NameInMap("UserGroupIds")
    public java.util.List<String> userGroupIds;

    /**
     * <p>The users to whom the control policy applies.</p>
     * <blockquote>
     * <p>This parameter is required if ScopeType is set to User. You can specify up to 500 user IDs.</p>
     * </blockquote>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static SetPolicyUserScopeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyUserScopeRequest self = new SetPolicyUserScopeRequest();
        return TeaModel.build(map, self);
    }

    public SetPolicyUserScopeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SetPolicyUserScopeRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public SetPolicyUserScopeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SetPolicyUserScopeRequest setScopeType(String scopeType) {
        this.scopeType = scopeType;
        return this;
    }
    public String getScopeType() {
        return this.scopeType;
    }

    public SetPolicyUserScopeRequest setUserGroupIds(java.util.List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
        return this;
    }
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    public SetPolicyUserScopeRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

}
