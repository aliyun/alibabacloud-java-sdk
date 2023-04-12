// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponseBody extends TeaModel {
    /**
     * <p>The list of backend servers.</p>
     */
    @NameInMap("BackendServers")
    public DescribeHealthStatusResponseBodyBackendServers backendServers;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHealthStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHealthStatusResponseBody self = new DescribeHealthStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHealthStatusResponseBody setBackendServers(DescribeHealthStatusResponseBodyBackendServers backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public DescribeHealthStatusResponseBodyBackendServers getBackendServers() {
        return this.backendServers;
    }

    public DescribeHealthStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHealthStatusResponseBodyBackendServersBackendServer extends TeaModel {
        /**
         * <p>The frontend port that is used by the CLB instance.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The backend port that is used by the CLB instance.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The frontend protocol that is used by the CLB instance.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The health status of the backend server. Valid values:</p>
         * <br>
         * <p>*   **normal**: The backend server is healthy.</p>
         * <p>*   **abnormal**: The backend server is unhealthy.</p>
         * <p>*   **unavailable**: The health check is not complete.</p>
         */
        @NameInMap("ServerHealthStatus")
        public String serverHealthStatus;

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance or elastic network interface (ENI).</p>
         */
        @NameInMap("ServerId")
        public String serverId;

        /**
         * <p>The IP address of the ECS instance.</p>
         */
        @NameInMap("ServerIp")
        public String serverIp;

        public static DescribeHealthStatusResponseBodyBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyBackendServersBackendServer self = new DescribeHealthStatusResponseBodyBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
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

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

        public DescribeHealthStatusResponseBodyBackendServersBackendServer setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
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
