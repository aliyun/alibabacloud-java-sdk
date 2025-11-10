// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobReplicaStatus extends TeaModel {
    @NameInMap("Active")
    public Integer active;

    @NameInMap("Type")
    public String type;

    public static JobReplicaStatus build(java.util.Map<String, ?> map) throws Exception {
        JobReplicaStatus self = new JobReplicaStatus();
        return TeaModel.build(map, self);
    }

    public JobReplicaStatus setActive(Integer active) {
        this.active = active;
        return this;
    }
    public Integer getActive() {
        return this.active;
    }

    public JobReplicaStatus setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
