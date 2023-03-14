// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the host and host account that you want to authorize the user group to manage. You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the user group is authorized to manage only the specified hosts. For more information about this parameter, see the "Description of the Hosts parameter" section of this topic.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host and the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.</p>
     */
    @NameInMap("Hosts")
    public String hosts;

    /**
     * <p>The ID of the bastion host in which you want to authorize the user group to manage the specified hosts and host accounts.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host in which you want to authorize the user group to manage the specified hosts and host accounts.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group that you want to authorize to manage the specified hosts and host accounts.</p>
     * <br>
     * <p>>  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static AttachHostAccountsToUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserGroupRequest self = new AttachHostAccountsToUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserGroupRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AttachHostAccountsToUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostAccountsToUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostAccountsToUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
