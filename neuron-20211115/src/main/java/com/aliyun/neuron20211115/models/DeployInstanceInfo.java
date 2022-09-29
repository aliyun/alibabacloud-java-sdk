// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeployInstanceInfo extends TeaModel {
    @NameInMap("ip")
    public String ip;

    @NameInMap("status")
    public String status;

    public static DeployInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        DeployInstanceInfo self = new DeployInstanceInfo();
        return TeaModel.build(map, self);
    }

    public DeployInstanceInfo setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DeployInstanceInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
