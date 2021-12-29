// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupResponseBody extends TeaModel {
    @NameInMap("MasterSlaveBackendServers")
    public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers masterSlaveBackendServers;

    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

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
        @NameInMap("Description")
        public String description;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("ServerType")
        public String serverType;

        @NameInMap("Type")
        public String type;

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
