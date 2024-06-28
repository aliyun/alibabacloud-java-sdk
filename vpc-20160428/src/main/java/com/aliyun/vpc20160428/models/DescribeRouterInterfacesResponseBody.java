// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7F6FCBD-F9CC-4501-8EF3-CDC9577CAE45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the router interface.</p>
     */
    @NameInMap("RouterInterfaceSet")
    public DescribeRouterInterfacesResponseBodyRouterInterfaceSet routerInterfaceSet;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRouterInterfacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesResponseBody self = new DescribeRouterInterfacesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouterInterfacesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouterInterfacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouterInterfacesResponseBody setRouterInterfaceSet(DescribeRouterInterfacesResponseBodyRouterInterfaceSet routerInterfaceSet) {
        this.routerInterfaceSet = routerInterfaceSet;
        return this;
    }
    public DescribeRouterInterfacesResponseBodyRouterInterfaceSet getRouterInterfaceSet() {
        return this.routerInterfaceSet;
    }

    public DescribeRouterInterfacesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags extends TeaModel {
        /**
         * <p>The key of the resource tag. At least one tag key must be entered, and a maximum of 20 tag keys are supported. If this value needs to be passed in, it cannot be an empty string.</p>
         * <p>A tag key can support up to 128 characters, cannot start with \&quot;aliyun\&quot; or \&quot;acs:\&quot;, and cannot contain \&quot;http://\&quot; or \&quot;https://\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the resource tag. A maximum of 20 tag values can be entered. If this value needs to be passed in, an empty string can be entered.</p>
         * <p>A maximum of 128 characters are supported, it cannot start with \&quot;aliyun\&quot; or \&quot;acs:\&quot;, and it cannot contain \&quot;http://\&quot; or \&quot;https://\&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags self = new DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags> tags;

        public static DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags self = new DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags setTags(java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTagsTags> getTags() {
            return this.tags;
        }

    }

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType extends TeaModel {
        /**
         * <p>The ID of the access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-shanghaiSZ-****</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>The bandwidth of the router interface. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The service status of the router interface. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>FinancialLocked</strong></li>
         * <li><strong>SecurityLocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PayByTraffic</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the connection was established.</p>
         * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("ConnectedTime")
        public String connectedTime;

        /**
         * <p>The time when the route table was created.</p>
         * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the connection is a cross-border connection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CrossBorder")
        public Boolean crossBorder;

        /**
         * <p>The description of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the router interface.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The end of the time range during which data was queried.</p>
         * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-08T12:20:55</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>Indicates whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FastLinkMode")
        public Boolean fastLinkMode;

        /**
         * <p>Indicates whether renewal data is included.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasReservationData")
        public String hasReservationData;

        /**
         * <p>The rate of heath checks.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HcRate")
        public Integer hcRate;

        /**
         * <p>The health check threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HcThreshold")
        public Integer hcThreshold;

        /**
         * <p>The source IP address that is used for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("HealthCheckSourceIp")
        public String healthCheckSourceIp;

        /**
         * <p>The destination IP address that is used for the health check.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

        /**
         * <p>Indicates whether protection against malicious IPv6 traffic is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * <li><strong>unsupport</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Ipv6Status")
        public String ipv6Status;

        /**
         * <p>The custom name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the peer access point.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-shanghaiSZ-****</p>
         */
        @NameInMap("OppositeAccessPointId")
        public String oppositeAccessPointId;

        /**
         * <p>The maximum bandwidth of the peer router interface. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("OppositeBandwidth")
        public Integer oppositeBandwidth;

        /**
         * <p>The service status of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OppositeInterfaceBusinessStatus")
        public String oppositeInterfaceBusinessStatus;

        /**
         * <p>The ID of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-bp1itx13bwe6f2wfh****</p>
         */
        @NameInMap("OppositeInterfaceId")
        public String oppositeInterfaceId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>271598332402530847</p>
         */
        @NameInMap("OppositeInterfaceOwnerId")
        public String oppositeInterfaceOwnerId;

        /**
         * <p>The specification of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>Large</p>
         */
        @NameInMap("OppositeInterfaceSpec")
        public String oppositeInterfaceSpec;

        /**
         * <p>The status of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("OppositeInterfaceStatus")
        public String oppositeInterfaceStatus;

        /**
         * <p>The region ID of the peer router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        /**
         * <p>The ID of the router to which the peer router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1d3bxtdv68tfd7g****</p>
         */
        @NameInMap("OppositeRouterId")
        public String oppositeRouterId;

        /**
         * <p>The type of the router to which the peer router interface belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>VRouter</p>
         */
        @NameInMap("OppositeRouterType")
        public String oppositeRouterType;

        /**
         * <p>The ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1qpo0kug3a20qqe****</p>
         */
        @NameInMap("OppositeVpcInstanceId")
        public String oppositeVpcInstanceId;

        /**
         * <p>The time when the renewal takes effect.</p>
         * <p>The time follows the ISO8601 standard in the <code>YYYY-MM-DDThh:mmZ</code> format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-11T16:00:00Z</p>
         */
        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        /**
         * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        /**
         * <p>The metering method that is used after the renewal takes effect. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        /**
         * <p>The type of the renewal order. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>RENEWCHANGE</p>
         */
        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        /**
         * <p>Resource Group ID.</p>
         * <p>For more information about resource groups, please refer to <a href="https://help.aliyun.com/document_detail/94475.html">What is a Resource Group?</a></p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Indicates whether the router interface is the initiator or acceptor of the peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>InitiatingSide</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The ID of the router to which the route entry belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-bp1d3bxtdv68tfd7g****</p>
         */
        @NameInMap("RouterId")
        public String routerId;

        /**
         * <p>The ID of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>ri-2zenfgfpyu3v93koa****</p>
         */
        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        /**
         * <p>The type of the router to which the route table belongs. Valid values:</p>
         * <ul>
         * <li><strong>VRouter</strong></li>
         * <li><strong>VBR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VRouter</p>
         */
        @NameInMap("RouterType")
        public String routerType;

        /**
         * <p>The specification of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>Large</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the router interface.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the resource.</p>
         */
        @NameInMap("Tags")
        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags tags;

        /**
         * <p>The ID of the local virtual private cloud (VPC) in the peering connection.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze3tq4uxhysg717x****</p>
         */
        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType self = new DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setConnectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }
        public String getConnectedTime() {
            return this.connectedTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setCrossBorder(Boolean crossBorder) {
            this.crossBorder = crossBorder;
            return this;
        }
        public Boolean getCrossBorder() {
            return this.crossBorder;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setFastLinkMode(Boolean fastLinkMode) {
            this.fastLinkMode = fastLinkMode;
            return this;
        }
        public Boolean getFastLinkMode() {
            return this.fastLinkMode;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHcRate(Integer hcRate) {
            this.hcRate = hcRate;
            return this;
        }
        public Integer getHcRate() {
            return this.hcRate;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHcThreshold(Integer hcThreshold) {
            this.hcThreshold = hcThreshold;
            return this;
        }
        public Integer getHcThreshold() {
            return this.hcThreshold;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHealthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setIpv6Status(String ipv6Status) {
            this.ipv6Status = ipv6Status;
            return this;
        }
        public String getIpv6Status() {
            return this.ipv6Status;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeAccessPointId(String oppositeAccessPointId) {
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }
        public String getOppositeAccessPointId() {
            return this.oppositeAccessPointId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeBandwidth(Integer oppositeBandwidth) {
            this.oppositeBandwidth = oppositeBandwidth;
            return this;
        }
        public Integer getOppositeBandwidth() {
            return this.oppositeBandwidth;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
            this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
            return this;
        }
        public String getOppositeInterfaceBusinessStatus() {
            return this.oppositeInterfaceBusinessStatus;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceId(String oppositeInterfaceId) {
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }
        public String getOppositeInterfaceId() {
            return this.oppositeInterfaceId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }
        public String getOppositeInterfaceOwnerId() {
            return this.oppositeInterfaceOwnerId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
            this.oppositeInterfaceSpec = oppositeInterfaceSpec;
            return this;
        }
        public String getOppositeInterfaceSpec() {
            return this.oppositeInterfaceSpec;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
            this.oppositeInterfaceStatus = oppositeInterfaceStatus;
            return this;
        }
        public String getOppositeInterfaceStatus() {
            return this.oppositeInterfaceStatus;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeRouterId(String oppositeRouterId) {
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }
        public String getOppositeRouterId() {
            return this.oppositeRouterId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeRouterType(String oppositeRouterType) {
            this.oppositeRouterType = oppositeRouterType;
            return this;
        }
        public String getOppositeRouterType() {
            return this.oppositeRouterType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
            this.oppositeVpcInstanceId = oppositeVpcInstanceId;
            return this;
        }
        public String getOppositeVpcInstanceId() {
            return this.oppositeVpcInstanceId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRouterInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setTags(DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceTypeTags getTags() {
            return this.tags;
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSet extends TeaModel {
        @NameInMap("RouterInterfaceType")
        public java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType> routerInterfaceType;

        public static DescribeRouterInterfacesResponseBodyRouterInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseBodyRouterInterfaceSet self = new DescribeRouterInterfacesResponseBodyRouterInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseBodyRouterInterfaceSet setRouterInterfaceType(java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType> routerInterfaceType) {
            this.routerInterfaceType = routerInterfaceType;
            return this;
        }
        public java.util.List<DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType> getRouterInterfaceType() {
            return this.routerInterfaceType;
        }

    }

}
