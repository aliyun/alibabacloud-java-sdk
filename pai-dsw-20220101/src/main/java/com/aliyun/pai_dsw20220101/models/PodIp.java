// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class PodIp extends TeaModel {
    @NameInMap("InterfaceName")
    public String interfaceName;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Type")
    public String type;

    public static PodIp build(java.util.Map<String, ?> map) throws Exception {
        PodIp self = new PodIp();
        return TeaModel.build(map, self);
    }

    public PodIp setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public PodIp setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public PodIp setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
