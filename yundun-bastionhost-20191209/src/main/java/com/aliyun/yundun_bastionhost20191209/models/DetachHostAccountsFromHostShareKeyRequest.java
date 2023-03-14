// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromHostShareKeyRequest extends TeaModel {
    /**
     * <p>The IDs of the host accounts.</p>
     */
    @NameInMap("HostAccountIds")
    public String hostAccountIds;

    /**
     * <p>The ID of the shared key.</p>
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

    public static DetachHostAccountsFromHostShareKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromHostShareKeyRequest self = new DetachHostAccountsFromHostShareKeyRequest();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromHostShareKeyRequest setHostAccountIds(String hostAccountIds) {
        this.hostAccountIds = hostAccountIds;
        return this;
    }
    public String getHostAccountIds() {
        return this.hostAccountIds;
    }

    public DetachHostAccountsFromHostShareKeyRequest setHostShareKeyId(String hostShareKeyId) {
        this.hostShareKeyId = hostShareKeyId;
        return this;
    }
    public String getHostShareKeyId() {
        return this.hostShareKeyId;
    }

    public DetachHostAccountsFromHostShareKeyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DetachHostAccountsFromHostShareKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
