// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Host")
    public GetHostResponseBodyHost host;

    public static GetHostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHostResponseBody self = new GetHostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHostResponseBody setHost(GetHostResponseBodyHost host) {
        this.host = host;
        return this;
    }
    public GetHostResponseBodyHost getHost() {
        return this.host;
    }

    public static class GetHostResponseBodyHostProtocols extends TeaModel {
        @NameInMap("ProtocolName")
        public String protocolName;

        @NameInMap("HostFingerPrint")
        public String hostFingerPrint;

        @NameInMap("Port")
        public Integer port;

        public static GetHostResponseBodyHostProtocols build(java.util.Map<String, ?> map) throws Exception {
            GetHostResponseBodyHostProtocols self = new GetHostResponseBodyHostProtocols();
            return TeaModel.build(map, self);
        }

        public GetHostResponseBodyHostProtocols setProtocolName(String protocolName) {
            this.protocolName = protocolName;
            return this;
        }
        public String getProtocolName() {
            return this.protocolName;
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

    }

    public static class GetHostResponseBodyHost extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        @NameInMap("Protocols")
        public java.util.List<GetHostResponseBodyHostProtocols> protocols;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Source")
        public String source;

        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("SourceInstanceState")
        public String sourceInstanceState;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        public static GetHostResponseBodyHost build(java.util.Map<String, ?> map) throws Exception {
            GetHostResponseBodyHost self = new GetHostResponseBodyHost();
            return TeaModel.build(map, self);
        }

        public GetHostResponseBodyHost setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetHostResponseBodyHost setActiveAddressType(String activeAddressType) {
            this.activeAddressType = activeAddressType;
            return this;
        }
        public String getActiveAddressType() {
            return this.activeAddressType;
        }

        public GetHostResponseBodyHost setHostPublicAddress(String hostPublicAddress) {
            this.hostPublicAddress = hostPublicAddress;
            return this;
        }
        public String getHostPublicAddress() {
            return this.hostPublicAddress;
        }

        public GetHostResponseBodyHost setProtocols(java.util.List<GetHostResponseBodyHostProtocols> protocols) {
            this.protocols = protocols;
            return this;
        }
        public java.util.List<GetHostResponseBodyHostProtocols> getProtocols() {
            return this.protocols;
        }

        public GetHostResponseBodyHost setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetHostResponseBodyHost setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetHostResponseBodyHost setHostPrivateAddress(String hostPrivateAddress) {
            this.hostPrivateAddress = hostPrivateAddress;
            return this;
        }
        public String getHostPrivateAddress() {
            return this.hostPrivateAddress;
        }

        public GetHostResponseBodyHost setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public GetHostResponseBodyHost setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

        public GetHostResponseBodyHost setSourceInstanceState(String sourceInstanceState) {
            this.sourceInstanceState = sourceInstanceState;
            return this;
        }
        public String getSourceInstanceState() {
            return this.sourceInstanceState;
        }

        public GetHostResponseBodyHost setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

    }

}
