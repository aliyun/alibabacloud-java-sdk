// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MicroServiceDigest extends TeaModel {
    @NameInMap("MqGroups")
    public MqGroup mqGroups;

    @NameInMap("ServiceId")
    public Long serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    public static MicroServiceDigest build(java.util.Map<String, ?> map) throws Exception {
        MicroServiceDigest self = new MicroServiceDigest();
        return TeaModel.build(map, self);
    }

    public MicroServiceDigest setMqGroups(MqGroup mqGroups) {
        this.mqGroups = mqGroups;
        return this;
    }
    public MqGroup getMqGroups() {
        return this.mqGroups;
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

}
