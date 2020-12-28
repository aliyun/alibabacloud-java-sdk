// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeHealthStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackendServers")
    public java.util.List<DescribeHealthStatusResponseBodyBackendServers> backendServers;

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

    public DescribeHealthStatusResponseBody setBackendServers(java.util.List<DescribeHealthStatusResponseBodyBackendServers> backendServers) {
        this.backendServers = backendServers;
        return this;
    }
    public java.util.List<DescribeHealthStatusResponseBodyBackendServers> getBackendServers() {
        return this.backendServers;
    }

    public static class DescribeHealthStatusResponseBodyBackendServers extends TeaModel {
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

        public static DescribeHealthStatusResponseBodyBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeHealthStatusResponseBodyBackendServers self = new DescribeHealthStatusResponseBodyBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeHealthStatusResponseBodyBackendServers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeHealthStatusResponseBodyBackendServers setEniHost(String eniHost) {
            this.eniHost = eniHost;
            return this;
        }
        public String getEniHost() {
            return this.eniHost;
        }

        public DescribeHealthStatusResponseBodyBackendServers setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeHealthStatusResponseBodyBackendServers setServerHealthStatus(String serverHealthStatus) {
            this.serverHealthStatus = serverHealthStatus;
            return this;
        }
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

        public DescribeHealthStatusResponseBodyBackendServers setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeHealthStatusResponseBodyBackendServers setServerIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }
        public String getServerIp() {
            return this.serverIp;
        }

        public DescribeHealthStatusResponseBodyBackendServers setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeHealthStatusResponseBodyBackendServers setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

}
