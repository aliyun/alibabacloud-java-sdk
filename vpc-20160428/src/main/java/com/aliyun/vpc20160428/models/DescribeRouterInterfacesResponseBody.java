// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouterInterfaceSet")
    public DescribeRouterInterfacesResponseBodyRouterInterfaceSet routerInterfaceSet;

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

    public static class DescribeRouterInterfacesResponseBodyRouterInterfaceSetRouterInterfaceType extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("ConnectedTime")
        public String connectedTime;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CrossBorder")
        public Boolean crossBorder;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("HasReservationData")
        public String hasReservationData;

        @NameInMap("HcRate")
        public Integer hcRate;

        @NameInMap("HcThreshold")
        public Integer hcThreshold;

        @NameInMap("HealthCheckSourceIp")
        public String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        public String healthCheckTargetIp;

        @NameInMap("Ipv6Status")
        public String ipv6Status;

        @NameInMap("Name")
        public String name;

        @NameInMap("OppositeAccessPointId")
        public String oppositeAccessPointId;

        @NameInMap("OppositeBandwidth")
        public Integer oppositeBandwidth;

        @NameInMap("OppositeInterfaceBusinessStatus")
        public String oppositeInterfaceBusinessStatus;

        @NameInMap("OppositeInterfaceId")
        public String oppositeInterfaceId;

        @NameInMap("OppositeInterfaceOwnerId")
        public String oppositeInterfaceOwnerId;

        @NameInMap("OppositeInterfaceSpec")
        public String oppositeInterfaceSpec;

        @NameInMap("OppositeInterfaceStatus")
        public String oppositeInterfaceStatus;

        @NameInMap("OppositeRegionId")
        public String oppositeRegionId;

        @NameInMap("OppositeRouterId")
        public String oppositeRouterId;

        @NameInMap("OppositeRouterType")
        public String oppositeRouterType;

        @NameInMap("OppositeVpcInstanceId")
        public String oppositeVpcInstanceId;

        @NameInMap("ReservationActiveTime")
        public String reservationActiveTime;

        @NameInMap("ReservationBandwidth")
        public String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        public String reservationInternetChargeType;

        @NameInMap("ReservationOrderType")
        public String reservationOrderType;

        @NameInMap("Role")
        public String role;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        @NameInMap("RouterType")
        public String routerType;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

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
