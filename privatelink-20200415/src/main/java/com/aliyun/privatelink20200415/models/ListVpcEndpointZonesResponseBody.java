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
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next requests are performed.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
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
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the zones.</p>
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
         * <p>The region ID of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-huhehaote</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the vSwitch in the zone. The system automatically creates an endpoint elastic network interface (ENI) in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hjkshjvdkdvd****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The domain name of the zone.</p>
         * <p>After the endpoint in the zone is connected to the endpoint service, you can access the service resources of the endpoint service by using the domain name of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-hp3f033dp24c5yc9****-cn-huhehaote.epsrv-hp3itcpowf37m3d5****.cn-huhehaote-a.privatelink.aliyuncs.com</p>
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
         * <p>Indicates whether the endpoint service supports IPv6. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ZoneIpv6Address")
        public String zoneIpv6Address;

        /**
         * <p>The state of the zone. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The zone is being created.</li>
         * <li><strong>Wait</strong>: The zone is to be connected.</li>
         * <li><strong>Connected</strong>: The zone is connected.</li>
         * <li><strong>Deleting</strong>: The zone is being deleted.</li>
         * <li><strong>Disconnecting</strong>: The zone is being disconnected.</li>
         * <li><strong>Disconnected</strong>: The zone is disconnected.</li>
         * <li><strong>Connecting</strong>: The zone is being connected.</li>
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
