// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateVServerGroupResponseBody extends TeaModel {
    /**
     * <p>The type of the backend server. Valid values:</p>
     * <br>
     * <p>*   **ecs**: an ECS instance. This is the default value.</p>
     * <p>*   **eni**: an ENI.</p>
     */
    @NameInMap("BackendServers")
    public CreateVServerGroupResponseBodyBackendServers backendServers;

    /**
     * <p>The list of backend servers.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static CreateVServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVServerGroupResponseBody self = new CreateVServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVServerGroupResponseBody setBackendServers(CreateVServerGroupResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public CreateVServerGroupResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public CreateVServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVServerGroupResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public static class CreateVServerGroupResponseBodyBackendServersBackendServer extends TeaModel {
        /**
         * <p>backend server</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the ECS instance or ENI.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Creates a vServer group and adds backend servers to the vServer group.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The weight of the backend server.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The description of the vServer group.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateVServerGroupResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            CreateVServerGroupResponseBodyBackendServersBackendServer self = new CreateVServerGroupResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
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
