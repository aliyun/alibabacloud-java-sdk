// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class ListVpcEndpointZonesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>If this parameter is empty, no next page exists.</p>
     * </li>
     * <li><p>If a value is returned, use the value to retrieve the next page of results.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The collection of zone information.</p>
     */
    @NameInMap("Zones")
    public java.util.List<ListVpcEndpointZonesResponseBodyZones> zones;

    public static ListVpcEndpointZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcEndpointZonesResponseBody self = new ListVpcEndpointZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcEndpointZonesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcEndpointZonesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcEndpointZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcEndpointZonesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListVpcEndpointZonesResponseBody setZones(java.util.List<ListVpcEndpointZonesResponseBodyZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListVpcEndpointZonesResponseBodyZones> getZones() {
        return this.zones;
    }

    public static class ListVpcEndpointZonesResponseBodyZones extends TeaModel {
        /**
         * <p>The ID of the endpoint ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-hp3c8qj1tyct8aqy****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The IP address of the endpoint ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.2.23</p>
         */
        @NameInMap("EniIp")
        public String eniIp;

        /**
         * <p>The ID of the region where the endpoint is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The vSwitch in the zone. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hjkshjvdkdvd****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The domain name of the zone.</p>
         * <p>After an endpoint connection is established, use this domain name to access the service resources of the endpoint service.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp3f033dp24c5yc9****-cn-huhehaote-a.epsrv-hp3itcpowf37m3d5****.cn-huhehaote.privatelink.aliyuncs.com</p>
         */
        @NameInMap("ZoneDomain")
        public String zoneDomain;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote-a</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The IPv6 address of the endpoint ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>2408:4005:3b6:<strong><strong>:6955:c3cb:34c:</strong></strong></p>
         */
        @NameInMap("ZoneIpv6Address")
        public String zoneIpv6Address;

        /**
         * <p>The status of the zone. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The zone is being created.</p>
         * </li>
         * <li><p><strong>Wait</strong>: The zone is waiting to be connected.</p>
         * </li>
         * <li><p><strong>Connected</strong>: The zone is connected.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The zone is being deleted.</p>
         * </li>
         * <li><p><strong>Disconnecting</strong>: The zone is being disconnected.</p>
         * </li>
         * <li><p><strong>Disconnected</strong>: The zone is disconnected.</p>
         * </li>
         * <li><p><strong>Connecting</strong>: The zone is being connected.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Wait</p>
         */
        @NameInMap("ZoneStatus")
        public String zoneStatus;

        public static ListVpcEndpointZonesResponseBodyZones build(java.util.Map<String, ?> map) throws Exception {
            ListVpcEndpointZonesResponseBodyZones self = new ListVpcEndpointZonesResponseBodyZones();
            return TeaModel.build(map, self);
        }

        public ListVpcEndpointZonesResponseBodyZones setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public ListVpcEndpointZonesResponseBodyZones setEniIp(String eniIp) {
            this.eniIp = eniIp;
            return this;
        }
        public String getEniIp() {
            return this.eniIp;
        }

        public ListVpcEndpointZonesResponseBodyZones setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcEndpointZonesResponseBodyZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneDomain(String zoneDomain) {
            this.zoneDomain = zoneDomain;
            return this;
        }
        public String getZoneDomain() {
            return this.zoneDomain;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneIpv6Address(String zoneIpv6Address) {
            this.zoneIpv6Address = zoneIpv6Address;
            return this;
        }
        public String getZoneIpv6Address() {
            return this.zoneIpv6Address;
        }

        public ListVpcEndpointZonesResponseBodyZones setZoneStatus(String zoneStatus) {
            this.zoneStatus = zoneStatus;
            return this;
        }
        public String getZoneStatus() {
            return this.zoneStatus;
        }

    }

}
