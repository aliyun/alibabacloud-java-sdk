// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ModifyHostsActiveAddressTypeRequest extends TeaModel {
    @NameInMap("ActiveAddressType")
    public String activeAddressType;

    @NameInMap("HostIds")
    public String hostIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyHostsActiveAddressTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHostsActiveAddressTypeRequest self = new ModifyHostsActiveAddressTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHostsActiveAddressTypeRequest setActiveAddressType(String activeAddressType) {
        this.activeAddressType = activeAddressType;
        return this;
    }
    public String getActiveAddressType() {
        return this.activeAddressType;
    }

    public ModifyHostsActiveAddressTypeRequest setHostIds(String hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public String getHostIds() {
        return this.hostIds;
    }

    public ModifyHostsActiveAddressTypeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyHostsActiveAddressTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
