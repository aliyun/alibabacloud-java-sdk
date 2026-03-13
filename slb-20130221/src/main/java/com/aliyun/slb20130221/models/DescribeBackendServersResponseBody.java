// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20130221.models;

import com.aliyun.tea.*;

public class DescribeBackendServersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public DescribeBackendServersResponseBodyListeners listeners;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackendServersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendServersResponseBody self = new DescribeBackendServersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackendServersResponseBody setListeners(DescribeBackendServersResponseBodyListeners listeners) {
        this.listeners = listeners;
        return this;
    }
    public DescribeBackendServersResponseBodyListeners getListeners() {
        return this.listeners;
    }

    public DescribeBackendServersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer extends TeaModel {
        @NameInMap("ServerHealthStatus")
        public String serverHealthStatus;

        @NameInMap("ServerId")
        public String serverId;

        public static DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer self = new DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer();
            return TeaModel.build(map, self);
        }

        public DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer setServerHealthStatus(String serverHealthStatus) {
            this.serverHealthStatus = serverHealthStatus;
            return this;
        }
        public String getServerHealthStatus() {
            return this.serverHealthStatus;
        }

        public DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer setServerId(String serverId) {
            this.serverId = serverId;
            return this;
        }
        public String getServerId() {
            return this.serverId;
        }

    }

    public static class DescribeBackendServersResponseBodyListenersListenerBackendServers extends TeaModel {
        @NameInMap("BackendServer")
        public java.util.List<DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer> backendServer;

        public static DescribeBackendServersResponseBodyListenersListenerBackendServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendServersResponseBodyListenersListenerBackendServers self = new DescribeBackendServersResponseBodyListenersListenerBackendServers();
            return TeaModel.build(map, self);
        }

        public DescribeBackendServersResponseBodyListenersListenerBackendServers setBackendServer(java.util.List<DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer> backendServer) {
            this.backendServer = backendServer;
            return this;
        }
        public java.util.List<DescribeBackendServersResponseBodyListenersListenerBackendServersBackendServer> getBackendServer() {
            return this.backendServer;
        }

    }

    public static class DescribeBackendServersResponseBodyListenersListener extends TeaModel {
        @NameInMap("BackendServers")
        public DescribeBackendServersResponseBodyListenersListenerBackendServers backendServers;

        @NameInMap("ListenerPort")
        public Integer listenerPort;

        public static DescribeBackendServersResponseBodyListenersListener build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendServersResponseBodyListenersListener self = new DescribeBackendServersResponseBodyListenersListener();
            return TeaModel.build(map, self);
        }

        public DescribeBackendServersResponseBodyListenersListener setBackendServers(DescribeBackendServersResponseBodyListenersListenerBackendServers backendServers) {
            this.backendServers = backendServers;
            return this;
        }
        public DescribeBackendServersResponseBodyListenersListenerBackendServers getBackendServers() {
            return this.backendServers;
        }

        public DescribeBackendServersResponseBodyListenersListener setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

    }

    public static class DescribeBackendServersResponseBodyListeners extends TeaModel {
        @NameInMap("Listener")
        public java.util.List<DescribeBackendServersResponseBodyListenersListener> listener;

        public static DescribeBackendServersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackendServersResponseBodyListeners self = new DescribeBackendServersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public DescribeBackendServersResponseBodyListeners setListener(java.util.List<DescribeBackendServersResponseBodyListenersListener> listener) {
            this.listener = listener;
            return this;
        }
        public java.util.List<DescribeBackendServersResponseBodyListenersListener> getListener() {
            return this.listener;
        }

    }

}
