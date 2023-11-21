// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the access point.</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The bandwidth of the router interface. Unit: Mbit/s.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The status of the router interface. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **FinancialLocked**</p>
     * <p>*   **SecurityLocked**</p>
     */
    @NameInMap("BusinessStatus")
    public String businessStatus;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **AfterPay**: pay-as-you-go</p>
     * <p>*   **PrePaid**: subscription</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the connection was established.</p>
     */
    @NameInMap("ConnectedTime")
    public String connectedTime;

    /**
     * <p>The time when the router interface was created.</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>Indicates whether the connection is a cross-border connection. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("CrossBorder")
    public Boolean crossBorder;

    /**
     * <p>The description of the router interface.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end of the time range during which data was queried.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Indicates whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only when **RouterType** is set to **VBR** and **OppositeRouterType** is set to **VRouter**.</p>
     * <br>
     * <p>*   When **FastLinkMode** is set to **true**, **Role** must be set to **InitiatingSide**. **AccessPointId**, **OppositeRouterType**, **OpppsiteRouterId**, and **OppositeInterfaceOwnerId** are required.</p>
     */
    @NameInMap("FastLinkMode")
    public String fastLinkMode;

    /**
     * <p>The time when the router interface was modified.</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>Indicates whether renewal data is included. Valid values:</p>
     * <br>
     * <p>*   **false**</p>
     * <p>*   **true**</p>
     */
    @NameInMap("HasReservationData")
    public String hasReservationData;

    /**
     * <p>The rate of health checks. Unit: seconds. The value indicates the interval at which probe packets are sent during a health check.</p>
     */
    @NameInMap("HcRate")
    public Integer hcRate;

    /**
     * <p>The healthy threshold. This value indicates the number of probe packets that are sent during a health check. Unit: packets.</p>
     */
    @NameInMap("HcThreshold")
    public Integer hcThreshold;

    /**
     * <p>The source IP address that is used for the health check.</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The status of the health check. Valid values:</p>
     * <br>
     * <p>*   **Abnormal**</p>
     * <p>*   **Normal**</p>
     * <p>*   **NoRedundantRoute**</p>
     * <p>*   **NoHealthCheckConfig**</p>
     */
    @NameInMap("HealthCheckStatus")
    public String healthCheckStatus;

    /**
     * <p>The destination IP address that is used for the health check.</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the router interface.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the peer access point.</p>
     */
    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

    /**
     * <p>The maximum bandwidth of the peer router interface. Unit: Mbit/s.</p>
     */
    @NameInMap("OppositeBandwidth")
    public Integer oppositeBandwidth;

    /**
     * <p>The service status of the peer router interface. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **FinancialLocked**</p>
     * <p>*   **SecurityLocked**</p>
     */
    @NameInMap("OppositeInterfaceBusinessStatus")
    public String oppositeInterfaceBusinessStatus;

    /**
     * <p>The ID of the peer router interface.</p>
     */
    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
     */
    @NameInMap("OppositeInterfaceOwnerId")
    public String oppositeInterfaceOwnerId;

    /**
     * <p>The specification of the peer router interface. Valid values:</p>
     * <br>
     * <p>*   **Mini.2**: 2 Mbit/s</p>
     * <p>*   **Mini.5**: 5 Mbit/s</p>
     * <p>*   **Small.1**: 10 Mbit/s</p>
     * <p>*   **Small.2**: 20 Mbit/s</p>
     * <p>*   **Small.5**: 50 Mbit/s</p>
     * <p>*   **Middle.1**: 100 Mbit/s</p>
     * <p>*   **Middle.2**: 200 Mbit/s</p>
     * <p>*   **Middle.5**: 500 Mbit/s</p>
     * <p>*   **Large.1**: 1,000 Mbit/s</p>
     * <p>*   **Large.2**: 2,000 Mbit/s</p>
     * <p>*   **Large.5**: 5,000 Mbit/s</p>
     * <p>*   **Xlarge.1**: 10,000 Mbit/s</p>
     * <p>*   **Negative**: not applicable</p>
     */
    @NameInMap("OppositeInterfaceSpec")
    public String oppositeInterfaceSpec;

    /**
     * <p>The status of the peer router interface. Valid values:</p>
     * <br>
     * <p>*   **Idle**</p>
     * <p>*   **AcceptingConnecting**</p>
     * <p>*   **Connecting**</p>
     * <p>*   **Activating**</p>
     * <p>*   **Active**</p>
     * <p>*   **Modifying**</p>
     * <p>*   **Deactivating**</p>
     * <p>*   **Inactive**</p>
     * <p>*   **Deleting**</p>
     * <p>*   **Deleted**</p>
     */
    @NameInMap("OppositeInterfaceStatus")
    public String oppositeInterfaceStatus;

    /**
     * <p>The region ID of the peer router interface.</p>
     */
    @NameInMap("OppositeRegionId")
    public String oppositeRegionId;

    /**
     * <p>The ID of the router to which the peer router interface belongs.</p>
     */
    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    /**
     * <p>The type of the router to which the peer router interface belongs. Valid values:</p>
     * <br>
     * <p>*   **VRouter**</p>
     * <p>*   **VBR**</p>
     */
    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    /**
     * <p>The ID of the peer VPC.</p>
     */
    @NameInMap("OppositeVpcInstanceId")
    public String oppositeVpcInstanceId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the renewal takes effect.</p>
     */
    @NameInMap("ReservationActiveTime")
    public String reservationActiveTime;

    /**
     * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
     */
    @NameInMap("ReservationBandwidth")
    public String reservationBandwidth;

    /**
     * <p>The metering method that is used after the renewal takes effect. Valid values: If **PayByBandwidth** is returned, it indicates that the Express Connect circuit is billed on a pay-by-bandwidth basis.</p>
     */
    @NameInMap("ReservationInternetChargeType")
    public String reservationInternetChargeType;

    /**
     * <p>The type of the renewal order. Only **RENEW** may be returned, which indicates that the order is placed for service renewal.</p>
     */
    @NameInMap("ReservationOrderType")
    public String reservationOrderType;

    /**
     * <p>The resource group ID.</p>
     * <br>
     * <p>For more information about resource groups, see [What is a resource group?](~~94475~~)</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The role of the router interface in the peering connection.</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The ID of the router to which the router interface belongs.</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The ID of the router interface.</p>
     */
    @NameInMap("RouterInterfaceId")
    public String routerInterfaceId;

    /**
     * <p>The type of the router to which the route table belongs. Valid values:</p>
     * <br>
     * <p>*   **VRouter**</p>
     * <p>*   **VBR**</p>
     */
    @NameInMap("RouterType")
    public String routerType;

    /**
     * <p>The specification of the router interface. Valid values:</p>
     * <br>
     * <p>*   **Mini.2**: 2 Mbit/s</p>
     * <p>*   **Mini.5**: 5 Mbit/s</p>
     * <p>*   **Small.1**: 10 Mbit/s</p>
     * <p>*   **Small.2**: 20 Mbit/s</p>
     * <p>*   **Small.5**: 50 Mbit/s</p>
     * <p>*   **Middle.1**: 100 Mbit/s</p>
     * <p>*   **Middle.2**: 200 Mbit/s</p>
     * <p>*   **Middle.5**: 500 Mbit/s</p>
     * <p>*   **Large.1**: 1,000 Mbit/s</p>
     * <p>*   **Large.2**: 2,000 Mbit/s</p>
     * <p>*   **Large.5**: 5,000 Mbit/s</p>
     * <p>*   **Xlarge.1**: 10,000 Mbit/s</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the router interface. Valid values:</p>
     * <br>
     * <p>*   **Idle**</p>
     * <p>*   **AcceptingConnecting**</p>
     * <p>*   **Connecting**</p>
     * <p>*   **Activating**</p>
     * <p>*   **Active**</p>
     * <p>*   **Modifying**</p>
     * <p>*   **Deactivating**</p>
     * <p>*   **Inactive**</p>
     * <p>*   **Deleting**</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The tag of the resource.</p>
     */
    @NameInMap("Tags")
    public DescribeRouterInterfaceAttributeResponseBodyTags tags;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the router interface belongs.</p>
     */
    @NameInMap("VpcInstanceId")
    public String vpcInstanceId;

    public static DescribeRouterInterfaceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouterInterfaceAttributeResponseBody self = new DescribeRouterInterfaceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRouterInterfaceAttributeResponseBody setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeRouterInterfaceAttributeResponseBody setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRouterInterfaceAttributeResponseBody setConnectedTime(String connectedTime) {
        this.connectedTime = connectedTime;
        return this;
    }
    public String getConnectedTime() {
        return this.connectedTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setCrossBorder(Boolean crossBorder) {
        this.crossBorder = crossBorder;
        return this;
    }
    public Boolean getCrossBorder() {
        return this.crossBorder;
    }

    public DescribeRouterInterfaceAttributeResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeRouterInterfaceAttributeResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setFastLinkMode(String fastLinkMode) {
        this.fastLinkMode = fastLinkMode;
        return this;
    }
    public String getFastLinkMode() {
        return this.fastLinkMode;
    }

    public DescribeRouterInterfaceAttributeResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHasReservationData(String hasReservationData) {
        this.hasReservationData = hasReservationData;
        return this;
    }
    public String getHasReservationData() {
        return this.hasReservationData;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHcRate(Integer hcRate) {
        this.hcRate = hcRate;
        return this;
    }
    public Integer getHcRate() {
        return this.hcRate;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHcThreshold(Integer hcThreshold) {
        this.hcThreshold = hcThreshold;
        return this;
    }
    public Integer getHcThreshold() {
        return this.hcThreshold;
    }

    public DescribeRouterInterfaceAttributeResponseBody setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
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

    public DescribeRouterInterfaceAttributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRouterInterfaceAttributeResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
        return this;
    }
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeBandwidth(Integer oppositeBandwidth) {
        this.oppositeBandwidth = oppositeBandwidth;
        return this;
    }
    public Integer getOppositeBandwidth() {
        return this.oppositeBandwidth;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceBusinessStatus(String oppositeInterfaceBusinessStatus) {
        this.oppositeInterfaceBusinessStatus = oppositeInterfaceBusinessStatus;
        return this;
    }
    public String getOppositeInterfaceBusinessStatus() {
        return this.oppositeInterfaceBusinessStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceSpec(String oppositeInterfaceSpec) {
        this.oppositeInterfaceSpec = oppositeInterfaceSpec;
        return this;
    }
    public String getOppositeInterfaceSpec() {
        return this.oppositeInterfaceSpec;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeInterfaceStatus(String oppositeInterfaceStatus) {
        this.oppositeInterfaceStatus = oppositeInterfaceStatus;
        return this;
    }
    public String getOppositeInterfaceStatus() {
        return this.oppositeInterfaceStatus;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setOppositeVpcInstanceId(String oppositeVpcInstanceId) {
        this.oppositeVpcInstanceId = oppositeVpcInstanceId;
        return this;
    }
    public String getOppositeVpcInstanceId() {
        return this.oppositeVpcInstanceId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationActiveTime(String reservationActiveTime) {
        this.reservationActiveTime = reservationActiveTime;
        return this;
    }
    public String getReservationActiveTime() {
        return this.reservationActiveTime;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationBandwidth(String reservationBandwidth) {
        this.reservationBandwidth = reservationBandwidth;
        return this;
    }
    public String getReservationBandwidth() {
        return this.reservationBandwidth;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationInternetChargeType(String reservationInternetChargeType) {
        this.reservationInternetChargeType = reservationInternetChargeType;
        return this;
    }
    public String getReservationInternetChargeType() {
        return this.reservationInternetChargeType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setReservationOrderType(String reservationOrderType) {
        this.reservationOrderType = reservationOrderType;
        return this;
    }
    public String getReservationOrderType() {
        return this.reservationOrderType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

    public DescribeRouterInterfaceAttributeResponseBody setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public DescribeRouterInterfaceAttributeResponseBody setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public DescribeRouterInterfaceAttributeResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeRouterInterfaceAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeRouterInterfaceAttributeResponseBody setTags(DescribeRouterInterfaceAttributeResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeRouterInterfaceAttributeResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeRouterInterfaceAttributeResponseBody setVpcInstanceId(String vpcInstanceId) {
        this.vpcInstanceId = vpcInstanceId;
        return this;
    }
    public String getVpcInstanceId() {
        return this.vpcInstanceId;
    }

    public static class DescribeRouterInterfaceAttributeResponseBodyTagsTags extends TeaModel {
        /**
         * <p>The key of tag N added to the resource. You must enter at least one tag key and at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (\_), and hyphens (-). It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeRouterInterfaceAttributeResponseBodyTagsTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfaceAttributeResponseBodyTagsTags self = new DescribeRouterInterfaceAttributeResponseBodyTagsTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfaceAttributeResponseBodyTagsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeRouterInterfaceAttributeResponseBodyTagsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeRouterInterfaceAttributeResponseBodyTags extends TeaModel {
        @NameInMap("Tags")
        public java.util.List<DescribeRouterInterfaceAttributeResponseBodyTagsTags> tags;

        public static DescribeRouterInterfaceAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeRouterInterfaceAttributeResponseBodyTags self = new DescribeRouterInterfaceAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeRouterInterfaceAttributeResponseBodyTags setTags(java.util.List<DescribeRouterInterfaceAttributeResponseBodyTagsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeRouterInterfaceAttributeResponseBodyTagsTags> getTags() {
            return this.tags;
        }

    }

}
