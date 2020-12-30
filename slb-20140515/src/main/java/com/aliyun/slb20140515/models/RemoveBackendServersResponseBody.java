// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveBackendServersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public RemoveBackendServersResponseBodyBackendServers backendServers;

    public static RemoveBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveBackendServersResponseBody self = new RemoveBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveBackendServersResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public RemoveBackendServersResponseBody setBackendServers(RemoveBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public RemoveBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public static class RemoveBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        public static RemoveBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            RemoveBackendServersResponseBodyBackendServersBackendServer self = new RemoveBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RemoveBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class RemoveBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<RemoveBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static RemoveBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveBackendServersResponseBodyBackendServers self = new RemoveBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public RemoveBackendServersResponseBodyBackendServers setBackendServer(java.util.List<RemoveBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<RemoveBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
