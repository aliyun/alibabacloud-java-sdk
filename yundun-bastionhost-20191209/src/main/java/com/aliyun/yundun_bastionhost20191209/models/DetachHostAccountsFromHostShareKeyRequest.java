// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromHostShareKeyRequest extends TeaModel {
    @NameInMap("HostAccountIds")
    public String hostAccountIds;

    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    @NameInMap("InstanceId")
    public String instanceId;

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
