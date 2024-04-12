// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostResponseBody extends TeaModel {
    /**
     * <p>The information about the host that was queried.</p>
     */
    @NameInMap("Host")
    public GetHostResponseBodyHost host;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostResponseBody self = new GetHostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostResponseBody setHost(GetHostResponseBodyHost host) {
        this.host = host;
        return this;
    }
    public GetHostResponseBodyHost getHost() {
        return this.host;
    }

    public GetHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetHostResponseBodyHostProtocols extends TeaModel {
        /**
         * <p>The fingerprint of the host. This parameter uniquely identifies a host.</p>
         */
        @NameInMap("HostFingerPrint")
        public String hostFingerPrint;

        /**
         * <p>The service port of the host.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The protocol that is used to connect to the host. Valid values:</p>
         * <br>
         * <p>*   **SSH**</p>
         * <p>*   **RDP**</p>
         */
        @NameInMap("ProtocolName")
        public String protocolName;

        public static GetHostResponseBodyHostProtocols build(java.util.Map<String, ?> map) throws Exception {
            GetHostResponseBodyHostProtocols self = new GetHostResponseBodyHostProtocols();
            return TeaModel.build(map, self);
        }

        public GetHostResponseBodyHostProtocols setHostFingerPrint(String hostFingerPrint) {
            this.hostFingerPrint = hostFingerPrint;
            return this;
        }
        public String getHostFingerPrint() {
            return this.hostFingerPrint;
        }

        public GetHostResponseBodyHostProtocols setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetHostResponseBodyHostProtocols setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
        }

    }

    public static class GetHostResponseBodyHost extends TeaModel {
        /**
         * <p>The address type of the host. Valid values:</p>
         * <br>
         * <p>*   **Public**: a public address</p>
         * <p>*   **Private**: a private address</p>
         */
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        /**
         * <p>The description of the host.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The ID of the host.</p>
         */
        @NameInMap("HostId")
        public String hostId;

        /**
         * <p>The hostname.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The internal endpoint of the host. The value is a domain name or an IP address.</p>
         */
        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        /**
         * <p>The public address of the host. The value is a domain name or an IP address.</p>
         */
        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        /**
         * <p>The ID of the new network domain to which the host belongs.</p>
         */
        @NameInMap("NetworkDomainId")
        public String networkDomainId;

        /**
         * <p>The operating system of the host. Valid values:</p>
         * <br>
         * <p>*   **Linux**</p>
         * <p>*   **Windows**</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The protocol information about the host.</p>
         */
        @NameInMap("Protocols")
        public java.util.List<GetHostResponseBodyHostProtocols> protocols;

        /**
         * <p>The source of the host. Valid values:</p>
         * <br>
         * <p>*   **Local**: a host in a data center</p>
         * <p>*   **Ecs**: an Elastic Compute Service (ECS) instance</p>
         * <p>*   **Rds**: a host in an ApsaraDB MyBase dedicated cluster</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The ID of the ECS instance or the host in an ApsaraDB MyBase dedicated cluster.</p>
         * <br>
         * <p>>  If **Local** is returned for the **Source** parameter, no value is returned for this parameter.</p>
         */
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        /**
         * <p>The status of the host. Valid values:</p>
         * <br>
         * <p>*   **Normal**: normal</p>
         * <p>*   **Release**: released</p>
         */
        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        public static GetHostResponseBodyHost build(java.util.Map<String, ?> map) throws Exception {
            GetHostResponseBodyHost self = new GetHostResponseBodyHost();
            return TeaModel.build(map, self);
        }

        public GetHostResponseBodyHost setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public GetHostResponseBodyHost setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetHostResponseBodyHost setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public GetHostResponseBodyHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetHostResponseBodyHost setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public GetHostResponseBodyHost setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public GetHostResponseBodyHost setNetworkDomainId(String networkDomainId) {
            this.networkDomainId = networkDomainId;
            return this;
        }
        public String getNetworkDomainId() {
            return this.networkDomainId;
        }

        public GetHostResponseBodyHost setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public GetHostResponseBodyHost setProtocols(java.util.List<GetHostResponseBodyHostProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<GetHostResponseBodyHostProtocols> getProtocols() {
            return this.protocols;
        }

        public GetHostResponseBodyHost setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetHostResponseBodyHost setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public GetHostResponseBodyHost setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

    }

}
