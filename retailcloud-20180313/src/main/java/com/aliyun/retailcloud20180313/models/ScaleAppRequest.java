// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ScaleAppRequest extends TeaModel {
    @NameInMap("EnvId")
    public Long envId;

    @NameInMap("Replicas")
    public Integer replicas;

    @NameInMap("TotalPartitions")
    public Integer totalPartitions;

    public static ScaleAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleAppRequest self = new ScaleAppRequest();
        return TeaModel.build(map, self);
    }

    public ScaleAppRequest setEnvId(Long envId) {
        this.envId = envId;
        return this;
    }
    public Long getEnvId() {
        return this.envId;
    }

    public ScaleAppRequest setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public ScaleAppRequest setTotalPartitions(Integer totalPartitions) {
        this.totalPartitions = totalPartitions;
        return this;
    }
    public Integer getTotalPartitions() {
        return this.totalPartitions;
    }

}
