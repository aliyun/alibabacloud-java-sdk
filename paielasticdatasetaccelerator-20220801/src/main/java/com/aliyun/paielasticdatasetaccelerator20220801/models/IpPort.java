// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class IpPort extends TeaModel {
    @NameInMap("Ip")
    public String ip;

    @NameInMap("Port")
    public String port;

    public static IpPort build(java.util.Map<String, ?> map) throws Exception {
        IpPort self = new IpPort();
        return TeaModel.build(map, self);
    }

    public IpPort setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public IpPort setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

}
