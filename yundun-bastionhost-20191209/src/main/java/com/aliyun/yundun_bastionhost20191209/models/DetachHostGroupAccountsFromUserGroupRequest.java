// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostGroupAccountsFromUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the host group and the name of host account on which you want to revoke permissions from the user group. You can specify up to 10 host group IDs and up to 10 host account names for each host group. You can specify only host group IDs. In this case, the permissions on the specified host groups and all host accounts in the host groups are revoked from the user group. For more information about this parameter, see the &quot;Description of the HostGroups parameter&quot; section of this topic.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to query the ID of the host group and the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query the name of the host account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;HostGroupId&quot;:&quot;1&quot;}, {&quot;HostGroupId&quot;:&quot;2&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;3&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;4&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}]</p>
     */
    @NameInMap("HostGroups")
    public String hostGroups;

    /**
     * <p>The ID of the bastion host for which you want to revoke permissions on the specified host groups and host accounts from the user group.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host for which you want to revoke permissions on the specified host groups and host accounts from the user group.</p>
     * <blockquote>
     * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group from which you want to revoke permissions on the specified host groups and host accounts.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to query the ID of the user group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DetachHostGroupAccountsFromUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachHostGroupAccountsFromUserGroupRequest self = new DetachHostGroupAccountsFromUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DetachHostGroupAccountsFromUserGroupRequest setHostGroups(String hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public String getHostGroups() {
        return this.hostGroups;
    }

    public DetachHostGroupAccountsFromUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachHostGroupAccountsFromUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachHostGroupAccountsFromUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
