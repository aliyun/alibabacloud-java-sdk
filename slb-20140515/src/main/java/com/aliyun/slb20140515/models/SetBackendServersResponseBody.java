// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    public SetBackendServersResponseBodyBackendServers backendServers;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetBackendServersResponseBody self = new SetBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public SetBackendServersResponseBody setBackendServers(SetBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public SetBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public SetBackendServersResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public SetBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        public static SetBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            SetBackendServersResponseBodyBackendServersBackendServer self = new SetBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetBackendServersResponseBodyBackendServersBackendServer setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class SetBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<SetBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static SetBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            SetBackendServersResponseBodyBackendServers self = new SetBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public SetBackendServersResponseBodyBackendServers setBackendServer(java.util.List<SetBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<SetBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
