// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TransitRouterFlowTopN")
    public java.util.List<GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN> transitRouterFlowTopN;

    public static GetTransitRouterFlowTopNResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTransitRouterFlowTopNResponseBody self = new GetTransitRouterFlowTopNResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTransitRouterFlowTopNResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTransitRouterFlowTopNResponseBody setTransitRouterFlowTopN(java.util.List<GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN> transitRouterFlowTopN) {
        this.transitRouterFlowTopN = transitRouterFlowTopN;
        return this;
    }
    public java.util.List<GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN> getTransitRouterFlowTopN() {
        return this.transitRouterFlowTopN;
    }

    public static class GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("BandwithPackageId")
        public String bandwithPackageId;

        @NameInMap("Bytes")
        public Double bytes;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("OtherIp")
        public String otherIp;

        @NameInMap("OtherPort")
        public String otherPort;

        @NameInMap("OtherRegion")
        public String otherRegion;

        @NameInMap("Packets")
        public Double packets;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ThisIp")
        public String thisIp;

        @NameInMap("ThisPort")
        public String thisPort;

        @NameInMap("ThisRegion")
        public String thisRegion;

        public static GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN build(java.util.Map<String, ?> map) throws Exception {
            GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN self = new GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN();
            return TeaModel.build(map, self);
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setBandwithPackageId(String bandwithPackageId) {
            this.bandwithPackageId = bandwithPackageId;
            return this;
        }
        public String getBandwithPackageId() {
            return this.bandwithPackageId;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setBytes(Double bytes) {
            this.bytes = bytes;
            return this;
        }
        public Double getBytes() {
            return this.bytes;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setOtherIp(String otherIp) {
            this.otherIp = otherIp;
            return this;
        }
        public String getOtherIp() {
            return this.otherIp;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setOtherPort(String otherPort) {
            this.otherPort = otherPort;
            return this;
        }
        public String getOtherPort() {
            return this.otherPort;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setOtherRegion(String otherRegion) {
            this.otherRegion = otherRegion;
            return this;
        }
        public String getOtherRegion() {
            return this.otherRegion;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setPackets(Double packets) {
            this.packets = packets;
            return this;
        }
        public Double getPackets() {
            return this.packets;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setThisIp(String thisIp) {
            this.thisIp = thisIp;
            return this;
        }
        public String getThisIp() {
            return this.thisIp;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setThisPort(String thisPort) {
            this.thisPort = thisPort;
            return this;
        }
        public String getThisPort() {
            return this.thisPort;
        }

        public GetTransitRouterFlowTopNResponseBodyTransitRouterFlowTopN setThisRegion(String thisRegion) {
            this.thisRegion = thisRegion;
            return this;
        }
        public String getThisRegion() {
            return this.thisRegion;
        }

    }

}
