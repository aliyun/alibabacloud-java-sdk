// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateVServerGroupResponseBody extends TeaModel {
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public CreateVServerGroupResponseBodyBackendServers backendServers;

    public static CreateVServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVServerGroupResponseBody self = new CreateVServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVServerGroupResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public CreateVServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVServerGroupResponseBody setBackendServers(CreateVServerGroupResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public CreateVServerGroupResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public static class CreateVServerGroupResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        public static CreateVServerGroupResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            CreateVServerGroupResponseBodyBackendServersBackendServer self = new CreateVServerGroupResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public CreateVServerGroupResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateVServerGroupResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateVServerGroupResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateVServerGroupResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateVServerGroupResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class CreateVServerGroupResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<CreateVServerGroupResponseBodyBackendServersBackendServer> backendServer;

        public static CreateVServerGroupResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            CreateVServerGroupResponseBodyBackendServers self = new CreateVServerGroupResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public CreateVServerGroupResponseBodyBackendServers setBackendServer(java.util.List<CreateVServerGroupResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<CreateVServerGroupResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
