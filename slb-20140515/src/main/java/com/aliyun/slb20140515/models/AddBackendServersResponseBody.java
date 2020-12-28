// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class AddBackendServersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public java.util.List<AddBackendServersResponseBodyBackendServers> backendServers;

    public static AddBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddBackendServersResponseBody self = new AddBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddBackendServersResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public AddBackendServersResponseBody setBackendServers(java.util.List<AddBackendServersResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<AddBackendServersResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class AddBackendServersResponseBodyBackendServers extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("ServerId")
        public String serverId;

        public static AddBackendServersResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            AddBackendServersResponseBodyBackendServers self = new AddBackendServersResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public AddBackendServersResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddBackendServersResponseBodyBackendServers setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

        public AddBackendServersResponseBodyBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddBackendServersResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
