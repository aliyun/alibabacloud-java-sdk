// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class DescribeNisTrafficRankingResponseBody extends TeaModel {
    @NameInMap("FlowRankingList")
    public java.util.List<DescribeNisTrafficRankingResponseBodyFlowRankingList> flowRankingList;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>task-7619ecb1db9148bab9f4</p>
     */
    @NameInMap("NisTrafficRankingId")
    public String nisTrafficRankingId;

    /**
     * <strong>example:</strong>
     * <p>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>Complete</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>72</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNisTrafficRankingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNisTrafficRankingResponseBody self = new DescribeNisTrafficRankingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNisTrafficRankingResponseBody setFlowRankingList(java.util.List<DescribeNisTrafficRankingResponseBodyFlowRankingList> flowRankingList) {
        this.flowRankingList = flowRankingList;
        return this;
    }
    public java.util.List<DescribeNisTrafficRankingResponseBodyFlowRankingList> getFlowRankingList() {
        return this.flowRankingList;
    }

    public DescribeNisTrafficRankingResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeNisTrafficRankingResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeNisTrafficRankingResponseBody setNisTrafficRankingId(String nisTrafficRankingId) {
        this.nisTrafficRankingId = nisTrafficRankingId;
        return this;
    }
    public String getNisTrafficRankingId() {
        return this.nisTrafficRankingId;
    }

    public DescribeNisTrafficRankingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNisTrafficRankingResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeNisTrafficRankingResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNisTrafficRankingResponseBodyFlowRankingList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ngw-ufwerthgvc*****</p>
         */
        @NameInMap("BindingResourceId")
        public String bindingResourceId;

        /**
         * <strong>example:</strong>
         * <p>EIP_NAT</p>
         */
        @NameInMap("BindingResourceType")
        public String bindingResourceType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bytes")
        public Double bytes;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("BytesRate")
        public Double bytesRate;

        /**
         * <strong>example:</strong>
         * <p>45102</p>
         */
        @NameInMap("ClientAsn")
        public String clientAsn;

        @NameInMap("ClientCity")
        public String clientCity;

        @NameInMap("ClientCountry")
        public String clientCountry;

        @NameInMap("ClientIsp")
        public String clientIsp;

        @NameInMap("ClientProvince")
        public String clientProvince;

        /**
         * <strong>example:</strong>
         * <p>192.168.***.0</p>
         */
        @NameInMap("DestinationIp")
        public String destinationIp;

        /**
         * <strong>example:</strong>
         * <p>23</p>
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
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dscp")
        public String dscp;

        /**
         * <strong>example:</strong>
         * <p>i-uf6i1zi6yhq7h***</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        /**
         * <strong>example:</strong>
         * <p>eip-fb6wzjl9hm****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>eni-8vbf2jxul***</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Packets")
        public Double packets;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("PacketsLostBlackhole")
        public Double packetsLostBlackhole;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PacketsLostNoRoute")
        public Double packetsLostNoRoute;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("PacketsLostTTLExpired")
        public Double packetsLostTTLExpired;

        /**
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>118.31.***.86</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RoundTripTime")
        public Double roundTripTime;

        /**
         * <strong>example:</strong>
         * <p>47.92.245.***</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <strong>example:</strong>
         * <p>5432</p>
         */
        @NameInMap("SourcePort")
        public String sourcePort;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("SourceRegionNo")
        public String sourceRegionNo;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("TrafficPath")
        public String trafficPath;

        /**
         * <strong>example:</strong>
         * <p>tr-attach-bfde1cd4cj***</p>
         */
        @NameInMap("TransitRouterAttachmentId")
        public String transitRouterAttachmentId;

        /**
         * <strong>example:</strong>
         * <p>1906814138****</p>
         */
        @NameInMap("TransitRouterDestinationAccountId")
        public String transitRouterDestinationAccountId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("TransitRouterDestinationAvailableZone")
        public String transitRouterDestinationAvailableZone;

        /**
         * <strong>example:</strong>
         * <p>eni-fdbf2jxulm***</p>
         */
        @NameInMap("TransitRouterDestinationNetworkInterface")
        public String transitRouterDestinationNetworkInterface;

        /**
         * <strong>example:</strong>
         * <p>tr-attach-bfve1cd4cjp****</p>
         */
        @NameInMap("TransitRouterDestinationResourceId")
        public String transitRouterDestinationResourceId;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zeekevlhxpqxu****</p>
         */
        @NameInMap("TransitRouterDestinationVSwitchId")
        public String transitRouterDestinationVSwitchId;

        /**
         * <strong>example:</strong>
         * <p>tr-2zefvwy2fz3444***</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <strong>example:</strong>
         * <p>tr-attach-okvj1cd4cjp***</p>
         */
        @NameInMap("TransitRouterPairAttachmentId")
        public String transitRouterPairAttachmentId;

        /**
         * <strong>example:</strong>
         * <p>1906814138***</p>
         */
        @NameInMap("TransitRouterSourceAccountId")
        public String transitRouterSourceAccountId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
         */
        @NameInMap("TransitRouterSourceAvailableZone")
        public String transitRouterSourceAvailableZone;

        /**
         * <strong>example:</strong>
         * <p>eni-8vbf2jxulma***</p>
         */
        @NameInMap("TransitRouterSourceNetworkInterface")
        public String transitRouterSourceNetworkInterface;

        /**
         * <strong>example:</strong>
         * <p>tr-attach-hvve1cd4cjpj***</p>
         */
        @NameInMap("TransitRouterSourceResourceId")
        public String transitRouterSourceResourceId;

        /**
         * <strong>example:</strong>
         * <p>vsw-ikfdkevlhxpqxuz****</p>
         */
        @NameInMap("TransitRouterSourceVSwitchId")
        public String transitRouterSourceVSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zeekevlh****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>vpc-m5ec6i0h5xss***</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeNisTrafficRankingResponseBodyFlowRankingList build(java.util.Map<String, ?> map) throws Exception {
            DescribeNisTrafficRankingResponseBodyFlowRankingList self = new DescribeNisTrafficRankingResponseBodyFlowRankingList();
            return TeaModel.build(map, self);
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setBindingResourceId(String bindingResourceId) {
            this.bindingResourceId = bindingResourceId;
            return this;
        }
        public String getBindingResourceId() {
            return this.bindingResourceId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setBindingResourceType(String bindingResourceType) {
            this.bindingResourceType = bindingResourceType;
            return this;
        }
        public String getBindingResourceType() {
            return this.bindingResourceType;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setBytes(Double bytes) {
            this.bytes = bytes;
            return this;
        }
        public Double getBytes() {
            return this.bytes;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setBytesRate(Double bytesRate) {
            this.bytesRate = bytesRate;
            return this;
        }
        public Double getBytesRate() {
            return this.bytesRate;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setClientAsn(String clientAsn) {
            this.clientAsn = clientAsn;
            return this;
        }
        public String getClientAsn() {
            return this.clientAsn;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setClientCity(String clientCity) {
            this.clientCity = clientCity;
            return this;
        }
        public String getClientCity() {
            return this.clientCity;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setClientCountry(String clientCountry) {
            this.clientCountry = clientCountry;
            return this;
        }
        public String getClientCountry() {
            return this.clientCountry;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setClientIsp(String clientIsp) {
            this.clientIsp = clientIsp;
            return this;
        }
        public String getClientIsp() {
            return this.clientIsp;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setClientProvince(String clientProvince) {
            this.clientProvince = clientProvince;
            return this;
        }
        public String getClientProvince() {
            return this.clientProvince;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setDestinationIp(String destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public String getDestinationIp() {
            return this.destinationIp;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setDestinationRegionNo(String destinationRegionNo) {
            this.destinationRegionNo = destinationRegionNo;
            return this;
        }
        public String getDestinationRegionNo() {
            return this.destinationRegionNo;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setDscp(String dscp) {
            this.dscp = dscp;
            return this;
        }
        public String getDscp() {
            return this.dscp;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setPackets(Double packets) {
            this.packets = packets;
            return this;
        }
        public Double getPackets() {
            return this.packets;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setPacketsLostBlackhole(Double packetsLostBlackhole) {
            this.packetsLostBlackhole = packetsLostBlackhole;
            return this;
        }
        public Double getPacketsLostBlackhole() {
            return this.packetsLostBlackhole;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setPacketsLostNoRoute(Double packetsLostNoRoute) {
            this.packetsLostNoRoute = packetsLostNoRoute;
            return this;
        }
        public Double getPacketsLostNoRoute() {
            return this.packetsLostNoRoute;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setPacketsLostTTLExpired(Double packetsLostTTLExpired) {
            this.packetsLostTTLExpired = packetsLostTTLExpired;
            return this;
        }
        public Double getPacketsLostTTLExpired() {
            return this.packetsLostTTLExpired;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setRoundTripTime(Double roundTripTime) {
            this.roundTripTime = roundTripTime;
            return this;
        }
        public Double getRoundTripTime() {
            return this.roundTripTime;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setSourcePort(String sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public String getSourcePort() {
            return this.sourcePort;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setSourceRegionNo(String sourceRegionNo) {
            this.sourceRegionNo = sourceRegionNo;
            return this;
        }
        public String getSourceRegionNo() {
            return this.sourceRegionNo;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTrafficPath(String trafficPath) {
            this.trafficPath = trafficPath;
            return this;
        }
        public String getTrafficPath() {
            return this.trafficPath;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterAttachmentId(String transitRouterAttachmentId) {
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }
        public String getTransitRouterAttachmentId() {
            return this.transitRouterAttachmentId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterDestinationAccountId(String transitRouterDestinationAccountId) {
            this.transitRouterDestinationAccountId = transitRouterDestinationAccountId;
            return this;
        }
        public String getTransitRouterDestinationAccountId() {
            return this.transitRouterDestinationAccountId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterDestinationAvailableZone(String transitRouterDestinationAvailableZone) {
            this.transitRouterDestinationAvailableZone = transitRouterDestinationAvailableZone;
            return this;
        }
        public String getTransitRouterDestinationAvailableZone() {
            return this.transitRouterDestinationAvailableZone;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterDestinationNetworkInterface(String transitRouterDestinationNetworkInterface) {
            this.transitRouterDestinationNetworkInterface = transitRouterDestinationNetworkInterface;
            return this;
        }
        public String getTransitRouterDestinationNetworkInterface() {
            return this.transitRouterDestinationNetworkInterface;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterDestinationResourceId(String transitRouterDestinationResourceId) {
            this.transitRouterDestinationResourceId = transitRouterDestinationResourceId;
            return this;
        }
        public String getTransitRouterDestinationResourceId() {
            return this.transitRouterDestinationResourceId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterDestinationVSwitchId(String transitRouterDestinationVSwitchId) {
            this.transitRouterDestinationVSwitchId = transitRouterDestinationVSwitchId;
            return this;
        }
        public String getTransitRouterDestinationVSwitchId() {
            return this.transitRouterDestinationVSwitchId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterPairAttachmentId(String transitRouterPairAttachmentId) {
            this.transitRouterPairAttachmentId = transitRouterPairAttachmentId;
            return this;
        }
        public String getTransitRouterPairAttachmentId() {
            return this.transitRouterPairAttachmentId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterSourceAccountId(String transitRouterSourceAccountId) {
            this.transitRouterSourceAccountId = transitRouterSourceAccountId;
            return this;
        }
        public String getTransitRouterSourceAccountId() {
            return this.transitRouterSourceAccountId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterSourceAvailableZone(String transitRouterSourceAvailableZone) {
            this.transitRouterSourceAvailableZone = transitRouterSourceAvailableZone;
            return this;
        }
        public String getTransitRouterSourceAvailableZone() {
            return this.transitRouterSourceAvailableZone;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterSourceNetworkInterface(String transitRouterSourceNetworkInterface) {
            this.transitRouterSourceNetworkInterface = transitRouterSourceNetworkInterface;
            return this;
        }
        public String getTransitRouterSourceNetworkInterface() {
            return this.transitRouterSourceNetworkInterface;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterSourceResourceId(String transitRouterSourceResourceId) {
            this.transitRouterSourceResourceId = transitRouterSourceResourceId;
            return this;
        }
        public String getTransitRouterSourceResourceId() {
            return this.transitRouterSourceResourceId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setTransitRouterSourceVSwitchId(String transitRouterSourceVSwitchId) {
            this.transitRouterSourceVSwitchId = transitRouterSourceVSwitchId;
            return this;
        }
        public String getTransitRouterSourceVSwitchId() {
            return this.transitRouterSourceVSwitchId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNisTrafficRankingResponseBodyFlowRankingList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
