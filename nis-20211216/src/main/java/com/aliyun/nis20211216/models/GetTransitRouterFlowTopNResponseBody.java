// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D5E98683-355B-5867-8D3D-A24755F6895B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ranking result of inter-region traffic data.</p>
     */
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
        /**
         * <p>The account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>118639953821xxxx</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The ID of the CEN bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>cenbwp-ia8kw1zjv4hyal****</p>
         */
        @NameInMap("BandwithPackageId")
        public String bandwithPackageId;

        /**
         * <p>The total volume of traffic in the specified time range.</p>
         * 
         * <strong>example:</strong>
         * <p>188</p>
         */
        @NameInMap("Bytes")
        public Double bytes;

        /**
         * <p>The CEN instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-ia8kw1zjv4hyal****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The end of the time range that you queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-31T06:40:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The remote IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>47.216.XX.XX</p>
         */
        @NameInMap("OtherIp")
        public String otherIp;

        /**
         * <p>The remote port.</p>
         * 
         * <strong>example:</strong>
         * <p>53470</p>
         */
        @NameInMap("OtherPort")
        public String otherPort;

        /**
         * <p>The remote region where the <strong>remote IP address</strong> resides.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        @NameInMap("OtherRegion")
        public String otherRegion;

        /**
         * <p>The total number of packets in the specified time range.</p>
         * 
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("Packets")
        public Double packets;

        /**
         * <p>The protocol number.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The beginning of the time range that you queried. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-31T05:40:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The local IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.8.XX.XX</p>
         */
        @NameInMap("ThisIp")
        public String thisIp;

        /**
         * <p>The local port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ThisPort")
        public String thisPort;

        /**
         * <p>The local region where the <strong>local IP address</strong> resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
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
