// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class TCPSocketAction extends TeaModel {
    @NameInMap("Host")
    public String host;

    @NameInMap("Port")
    public Integer port;

    public static TCPSocketAction build(java.util.Map<String, ?> map) throws Exception {
        TCPSocketAction self = new TCPSocketAction();
        return TeaModel.build(map, self);
    }

    public TCPSocketAction setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public TCPSocketAction setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

}
