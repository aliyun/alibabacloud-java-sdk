// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserRequest extends TeaModel {
    /**
     * <p>The IDs of the host and host account that you want to authorize the user to manage. You can specify up to 10 host IDs and up to 10 host account IDs for each host. You can specify only host IDs. In this case, the user is authorized to manage only the specified hosts. For more information about this parameter, see the "Description of the Hosts parameter" section of this topic.</p>
     * <br>
     * <p>>  You can call the [ListHosts](~~200665~~) operation to query the ID of the host and the [ListHostAccounts](~~204372~~) operation to query the ID of the host account.</p>
     */
    @NameInMap("Hosts")
    public String hosts;

    /**
     * <p>The ID of the bastion host for which you want to authorize the user to manage the specified hosts and host accounts.</p>
     * <br>
     * <p>>  You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host for which you want to authorize the user to manage the specified hosts and host accounts.</p>
     * <br>
     * <p>>  For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user that you want to authorize to manage the specified hosts and host accounts.</p>
     * <br>
     * <p>>  You can call the [ListUsers](~~204522~~) operation to query the ID of the user.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AttachHostAccountsToUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserRequest self = new AttachHostAccountsToUserRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserRequest setHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }
    public String getHosts() {
        return this.hosts;
    }

    public AttachHostAccountsToUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostAccountsToUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachHostAccountsToUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
