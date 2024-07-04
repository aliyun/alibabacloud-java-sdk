// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkRankingResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetNisNetworkRankingResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>A7F0D6EC-E19E-58AC-AC9F-08036763960F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNisNetworkRankingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkRankingResponseBody self = new GetNisNetworkRankingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkRankingResponseBody setData(java.util.List<GetNisNetworkRankingResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNisNetworkRankingResponseBodyData> getData() {
        return this.data;
    }

    public GetNisNetworkRankingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetNisNetworkRankingResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("ActiveSessionCount")
        public Double activeSessionCount;

        /**
         * <strong>example:</strong>
         * <p>129103</p>
         */
        @NameInMap("Asn")
        public String asn;

        /**
         * <strong>example:</strong>
         * <p>tr-sample*</p>
         */
        @NameInMap("AttachmentId")
        public String attachmentId;

        /**
         * <strong>example:</strong>
         * <p>cbwp-sample*</p>
         */
        @NameInMap("BandwidthPackageId")
        public String bandwidthPackageId;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("ByteCount")
        public Double byteCount;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        /**
         * <strong>example:</strong>
         * <p>2.2.XX.XX</p>
         */
        @NameInMap("DestinationIp")
        public String destinationIp;

        @NameInMap("DestinationIsp")
        public String destinationIsp;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DestinationPort")
        public String destinationPort;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("DestinationRegionNo")
        public String destinationRegionNo;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        @NameInMap("DestinationZone")
        public String destinationZone;

        /**
         * <strong>example:</strong>
         * <p>120.238.XX.XX</p>
         */
        @NameInMap("IP")
        public String IP;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("InBps")
        public Double inBps;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("InPps")
        public Double inPps;

        /**
         * <strong>example:</strong>
         * <p>eip-sample*</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("NewSessionPerSecond")
        public Double newSessionPerSecond;

        /**
         * <strong>example:</strong>
         * <p>88</p>
         */
        @NameInMap("OutBps")
        public Double outBps;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("OutPps")
        public Double outPps;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("PacketCount")
        public Double packetCount;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("Province")
        public String province;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("RTT")
        public Double RTT;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("RetransmitRate")
        public Double retransmitRate;

        /**
         * <strong>example:</strong>
         * <p>42.120.XX.XX</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("SourceIsp")
        public String sourceIsp;

        /**
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-a</p>
         */
        @NameInMap("SourceZone")
        public String sourceZone;

        /**
         * <strong>example:</strong>
         * <p>vbr-sample*</p>
         */
        @NameInMap("VbrId")
        public String vbrId;

        public static GetNisNetworkRankingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNisNetworkRankingResponseBodyData self = new GetNisNetworkRankingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNisNetworkRankingResponseBodyData setActiveSessionCount(Double activeSessionCount) {
            this.activeSessionCount = activeSessionCount;
            return this;
        }
        public Double getActiveSessionCount() {
            return this.activeSessionCount;
        }

        public GetNisNetworkRankingResponseBodyData setAsn(String asn) {
            this.asn = asn;
            return this;
        }
        public String getAsn() {
            return this.asn;
        }

        public GetNisNetworkRankingResponseBodyData setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public GetNisNetworkRankingResponseBodyData setBandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }
        public String getBandwidthPackageId() {
            return this.bandwidthPackageId;
        }

        public GetNisNetworkRankingResponseBodyData setByteCount(Double byteCount) {
            this.byteCount = byteCount;
            return this;
        }
        public Double getByteCount() {
            return this.byteCount;
        }

        public GetNisNetworkRankingResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetNisNetworkRankingResponseBodyData setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetNisNetworkRankingResponseBodyData setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public GetNisNetworkRankingResponseBodyData setDestinationIsp(String destinationIsp) {
            this.destinationIsp = destinationIsp;
            return this;
        }
        public String getDestinationIsp() {
            return this.destinationIsp;
        }

        public GetNisNetworkRankingResponseBodyData setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public GetNisNetworkRankingResponseBodyData setDestinationRegionNo(String destinationRegionNo) {
            this.destinationRegionNo = destinationRegionNo;
            return this;
        }
        public String getDestinationRegionNo() {
            return this.destinationRegionNo;
        }

        public GetNisNetworkRankingResponseBodyData setDestinationZone(String destinationZone) {
            this.destinationZone = destinationZone;
            return this;
        }
        public String getDestinationZone() {
            return this.destinationZone;
        }

        public GetNisNetworkRankingResponseBodyData setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public GetNisNetworkRankingResponseBodyData setInBps(Double inBps) {
            this.inBps = inBps;
            return this;
        }
        public Double getInBps() {
            return this.inBps;
        }

        public GetNisNetworkRankingResponseBodyData setInPps(Double inPps) {
            this.inPps = inPps;
            return this;
        }
        public Double getInPps() {
            return this.inPps;
        }

        public GetNisNetworkRankingResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetNisNetworkRankingResponseBodyData setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public GetNisNetworkRankingResponseBodyData setNewSessionPerSecond(Double newSessionPerSecond) {
            this.newSessionPerSecond = newSessionPerSecond;
            return this;
        }
        public Double getNewSessionPerSecond() {
            return this.newSessionPerSecond;
        }

        public GetNisNetworkRankingResponseBodyData setOutBps(Double outBps) {
            this.outBps = outBps;
            return this;
        }
        public Double getOutBps() {
            return this.outBps;
        }

        public GetNisNetworkRankingResponseBodyData setOutPps(Double outPps) {
            this.outPps = outPps;
            return this;
        }
        public Double getOutPps() {
            return this.outPps;
        }

        public GetNisNetworkRankingResponseBodyData setPacketCount(Double packetCount) {
            this.packetCount = packetCount;
            return this;
        }
        public Double getPacketCount() {
            return this.packetCount;
        }

        public GetNisNetworkRankingResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetNisNetworkRankingResponseBodyData setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public GetNisNetworkRankingResponseBodyData setRTT(Double RTT) {
            this.RTT = RTT;
            return this;
        }
        public Double getRTT() {
            return this.RTT;
        }

        public GetNisNetworkRankingResponseBodyData setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public GetNisNetworkRankingResponseBodyData setRetransmitRate(Double retransmitRate) {
            this.retransmitRate = retransmitRate;
            return this;
        }
        public Double getRetransmitRate() {
            return this.retransmitRate;
        }

        public GetNisNetworkRankingResponseBodyData setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public GetNisNetworkRankingResponseBodyData setSourceIsp(String sourceIsp) {
            this.sourceIsp = sourceIsp;
            return this;
        }
        public String getSourceIsp() {
            return this.sourceIsp;
        }

        public GetNisNetworkRankingResponseBodyData setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public GetNisNetworkRankingResponseBodyData setSourceZone(String sourceZone) {
            this.sourceZone = sourceZone;
            return this;
        }
        public String getSourceZone() {
            return this.sourceZone;
        }

        public GetNisNetworkRankingResponseBodyData setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

    }

}
