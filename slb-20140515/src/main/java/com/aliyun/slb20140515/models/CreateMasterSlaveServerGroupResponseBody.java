// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateMasterSlaveServerGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("MasterSlaveBackendServers")
    public java.util.List<CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers> masterSlaveBackendServers;

    public static CreateMasterSlaveServerGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMasterSlaveServerGroupResponseBody self = new CreateMasterSlaveServerGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMasterSlaveServerGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMasterSlaveServerGroupResponseBody setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public CreateMasterSlaveServerGroupResponseBody setMasterSlaveBackendServers(java.util.List<CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers> masterSlaveBackendServers) {
        this.masterSlaveBackendServers = masterSlaveBackendServers;
        return this;
    }
    public java.util.List<CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers> getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    public static class CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers extends TeaModel {
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

        @NameInMap("ServerType")
        public String serverType;

        public static CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers build(java.util.Map<String, ?> map) throws Exception {
            CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers self = new CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers();
            return TeaModel.build(map, self);
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public CreateMasterSlaveServerGroupResponseBodyMasterSlaveBackendServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

    }

}
