// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MicroServiceDigest extends TeaModel {
    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("laneMqGroupInfos")
    public LaneMqGroupInfo laneMqGroupInfos;

    public static MicroServiceDigest build(java.util.Map<String, ?> map) throws Exception {
        MicroServiceDigest self = new MicroServiceDigest();
        return TeaModel.build(map, self);
    }

    public MicroServiceDigest setServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public Long getServiceId() {
        return this.serviceId;
    }

    public MicroServiceDigest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public MicroServiceDigest setLaneMqGroupInfos(LaneMqGroupInfo laneMqGroupInfos) {
        this.laneMqGroupInfos = laneMqGroupInfos;
        return this;
    }
    public LaneMqGroupInfo getLaneMqGroupInfos() {
        return this.laneMqGroupInfos;
    }

}
