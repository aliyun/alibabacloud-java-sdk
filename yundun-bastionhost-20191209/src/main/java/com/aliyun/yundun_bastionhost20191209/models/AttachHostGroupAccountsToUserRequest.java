// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostGroupAccountsToUserRequest extends TeaModel {
    /**
     * <p>The IDs of the host groups and the names of the host accounts to which you want to grant the user access. You can specify up to 10 host group IDs and up to 10 host account names for each host group. If you do not specify host account names, the user is granted access only to the host groups. For more information about the structure of this parameter, see the HostGroups parameter structure description in the request parameter list.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/201307.html">ListHostGroups</a> operation to obtain host group IDs and call the <a href="https://help.aliyun.com/document_detail/204372.html">ListHostAccounts</a> operation to obtain host account names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;HostGroupId&quot;:&quot;1&quot;}, {&quot;HostGroupId&quot;:&quot;2&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;3&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]}, {&quot;HostGroupId&quot;:&quot;4&quot;,&quot;HostAccountNames&quot;:[&quot;root&quot;,&quot;111&quot;,&quot;abc&quot;]} ]</p>
     */
    @NameInMap("HostGroups")
    public String hostGroups;

    /**
     * <p>The instance ID of the Bastionhost instance to which the user to be granted authorization on host groups and host accounts belongs.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies the region ID of the Bastionhost instance where the user to be granted permissions on host groups and host accounts is located.</p>
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
     * <p>The ID of the user to be granted permissions on host groups and host accounts.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/204522.html">ListUsers</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AttachHostGroupAccountsToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostGroupAccountsToUserRequest self = new AttachHostGroupAccountsToUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostGroupAccountsToUserRequest setHostGroups(String hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public String getHostGroups() {
        return this.hostGroups;
    }

    public AttachHostGroupAccountsToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostGroupAccountsToUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostGroupAccountsToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
