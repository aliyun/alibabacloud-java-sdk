// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddVServerGroupBackendServersResponseBody extends TeaModel {
    /**
     * <p>The backend servers.</p>
     */
    @NameInMap("BackendServers")
    public AddVServerGroupBackendServersResponseBodyBackendServers backendServers;

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
     * <p>rsp-cige6j******</p>
     */
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    public static AddVServerGroupBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVServerGroupBackendServersResponseBody self = new AddVServerGroupBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVServerGroupBackendServersResponseBody setBackendServers(AddVServerGroupBackendServersResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public AddVServerGroupBackendServersResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public AddVServerGroupBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddVServerGroupBackendServersResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public static class AddVServerGroupBackendServersResponseBodyBackendServersBackendServer extends TeaModel {
        /**
         * <p>The description of the vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>backend server</p>
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
         * <p>eni-hhshhs****</p>
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

        public static AddVServerGroupBackendServersResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            AddVServerGroupBackendServersResponseBodyBackendServersBackendServer self = new AddVServerGroupBackendServersResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public AddVServerGroupBackendServersResponseBodyBackendServersBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServersBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class AddVServerGroupBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<AddVServerGroupBackendServersResponseBodyBackendServersBackendServer> backendServer;

        public static AddVServerGroupBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            AddVServerGroupBackendServersResponseBodyBackendServers self = new AddVServerGroupBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public AddVServerGroupBackendServersResponseBodyBackendServers setBackendServer(java.util.List<AddVServerGroupBackendServersResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<AddVServerGroupBackendServersResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
