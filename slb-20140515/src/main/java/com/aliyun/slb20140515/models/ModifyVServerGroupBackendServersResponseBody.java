// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersResponseBody extends TeaModel {
    /**
     * <p>The backend servers.</p>
     */
    @NameInMap("BackendServers")
    public ModifyVServerGroupBackendServersResponseBodyBackendServers backendServers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DEC9C28-AB05-4DDF-9A78-6B08EC9CE18C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the vServer group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-cige6j****</p>
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
         * <p>The description of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>Backend server description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port that is used by the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the ECS instance or ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ge5hrp****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of backend server. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong> (default): ECS instance</li>
         * <li><strong>eni</strong>: ENI</li>
         * <li><strong>eci</strong>: elastic container instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
