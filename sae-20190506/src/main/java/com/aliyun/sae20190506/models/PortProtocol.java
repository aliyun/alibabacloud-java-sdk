// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class PortProtocol extends TeaModel {
    @NameInMap("Port")
    public Integer port;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("TargetPort")
    public Integer targetPort;

    public static PortProtocol build(java.util.Map<String, ?> map) throws Exception {
        PortProtocol self = new PortProtocol();
        return TeaModel.build(map, self);
    }

    public PortProtocol setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public PortProtocol setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public PortProtocol setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }
    public Integer getTargetPort() {
        return this.targetPort;
    }

}
