// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeResponseBody extends TeaModel {
    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    @NameInMap("OppositeInterfaceStatus")
    public String oppositeInterfaceStatus;

    @NameInMap("Description")
    public String description;

    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    @NameInMap("Message")
    public String message;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("RouterId")
    public String routerId;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Name")
    public String name;

    @NameInMap("ReservationOrderType")
    public String reservationOrderType;

    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OppositeBandwidth")
    public Integer oppositeBandwidth;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("ConnectedTime")
    public String connectedTime;

    @NameInMap("ReservationActiveTime")
    public String reservationActiveTime;

    @NameInMap("HcThreshold")
    public Integer hcThreshold;

    @NameInMap("ReservationBandwidth")
    public String reservationBandwidth;

    @NameInMap("Status")
    public String status;

    @NameInMap("OppositeInterfaceOwnerId")
    public String oppositeInterfaceOwnerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OppositeRegionId")
    public String oppositeRegionId;

    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    @NameInMap("HasReservationData")
    public String hasReservationData;

    @NameInMap("CrossBorder")
    public Boolean crossBorder;

    @NameInMap("HcRate")
    public Integer hcRate;

    @NameInMap("Code")
    public String code;

    @NameInMap("ReservationInternetChargeType")
    public String reservationInternetChargeType;

    @NameInMap("OppositeInterfaceSpec")
    public String oppositeInterfaceSpec;

    @NameInMap("Role")
    public String role;

    @NameInMap("OppositeVpcInstanceId")
    public String oppositeVpcInstanceId;

    @NameInMap("RouterType")
    public String routerType;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("CreationTime")
    public String creationTime;

    @NameInMap("AccessPointId")
    public String accessPointId;

    @NameInMap("VpcInstanceId")
    public String vpcInstanceId;

    @NameInMap("OppositeInterfaceBusinessStatus")
    public String oppositeInterfaceBusinessStatus;

    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("HealthCheckStatus")
    public String healthCheckStatus;

    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    public static DescribeRouterInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfaceAttributeResponseBody self = new DescribeRouterInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
        this.oppositeInterfaceStatus = oppositeInterfaceStatus;
        return this;
    }
    public String getOppositeInterfaceStatus() {
        return this.oppositeInterfaceStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRouterInterfaceAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRouterInterfaceAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationOrderType(String reservationOrderType) {
        this.reservationOrderType = reservationOrderType;
        return this;
    }
    public String getReservationOrderType() {
        return this.reservationOrderType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeBandwidth(Integer oppositeBandwidth) {
        this.oppositeBandwidth = oppositeBandwidth;
        return this;
    }
    public Integer getOppositeBandwidth() {
        return this.oppositeBandwidth;
    }

    public DescribeRouterInterfaceAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeRouterInterfaceAttributeResponseBody setConnectedTime(String connectedTime) {
        this.connectedTime = connectedTime;
        return this;
    }
    public String getConnectedTime() {
        return this.connectedTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationActiveTime(String reservationActiveTime) {
        this.reservationActiveTime = reservationActiveTime;
        return this;
    }
    public String getReservationActiveTime() {
        return this.reservationActiveTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHcThreshold(Integer hcThreshold) {
        this.hcThreshold = hcThreshold;
        return this;
    }
    public Integer getHcThreshold() {
        return this.hcThreshold;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationBandwidth(String reservationBandwidth) {
        this.reservationBandwidth = reservationBandwidth;
        return this;
    }
    public String getReservationBandwidth() {
        return this.reservationBandwidth;
    }

    public DescribeRouterInterfaceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHasReservationData(String hasReservationData) {
        this.hasReservationData = hasReservationData;
        return this;
    }
    public String getHasReservationData() {
        return this.hasReservationData;
    }

    public DescribeRouterInterfaceAttributeResponseBody setCrossBorder(Boolean crossBorder) {
        this.crossBorder = crossBorder;
        return this;
    }
    public Boolean getCrossBorder() {
        return this.crossBorder;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHcRate(Integer hcRate) {
        this.hcRate = hcRate;
        return this;
    }
    public Integer getHcRate() {
        return this.hcRate;
    }

    public DescribeRouterInterfaceAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationInternetChargeType(String reservationInternetChargeType) {
        this.reservationInternetChargeType = reservationInternetChargeType;
        return this;
    }
    public String getReservationInternetChargeType() {
        return this.reservationInternetChargeType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
        this.oppositeInterfaceSpec = oppositeInterfaceSpec;
        return this;
    }
    public String getOppositeInterfaceSpec() {
        return this.oppositeInterfaceSpec;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
        this.oppositeVpcInstanceId = oppositeVpcInstanceId;
        return this;
    }
    public String getOppositeVpcInstanceId() {
        return this.oppositeVpcInstanceId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setVpcInstanceId(String vpcInstanceId) {
        this.vpcInstanceId = vpcInstanceId;
        return this;
    }
    public String getVpcInstanceId() {
        return this.vpcInstanceId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
        this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
        return this;
    }
    public String getOppositeInterfaceBusinessStatus() {
        return this.oppositeInterfaceBusinessStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
        return this;
    }
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHealthCheckStatus(String healthCheckStatus) {
        this.healthCheckStatus = healthCheckStatus;
        return this;
    }
    public String getHealthCheckStatus() {
        return this.healthCheckStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
