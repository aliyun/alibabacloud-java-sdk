// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupAttributeResponseBody extends TeaModel {
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("MasterSlaveBackendServers")
    public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers masterSlaveBackendServers;

    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMasterSlaveServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupAttributeResponseBody self = new DescribeMasterSlaveServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveBackendServers(DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers masterSlaveBackendServers) {
        this.masterSlaveBackendServers = masterSlaveBackendServers;
        return this;
    }
    public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
        this.masterSlaveServerGroupName = masterSlaveServerGroupName;
        return this;
    }
    public String getMasterSlaveServerGroupName() {
        return this.masterSlaveServerGroupName;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer extends TeaModel {
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

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer self = new DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers extends TeaModel {
        @NameInMap("MasterSlaveBackendServer")
        public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> masterSlaveBackendServer;

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers self = new DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setMasterSlaveBackendServer(java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> masterSlaveBackendServer) {
            this.masterSlaveBackendServer = masterSlaveBackendServer;
            return this;
        }
        public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServersMasterSlaveBackendServer> getMasterSlaveBackendServer() {
            return this.masterSlaveBackendServer;
        }

    }

}
