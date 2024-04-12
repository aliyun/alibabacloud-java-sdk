// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteNetworkDomainRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    @NameInMap("RegionId")
    public String regionId;

    public static DeleteNetworkDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkDomainRequest self = new DeleteNetworkDomainRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNetworkDomainRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public DeleteNetworkDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
