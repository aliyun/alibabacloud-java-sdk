// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToHostShareKeyRequest extends TeaModel {
    @NameInMap("HostAccountIds")
    public String hostAccountIds;

    @NameInMap("HostShareKeyId")
    public String hostShareKeyId;

    @NameInMap("InstanceId")
    public String instanceId;

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
