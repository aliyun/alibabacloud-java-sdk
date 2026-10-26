// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserGroupRequest extends TeaModel {
    /**
     * <p>The IDs of the host groups and the names of the host accounts to which you want to grant the user group access. You can specify up to 10 host group IDs and up to 10 host account names for each host group. If you do not specify host account names, the user group is granted access only to the host groups. For more information about the structure of this parameter, see the HostGroups parameter structure description in the Request parameters section.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to query host group IDs and call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to query host account names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;HostGroupId&quot;:&quot;1&quot;}, {&quot;HostGroupId&quot;:&quot;2&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;3&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;4&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}]</p>
     */
    @NameInMap("HostGroups")
    public String hostGroups;

    /**
     * <p>The ID of the Bastionhost instance where the user group resides. The user group is to be authorized to access host groups and host accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain the value of this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the region ID of the Bastionhost instance that manages the user group to which you want to grant permissions on host groups and host accounts.</p>
     * <blockquote>
     * <p>For the mappings between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user group to which you want to grant permissions on host groups and host accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204509.html">ListUserGroups</a> operation to query the user group ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserGroupId")
    public String userGroupId;

    public static AttachHostGroupAccountsToUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserGroupRequest self = new AttachHostGroupAccountsToUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserGroupRequest setHostGroups(String hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public String getHostGroups() {
        return this.hostGroups;
    }

    public AttachHostGroupAccountsToUserGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostGroupAccountsToUserGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostGroupAccountsToUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

}
