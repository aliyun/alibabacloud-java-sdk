// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    public AddBackendServersResponseBodyBackendServers backendServers;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("RequestId")
    public String requestId;

    public static AddBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersResponseBody self = new AddBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBackendServersResponseBody setBackendServers(AddBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public AddBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public AddBackendServersResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public AddBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        public static AddBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            AddBackendServersResponseBodyBackendServersBackendServer self = new AddBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddBackendServersResponseBodyBackendServersBackendServer setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class AddBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<AddBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static AddBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            AddBackendServersResponseBodyBackendServers self = new AddBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public AddBackendServersResponseBodyBackendServers setBackendServer(java.util.List<AddBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<AddBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
