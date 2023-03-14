// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the host and host account on which you want to revoke permissions from the user group.</p>
     * <br>
     * <p>You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the permissions on both the specified hosts and all host accounts of the hosts are revoked from the user group. For more information about this parameter, see the "Description of the Hosts parameter" section of this topic.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host and the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.</p>
     */
    @NameInMap("Hosts")
    public String hosts;

    /**
     * <p>The ID of the bastion host in which you want to revoke permissions on the specified hosts and host accounts from the user group.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host in which you want to revoke permissions on the specified hosts and host accounts from the user group.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group from which you want to revoke permissions on the specified hosts and host accounts.</p>
     * <br>
     * <p>>  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.</p>
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
