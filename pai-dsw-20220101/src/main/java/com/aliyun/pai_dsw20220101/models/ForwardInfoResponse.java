// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ForwardInfoResponse extends TeaModel {
    @NameInMap("ConnectInfo")
    public ForwardInfoResponseConnectInfo connectInfo;

    /**
     * <strong>example:</strong>
     * <p>dsw-notebook</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <strong>example:</strong>
     * <p>eip-25877c70gddh****</p>
     */
    @NameInMap("EipAllocationId")
    public String eipAllocationId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>ngw-bp1uewa15k4iy5770****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("SSHPublicKey")
    public String SSHPublicKey;

    public static ForwardInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ForwardInfoResponse self = new ForwardInfoResponse();
        return TeaModel.build(map, self);
    }

    public ForwardInfoResponse setConnectInfo(ForwardInfoResponseConnectInfo connectInfo) {
        this.connectInfo = connectInfo;
        return this;
    }
    public ForwardInfoResponseConnectInfo getConnectInfo() {
        return this.connectInfo;
    }

    public ForwardInfoResponse setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public ForwardInfoResponse setEipAllocationId(String eipAllocationId) {
        this.eipAllocationId = eipAllocationId;
        return this;
    }
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    public ForwardInfoResponse setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public ForwardInfoResponse setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ForwardInfoResponse setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public ForwardInfoResponse setSSHPublicKey(String SSHPublicKey) {
        this.SSHPublicKey = SSHPublicKey;
        return this;
    }
    public String getSSHPublicKey() {
        return this.SSHPublicKey;
    }

    public static class ForwardInfoResponseConnectInfoInternet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>47.111.119.114</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public String port;

        public static ForwardInfoResponseConnectInfoInternet build(java.util.Map<String, ?> map) throws Exception {
            ForwardInfoResponseConnectInfoInternet self = new ForwardInfoResponseConnectInfoInternet();
            return TeaModel.build(map, self);
        }

        public ForwardInfoResponseConnectInfoInternet setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ForwardInfoResponseConnectInfoInternet setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ForwardInfoResponseConnectInfoIntranet extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>dsw-notebook-22-urz3u6cnu0uts7ej9r.dsw-5cc6083084818f60.dsw.pai.alibaba.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Port")
        public String port;

        public static ForwardInfoResponseConnectInfoIntranet build(java.util.Map<String, ?> map) throws Exception {
            ForwardInfoResponseConnectInfoIntranet self = new ForwardInfoResponseConnectInfoIntranet();
            return TeaModel.build(map, self);
        }

        public ForwardInfoResponseConnectInfoIntranet setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ForwardInfoResponseConnectInfoIntranet setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

    }

    public static class ForwardInfoResponseConnectInfo extends TeaModel {
        @NameInMap("Internet")
        public ForwardInfoResponseConnectInfoInternet internet;

        @NameInMap("Intranet")
        public ForwardInfoResponseConnectInfoIntranet intranet;

        /**
         * <strong>example:</strong>
         * <p>DNAT and privateZone are both ready.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        @NameInMap("Phase")
        public String phase;

        public static ForwardInfoResponseConnectInfo build(java.util.Map<String, ?> map) throws Exception {
            ForwardInfoResponseConnectInfo self = new ForwardInfoResponseConnectInfo();
            return TeaModel.build(map, self);
        }

        public ForwardInfoResponseConnectInfo setInternet(ForwardInfoResponseConnectInfoInternet internet) {
            this.internet = internet;
            return this;
        }
        public ForwardInfoResponseConnectInfoInternet getInternet() {
            return this.internet;
        }

        public ForwardInfoResponseConnectInfo setIntranet(ForwardInfoResponseConnectInfoIntranet intranet) {
            this.intranet = intranet;
            return this;
        }
        public ForwardInfoResponseConnectInfoIntranet getIntranet() {
            return this.intranet;
        }

        public ForwardInfoResponseConnectInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ForwardInfoResponseConnectInfo setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

    }

}
