// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyVServerGroupBackendServersResponseBody extends TeaModel {
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public java.util.List<ModifyVServerGroupBackendServersResponseBodyBackendServers> backendServers;

    public static ModifyVServerGroupBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyVServerGroupBackendServersResponseBody self = new ModifyVServerGroupBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyVServerGroupBackendServersResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public ModifyVServerGroupBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyVServerGroupBackendServersResponseBody setBackendServers(java.util.List<ModifyVServerGroupBackendServersResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<ModifyVServerGroupBackendServersResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class ModifyVServerGroupBackendServersResponseBodyBackendServers extends TeaModel {
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

        public static ModifyVServerGroupBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            ModifyVServerGroupBackendServersResponseBodyBackendServers self = new ModifyVServerGroupBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ModifyVServerGroupBackendServersResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
