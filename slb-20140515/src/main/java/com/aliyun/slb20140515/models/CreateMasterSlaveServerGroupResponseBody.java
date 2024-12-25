// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupResponseBody extends TeaModel {
    /**
     * <p>The backend servers in the primary/secondary server group.</p>
     */
    @NameInMap("MasterSlaveBackendServers")
    public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers masterSlaveBackendServers;

    /**
     * <p>The ID of the active/standby server group.</p>
     * 
     * <strong>example:</strong>
     * <p>rsp-bp19au4******</p>
     */
    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7CA4DB76-4D32-523B-822E-5C9494613D46</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMasterSlaveServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMasterSlaveServerGroupResponseBody self = new CreateMasterSlaveServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMasterSlaveServerGroupResponseBody setMasterSlaveBackendServers(CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers masterSlaveBackendServers) {
        this.masterSlaveBackendServers = masterSlaveBackendServers;
        return this;
    }
    public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    public CreateMasterSlaveServerGroupResponseBody setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public CreateMasterSlaveServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer extends TeaModel {
        /**
         * <p>The description of the primary/secondary server group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-112</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The port that is used by the backend server.</p>
         * 
         * <strong>example:</strong>
         * <p>82</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The ID of the backend server that you want to add.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1fq61enf4loa5i****</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The type of backend server.</p>
         * <p>Valid values: <strong>Master</strong> and <strong>Slave</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Master</p>
         */
        @NameInMap("ServerType")
        public String serverType;

        /**
         * <p>The type of backend server. Valid values:</p>
         * <ul>
         * <li><strong>ecs</strong>: ECS instance</li>
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

        public static CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer build(java.util.Map<String, ?> map) throws Exception {
            CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer self = new CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer();
            return TeaModel.build(map, self);
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers extends TeaModel {
        @NameInMap("MasterSlaveBackendServer")
        public java.util.List<CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> masterSlaveBackendServer;

        public static CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers build(java.util.Map<String, ?> map) throws Exception {
            CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers self = new CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers();
            return TeaModel.build(map, self);
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setMasterSlaveBackendServer(java.util.List<CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> masterSlaveBackendServer) {
            this.masterSlaveBackendServer = masterSlaveBackendServer;
            return this;
        }
        public java.util.List<CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> getMasterSlaveBackendServer() {
            return this.masterSlaveBackendServer;
        }

    }

}
