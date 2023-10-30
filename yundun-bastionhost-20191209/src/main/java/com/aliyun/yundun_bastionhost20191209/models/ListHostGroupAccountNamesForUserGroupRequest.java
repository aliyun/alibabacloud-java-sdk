// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListHostGroupAccountNamesForUserGroupRequest extends TeaModel {
    /**
     * <p>WB662865</p>
     */
    @NameInMap("HostGroupId")
    public String hostGroupId;

    /**
     * <p>All Bastionhost API requests must include common request parameters. For more information about common request parameters, see [Common parameters](~~148139~~).</p>
     * <br>
     * <p>For more information about sample requests, see the "Examples" section of this topic.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Queries the names of the host accounts that a specified user group is authorized to manage in a specified host group.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>ListHostGroupAccountNamesForUserGroup</p>
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
