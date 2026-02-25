// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class TCPSocketAction extends TeaModel {
    /**
     * <p>Optional. The hostname to which you want to connect. The default value is the IP address of the pod.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The port number that you want to access on the container. Valid values: 1 to 65535.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
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
