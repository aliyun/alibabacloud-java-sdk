// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetInternetTupleResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetInternetTupleResponseBodyData> data;

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
        @NameInMap("AccessRegion")
        public String accessRegion;

        @NameInMap("BeginTime")
        public String beginTime;

        @NameInMap("ByteCount")
        public Double byteCount;

        @NameInMap("CloudCity")
        public String cloudCity;

        @NameInMap("CloudCountry")
        public String cloudCountry;

        @NameInMap("CloudIp")
        public String cloudIp;

        @NameInMap("CloudIsp")
        public String cloudIsp;

        @NameInMap("CloudPort")
        public String cloudPort;

        @NameInMap("CloudProduct")
        public String cloudProduct;

        @NameInMap("CloudProvince")
        public String cloudProvince;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("InByteCount")
        public Double inByteCount;

        @NameInMap("InOutOrderCount")
        public Double inOutOrderCount;

        @NameInMap("InPacketCount")
        public Double inPacketCount;

        @NameInMap("InRetranCount")
        public Double inRetranCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OtherCity")
        public String otherCity;

        @NameInMap("OtherCountry")
        public String otherCountry;

        @NameInMap("OtherIp")
        public String otherIp;

        @NameInMap("OtherIsp")
        public String otherIsp;

        @NameInMap("OtherPort")
        public String otherPort;

        @NameInMap("OtherProduct")
        public String otherProduct;

        @NameInMap("OtherProvince")
        public String otherProvince;

        @NameInMap("OutByteCount")
        public Double outByteCount;

        @NameInMap("OutOrderCount")
        public Double outOrderCount;

        @NameInMap("OutOutOrderCount")
        public Double outOutOrderCount;

        @NameInMap("OutPacketCount")
        public Double outPacketCount;

        @NameInMap("OutRetranCount")
        public Double outRetranCount;

        @NameInMap("PacketCount")
        public Double packetCount;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("RetranCount")
        public Double retranCount;

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

        public GetInternetTupleResponseBodyData setRetranCount(Double retranCount) {
            this.retranCount = retranCount;
            return this;
        }
        public Double getRetranCount() {
            return this.retranCount;
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
