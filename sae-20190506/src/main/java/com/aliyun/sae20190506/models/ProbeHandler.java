// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ProbeHandler extends TeaModel {
    /**
     * <p>The action that specifies the HTTP request to execute.</p>
     */
    @NameInMap("HttpGet")
    public HTTPGetAction httpGet;

    /**
     * <p>The action that specifies the involved TCP port.</p>
     */
    @NameInMap("TcpSocket")
    public TCPSocketAction tcpSocket;

    public static ProbeHandler build(java.util.Map<String, ?> map) throws Exception {
        ProbeHandler self = new ProbeHandler();
        return TeaModel.build(map, self);
    }

    public ProbeHandler setHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }
    public HTTPGetAction getHttpGet() {
        return this.httpGet;
    }

    public ProbeHandler setTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }
    public TCPSocketAction getTcpSocket() {
        return this.tcpSocket;
    }

}
