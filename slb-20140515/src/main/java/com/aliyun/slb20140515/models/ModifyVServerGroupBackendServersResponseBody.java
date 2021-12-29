// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersResponseBody extends TeaModel {
    @NameInMap("BackendServers")
    public ModifyVServerGroupBackendServersResponseBodyBackendServers backendServers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static ModifyVServerGroupBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVServerGroupBackendServersResponseBody self = new ModifyVServerGroupBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVServerGroupBackendServersResponseBody setBackendServers(ModifyVServerGroupBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public ModifyVServerGroupBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public ModifyVServerGroupBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVServerGroupBackendServersResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public static class ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        public static ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer self = new ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ModifyVServerGroupBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static ModifyVServerGroupBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyVServerGroupBackendServersResponseBodyBackendServers self = new ModifyVServerGroupBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServers setBackendServer(java.util.List<ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<ModifyVServerGroupBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
