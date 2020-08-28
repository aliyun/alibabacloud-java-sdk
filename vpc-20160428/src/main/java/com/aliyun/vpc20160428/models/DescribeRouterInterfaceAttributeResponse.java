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

}
