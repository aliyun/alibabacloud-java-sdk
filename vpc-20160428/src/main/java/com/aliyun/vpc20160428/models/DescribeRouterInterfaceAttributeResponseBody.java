// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeRouterInterfaceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the access point.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-qingdao-ls-A</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>The bandwidth of the router interface. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The status of the router interface. Valid values:</p>
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
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>AfterPay</strong>: pay-as-you-go</li>
     * <li><strong>PrePaid</strong>: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AfterPay</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the connection was established.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-14T08:58:04Z</p>
     */
    @NameInMap("ConnectedTime")
    public String connectedTime;

    /**
     * <p>The time when the router interface was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-14T08:57:24Z</p>
     */
    @NameInMap("CreationTime")
    public String creationTime;

    /**
     * <p>Indicates whether the connection is a cross-border connection. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
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
     * <p>Peer interface.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end of the time range during which data was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2999-09-08T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Indicates whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when <strong>RouterType</strong> is set to <strong>VBR</strong> and <strong>OppositeRouterType</strong> is set to <strong>VRouter</strong>.</p>
     * </li>
     * <li><p>When <strong>FastLinkMode</strong> is set to <strong>true</strong>, <strong>Role</strong> must be set to <strong>InitiatingSide</strong>. <strong>AccessPointId</strong>, <strong>OppositeRouterType</strong>, <strong>OpppsiteRouterId</strong>, and <strong>OppositeInterfaceOwnerId</strong> are required.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FastLinkMode")
    public String fastLinkMode;

    /**
     * <p>The time when the router interface was modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-28T10:02:12Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <p>Indicates whether renewal data is included. Valid values:</p>
     * <ul>
     * <li><strong>false</strong></li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("HasReservationData")
    public String hasReservationData;

    /**
     * <p>The rate of health checks. Unit: seconds. The value indicates the interval at which probe packets are sent during a health check.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("HcRate")
    public Integer hcRate;

    /**
     * <p>The healthy threshold. This value indicates the number of probe packets that are sent during a health check. Unit: packets.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("HcThreshold")
    public Integer hcThreshold;

    /**
     * <p>The source IP address that is used for the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>1.1.XX.XX</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The status of the health check. Valid values:</p>
     * <ul>
     * <li><strong>Abnormal</strong></li>
     * <li><strong>Normal</strong></li>
     * <li><strong>NoRedundantRoute</strong></li>
     * <li><strong>NoHealthCheckConfig</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("HealthCheckStatus")
    public String healthCheckStatus;

    /**
     * <p>The destination IP address that is used for the health check.</p>
     * 
     * <strong>example:</strong>
     * <p>2.2.XX.XX</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the router interface.</p>
     * 
     * <strong>example:</strong>
     * <p>RouterInterface1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the peer access point.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-qingdao-ls-B</p>
     */
    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

    /**
     * <p>The maximum bandwidth of the peer router interface. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OppositeBandwidth")
    public Integer oppositeBandwidth;

    /**
     * <p>The service status of the peer router interface. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>FinancialLocked</strong></li>
     * <li><strong>SecurityLocked</strong></li>
     * </ul>
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
     * <p>ri-bp1xkrzttximaoxbl****</p>
     */
    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the peer router interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1321932713****</p>
     */
    @NameInMap("OppositeInterfaceOwnerId")
    public String oppositeInterfaceOwnerId;

    /**
     * <p>The specification of the peer router interface. Valid values:</p>
     * <ul>
     * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
     * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
     * <li><strong>Small.1</strong>: 10 Mbit/s</li>
     * <li><strong>Small.2</strong>: 20 Mbit/s</li>
     * <li><strong>Small.5</strong>: 50 Mbit/s</li>
     * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
     * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
     * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
     * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
     * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
     * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
     * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
     * <li><strong>Negative</strong>: not applicable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Negative</p>
     */
    @NameInMap("OppositeInterfaceSpec")
    public String oppositeInterfaceSpec;

    /**
     * <p>The status of the peer router interface. Valid values:</p>
     * <ul>
     * <li><strong>Idle</strong></li>
     * <li><strong>AcceptingConnecting</strong></li>
     * <li><strong>Connecting</strong></li>
     * <li><strong>Activating</strong></li>
     * <li><strong>Active</strong></li>
     * <li><strong>Modifying</strong></li>
     * <li><strong>Deactivating</strong></li>
     * <li><strong>Inactive</strong></li>
     * <li><strong>Deleting</strong></li>
     * <li><strong>Deleted</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("OppositeInterfaceStatus")
    public String oppositeInterfaceStatus;

    /**
     * <p>The region ID of the peer router interface.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("OppositeRegionId")
    public String oppositeRegionId;

    /**
     * <p>The ID of the router to which the peer router interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp11xvy6lb9photuu****</p>
     */
    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    /**
     * <p>The type of the router to which the peer router interface belongs. Valid values:</p>
     * <ul>
     * <li><strong>VRouter</strong></li>
     * <li><strong>VBR</strong></li>
     * </ul>
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
     * <p>vpc-bp1b49rqrybk45nio****</p>
     */
    @NameInMap("OppositeVpcInstanceId")
    public String oppositeVpcInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01818199-04F6-47F4-9ADF-7CC824CF57A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The time when the renewal takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-11T16:00:00Z</p>
     */
    @NameInMap("ReservationActiveTime")
    public String reservationActiveTime;

    /**
     * <p>The maximum bandwidth after the renewal takes effect. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ReservationBandwidth")
    public String reservationBandwidth;

    /**
     * <p>The metering method that is used after the renewal takes effect. Valid values: If <strong>PayByBandwidth</strong> is returned, it indicates that the Express Connect circuit is billed on a pay-by-bandwidth basis.</p>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("ReservationInternetChargeType")
    public String reservationInternetChargeType;

    /**
     * <p>The type of the renewal order. Only <strong>RENEW</strong> may be returned, which indicates that the order is placed for service renewal.</p>
     * 
     * <strong>example:</strong>
     * <p>RENEW</p>
     */
    @NameInMap("ReservationOrderType")
    public String reservationOrderType;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group?</a></p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The role of the router interface in the peering connection.</p>
     * 
     * <strong>example:</strong>
     * <p>InitiatingSide</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The ID of the router to which the router interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-m5ex0xf63xk8s5bob****</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The ID of the router interface.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-m5egfc10sednwk2yt****</p>
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
     * <p>The specification of the router interface. Valid values:</p>
     * <ul>
     * <li><strong>Mini.2</strong>: 2 Mbit/s</li>
     * <li><strong>Mini.5</strong>: 5 Mbit/s</li>
     * <li><strong>Small.1</strong>: 10 Mbit/s</li>
     * <li><strong>Small.2</strong>: 20 Mbit/s</li>
     * <li><strong>Small.5</strong>: 50 Mbit/s</li>
     * <li><strong>Middle.1</strong>: 100 Mbit/s</li>
     * <li><strong>Middle.2</strong>: 200 Mbit/s</li>
     * <li><strong>Middle.5</strong>: 500 Mbit/s</li>
     * <li><strong>Large.1</strong>: 1,000 Mbit/s</li>
     * <li><strong>Large.2</strong>: 2,000 Mbit/s</li>
     * <li><strong>Large.5</strong>: 5,000 Mbit/s</li>
     * <li><strong>Xlarge.1</strong>: 10,000 Mbit/s</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Mini.2</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The status of the router interface. Valid values:</p>
     * <ul>
     * <li><strong>Idle</strong></li>
     * <li><strong>AcceptingConnecting</strong></li>
     * <li><strong>Connecting</strong></li>
     * <li><strong>Activating</strong></li>
     * <li><strong>Active</strong></li>
     * <li><strong>Modifying</strong></li>
     * <li><strong>Deactivating</strong></li>
     * <li><strong>Inactive</strong></li>
     * <li><strong>Deleting</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1b49rqrybk45nio****</p>
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
         * <p>The tag key can be up to 64 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>It can be up to 128 characters in length and can contain digits, periods (.), underscores (_), and hyphens (-). It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
