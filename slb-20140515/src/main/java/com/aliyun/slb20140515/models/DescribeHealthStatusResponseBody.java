// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public DescribeHealthStatusResponseBodyBackendServers backendServers;

    public static DescribeHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusResponseBody self = new DescribeHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHealthStatusResponseBody setBackendServers(DescribeHealthStatusResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public DescribeHealthStatusResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public static class DescribeHealthStatusResponseBodyBackendServersBackendServer extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("EniHost")
        public String eniHost;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("ServerHealthStatus")
        public String serverHealthStatus;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        @NameInMap("ServerIp")
        public String serverIp;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeHealthStatusResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyBackendServersBackendServer self = new DescribeHealthStatusResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setEniHost(String eniHost) {
            this.eniHost = eniHost;
            return this;
        }
        public String getEniHost() {
            return this.eniHost;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setServerHealthStatus(String serverHealthStatus) {
            this.serverHealthStatus = serverHealthStatus;
            return this;
        }
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class DescribeHealthStatusResponseBodyBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<DescribeHealthStatusResponseBodyBackendServersBackendServer> backendServer;

        public static DescribeHealthStatusResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyBackendServers self = new DescribeHealthStatusResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyBackendServers setBackendServer(java.util.List<DescribeHealthStatusResponseBodyBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeHealthStatusResponseBodyBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

}
