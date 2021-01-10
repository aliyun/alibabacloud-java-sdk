// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class StopCasLoadbalanceListenerRequest extends TeaModel {
    @NameInMap("ListenerPort")
    public Long listenerPort;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    public static StopCasLoadbalanceListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCasLoadbalanceListenerRequest self = new StopCasLoadbalanceListenerRequest();
        return TeaModel.build(map, self);
    }

    public StopCasLoadbalanceListenerRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public StopCasLoadbalanceListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

}
