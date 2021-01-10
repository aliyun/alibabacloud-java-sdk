// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceSecurityipRequest extends TeaModel {
    @NameInMap("ListenerPort")
    public Long listenerPort;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasLoadbalanceSecurityipRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceSecurityipRequest self = new QueryCasLoadbalanceSecurityipRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceSecurityipRequest setListenerPort(Long listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Long getListenerPort() {
        return this.listenerPort;
    }

    public QueryCasLoadbalanceSecurityipRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public QueryCasLoadbalanceSecurityipRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
