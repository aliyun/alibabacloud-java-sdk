// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceRequest extends TeaModel {
    /**
     * <p>The ID of the access point to which the VBR belongs.</p>
     * <br>
     * <p>You can call the [DescribeAccessPoints](~~36062~~) operation to obtain the IDs of access points.</p>
     * <br>
     * <p>>  This parameter is required if the VBR is connected to an Express Connect circuit.</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **false** (default): The automatic payment is disabled. If you select this option, you must go to the Order Center to complete the payment after an order is generated.</p>
     * <p>*   **true**: The automatic payment is enabled. Payments are automatically complete after an order is generated.</p>
     * <br>
     * <p>>  This parameter is required if **InstanceChargeType** is set to **PrePaid**.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the router interface.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the VBR that is created in the Fast Link mode is uplinked to the router interface. The Fast Link mode helps automatically connect router interfaces that are created for the VBR and its peer VPC. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter takes effect only if **RouterType** is set to **VBR** and **OppositeRouterType** is set to **VRouter**.</p>
     * <br>
     * <p>*   If **FastLinkMode** is set to **true**, **Role** must be set to **InitiatingSide**. In this case, **AccessPointId**, **OppositeRouterType**, **OpppsiteRouterId**, and **OppositeInterfaceOwnerId** are required.</p>
     */
    @NameInMap("FastLinkMode")
    public Boolean fastLinkMode;

    /**
     * <p>The source IP address that is used to perform health checks. The source IP address must be an idle IP address of the local virtual private cloud (VPC).</p>
     * <br>
     * <p>>  You can set this parameter when an Express Connect circuit is used.</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The destination IP address that is used to perform health checks.</p>
     * <br>
     * <p>>  This parameter is required if you specify **HealthCheckSourceIp**</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The billing method of the router interface. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the router interface.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the access point to which the peer belongs.</p>
     * <br>
     * <p>>  This parameter is required if the peer router interface is associated with a VBR. The specified value cannot be changed after the router interface is created.</p>
     */
    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

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
     * <p>The ID of the region in which the acceptor is deployed.</p>
     */
    @NameInMap("OppositeRegionId")
    public String oppositeRegionId;

    /**
     * <p>The ID of the peer router.</p>
     */
    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    /**
     * <p>The type of router that is associated with the peer router interface. Valid values:</p>
     * <br>
     * <p>*   **VRouter**</p>
     * <p>*   **VBR**</p>
     */
    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <br>
     * <p>*   Valid values when PricingCycle is set to Month: **1 to 9**.</p>
     * <p>*   Valid values when PricingCycle is set to Year: **1 to 3**.</p>
     * <br>
     * <p>>  This parameter is required if **InstanceChargeType** is set to **PrePaid**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription. Valid values:</p>
     * <br>
     * <p>*   **Month** (default)</p>
     * <p>*   **Year**</p>
     * <br>
     * <p>>  This parameter is required if **InstanceChargeType** is set to **PrePaid**.</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the region to which the router interface belongs.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to obtain the region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource group, see [What is Resource Management?](~~94475~~)</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role of the router interface. Valid values:</p>
     * <br>
     * <p>*   **InitiatingSide**: requester</p>
     * <p>*   **AcceptingSide**: acceptor</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The ID of the router that is associated with the router interface.</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The type of router that is associated with the router interface. Valid values:</p>
     * <br>
     * <p>*   **VRouter**</p>
     * <p>*   **VBR**</p>
     */
    @NameInMap("RouterType")
    public String routerType;

    /**
     * <p>The specification of the router interface and the corresponding bandwidth. Valid values:</p>
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
     * <br>
     * <p>>  If **Role** is set to **AcceptingSide**, set **Spec** to **Negative**. This indicates that you do not need to specify the specification when you create an acceptor router interface.</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tag to add to the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateRouterInterfaceRequestTags> tags;

    public static CreateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceRequest self = new CreateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreateRouterInterfaceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateRouterInterfaceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRouterInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouterInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouterInterfaceRequest setFastLinkMode(Boolean fastLinkMode) {
        this.fastLinkMode = fastLinkMode;
        return this;
    }
    public Boolean getFastLinkMode() {
        return this.fastLinkMode;
    }

    public CreateRouterInterfaceRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public CreateRouterInterfaceRequest setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public CreateRouterInterfaceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRouterInterfaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouterInterfaceRequest setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
        return this;
    }
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    public CreateRouterInterfaceRequest setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public CreateRouterInterfaceRequest setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public CreateRouterInterfaceRequest setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public CreateRouterInterfaceRequest setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public CreateRouterInterfaceRequest setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public CreateRouterInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRouterInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRouterInterfaceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRouterInterfaceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouterInterfaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRouterInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRouterInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRouterInterfaceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateRouterInterfaceRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public CreateRouterInterfaceRequest setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public CreateRouterInterfaceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateRouterInterfaceRequest setTags(java.util.List<CreateRouterInterfaceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateRouterInterfaceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateRouterInterfaceRequestTags extends TeaModel {
        /**
         * <p>The tag key to add to the resource. You must enter at least one tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <br>
         * <p>A tag key can be at most 128 characters in length. It cannot start with `aliyun` or `acs:`, and cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value to add to the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRouterInterfaceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateRouterInterfaceRequestTags self = new CreateRouterInterfaceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateRouterInterfaceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRouterInterfaceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
