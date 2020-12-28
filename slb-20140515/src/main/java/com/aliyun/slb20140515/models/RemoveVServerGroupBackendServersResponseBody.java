// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class RemoveVServerGroupBackendServersResponseBody extends TeaModel {
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public java.util.List<RemoveVServerGroupBackendServersResponseBodyBackendServers> backendServers;

    public static RemoveVServerGroupBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveVServerGroupBackendServersResponseBody self = new RemoveVServerGroupBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveVServerGroupBackendServersResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public RemoveVServerGroupBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveVServerGroupBackendServersResponseBody setBackendServers(java.util.List<RemoveVServerGroupBackendServersResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<RemoveVServerGroupBackendServersResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class RemoveVServerGroupBackendServersResponseBodyBackendServers extends TeaModel {
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

        public static RemoveVServerGroupBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            RemoveVServerGroupBackendServersResponseBodyBackendServers self = new RemoveVServerGroupBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public RemoveVServerGroupBackendServersResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
