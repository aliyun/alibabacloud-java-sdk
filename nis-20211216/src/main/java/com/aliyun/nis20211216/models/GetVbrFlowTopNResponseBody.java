// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetVbrFlowTopNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VirtualBorderRouterFlowlogTopN")
    public java.util.List<GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN;

    public static GetVbrFlowTopNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVbrFlowTopNResponseBody self = new GetVbrFlowTopNResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVbrFlowTopNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVbrFlowTopNResponseBody setVirtualBorderRouterFlowlogTopN(java.util.List<GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN> virtualBorderRouterFlowlogTopN) {
        this.virtualBorderRouterFlowlogTopN = virtualBorderRouterFlowlogTopN;
        return this;
    }
    public java.util.List<GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN> getVirtualBorderRouterFlowlogTopN() {
        return this.virtualBorderRouterFlowlogTopN;
    }

    public static class GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("AttachmentId")
        public String attachmentId;

        @NameInMap("Bytes")
        public Double bytes;

        @NameInMap("CloudIp")
        public String cloudIp;

        @NameInMap("CloudPort")
        public String cloudPort;

        @NameInMap("CloudRegion")
        public String cloudRegion;

        @NameInMap("OtherIp")
        public String otherIp;

        @NameInMap("OtherPort")
        public String otherPort;

        @NameInMap("Packets")
        public Double packets;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("VirtualBorderRouterId")
        public String virtualBorderRouterId;

        public static GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN build(java.util.Map<String, ?> map) throws Exception {
            GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN self = new GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN();
            return TeaModel.build(map, self);
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setBytes(Double bytes) {
            this.bytes = bytes;
            return this;
        }
        public Double getBytes() {
            return this.bytes;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setCloudIp(String cloudIp) {
            this.cloudIp = cloudIp;
            return this;
        }
        public String getCloudIp() {
            return this.cloudIp;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setCloudPort(String cloudPort) {
            this.cloudPort = cloudPort;
            return this;
        }
        public String getCloudPort() {
            return this.cloudPort;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setCloudRegion(String cloudRegion) {
            this.cloudRegion = cloudRegion;
            return this;
        }
        public String getCloudRegion() {
            return this.cloudRegion;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setOtherIp(String otherIp) {
            this.otherIp = otherIp;
            return this;
        }
        public String getOtherIp() {
            return this.otherIp;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setOtherPort(String otherPort) {
            this.otherPort = otherPort;
            return this;
        }
        public String getOtherPort() {
            return this.otherPort;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setPackets(Double packets) {
            this.packets = packets;
            return this;
        }
        public Double getPackets() {
            return this.packets;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetVbrFlowTopNResponseBodyVirtualBorderRouterFlowlogTopN setVirtualBorderRouterId(String virtualBorderRouterId) {
            this.virtualBorderRouterId = virtualBorderRouterId;
            return this;
        }
        public String getVirtualBorderRouterId() {
            return this.virtualBorderRouterId;
        }

    }

}
