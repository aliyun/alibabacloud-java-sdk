// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetHostResponseBody extends TeaModel {
    @NameInMap("Host")
    public GetHostResponseBodyHost host;

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
        @NameInMap("HostFingerPrint")
        public String hostFingerPrint;

        @NameInMap("Port")
        public Integer port;

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
        @NameInMap("ActiveAddressType")
        public String activeAddressType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("HostId")
        public String hostId;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("HostPrivateAddress")
        public String hostPrivateAddress;

        @NameInMap("HostPublicAddress")
        public String hostPublicAddress;

        @NameInMap("OSType")
        public String OSType;

        @NameInMap("Protocols")
        public java.util.List<GetHostResponseBodyHostProtocols> protocols;

        @NameInMap("Source")
        public String source;

        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

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
