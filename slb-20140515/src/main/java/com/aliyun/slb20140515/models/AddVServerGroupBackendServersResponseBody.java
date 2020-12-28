// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddVServerGroupBackendServersResponseBody extends TeaModel {
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public java.util.List<AddVServerGroupBackendServersResponseBodyBackendServers> backendServers;

    public static AddVServerGroupBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVServerGroupBackendServersResponseBody self = new AddVServerGroupBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVServerGroupBackendServersResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public AddVServerGroupBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddVServerGroupBackendServersResponseBody setBackendServers(java.util.List<AddVServerGroupBackendServersResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<AddVServerGroupBackendServersResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class AddVServerGroupBackendServersResponseBodyBackendServers extends TeaModel {
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

        public static AddVServerGroupBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            AddVServerGroupBackendServersResponseBodyBackendServers self = new AddVServerGroupBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public AddVServerGroupBackendServersResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public AddVServerGroupBackendServersResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
