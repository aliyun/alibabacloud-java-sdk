// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RescaleApplicationQuery extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("Replicas")
    @Validation(required = true)
    public Integer replicas;

    @NameInMap("MinReadyInstances")
    public Integer minReadyInstances;

    public static RescaleApplicationQuery build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationQuery self = new RescaleApplicationQuery();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationQuery setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RescaleApplicationQuery setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public RescaleApplicationQuery setMinReadyInstances(Integer minReadyInstances) {
        this.minReadyInstances = minReadyInstances;
        return this;
    }
    public Integer getMinReadyInstances() {
        return this.minReadyInstances;
    }

}
