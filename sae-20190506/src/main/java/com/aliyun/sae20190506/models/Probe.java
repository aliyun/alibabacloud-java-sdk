// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class Probe extends TeaModel {
    @NameInMap("failureThreshold")
    public Integer failureThreshold;

    @NameInMap("initialDelaySeconds")
    public Integer initialDelaySeconds;

    @NameInMap("periodSeconds")
    public Integer periodSeconds;

    @NameInMap("probeHandler")
    public ProbeProbeHandler probeHandler;

    @NameInMap("timeoutSeconds")
    public Integer timeoutSeconds;

    public static Probe build(java.util.Map<String, ?> map) throws Exception {
        Probe self = new Probe();
        return TeaModel.build(map, self);
    }

    public Probe setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }
    public Integer getFailureThreshold() {
        return this.failureThreshold;
    }

    public Probe setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }
    public Integer getInitialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    public Probe setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }
    public Integer getPeriodSeconds() {
        return this.periodSeconds;
    }

    public Probe setProbeHandler(ProbeProbeHandler probeHandler) {
        this.probeHandler = probeHandler;
        return this;
    }
    public ProbeProbeHandler getProbeHandler() {
        return this.probeHandler;
    }

    public Probe setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static class ProbeProbeHandlerHttpGetHttpHeaders extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static ProbeProbeHandlerHttpGetHttpHeaders build(java.util.Map<String, ?> map) throws Exception {
            ProbeProbeHandlerHttpGetHttpHeaders self = new ProbeProbeHandlerHttpGetHttpHeaders();
            return TeaModel.build(map, self);
        }

        public ProbeProbeHandlerHttpGetHttpHeaders setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ProbeProbeHandlerHttpGetHttpHeaders setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ProbeProbeHandlerHttpGet extends TeaModel {
        @NameInMap("httpHeaders")
        public java.util.List<ProbeProbeHandlerHttpGetHttpHeaders> httpHeaders;

        @NameInMap("path")
        public String path;

        @NameInMap("port")
        public Integer port;

        public static ProbeProbeHandlerHttpGet build(java.util.Map<String, ?> map) throws Exception {
            ProbeProbeHandlerHttpGet self = new ProbeProbeHandlerHttpGet();
            return TeaModel.build(map, self);
        }

        public ProbeProbeHandlerHttpGet setHttpHeaders(java.util.List<ProbeProbeHandlerHttpGetHttpHeaders> httpHeaders) {
            this.httpHeaders = httpHeaders;
            return this;
        }
        public java.util.List<ProbeProbeHandlerHttpGetHttpHeaders> getHttpHeaders() {
            return this.httpHeaders;
        }

        public ProbeProbeHandlerHttpGet setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ProbeProbeHandlerHttpGet setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ProbeProbeHandlerTcpSocket extends TeaModel {
        @NameInMap("port")
        public Integer port;

        public static ProbeProbeHandlerTcpSocket build(java.util.Map<String, ?> map) throws Exception {
            ProbeProbeHandlerTcpSocket self = new ProbeProbeHandlerTcpSocket();
            return TeaModel.build(map, self);
        }

        public ProbeProbeHandlerTcpSocket setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

    }

    public static class ProbeProbeHandler extends TeaModel {
        @NameInMap("httpGet")
        public ProbeProbeHandlerHttpGet httpGet;

        @NameInMap("tcpSocket")
        public ProbeProbeHandlerTcpSocket tcpSocket;

        public static ProbeProbeHandler build(java.util.Map<String, ?> map) throws Exception {
            ProbeProbeHandler self = new ProbeProbeHandler();
            return TeaModel.build(map, self);
        }

        public ProbeProbeHandler setHttpGet(ProbeProbeHandlerHttpGet httpGet) {
            this.httpGet = httpGet;
            return this;
        }
        public ProbeProbeHandlerHttpGet getHttpGet() {
            return this.httpGet;
        }

        public ProbeProbeHandler setTcpSocket(ProbeProbeHandlerTcpSocket tcpSocket) {
            this.tcpSocket = tcpSocket;
            return this;
        }
        public ProbeProbeHandlerTcpSocket getTcpSocket() {
            return this.tcpSocket;
        }

    }

}
