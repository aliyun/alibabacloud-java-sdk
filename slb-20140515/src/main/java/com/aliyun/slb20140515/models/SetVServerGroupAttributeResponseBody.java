// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetVServerGroupAttributeResponseBody extends TeaModel {
    /**
     * <p>The list of backend servers.</p>
     */
    @NameInMap("BackendServers")
    public SetVServerGroupAttributeResponseBodyBackendServers backendServers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the vServer group.</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    /**
     * <p>The name of the vServer group.</p>
     */
    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    public static SetVServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVServerGroupAttributeResponseBody self = new SetVServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVServerGroupAttributeResponseBody setBackendServers(SetVServerGroupAttributeResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public SetVServerGroupAttributeResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public SetVServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetVServerGroupAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public SetVServerGroupAttributeResponseBody setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

    public static class SetVServerGroupAttributeResponseBodyBackendServersBackendServer extends TeaModel {
        /**
         * <p>The description of the vServer group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port that is used by the backend server.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the ECS instance or ENI.</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of backend server. Valid values:</p>
         * <br>
         * <p>*   **ecs**: an ECS instance</p>
         * <p>*   **eni**: an ENI</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the backend server.</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static SetVServerGroupAttributeResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            SetVServerGroupAttributeResponseBodyBackendServersBackendServer self = new SetVServerGroupAttributeResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public SetVServerGroupAttributeResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SetVServerGroupAttributeResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SetVServerGroupAttributeResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public SetVServerGroupAttributeResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetVServerGroupAttributeResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class SetVServerGroupAttributeResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<SetVServerGroupAttributeResponseBodyBackendServersBackendServer> backendServer;

        public static SetVServerGroupAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            SetVServerGroupAttributeResponseBodyBackendServers self = new SetVServerGroupAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public SetVServerGroupAttributeResponseBodyBackendServers setBackendServer(java.util.List<SetVServerGroupAttributeResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<SetVServerGroupAttributeResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
