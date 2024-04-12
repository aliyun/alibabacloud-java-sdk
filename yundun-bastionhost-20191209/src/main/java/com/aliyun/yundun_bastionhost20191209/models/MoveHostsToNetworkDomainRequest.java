// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveHostsToNetworkDomainRequest extends TeaModel {
    @NameInMap("HostIds")
    public java.util.List<String> hostIds;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("RegionId")
    public String regionId;

    public static MoveHostsToNetworkDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveHostsToNetworkDomainRequest self = new MoveHostsToNetworkDomainRequest();
        return TeaModel.build(map, self);
    }

    public MoveHostsToNetworkDomainRequest setHostIds(java.util.List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }
    public java.util.List<String> getHostIds() {
        return this.hostIds;
    }

    public MoveHostsToNetworkDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MoveHostsToNetworkDomainRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public MoveHostsToNetworkDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
