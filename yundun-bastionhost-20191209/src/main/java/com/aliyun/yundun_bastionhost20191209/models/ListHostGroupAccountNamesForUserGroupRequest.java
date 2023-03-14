// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserGroupRequest extends TeaModel {
    /**
     * <p>The ID of the host group.</p>
     * <br>
     * <p>>  You can call the [ListHostGroups](~~201307~~) operation to query the ID of the host group.</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>The ID of the Bastionhost instance where you want to query the host account names that the user group is authorized to manage in a specified host group.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the Bastionhost instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance where you want to query the host account names that the user group is authorized to manage in a specified host group.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group.</p>
     * <br>
     * <p>>  You can call the [ListUserGroups](~~204509~~) operation to query the ID of the user group.</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static ListHostGroupAccountNamesForUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupAccountNamesForUserGroupRequest self = new ListHostGroupAccountNamesForUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListHostGroupAccountNamesForUserGroupRequest setHostGroupId(String hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public ListHostGroupAccountNamesForUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHostGroupAccountNamesForUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListHostGroupAccountNamesForUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
