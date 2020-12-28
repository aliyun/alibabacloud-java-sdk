// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeMasterSlaveServerGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MasterSlaveServerGroupId")
    public String masterSlaveServerGroupId;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("MasterSlaveServerGroupName")
    public String masterSlaveServerGroupName;

    @NameInMap("MasterSlaveBackendServers")
    public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers> masterSlaveBackendServers;

    public static DescribeMasterSlaveServerGroupAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMasterSlaveServerGroupAttributeResponseBody self = new DescribeMasterSlaveServerGroupAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveServerGroupId(String masterSlaveServerGroupId) {
        this.masterSlaveServerGroupId = masterSlaveServerGroupId;
        return this;
    }
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveServerGroupName(String masterSlaveServerGroupName) {
        this.masterSlaveServerGroupName = masterSlaveServerGroupName;
        return this;
    }
    public String getMasterSlaveServerGroupName() {
        return this.masterSlaveServerGroupName;
    }

    public DescribeMasterSlaveServerGroupAttributeResponseBody setMasterSlaveBackendServers(java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers> masterSlaveBackendServers) {
        this.masterSlaveBackendServers = masterSlaveBackendServers;
        return this;
    }
    public java.util.List<DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers> getMasterSlaveBackendServers() {
        return this.masterSlaveBackendServers;
    }

    public static class DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers extends TeaModel {
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

        public static DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers self = new DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeMasterSlaveServerGroupAttributeResponseBodyMasterSlaveBackendServers setServerType(String serverType) {
            this.serverType = serverType;
            return this;
        }
        public String getServerType() {
            return this.serverType;
        }

    }

}
