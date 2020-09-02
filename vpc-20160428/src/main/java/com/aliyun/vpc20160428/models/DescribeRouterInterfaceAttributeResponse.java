// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

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

    @NameInMap("GmtModified")
    @Validation(required = true)
    public String gmtModified;

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

    @NameInMap("HealthCheckStatus")
    @Validation(required = true)
    public String healthCheckStatus;

    public static DescribeRouterInterfaceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfaceAttributeResponse self = new DescribeRouterInterfaceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfaceAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouterInterfaceAttributeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRouterInterfaceAttributeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRouterInterfaceAttributeResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRouterInterfaceAttributeResponse setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public DescribeRouterInterfaceAttributeResponse setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeRouterInterfaceAttributeResponse setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeRouterInterfaceAttributeResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRouterInterfaceAttributeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeRouterInterfaceAttributeResponse setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeRouterInterfaceAttributeResponse setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public DescribeRouterInterfaceAttributeResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeRouterInterfaceAttributeResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeRouterInterfaceAttributeResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRouterInterfaceAttributeResponse setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeRouterInterfaceAttributeResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRouterInterfaceAttributeResponse setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeRouterInterfaceAttributeResponse setConnectedTime(String connectedTime) {
        this.connectedTime = connectedTime;
        return this;
    }
    public String getConnectedTime() {
        return this.connectedTime;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
        this.oppositeInterfaceSpec = oppositeInterfaceSpec;
        return this;
    }
    public String getOppositeInterfaceSpec() {
        return this.oppositeInterfaceSpec;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
        this.oppositeInterfaceStatus = oppositeInterfaceStatus;
        return this;
    }
    public String getOppositeInterfaceStatus() {
        return this.oppositeInterfaceStatus;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
        this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
        return this;
    }
    public String getOppositeInterfaceBusinessStatus() {
        return this.oppositeInterfaceBusinessStatus;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public DescribeRouterInterfaceAttributeResponse setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
        return this;
    }
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    public DescribeRouterInterfaceAttributeResponse setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public DescribeRouterInterfaceAttributeResponse setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
        this.oppositeVpcInstanceId = oppositeVpcInstanceId;
        return this;
    }
    public String getOppositeVpcInstanceId() {
        return this.oppositeVpcInstanceId;
    }

    public DescribeRouterInterfaceAttributeResponse setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeRouterInterfaceAttributeResponse setVpcInstanceId(String vpcInstanceId) {
        this.vpcInstanceId = vpcInstanceId;
        return this;
    }
    public String getVpcInstanceId() {
        return this.vpcInstanceId;
    }

    public DescribeRouterInterfaceAttributeResponse setOppositeBandwidth(Integer oppositeBandwidth) {
        this.oppositeBandwidth = oppositeBandwidth;
        return this;
    }
    public Integer getOppositeBandwidth() {
        return this.oppositeBandwidth;
    }

    public DescribeRouterInterfaceAttributeResponse setHasReservationData(String hasReservationData) {
        this.hasReservationData = hasReservationData;
        return this;
    }
    public String getHasReservationData() {
        return this.hasReservationData;
    }

    public DescribeRouterInterfaceAttributeResponse setReservationBandwidth(String reservationBandwidth) {
        this.reservationBandwidth = reservationBandwidth;
        return this;
    }
    public String getReservationBandwidth() {
        return this.reservationBandwidth;
    }

    public DescribeRouterInterfaceAttributeResponse setReservationInternetChargeType(String reservationInternetChargeType) {
        this.reservationInternetChargeType = reservationInternetChargeType;
        return this;
    }
    public String getReservationInternetChargeType() {
        return this.reservationInternetChargeType;
    }

    public DescribeRouterInterfaceAttributeResponse setReservationActiveTime(String reservationActiveTime) {
        this.reservationActiveTime = reservationActiveTime;
        return this;
    }
    public String getReservationActiveTime() {
        return this.reservationActiveTime;
    }

    public DescribeRouterInterfaceAttributeResponse setReservationOrderType(String reservationOrderType) {
        this.reservationOrderType = reservationOrderType;
        return this;
    }
    public String getReservationOrderType() {
        return this.reservationOrderType;
    }

    public DescribeRouterInterfaceAttributeResponse setCrossBorder(Boolean crossBorder) {
        this.crossBorder = crossBorder;
        return this;
    }
    public Boolean getCrossBorder() {
        return this.crossBorder;
    }

    public DescribeRouterInterfaceAttributeResponse setHcThreshold(Integer hcThreshold) {
        this.hcThreshold = hcThreshold;
        return this;
    }
    public Integer getHcThreshold() {
        return this.hcThreshold;
    }

    public DescribeRouterInterfaceAttributeResponse setHcRate(Integer hcRate) {
        this.hcRate = hcRate;
        return this;
    }
    public Integer getHcRate() {
        return this.hcRate;
    }

    public DescribeRouterInterfaceAttributeResponse setHealthCheckStatus(String healthCheckStatus) {
        this.healthCheckStatus = healthCheckStatus;
        return this;
    }
    public String getHealthCheckStatus() {
        return this.healthCheckStatus;
    }

}
