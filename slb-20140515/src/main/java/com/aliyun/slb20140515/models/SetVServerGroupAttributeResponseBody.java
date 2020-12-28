// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetVServerGroupAttributeResponseBody extends TeaModel {
    @NameInMap("VServerGroupId")
    public String VServerGroupId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VServerGroupName")
    public String VServerGroupName;

    @NameInMap("BackendServers")
    public java.util.List<SetVServerGroupAttributeResponseBodyBackendServers> backendServers;

    public static SetVServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVServerGroupAttributeResponseBody self = new SetVServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVServerGroupAttributeResponseBody setVServerGroupId(String VServerGroupId) {
        this.VServerGroupId = VServerGroupId;
        return this;
    }
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    public SetVServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetVServerGroupAttributeResponseBody setVServerGroupName(String VServerGroupName) {
        this.VServerGroupName = VServerGroupName;
        return this;
    }
    public String getVServerGroupName() {
        return this.VServerGroupName;
    }

    public SetVServerGroupAttributeResponseBody setBackendServers(java.util.List<SetVServerGroupAttributeResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<SetVServerGroupAttributeResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class SetVServerGroupAttributeResponseBodyBackendServers extends TeaModel {
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

        public static SetVServerGroupAttributeResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            SetVServerGroupAttributeResponseBodyBackendServers self = new SetVServerGroupAttributeResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public SetVServerGroupAttributeResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SetVServerGroupAttributeResponseBodyBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public SetVServerGroupAttributeResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SetVServerGroupAttributeResponseBodyBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SetVServerGroupAttributeResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
