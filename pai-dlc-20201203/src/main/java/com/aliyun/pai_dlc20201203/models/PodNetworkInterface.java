// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class PodNetworkInterface extends TeaModel {
    /**
     * <p>The name of the network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>eth0</p>
     */
    @NameInMap("InterfaceName")
    public String interfaceName;

    /**
     * <p>The IP address of the network interface.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.1.2</p>
     */
    @NameInMap("Ip")
    public String ip;

    public static PodNetworkInterface build(java.util.Map<String, ?> map) throws Exception {
        PodNetworkInterface self = new PodNetworkInterface();
        return TeaModel.build(map, self);
    }

    public PodNetworkInterface setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }
    public String getInterfaceName() {
        return this.interfaceName;
    }

    public PodNetworkInterface setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
