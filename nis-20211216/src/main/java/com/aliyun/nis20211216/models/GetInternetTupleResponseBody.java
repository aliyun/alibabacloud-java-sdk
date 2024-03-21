// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleResponseBody extends TeaModel {
    /**
     * <p>The ranking result of Internet traffic data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetInternetTupleResponseBodyData> data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInternetTupleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInternetTupleResponseBody self = new GetInternetTupleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInternetTupleResponseBody setData(java.util.List<GetInternetTupleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetInternetTupleResponseBodyData> getData() {
        return this.data;
    }

    public GetInternetTupleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInternetTupleResponseBodyData extends TeaModel {
        /**
         * <p>The access point of Alibaba Cloud.</p>
         * <br>
         * <p>>  This parameter is valid only if you set **InstanceId** to the instance ID of an Anycast elastic IP address (EIP).</p>
         */
        @NameInMap("AccessRegion")
        public String accessRegion;

        /**
         * <p>The beginning of the time range that you queried. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("BeginTime")
        public String beginTime;

        /**
         * <p>The traffic volume. Unit: bytes.</p>
         */
        @NameInMap("ByteCount")
        public Double byteCount;

        /**
         * <p>The local city.</p>
         */
        @NameInMap("CloudCity")
        public String cloudCity;

        /**
         * <p>The local country or region.</p>
         */
        @NameInMap("CloudCountry")
        public String cloudCountry;

        /**
         * <p>The local IP address.</p>
         */
        @NameInMap("CloudIp")
        public String cloudIp;

        /**
         * <p>The local ISP.</p>
         */
        @NameInMap("CloudIsp")
        public String cloudIsp;

        /**
         * <p>The local port.</p>
         */
        @NameInMap("CloudPort")
        public String cloudPort;

        /**
         * <p>The service code of the instance to which the local IP address belongs.</p>
         */
        @NameInMap("CloudProduct")
        public String cloudProduct;

        /**
         * <p>The local province.</p>
         */
        @NameInMap("CloudProvince")
        public String cloudProvince;

        /**
         * <p>The direction of Internet traffic. Valid values:</p>
         * <br>
         * <p>*   **in**: inbound</p>
         * <p>*   **out**: outbound</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The inbound traffic volume. Unit: bytes.</p>
         */
        @NameInMap("InByteCount")
        public Double inByteCount;

        /**
         * <p>The number of inbound disordered packets.</p>
         */
        @NameInMap("InOutOrderCount")
        public Double inOutOrderCount;

        /**
         * <p>The number of inbound packets.</p>
         */
        @NameInMap("InPacketCount")
        public Double inPacketCount;

        /**
         * <p>The number of inbound repeated packets.</p>
         */
        @NameInMap("InRetranCount")
        public Double inRetranCount;

        /**
         * <p>The ID of the instance to which the local IP address belongs.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The remote city. In most cases, this parameter is empty if you set **OtherCountry** to a country except China.</p>
         */
        @NameInMap("OtherCity")
        public String otherCity;

        /**
         * <p>The remote country or region.</p>
         */
        @NameInMap("OtherCountry")
        public String otherCountry;

        /**
         * <p>The remote IP address.</p>
         */
        @NameInMap("OtherIp")
        public String otherIp;

        /**
         * <p>The remote ISP.</p>
         */
        @NameInMap("OtherIsp")
        public String otherIsp;

        /**
         * <p>The remote port.</p>
         */
        @NameInMap("OtherPort")
        public String otherPort;

        /**
         * <p>The service code of the instance to which the remote IP address belongs. If the IP address is not on the cloud, this parameter is empty.</p>
         */
        @NameInMap("OtherProduct")
        public String otherProduct;

        /**
         * <p>The remote province. In most cases, this parameter is empty if you set **OtherCountry** to a country except China.</p>
         */
        @NameInMap("OtherProvince")
        public String otherProvince;

        /**
         * <p>The outbound traffic volume. Unit: bytes.</p>
         */
        @NameInMap("OutByteCount")
        public Double outByteCount;

        /**
         * <p>The number of disordered packets.</p>
         */
        @NameInMap("OutOrderCount")
        public Double outOrderCount;

        /**
         * <p>The number of outbound disordered packets.</p>
         */
        @NameInMap("OutOutOrderCount")
        public Double outOutOrderCount;

        /**
         * <p>The number of outbound packets.</p>
         */
        @NameInMap("OutPacketCount")
        public Double outPacketCount;

        /**
         * <p>The number of outbound repeated packets.</p>
         */
        @NameInMap("OutRetranCount")
        public Double outRetranCount;

        /**
         * <p>The number of packets.</p>
         */
        @NameInMap("PacketCount")
        public Double packetCount;

        /**
         * <p>The protocol number.</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The retransmission rate of TCP packets.</p>
         */
        @NameInMap("RetransmitRate")
        public Double retransmitRate;

        /**
         * <p>The round-trip time (RTT). Unit: milliseconds.</p>
         */
        @NameInMap("Rtt")
        public Double rtt;

        public static GetInternetTupleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInternetTupleResponseBodyData self = new GetInternetTupleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInternetTupleResponseBodyData setAccessRegion(String accessRegion) {
            this.accessRegion = accessRegion;
            return this;
        }
        public String getAccessRegion() {
            return this.accessRegion;
        }

        public GetInternetTupleResponseBodyData setBeginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public String getBeginTime() {
            return this.beginTime;
        }

        public GetInternetTupleResponseBodyData setByteCount(Double byteCount) {
            this.byteCount = byteCount;
            return this;
        }
        public Double getByteCount() {
            return this.byteCount;
        }

        public GetInternetTupleResponseBodyData setCloudCity(String cloudCity) {
            this.cloudCity = cloudCity;
            return this;
        }
        public String getCloudCity() {
            return this.cloudCity;
        }

        public GetInternetTupleResponseBodyData setCloudCountry(String cloudCountry) {
            this.cloudCountry = cloudCountry;
            return this;
        }
        public String getCloudCountry() {
            return this.cloudCountry;
        }

        public GetInternetTupleResponseBodyData setCloudIp(String cloudIp) {
            this.cloudIp = cloudIp;
            return this;
        }
        public String getCloudIp() {
            return this.cloudIp;
        }

        public GetInternetTupleResponseBodyData setCloudIsp(String cloudIsp) {
            this.cloudIsp = cloudIsp;
            return this;
        }
        public String getCloudIsp() {
            return this.cloudIsp;
        }

        public GetInternetTupleResponseBodyData setCloudPort(String cloudPort) {
            this.cloudPort = cloudPort;
            return this;
        }
        public String getCloudPort() {
            return this.cloudPort;
        }

        public GetInternetTupleResponseBodyData setCloudProduct(String cloudProduct) {
            this.cloudProduct = cloudProduct;
            return this;
        }
        public String getCloudProduct() {
            return this.cloudProduct;
        }

        public GetInternetTupleResponseBodyData setCloudProvince(String cloudProvince) {
            this.cloudProvince = cloudProvince;
            return this;
        }
        public String getCloudProvince() {
            return this.cloudProvince;
        }

        public GetInternetTupleResponseBodyData setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public GetInternetTupleResponseBodyData setInByteCount(Double inByteCount) {
            this.inByteCount = inByteCount;
            return this;
        }
        public Double getInByteCount() {
            return this.inByteCount;
        }

        public GetInternetTupleResponseBodyData setInOutOrderCount(Double inOutOrderCount) {
            this.inOutOrderCount = inOutOrderCount;
            return this;
        }
        public Double getInOutOrderCount() {
            return this.inOutOrderCount;
        }

        public GetInternetTupleResponseBodyData setInPacketCount(Double inPacketCount) {
            this.inPacketCount = inPacketCount;
            return this;
        }
        public Double getInPacketCount() {
            return this.inPacketCount;
        }

        public GetInternetTupleResponseBodyData setInRetranCount(Double inRetranCount) {
            this.inRetranCount = inRetranCount;
            return this;
        }
        public Double getInRetranCount() {
            return this.inRetranCount;
        }

        public GetInternetTupleResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInternetTupleResponseBodyData setOtherCity(String otherCity) {
            this.otherCity = otherCity;
            return this;
        }
        public String getOtherCity() {
            return this.otherCity;
        }

        public GetInternetTupleResponseBodyData setOtherCountry(String otherCountry) {
            this.otherCountry = otherCountry;
            return this;
        }
        public String getOtherCountry() {
            return this.otherCountry;
        }

        public GetInternetTupleResponseBodyData setOtherIp(String otherIp) {
            this.otherIp = otherIp;
            return this;
        }
        public String getOtherIp() {
            return this.otherIp;
        }

        public GetInternetTupleResponseBodyData setOtherIsp(String otherIsp) {
            this.otherIsp = otherIsp;
            return this;
        }
        public String getOtherIsp() {
            return this.otherIsp;
        }

        public GetInternetTupleResponseBodyData setOtherPort(String otherPort) {
            this.otherPort = otherPort;
            return this;
        }
        public String getOtherPort() {
            return this.otherPort;
        }

        public GetInternetTupleResponseBodyData setOtherProduct(String otherProduct) {
            this.otherProduct = otherProduct;
            return this;
        }
        public String getOtherProduct() {
            return this.otherProduct;
        }

        public GetInternetTupleResponseBodyData setOtherProvince(String otherProvince) {
            this.otherProvince = otherProvince;
            return this;
        }
        public String getOtherProvince() {
            return this.otherProvince;
        }

        public GetInternetTupleResponseBodyData setOutByteCount(Double outByteCount) {
            this.outByteCount = outByteCount;
            return this;
        }
        public Double getOutByteCount() {
            return this.outByteCount;
        }

        public GetInternetTupleResponseBodyData setOutOrderCount(Double outOrderCount) {
            this.outOrderCount = outOrderCount;
            return this;
        }
        public Double getOutOrderCount() {
            return this.outOrderCount;
        }

        public GetInternetTupleResponseBodyData setOutOutOrderCount(Double outOutOrderCount) {
            this.outOutOrderCount = outOutOrderCount;
            return this;
        }
        public Double getOutOutOrderCount() {
            return this.outOutOrderCount;
        }

        public GetInternetTupleResponseBodyData setOutPacketCount(Double outPacketCount) {
            this.outPacketCount = outPacketCount;
            return this;
        }
        public Double getOutPacketCount() {
            return this.outPacketCount;
        }

        public GetInternetTupleResponseBodyData setOutRetranCount(Double outRetranCount) {
            this.outRetranCount = outRetranCount;
            return this;
        }
        public Double getOutRetranCount() {
            return this.outRetranCount;
        }

        public GetInternetTupleResponseBodyData setPacketCount(Double packetCount) {
            this.packetCount = packetCount;
            return this;
        }
        public Double getPacketCount() {
            return this.packetCount;
        }

        public GetInternetTupleResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetInternetTupleResponseBodyData setRetransmitRate(Double retransmitRate) {
            this.retransmitRate = retransmitRate;
            return this;
        }
        public Double getRetransmitRate() {
            return this.retransmitRate;
        }

        public GetInternetTupleResponseBodyData setRtt(Double rtt) {
            this.rtt = rtt;
            return this;
        }
        public Double getRtt() {
            return this.rtt;
        }

    }

}
