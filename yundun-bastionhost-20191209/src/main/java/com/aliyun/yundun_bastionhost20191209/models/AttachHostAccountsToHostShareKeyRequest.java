// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToHostShareKeyRequest extends TeaModel {
    /**
     * <p>The IDs of the host accounts.</p>
     * <br>
     * <p>> You must specify this parameter.</p>
     */
    @NameInMap("HostAccountIds")
    public String hostAccountIds;

    /**
     * <p>The ID of the shared key.</p>
     * <br>
     * <p>> You must specify this parameter.</p>
     */
    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    /**
     * <p>The ID of the bastion host. You can call the [DescribeInstances](~~153281~~) operation to query the ID of the bastion host.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the bastion host. For more information about the mapping between region IDs and region names, see [Regions and zones](~~40654~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AttachHostAccountsToHostShareKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToHostShareKeyRequest self = new AttachHostAccountsToHostShareKeyRequest();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToHostShareKeyRequest setHostAccountIds(String hostAccountIds) {
        this.hostAccountIds = hostAccountIds;
        return this;
    }
    public String getHostAccountIds() {
        return this.hostAccountIds;
    }

    public AttachHostAccountsToHostShareKeyRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public AttachHostAccountsToHostShareKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachHostAccountsToHostShareKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
