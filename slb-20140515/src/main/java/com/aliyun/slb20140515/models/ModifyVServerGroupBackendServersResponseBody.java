// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersResponseBody extends TeaModel {
    /**
     * <p>The weight of the backend server.</p>
     */
    @NameInMap("BackendServers")
    public ModifyVServerGroupBackendServersResponseBodyBackendServers backendServers;

    /**
     * <p>The type of backend server. Valid values:</p>
     * <br>
     * <p>*   **ecs**: an ECS instance. This is the default value.</p>
     * <p>*   **eni**: an ENI.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of backend servers.</p>
     */
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
        /**
         * <p>The port that is used by the backend server.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>You can call this operation to replace the backend servers in a specified vServer group. To modify the configurations of the backend servers, such as their weights, you can call the [SetVServerGroupAttribute](~~35217~~) operation.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>Replaces backend servers in a specified vServer group.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The description of the backend server.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Backend server description</p>
         */
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
