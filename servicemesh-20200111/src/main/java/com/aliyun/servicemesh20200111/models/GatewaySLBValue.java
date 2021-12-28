// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GatewaySLBValue extends TeaModel {
    @NameInMap("SLBAddress")
    public String SLBAddress;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("BackendServers")
    public GatewaySLBValueBackendServers backendServers;

    @NameInMap("SLBHealthCheckState")
    public String SLBHealthCheckState;

    public static GatewaySLBValue build(java.util.Map<String, ?> map) throws Exception {
        GatewaySLBValue self = new GatewaySLBValue();
        return TeaModel.build(map, self);
    }

    public GatewaySLBValue setSLBAddress(String SLBAddress) {
        this.SLBAddress = SLBAddress;
        return this;
    }
    public String getSLBAddress() {
        return this.SLBAddress;
    }

    public GatewaySLBValue setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public GatewaySLBValue setBackendServers(GatewaySLBValueBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public GatewaySLBValueBackendServers getBackendServers() {
        return this.backendServers;
    }

    public GatewaySLBValue setSLBHealthCheckState(String SLBHealthCheckState) {
        this.SLBHealthCheckState = SLBHealthCheckState;
        return this;
    }
    public String getSLBHealthCheckState() {
        return this.SLBHealthCheckState;
    }

    public static class GatewaySLBValueBackendServers extends TeaModel {
        @NameInMap("Port")
        public Long port;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("ServerHealthStatus")
        public String serverHealthStatus;

        @NameInMap("ServerId")
        public String serverId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("ListenerPort")
        public Long listenerPort;

        @NameInMap("Weight")
        public String weight;

        @NameInMap("Description")
        public String description;

        @NameInMap("EniHost")
        public String eniHost;

        @NameInMap("Type")
        public String type;

        public static GatewaySLBValueBackendServers build(java.util.Map<String, ?> map) throws Exception {
            GatewaySLBValueBackendServers self = new GatewaySLBValueBackendServers();
            return TeaModel.build(map, self);
        }

        public GatewaySLBValueBackendServers setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GatewaySLBValueBackendServers setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GatewaySLBValueBackendServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public GatewaySLBValueBackendServers setServerHealthStatus(String serverHealthStatus) {
            this.serverHealthStatus = serverHealthStatus;
            return this;
        }
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

        public GatewaySLBValueBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public GatewaySLBValueBackendServers setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GatewaySLBValueBackendServers setListenerPort(Long listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public GatewaySLBValueBackendServers setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

        public GatewaySLBValueBackendServers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GatewaySLBValueBackendServers setEniHost(String eniHost) {
            this.eniHost = eniHost;
            return this;
        }
        public String getEniHost() {
            return this.eniHost;
        }

        public GatewaySLBValueBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
