// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("RouterInterfaceSet")
    @Validation(required = true)
    public DescribeRouterInterfacesResponseRouterInterfaceSet routerInterfaceSet;

    public static DescribeRouterInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfacesResponse self = new DescribeRouterInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfacesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouterInterfacesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRouterInterfacesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRouterInterfacesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRouterInterfacesResponse setRouterInterfaceSet(DescribeRouterInterfacesResponseRouterInterfaceSet routerInterfaceSet) {
        this.routerInterfaceSet = routerInterfaceSet;
        return this;
    }
    public DescribeRouterInterfacesResponseRouterInterfaceSet getRouterInterfaceSet() {
        return this.routerInterfaceSet;
    }

    public static class DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType extends TeaModel {
        @NameInMap("RouterInterfaceId")
        @Validation(required = true)
        public String routerInterfaceId;

        @NameInMap("OppositeRegionId")
        @Validation(required = true)
        public String oppositeRegionId;

        @NameInMap("Role")
        @Validation(required = true)
        public String role;

        @NameInMap("Spec")
        @Validation(required = true)
        public String spec;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

        @NameInMap("RouterType")
        @Validation(required = true)
        public String routerType;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("ChargeType")
        @Validation(required = true)
        public String chargeType;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("BusinessStatus")
        @Validation(required = true)
        public String businessStatus;

        @NameInMap("ConnectedTime")
        @Validation(required = true)
        public String connectedTime;

        @NameInMap("OppositeInterfaceId")
        @Validation(required = true)
        public String oppositeInterfaceId;

        @NameInMap("OppositeInterfaceSpec")
        @Validation(required = true)
        public String oppositeInterfaceSpec;

        @NameInMap("OppositeInterfaceStatus")
        @Validation(required = true)
        public String oppositeInterfaceStatus;

        @NameInMap("OppositeInterfaceBusinessStatus")
        @Validation(required = true)
        public String oppositeInterfaceBusinessStatus;

        @NameInMap("OppositeRouterId")
        @Validation(required = true)
        public String oppositeRouterId;

        @NameInMap("OppositeRouterType")
        @Validation(required = true)
        public String oppositeRouterType;

        @NameInMap("OppositeInterfaceOwnerId")
        @Validation(required = true)
        public String oppositeInterfaceOwnerId;

        @NameInMap("AccessPointId")
        @Validation(required = true)
        public String accessPointId;

        @NameInMap("OppositeAccessPointId")
        @Validation(required = true)
        public String oppositeAccessPointId;

        @NameInMap("HealthCheckSourceIp")
        @Validation(required = true)
        public String healthCheckSourceIp;

        @NameInMap("HealthCheckTargetIp")
        @Validation(required = true)
        public String healthCheckTargetIp;

        @NameInMap("OppositeVpcInstanceId")
        @Validation(required = true)
        public String oppositeVpcInstanceId;

        @NameInMap("Bandwidth")
        @Validation(required = true)
        public Integer bandwidth;

        @NameInMap("VpcInstanceId")
        @Validation(required = true)
        public String vpcInstanceId;

        @NameInMap("OppositeBandwidth")
        @Validation(required = true)
        public Integer oppositeBandwidth;

        @NameInMap("HasReservationData")
        @Validation(required = true)
        public String hasReservationData;

        @NameInMap("ReservationBandwidth")
        @Validation(required = true)
        public String reservationBandwidth;

        @NameInMap("ReservationInternetChargeType")
        @Validation(required = true)
        public String reservationInternetChargeType;

        @NameInMap("ReservationActiveTime")
        @Validation(required = true)
        public String reservationActiveTime;

        @NameInMap("ReservationOrderType")
        @Validation(required = true)
        public String reservationOrderType;

        @NameInMap("CrossBorder")
        @Validation(required = true)
        public Boolean crossBorder;

        @NameInMap("HcThreshold")
        @Validation(required = true)
        public Integer hcThreshold;

        @NameInMap("HcRate")
        @Validation(required = true)
        public Integer hcRate;

        public static DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType self = new DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setRouterInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeRegionId(String oppositeRegionId) {
            this.oppositeRegionId = oppositeRegionId;
            return this;
        }
        public String getOppositeRegionId() {
            return this.oppositeRegionId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setRouterType(String routerType) {
            this.routerType = routerType;
            return this;
        }
        public String getRouterType() {
            return this.routerType;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setConnectedTime(String connectedTime) {
            this.connectedTime = connectedTime;
            return this;
        }
        public String getConnectedTime() {
            return this.connectedTime;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeInterfaceId(String oppositeInterfaceId) {
            this.oppositeInterfaceId = oppositeInterfaceId;
            return this;
        }
        public String getOppositeInterfaceId() {
            return this.oppositeInterfaceId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
            this.oppositeInterfaceSpec = oppositeInterfaceSpec;
            return this;
        }
        public String getOppositeInterfaceSpec() {
            return this.oppositeInterfaceSpec;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
            this.oppositeInterfaceStatus = oppositeInterfaceStatus;
            return this;
        }
        public String getOppositeInterfaceStatus() {
            return this.oppositeInterfaceStatus;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
            this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
            return this;
        }
        public String getOppositeInterfaceBusinessStatus() {
            return this.oppositeInterfaceBusinessStatus;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeRouterId(String oppositeRouterId) {
            this.oppositeRouterId = oppositeRouterId;
            return this;
        }
        public String getOppositeRouterId() {
            return this.oppositeRouterId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeRouterType(String oppositeRouterType) {
            this.oppositeRouterType = oppositeRouterType;
            return this;
        }
        public String getOppositeRouterType() {
            return this.oppositeRouterType;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
            this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
            return this;
        }
        public String getOppositeInterfaceOwnerId() {
            return this.oppositeInterfaceOwnerId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeAccessPointId(String oppositeAccessPointId) {
            this.oppositeAccessPointId = oppositeAccessPointId;
            return this;
        }
        public String getOppositeAccessPointId() {
            return this.oppositeAccessPointId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setHealthCheckSourceIp(String healthCheckSourceIp) {
            this.healthCheckSourceIp = healthCheckSourceIp;
            return this;
        }
        public String getHealthCheckSourceIp() {
            return this.healthCheckSourceIp;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setHealthCheckTargetIp(String healthCheckTargetIp) {
            this.healthCheckTargetIp = healthCheckTargetIp;
            return this;
        }
        public String getHealthCheckTargetIp() {
            return this.healthCheckTargetIp;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
            this.oppositeVpcInstanceId = oppositeVpcInstanceId;
            return this;
        }
        public String getOppositeVpcInstanceId() {
            return this.oppositeVpcInstanceId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setOppositeBandwidth(Integer oppositeBandwidth) {
            this.oppositeBandwidth = oppositeBandwidth;
            return this;
        }
        public Integer getOppositeBandwidth() {
            return this.oppositeBandwidth;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setHasReservationData(String hasReservationData) {
            this.hasReservationData = hasReservationData;
            return this;
        }
        public String getHasReservationData() {
            return this.hasReservationData;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setReservationBandwidth(String reservationBandwidth) {
            this.reservationBandwidth = reservationBandwidth;
            return this;
        }
        public String getReservationBandwidth() {
            return this.reservationBandwidth;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setReservationInternetChargeType(String reservationInternetChargeType) {
            this.reservationInternetChargeType = reservationInternetChargeType;
            return this;
        }
        public String getReservationInternetChargeType() {
            return this.reservationInternetChargeType;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setReservationActiveTime(String reservationActiveTime) {
            this.reservationActiveTime = reservationActiveTime;
            return this;
        }
        public String getReservationActiveTime() {
            return this.reservationActiveTime;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setReservationOrderType(String reservationOrderType) {
            this.reservationOrderType = reservationOrderType;
            return this;
        }
        public String getReservationOrderType() {
            return this.reservationOrderType;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setCrossBorder(Boolean crossBorder) {
            this.crossBorder = crossBorder;
            return this;
        }
        public Boolean getCrossBorder() {
            return this.crossBorder;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setHcThreshold(Integer hcThreshold) {
            this.hcThreshold = hcThreshold;
            return this;
        }
        public Integer getHcThreshold() {
            return this.hcThreshold;
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType setHcRate(Integer hcRate) {
            this.hcRate = hcRate;
            return this;
        }
        public Integer getHcRate() {
            return this.hcRate;
        }

    }

    public static class DescribeRouterInterfacesResponseRouterInterfaceSet extends TeaModel {
        @NameInMap("RouterInterfaceType")
        @Validation(required = true)
        public java.util.List<DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType> routerInterfaceType;

        public static DescribeRouterInterfacesResponseRouterInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfacesResponseRouterInterfaceSet self = new DescribeRouterInterfacesResponseRouterInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfacesResponseRouterInterfaceSet setRouterInterfaceType(java.util.List<DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType> routerInterfaceType) {
            this.routerInterfaceType = routerInterfaceType;
            return this;
        }
        public java.util.List<DescribeRouterInterfacesResponseRouterInterfaceSetRouterInterfaceType> getRouterInterfaceType() {
            return this.routerInterfaceType;
        }

    }

}
