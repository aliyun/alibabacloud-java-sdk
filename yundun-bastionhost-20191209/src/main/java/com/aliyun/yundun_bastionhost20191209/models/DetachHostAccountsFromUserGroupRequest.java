// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the host and host account on which you want to revoke permissions from the user group.</p>
     * <p>You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the permissions on both the specified hosts and all host accounts of the hosts are revoked from the user group. For more information about this parameter, see the &quot;Description of the Hosts parameter&quot; section of this topic.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to query the ID of the host and the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query the ID of the host account.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;HostId&quot;:&quot;1&quot;}, {&quot;HostId&quot;:&quot;2&quot;,&quot;HostAccountIds&quot;:[&quot;1&quot;,&quot;2&quot;,&quot;3&quot;,...]}, {&quot;HostId&quot;:&quot;3&quot;,&quot;HostAccountIds&quot;:[&quot;4&quot;,&quot;5&quot;,&quot;6&quot;]}, {&quot;HostId&quot;:&quot;4&quot;,&quot;HostAccountIds&quot;:[&quot;9&quot;,&quot;8&quot;,&quot;7&quot;]} ]</p>
     */
    @NameInMap("Hosts")
    public String hosts;

    /**
     * <p>The ID of the bastion host in which you want to revoke permissions on the specified hosts and host accounts from the user group.</p>
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
     * <p>The region ID of the bastion host in which you want to revoke permissions on the specified hosts and host accounts from the user group.</p>
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
     * <p>The ID of the user group from which you want to revoke permissions on the specified hosts and host accounts.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to query the ID of the user group.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>１</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static DetachHostAccountsFromUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserGroupRequest self = new DetachHostAccountsFromUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserGroupRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public DetachHostAccountsFromUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachHostAccountsFromUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DetachHostAccountsFromUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
